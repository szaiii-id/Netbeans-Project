/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.time.LocalDate;
import javax.swing.JOptionPane;
import model.Konsultasi;
import service.konsultasiService;

/**
 *
 * @author solosz
 */
public class konsultasiServiceImpl implements konsultasiService{

    @Override
    public String messageKonsultasi(Konsultasi konsultasi) {
        return "Id Konsultasi : " + konsultasi.getId_konsultasi() + 
               "\nId Klient : " + konsultasi.getId_klient() +
               "\nPertanyaan : " + konsultasi.getPertanyaan() +
               "\nTanggal : " + konsultasi.getTanggal() + 
               "\nStatus : " + konsultasi.getStatus();
    }

    @Override
    public void infoKonsultasi(Konsultasi konsultasi) {
        try {
            validateKonsultasi(konsultasi);
            
            String msg = messageKonsultasi(konsultasi);
            
            JOptionPane.showMessageDialog(null, msg);
            
        } catch (IllegalArgumentException except) {
            JOptionPane.showMessageDialog(null, except.getMessage());
        }
    }

    @Override
    public void validateKonsultasi(Konsultasi konsultasi) throws IllegalArgumentException{
        if (konsultasi == null) {
            throw new IllegalArgumentException("Data Konsultasi Tidak Boleh Kosong");
        }
        
        if (konsultasi.getId_konsultasi() == null || konsultasi.getId_konsultasi().isBlank() ) {
            throw  new IllegalArgumentException("Id Konsultasi Tidak Boleh Kosong");
        }
        if (konsultasi.getId_klient()== null || konsultasi.getId_klient().isBlank()) {
            throw  new IllegalArgumentException("Id Klient Tidak Boleh Kosong");
        }
        if (konsultasi.getPertanyaan()== null || konsultasi.getPertanyaan().isBlank() ) {
            throw  new IllegalArgumentException("Pertanyaan Konsultasi Tidak Boleh Kosong");
        }
        if (konsultasi.getTanggal()== null) {
            throw new IllegalArgumentException("Tanggal Tidak Boleh Kosong");
        }
        if (konsultasi.getStatus() == null || konsultasi.getStatus().isBlank() ) {
            konsultasi.setStatus("MENUNGGU");
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Konsultasi;
import service.konsultasiService;

/**
 *
 * @author solosz
 */
public class konsultasiServiceImpl implements konsultasiService{
    
    private ArrayList<Konsultasi> konsultasiList = new ArrayList<>();

    @Override
    public String messageKonsultasi(Konsultasi konsultasi) {
        return "Id Konsultasi : " + konsultasi.getId_konsultasi() + 
               "\nId Klient : " + konsultasi.getId_klient() +
               "\nPertanyaan : " + konsultasi.getPertanyaan() +
               "\nTanggal : " + konsultasi.getTanggal() + 
               "\nStatus : " + konsultasi.getStatus();
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

    @Override
    public Konsultasi tambahKonsultasi(Konsultasi konsultasi) {
        try {
            validateKonsultasi(konsultasi);
            this.konsultasiList.add(konsultasi);
            
            JOptionPane.showMessageDialog(null, "Data Berhasil DiTambahkan");
            return konsultasi;
        } catch (IllegalArgumentException except) {
            JOptionPane.showMessageDialog(null, except.getMessage());
            return null;
        }
    }

    @Override
    public Konsultasi cariKonsultasiByID(String inputIndex) {
        
        if (inputIndex.isBlank()) {
            JOptionPane.showMessageDialog(null, "Anda Harus Memasukkan Index");
            return null;
        }
        
        int index;
        try {
            index = Integer.parseInt(inputIndex);
        } catch (NumberFormatException except) {
            JOptionPane.showMessageDialog(null, "Index Harus Berupa Angka");
            return null;
        }
        
        if (this.konsultasiList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data Konsultasi Masih Kosong");
            return null;
        }
        
        if (index < 0 || index >= this.konsultasiList.size() ) {
            JOptionPane.showMessageDialog(null, "Index " + index + " Tidak Ditemukan" );
            return null;
        }
        
        Konsultasi konsultasi = this.konsultasiList.get(index);
        
        JOptionPane.showMessageDialog(null, messageKonsultasi(konsultasi));
        
        return konsultasi;
        
    }
    
}

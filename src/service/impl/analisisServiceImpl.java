/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import javax.swing.JOptionPane;
import model.AnalisisHukum;
import service.analisisService;

/**
 *
 * @author solosz
 */
public class analisisServiceImpl implements analisisService{

    @Override
    public String mesaageAnalisis(AnalisisHukum analisisHukum) {
        return "Id Analisis Hukum : " + analisisHukum.getId_analisis() + 
               "\nId Konsultasi : " +  analisisHukum.getId_konsultasi() + 
               "\nId Advokat : " + analisisHukum.getId_advokat() +
               "\nAnalisis : " + analisisHukum.getAnalisis() +
               "\nRekomendasi : " + analisisHukum.getRekomendasi() + 
               "\nTanggal : " + analisisHukum.getTanggal();
    }

    @Override
    public void infoAnalisis(AnalisisHukum analisisHukum) {
        
        try {
            validateAnalisis(analisisHukum);
        
            String msg = mesaageAnalisis(analisisHukum);

            JOptionPane.showMessageDialog(null, msg);
        } catch (IllegalArgumentException except) {
            JOptionPane.showMessageDialog(null, except.getMessage());
        }

    }

    @Override
    public void validateAnalisis(AnalisisHukum analisisHukum) throws IllegalArgumentException{
        if (analisisHukum == null) {
            throw new IllegalArgumentException("Data Analisis Hukum Tidak Boleh Kosong");
        }
        
        if (analisisHukum.getId_analisis() == null || analisisHukum.getId_analisis().isBlank()) {
            throw new IllegalArgumentException("Id Analisis Tidak Boleh Kosong");
        }
        if (analisisHukum.getId_konsultasi()== null || analisisHukum.getId_konsultasi().isBlank()) {
            throw new IllegalArgumentException("Id Konsultasi Tidak Boleh Kosong");
        }
        if (analisisHukum.getId_advokat()== null || analisisHukum.getId_advokat().isBlank()) {
            throw new IllegalArgumentException("Id Advokat Tidak Boleh Kosong");
        }
        if (analisisHukum.getAnalisis()== null || analisisHukum.getAnalisis().isBlank()) {
            throw new IllegalArgumentException("Analisis Tidak Boleh Kosong");
        }
        if (analisisHukum.getRekomendasi()== null || analisisHukum.getRekomendasi().isBlank()) {
            throw new IllegalArgumentException("Rekomendasi Analisis Tidak Boleh Kosong");
        }
        if (analisisHukum.getTanggal()== null ) {
            throw new IllegalArgumentException("Tanggal Analisis Tidak Boleh Kosong");
        }
    }
    
}

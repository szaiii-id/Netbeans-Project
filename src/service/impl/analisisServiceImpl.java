/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.AnalisisHukum;
import service.analisisService;

/**
 *
 * @author solosz
 */
public class analisisServiceImpl implements analisisService{
    
    private ArrayList<AnalisisHukum> analisisHukumList = new ArrayList<>();

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

    @Override
    public AnalisisHukum tambahAnalisisHukum(AnalisisHukum analisisHukum) {
        try {
            
            validateAnalisis(analisisHukum);
            this.analisisHukumList.add(analisisHukum);
            
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
            return analisisHukum;
        } catch (IllegalArgumentException except) {
            JOptionPane.showMessageDialog(null, except.getMessage());
            return null;
        }
    }



    @Override
    public AnalisisHukum cariAnalisisHukumById(String inputText) {
        if (inputText.isBlank()) {
            JOptionPane.showMessageDialog(null, "Anda Belum Memasukkan Index");
            return null;
        }
        
        int index;
        try {
            index = Integer.parseInt(inputText);
        } catch (NumberFormatException except) {
            JOptionPane.showMessageDialog(null, "Index Harus Berupa Angka");
            return null;
        }
        
        if (this.analisisHukumList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data Analisis Hukum Masih Kosong");
            return null;
        }
        
        if (index < 0 || index >= this.analisisHukumList.size()) {
            JOptionPane.showMessageDialog(null, "Index " + index + " Tidak Ditemukan");
            return null;
        }
        
        AnalisisHukum analisisHukum = this.analisisHukumList.get(index);
        JOptionPane.showMessageDialog(null, mesaageAnalisis(analisisHukum));
        
        return analisisHukum;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author solosz
 */
public class AnalisisHukum {
    private String id_analisis;
    private String id_konsultasi; 
    private String id_advokat; 
    private String analisis;
    private String rekomendasi;
    private LocalDate tanggal;

    public AnalisisHukum() {
    }

    public AnalisisHukum(String id_analisis, String id_konsultasi, String id_advokat, String analisis, String rekomendasi, LocalDate tanggal) {
        this.id_analisis = id_analisis;
        this.id_konsultasi = id_konsultasi;
        this.id_advokat = id_advokat;
        this.analisis = analisis;
        this.rekomendasi = rekomendasi;
        this.tanggal = tanggal;
    }

    public String getId_analisis() {
        return this.id_analisis;
    }

    public void setId_analisis(String id_analisis) {
        this.id_analisis = id_analisis;
    }

    public String getId_konsultasi() {
        return this.id_konsultasi;
    }

    public void setId_konsultasi(String id_konsultasi) {
        this.id_konsultasi = id_konsultasi;
    }

    public String getId_advokat() {
        return this.id_advokat;
    }

    public void setId_advokat(String id_advokat) {
        this.id_advokat = id_advokat;
    }

    public String getAnalisis() {
        return this.analisis;
    }

    public void setAnalisis(String analisis) {
        this.analisis = analisis;
    }

    public String getRekomendasi() {
        return this.rekomendasi;
    }

    public void setRekomendasi(String rekomendasi) {
        this.rekomendasi = rekomendasi;
    }

    public LocalDate getTanggal() {
        return this.tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }
    
    
}

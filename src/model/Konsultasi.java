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
public class Konsultasi {
    private String id_konsultasi;
    private String id_klient;
    private String pertanyaan;
    private LocalDate tanggal;
    private String status;

    public Konsultasi() {
    }

    public Konsultasi(String id_konsultasi, String id_klient, String pertanyaan, LocalDate tanggal, String status) {
        this.id_konsultasi = id_konsultasi;
        this.id_klient = id_klient;
        this.pertanyaan = pertanyaan;
        this.tanggal = tanggal;
        this.status = status;
    }

    public String getId_konsultasi() {
        return this.id_konsultasi;
    }

    public void setId_konsultasi(String id_konsultasi) {
        this.id_konsultasi = id_konsultasi;
    }

    public String getId_klient() {
        return this.id_klient;
    }

    public void setId_klient(String id_klient) {
        this.id_klient = id_klient;
    }

    public String getPertanyaan() {
        return this.pertanyaan;
    }

    public void setPertanyaan(String pertanyaan) {
        this.pertanyaan = pertanyaan;
    }

    public LocalDate getTanggal() {
        return this.tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import model.Konsultasi;
/**
 *
 * @author solosz
 */
public interface konsultasiService {
    public String messageKonsultasi(Konsultasi konsultasi);
    public void validateKonsultasi(Konsultasi konsultasi);
    public Konsultasi tambahKonsultasi(Konsultasi konsultasi);
    public Konsultasi cariKonsultasiByID(String inputText);
}

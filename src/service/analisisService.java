/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import model.AnalisisHukum;

/**
 *
 * @author solosz
 */
public interface analisisService {
    public String mesaageAnalisis(AnalisisHukum analisisHukum);
    public void validateAnalisis(AnalisisHukum analisisHukum);
    public AnalisisHukum tambahAnalisisHukum(AnalisisHukum analisisHukum);
    public AnalisisHukum cariAnalisisHukumById(String inputText);
}

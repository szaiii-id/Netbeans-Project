/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;


import model.Advokat;
/**
 *
 * @author solosz
 */
public interface advokatService {
    public String messageAdvokat(Advokat advokat);
    public void validateAdvokat(Advokat advokat);
    public Advokat tambahAdvokat(Advokat advokat);
    public Advokat cariAdvokatById(String index);
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import model.Klient;

/**
 *
 * @author solosz
 */
public interface klientService {
    public String massageKlient(Klient klient);
    public void validateKlient(Klient klient);
    public Klient tambahKlient(Klient klient);
    public Klient cariKlientById(String index);


}


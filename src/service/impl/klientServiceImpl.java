/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import javax.swing.JOptionPane;
import model.Klient;
import service.klientService;
import service.klientService;

/**
 *
 * @author solosz
 */
public class klientServiceImpl implements klientService{
    @Override
    public String massageKlient(Klient klient) {
        return "Id Klient : " + klient.getId_klien() + "\nNama : " + klient.getNama() + "\nEmail : " + klient.getEmail() +
                          "\nPassword : " + klient.getPassword() + "\nNo Telp : " + klient.getTelp() + "\nNo Identitas : " + klient.getIdentitas() ;
    }

    @Override
    public void infoKlient(Klient klient) {
        try {
            validateKlient(klient);
            
            
            String msg = massageKlient(klient);
            
            JOptionPane.showMessageDialog(null, msg);
            
        } catch (IllegalArgumentException except) {
            JOptionPane.showMessageDialog(null, except.getMessage());
        }
    }

    @Override
    public void validateKlient(Klient klient) throws IllegalArgumentException{
        
        if (klient == null) {
            throw new IllegalArgumentException("Data Klient Tidak Boleh Kosong");
        }
        
        if (klient.getId_klien() == null || klient.getId_klien().isBlank()) {
            throw new IllegalArgumentException("Id Klient Tidak Boleh Kosong");
        }
        
        if (klient.getNama() == null || klient.getNama().isBlank()) {
            throw new IllegalArgumentException("Nama Klient Tidak Boleh kosong");
        }
        
        if (klient.getEmail() == null || klient.getEmail().isBlank()) {
            throw new IllegalArgumentException("Email Klient Tidak Boleh Kosong");
        }
        
        if (klient.getPassword() == null || klient.getPassword().isBlank()) {
            throw new IllegalArgumentException("Password Klient Tidak Boleh Kosong");
        }
        
        if (klient.getTelp()== null || klient.getTelp().isBlank()) {
            throw new IllegalArgumentException("No Telp Klient Tidak Boleh Kosong");
        }
               
        if (klient.getIdentitas() == null || klient.getIdentitas().isBlank()) {
            klient.setIdentitas("-");
        }
    }
}

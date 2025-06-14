/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Klient;
import service.klientService;
import service.klientService;

/**
 *
 * @author solosz
 */
public class klientServiceImpl implements klientService{
    
    private ArrayList<Klient> klientList = new ArrayList<>();
    
    
    @Override
    public String massageKlient(Klient klient) {
        return "Id Klient : " + klient.getId_klien() + 
                "\nNama : " + klient.getNama() + 
                "\nEmail : " + klient.getEmail() +
                "\nPassword : " + klient.getPassword() + 
                "\nNo Telp : " + klient.getTelp() + 
                "\nNo Identitas : " + klient.getIdentitas() ;
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

    @Override
    public Klient tambahKlient(Klient klient) {
        try {
            
            validateKlient(klient);
            this.klientList.add(klient);
            
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Tambahkan");
            
            return klient;
        } catch (IllegalArgumentException except) {
            JOptionPane.showMessageDialog(null, except.getMessage());
            return null;
        }
    }

    @Override
    public Klient cariKlientById(String inputIndex) {
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
        
        if (this.klientList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data Klient Masih Kosong");
            return null;
        }
        
        if (index < 0 || index >= this.klientList.size()) {
            JOptionPane.showMessageDialog(null, "Index" + index + "Tidak Ditemukan");
            return null;
        }
        
        Klient klient = this.klientList.get(index);
        
        JOptionPane.showMessageDialog(null, massageKlient(klient));
        
        return klient;
    }


}

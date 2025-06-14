/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Advokat;
import service.advokatService;

/**
 *
 * @author solosz
 */
public class advokatServiceImpl implements advokatService {
    
    private ArrayList<Advokat> advokatList = new ArrayList<>();

    @Override
    public String messageAdvokat(Advokat advokat) {
        return "Id Advokat : " + advokat.getId_advokat() + 
               "\nNama : " + advokat.getNama() + 
               "\nEmail : " + advokat.getEmail() + 
               "\nPassword : " + advokat.getPassword() + 
               "\nNo Telp : " + advokat.getTelp() + 
               "\nNo Identitas : " + advokat.getIdentitas();
    }


    @Override
    public void validateAdvokat(Advokat advokat) throws IllegalArgumentException{
       
        if (advokat == null) {
            throw  new IllegalArgumentException("Data Advokat Tidak Boleh Kosong");
        }
        
        if (advokat.getId_advokat() == null || advokat.getId_advokat().isBlank()) {
            throw new IllegalArgumentException("Id Advokat Tidak Boleh Kosong");
        }
        
        if (advokat.getNama() == null || advokat.getNama().isBlank()) {
            throw  new IllegalArgumentException("Nama Advokat Tidak Boleh Kosong");
        }
        if (advokat.getEmail() == null || advokat.getEmail().isBlank()) {
            throw  new IllegalArgumentException("Email Advokat Tidak Boleh Kosong");
        }
        if (advokat.getPassword() == null || advokat.getPassword().isBlank()) {
            throw  new IllegalArgumentException("Password Advokat Tidak Boleh Kosong");
        }
        if (advokat.getTelp()== null || advokat.getTelp().isBlank()) {
            throw  new IllegalArgumentException("No Telp Advokat Tidak Boleh Kosong");
        }
        if (advokat.getIdentitas()== null || advokat.getIdentitas().isBlank()) {
            advokat.setIdentitas("-");
        }
    }

    @Override
    public Advokat tambahAdvokat(Advokat advokat) {
        try {
            validateAdvokat(advokat);  
            this.advokatList.add(advokat);

            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
            return advokat;

        } catch (IllegalArgumentException except) {
            JOptionPane.showMessageDialog(null, except.getMessage());
            return null; 
        }
    }


 
    @Override
    public Advokat cariAdvokatById(String inputText) {
        if (inputText.isBlank()) {
            JOptionPane.showMessageDialog(null, "Anda Belum Memasukkan Index.");
            return null;
        }

        int index;
        try {
            index = Integer.parseInt(inputText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Index harus berupa angka.");
            return null;
        }

        if (this.advokatList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data Advokat masih kosong.");
            return null;
        }
        if (index < 0 || index >= this.advokatList.size()) {
            JOptionPane.showMessageDialog(null, "Index " + index + " Tidak Ditemukan");
            return null;
        }

        Advokat advokat = advokatList.get(index);
        JOptionPane.showMessageDialog(null, messageAdvokat(advokat));

        return advokat;
    }


    
}

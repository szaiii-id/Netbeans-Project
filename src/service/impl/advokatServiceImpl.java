/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import javax.swing.JOptionPane;
import model.Advokat;
import service.advokatService;

/**
 *
 * @author solosz
 */
public class advokatServiceImpl implements advokatService {

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
    public void infoAdvokat(Advokat advokat) {
        try {
            validateAdvokat(advokat);
            
            String msg = messageAdvokat(advokat);
            
            JOptionPane.showMessageDialog(null, msg);
            
        } catch (IllegalArgumentException except) {
            JOptionPane.showMessageDialog(null, except.getMessage());
        }
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
    
}

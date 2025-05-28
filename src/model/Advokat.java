/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author solosz
 */
public class Advokat {
    private String id_advokat;
    private String nama;
    private String email;
    private String password;
    private String telp;
    private String identitas;

    public Advokat() {
    }

    public Advokat(String id_advokat, String nama, String email, String password, String telp, String identitas) {
        this.id_advokat = id_advokat;
        this.nama = nama;
        this.email = email;
        this.password = password;
        this.telp = telp;
        this.identitas = identitas;
    }

    public String getId_advokat() {
        return this.id_advokat;
    }

    public void setId_advokat(String id_advokat) {
        this.id_advokat = id_advokat;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelp() {
        return this.telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getIdentitas() {
        return this.identitas;
    }

    public void setIdentitas(String identitas) {
        this.identitas = identitas;
    }
    
    
}

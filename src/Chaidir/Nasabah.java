/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chaidir;

/**
 *
 * @author user
 */
public class Nasabah extends DataNasabah{

    private String nama;
    private String address;
    private String status;
    private int mobile;
    private int rumah;
    private double tanggungan;
    private double gaji;
    private double penghasilanTmbhn;
    private double bonus;

    public Nasabah() {
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the mobile
     */
    public int getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the rumah
     */
    public int getRumah() {
        return rumah;
    }

    /**
     * @param rumah the rumah to set
     */
    public void setRumah(int rumah) {
        this.rumah = rumah;
    }

    /**
     * @return the tanggungan
     */
    public double getTanggungan() {
        return tanggungan;
    }

    /**
     * @param tanggungan the tanggungan to set
     */
    public void setTanggungan(double tanggungan) {
        this.tanggungan = tanggungan;
    }

    /**
     * @return the gaji
     */
    public double getGaji() {
        return gaji;
    }

    /**
     * @param gaji the gaji to set
     */
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    /**
     * @return the penghasilanTmbhn
     */
    public double getPenghasilanTmbhn() {
        return penghasilanTmbhn;
    }

    /**
     * @param penghasilanTmbhn the penghasilanTmbhn to set
     */
    public void setPenghasilanTmbhn(double penghasilanTmbhn) {
        this.penghasilanTmbhn = penghasilanTmbhn;
    }

    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
}


import Chaidir.DataNasabah;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class PengajuanKredit extends DataNasabah{

    private String hargaBarang;
    private String uangMuka;
    private String lamaKredit;
    private String sukuBunga;
    
    public PengajuanKredit() {
    }

    public PengajuanKredit(String hargaBarang, String uangMuka, String lamaKredit, String sukuBunga) {
        this.hargaBarang = hargaBarang;
        this.uangMuka = uangMuka;
        this.lamaKredit = lamaKredit;
        this.sukuBunga = sukuBunga;
    }
    

    /**
     * @return the hargaBarang
     */
    public String getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(String hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    /**
     * @return the uangMuka
     */
    public String getUangMuka() {
        return uangMuka;
    }

    /**
     * @param uangMuka the uangMuka to set
     */
    public void setUangMuka(String uangMuka) {
        this.uangMuka = uangMuka;
    }

    /**
     * @return the lamaKredit
     */
    public String getLamaKredit() {
        return lamaKredit;
    }

    /**
     * @param lamaKredit the lamaKredit to set
     */
    public void setLamaKredit(String lamaKredit) {
        this.lamaKredit = lamaKredit;
    }

    /**
     * @return the sukuBunga
     */
    public String getSukuBunga() {
        return sukuBunga;
    }

    /**
     * @param sukuBunga the sukuBunga to set
     */
    public void setSukuBunga(String sukuBunga) {
        this.sukuBunga = sukuBunga;
    }
    
    
    
    
    
}

package com.sensei.DAO;

import com.sensei.model.HitungTarifKiriman;
import java.util.List;

public class HitungTipePaket {
    private String noPaket;
    private String tipePaket;
    private boolean asuransi;
    private double nilaAsuransi;
    private double hargaBarang;
    private String pembayaran;
    private String jenisBarang;
    private int beratBarang;
    private double panjang;
    private double tinggi;
    private double lebar;
    private double dimensi;
    private String kotaTujuan;
    private double hargaPaket;
    private double hargaKaliBerat;
    private double hargaAsuransi;
    
    
    private FileTarifKreditDAO dataTarif = new FileTarifKreditDAO();
    
    public void tarifPaketReguler(){
        getDataTarif().daftarTarifPaket();
        for (HitungTarifKiriman tarif : getDataTarif().getTarif()) {
            if(this.getKotaTujuan().equalsIgnoreCase(tarif.getKotaTujuan())){
                setHargaPaket(tarif.getPaketReguler());
            }
        }
    }
    public void tarifPaketExpress(){
        getDataTarif().daftarTarifPaket();
        for (HitungTarifKiriman tarif : getDataTarif().getTarif()) {
            if(this.getKotaTujuan().equalsIgnoreCase(tarif.getKotaTujuan())){
                setHargaPaket(tarif.getPaketExpress());
            }
        }
    }
    public void tarifPaketSDS(){
        getDataTarif().daftarTarifPaket();
        for (HitungTarifKiriman tarif : getDataTarif().getTarif()) {
            if(this.getKotaTujuan().equalsIgnoreCase(tarif.getKotaTujuan())){
                setHargaPaket(tarif.getPaketSds());
            }
        }
    }
    public void tarifPaketONS(){
        getDataTarif().daftarTarifPaket();
        for (HitungTarifKiriman tarif : getDataTarif().getTarif()) {
            if(this.getKotaTujuan().equalsIgnoreCase(tarif.getKotaTujuan())){
                setHargaPaket(tarif.getPaketOns());
            }
        }
    }    
    public void tarifPaketHDS(){
        getDataTarif().daftarTarifPaket();
        for (HitungTarifKiriman tarif : getDataTarif().getTarif()) {
            if(this.getKotaTujuan().equalsIgnoreCase(tarif.getKotaTujuan())){
                setHargaPaket(tarif.getPaketHds());
            }
        }
    }
    
    
    /**
     * @return the noPaket
     */
    public String getNoPaket() {
        return noPaket;
    }

    /**
     * @param noPaket the noPaket to set
     */
    public void setNoPaket(String noPaket) {
        this.noPaket = noPaket;
    }

    /**
     * @return the tipePaket
     */
    public String getTipePaket() {
        return tipePaket;
    }

    /**
     * @param tipePaket the tipePaket to set
     */
    public void setTipePaket(String tipePaket) {
        this.tipePaket = tipePaket;
    }

    /**
     * @return the asuransi
     */
    public boolean isAsuransi() {
        return asuransi;
    }

    /**
     * @param asuransi the asuransi to set
     */
    public void setAsuransi(boolean asuransi) {
        this.asuransi = asuransi;
    }

    /**
     * @return the nilaAsuransi
     */
    public double getNilaAsuransi() {
        return nilaAsuransi;
    }

    /**
     * @param nilaAsuransi the nilaAsuransi to set
     */
    public void setNilaAsuransi() {
        this.nilaAsuransi = this.hargaBarang * 0.1;
    }

    /**
     * @return the hargaBarang
     */
    public double getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    /**
     * @return the pembayaran
     */
    public String getPembayaran() {
        return pembayaran;
    }

    /**
     * @param pembayaran the pembayaran to set
     */
    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }

    /**
     * @return the jenisBarang
     */
    public String getJenisBarang() {
        return jenisBarang;
    }

    /**
     * @param jenisBarang the jenisBarang to set
     */
    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    /**
     * @return the beratBarang
     */
    public int getBeratBarang() {
        return beratBarang;
    }

    /**
     * @param beratBarang the beratBarang to set
     */
    public void setBeratBarang(int beratBarang) {
        this.beratBarang = beratBarang;
    }

    /**
     * @return the panjang
     */
    public double getPanjang() {
        return panjang;
    }

    /**
     * @param panjang the panjang to set
     */
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    /**
     * @return the tinggi
     */
    public double getTinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    /**
     * @return the lebar
     */
    public double getLebar() {
        return lebar;
    }

    /**
     * @param lebar the lebar to set
     */
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    /**
     * @return the dimensi
     */
    public double getDimensi() {
        return dimensi;
    }

    /**
     * @param dimensi the dimensi to set
     */
    public void setDimensi(double dimensi) {
        this.dimensi = dimensi;
    }

    /**
     * @return the dataTarif
     */
    public FileTarifKreditDAO getDataTarif() {
        return dataTarif;
    }

    /**
     * @param dataTarif the dataTarif to set
     */
    public void setDataTarif(FileTarifKreditDAO dataTarif) {
        this.dataTarif = dataTarif;
    }

    /**
     * @return the kotaTujuan
     */
    public String getKotaTujuan() {
        return kotaTujuan;
    }

    /**
     * @param kotaTujuan the kotaTujuan to set
     */
    public void setKotaTujuan(String kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }

    /**
     * @return the hargaPaket
     */
    public double getHargaPaket() {
        return hargaPaket;
    }

    /**
     * @param hargaPaket the hargaPaket to set
     */
    public void setHargaPaket(double hargaPaket) {
        this.hargaPaket = hargaPaket;
    }

    /**
     * @return the hargaKaliBerat
     */
    public double getHargaKaliBerat() {
        return hargaKaliBerat;
    }

    /**
     * @param hargaKaliBerat the hargaKaliBerat to set
     */
    public void setHargaKaliBerat() {
        this.hargaKaliBerat = this.hargaPaket * this.beratBarang;
    }

    /**
     * @return the hargaAsuransi
     */
    public double getHargaAsuransi() {
        return hargaAsuransi;
    }

    /**
     * @param hargaAsuransi the hargaAsuransi to set
     */
    public void setHargaAsuransi() {
        if(this.asuransi == true){
            this.hargaAsuransi = hargaKaliBerat + nilaAsuransi;
        }else if(this.asuransi == false){
            this.hargaAsuransi = hargaKaliBerat;
        }
    }
}

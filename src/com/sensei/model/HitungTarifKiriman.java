package com.sensei.model;

import com.sensei.DAO.FileTarifKreditDAO;
import com.sensei.DAO.HitungTipePaket;
import javax.swing.JOptionPane;

public class HitungTarifKiriman {

    FileTarifKreditDAO tarifdao = new FileTarifKreditDAO();
    HitungTipePaket tarifPaket = new HitungTipePaket();
    
    Pengirim sender = new Pengirim();
    Penerima recevier = new Penerima();

    private int berat;
    private int pangjang;
    private int lebar;
    private int tinggi;
    private String kota;
    private String provinsi;
    private String kotaTujuan;
    private String jenisBarang;
    private double tarifTujuan = 0.0;
    private double hargaBarang = 0.0;
    private double asuransi;
    private String noPaket;
    private boolean isAsuransi;
    private String tipePaket;
    private double paketReguler;
    private double paketExpress;
    private double paketSds;
    private double paketHds;
    private double paketOns;

    public HitungTarifKiriman() {
    }

    public HitungTarifKiriman(int berat, int pangjang, int lebar, int tinggi, String kota, String provinsi, String kotaTujuan, String jenisBarang, double asuransi, String noPaket, boolean isAsuransi, String tipePaket, double paketReguler, double paketExpress, double paketSds, double paketHds, double paketOns) {
        this.berat = berat;
        this.pangjang = pangjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kota = kota;
        this.provinsi = provinsi;
        this.kotaTujuan = kotaTujuan;
        this.jenisBarang = jenisBarang;
        this.asuransi = asuransi;
        this.noPaket = noPaket;
        this.isAsuransi = isAsuransi;
        this.tipePaket = tipePaket;
        this.paketReguler = paketReguler;
        this.paketExpress = paketExpress;
        this.paketSds = paketSds;
        this.paketHds = paketHds;
        this.paketOns = paketOns;
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
     * @return the paketReguler
     */
    public double getPaketReguler() {
        return paketReguler;
    }

    /**
     * @param paketReguler the paketReguler to set
     */
    public void setPaketReguler(double paketReguler) {
        this.paketReguler = paketReguler;
    }

    /**
     * @return the paketExpress
     */
    public double getPaketExpress() {
        return paketExpress;
    }

    /**
     * @param paketExpress the paketExpress to set
     */
    public void setPaketExpress(double paketExpress) {
        this.paketExpress = paketExpress;
    }

    /**
     * @return the paketSds
     */
    public double getPaketSds() {
        return paketSds;
    }

    /**
     * @param paketSds the paketSds to set
     */
    public void setPaketSds(double paketSds) {
        this.paketSds = paketSds;
    }

    /**
     * @return the paketHds
     */
    public double getPaketHds() {
        return paketHds;
    }

    /**
     * @param paketHds the paketHds to set
     */
    public void setPaketHds(double paketHds) {
        this.paketHds = paketHds;
    }

    /**
     * @return the paketOns
     */
    public double getPaketOns() {
        return paketOns;
    }

    /**
     * @param paketOns the paketOns to set
     */
    public void setPaketOns(double paketOns) {
        this.paketOns = paketOns;
    }

    /**
     * @return the isAsuransi
     */
    public boolean isIsAsuransi() {
        return isAsuransi;
    }

    /**
     * @param isAsuransi the isAsuransi to set
     */
    public void setIsAsuransi(boolean isAsuransi) {
        this.isAsuransi = isAsuransi;
    }

    /**
     * @return the berat
     */
    public int getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(int berat) {
        this.berat = berat;
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
     * @return the pangjang
     */
    public int getPangjang() {
        return pangjang;
    }

    /**
     * @param pangjang the pangjang to set
     */
    public void setPangjang(int pangjang) {
        this.pangjang = pangjang;
    }

    /**
     * @return the lebar
     */
    public int getLebar() {
        return lebar;
    }

    /**
     * @param lebar the lebar to set
     */
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    /**
     * @return the tinggi
     */
    public int getTinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    /**
     * @return the kota
     */
    public String getKota() {
        return kota;
    }

    /**
     * @param kota the kota to set
     */
    public void setKota(String kota) {
        this.kota = kota;
    }

    /**
     * @return the provinsi
     */
    public String getProvinsi() {
        return provinsi;
    }

    /**
     * @param provinsi the provinsi to set
     */
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    /**
     * @return the tarifTujuan
     */
    public double getTarifTujuan() {
        return tarifTujuan;
    }

    /**
     * @param tarifTujuan the tarifTujuan to set
     */
    public void setTarifTujuan(double tarifTujuan) {
        this.tarifTujuan = tarifTujuan;
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
     * @return the asuransi
     */
    public double getAsuransi() {
        return asuransi;
    }

    /**
     * @param asuransi the asuransi to set
     */
    public void setAsuransi(double asuransi) {
        this.asuransi = asuransi;
    }

    public double tarifAsuransi() {
        if (this.isAsuransi == true) {
            this.asuransi = getHargaBarang() * 0.3;
        } else if (this.isAsuransi == false) {
            this.asuransi = 0.0;
        }
        return asuransi;
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

    public void paketReg() {
        this.paketReguler = this.berat * this.paketReguler;
    }

    public void paketExp() {
        this.paketExpress = this.berat * this.paketExpress;
    }

    public void paketSds() {
        this.paketSds = this.berat * this.paketSds;
    }

    public void paketHds() {
        this.paketHds = this.berat * this.paketHds;
    }

    public void paketOns() {
        this.paketOns = this.berat * this.paketOns;
    }

    @Override
    public String toString() {
        return this.kotaTujuan;
    }
}

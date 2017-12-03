
package com.sensei.model;

public class FileTarif {
    private String provinsi;
    private String kota;
    private double reguler;
    private double express;
    private double sds;
    private double ons;
    private double hds;

    public FileTarif() {
    }

    public FileTarif(String provinsi, String kota, double reguler, double express, double sds, double ons, double hds) {
        this.provinsi = provinsi;
        this.kota = kota;
        this.reguler = reguler;
        this.express = express;
        this.sds = sds;
        this.ons = ons;
        this.hds = hds;
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
     * @return the reguler
     */
    public double getReguler() {
        return reguler;
    }

    /**
     * @param reguler the reguler to set
     */
    public void setReguler(double reguler) {
        this.reguler = reguler;
    }

    /**
     * @return the express
     */
    public double getExpress() {
        return express;
    }

    /**
     * @param express the express to set
     */
    public void setExpress(double express) {
        this.express = express;
    }

    /**
     * @return the sds
     */
    public double getSds() {
        return sds;
    }

    /**
     * @param sds the sds to set
     */
    public void setSds(double sds) {
        this.sds = sds;
    }

    /**
     * @return the ons
     */
    public double getOns() {
        return ons;
    }

    /**
     * @param ons the ons to set
     */
    public void setOns(double ons) {
        this.ons = ons;
    }

    /**
     * @return the hds
     */
    public double getHds() {
        return hds;
    }

    /**
     * @param hds the hds to set
     */
    public void setHds(double hds) {
        this.hds = hds;
    }
}

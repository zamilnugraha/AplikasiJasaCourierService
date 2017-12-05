package com.sensei.DAO;

import com.sensei.model.FileTarif;
import com.sensei.model.HitungTarifKiriman;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileTarifKreditDAO {

    private List<String> hitungTarifKota = new ArrayList<>();
    private List<HitungTarifKiriman> tarif = new ArrayList<>();

    public void daftarTarifPaket() {
        try {
            Scanner scan;
            scan = new Scanner(new File("C:\\Java\\Latihan15nov\\AplikasiJasaCourierService\\datatarif.txt"));
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] data = line.split(",");
                String provinsi = data[0];
                String kota = data[1].trim();
                double reguler = Double.parseDouble(data[2].trim());
                double express = Double.parseDouble(data[3].trim());
                double sds = Double.parseDouble(data[4].trim());
                double ons = Double.parseDouble(data[5].trim());
                double hdsreguler = Double.parseDouble(data[6].trim());

                HitungTarifKiriman hitung = new HitungTarifKiriman();
                hitung.setProvinsi(provinsi);
                hitung.setKotaTujuan(kota);
                hitung.setPaketReguler(hdsreguler);
                hitung.setPaketExpress(express);
                hitung.setPaketSds(sds);
                hitung.setPaketHds(sds);
                hitung.setPaketOns(ons);
                getTarif().add(hitung);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileTarifKreditDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String[] daftarTarifKota() {
        String[] arrayKota = {};
        try {
            Scanner scan;
            scan = new Scanner(new File("C:\\Java\\Latihan15nov\\AplikasiJasaCourierService\\datatarif.txt"));
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] data = line.split(",");
                String provinsi = data[0];
                String kota = data[1].trim();
                getHitungTarifKota().add(kota);

                HitungTarifKiriman hitung = new HitungTarifKiriman();
                hitung.setProvinsi(provinsi);
                hitung.setKotaTujuan(kota);
            }

            for (String kotas : getHitungTarifKota()) {
                arrayKota = getHitungTarifKota().toArray(new String[getHitungTarifKota().size()]);
                return arrayKota;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileTarifKreditDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayKota;
    }

    public String daftarProvinsi() {
        HitungTarifKiriman tarifss = new HitungTarifKiriman();
        String arrayProvinsi = "";
        try {
            Scanner scan;
            scan = new Scanner(new File("C:\\Java\\Latihan15nov\\AplikasiJasaCourierService\\datatarif.txt"));
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] data = line.split(",");
                String kota = data[1].trim();
                arrayProvinsi = data[0];
                tarifss.setProvinsi(arrayProvinsi);

                for (String provinsi : getHitungTarifKota()) {
                    if (kota.equalsIgnoreCase(tarifss.getKotaTujuan())) {
                        arrayProvinsi = data[0];
                        tarifss.setProvinsi(arrayProvinsi);
                    }
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileTarifKreditDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayProvinsi;
    }

    /**
     * @return the tarif
     */
    public List<HitungTarifKiriman> getTarif() {
        return tarif;
    }

    /**
     * @param tarif the tarif to set
     */
    public void setTarif(List<HitungTarifKiriman> tarif) {
        this.tarif = tarif;
    }

    /**
     * @return the hitungTarifKota
     */
    public List<String> getHitungTarifKota() {
        return hitungTarifKota;
    }

    /**
     * @param hitungTarifKota the hitungTarifKota to set
     */
    public void setHitungTarifKota(List<String> hitungTarifKota) {
        this.hitungTarifKota = hitungTarifKota;
    }
}

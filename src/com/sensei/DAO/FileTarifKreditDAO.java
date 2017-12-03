package com.sensei.DAO;

import com.sensei.model.FileTarif;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileTarifKreditDAO {
    
    private List<FileTarif> tarif = new ArrayList<>();
    
    public void daftarTarifPaket(){
        try {
            Scanner scan;
            
            scan = new Scanner(new File("C:/Java/Latihan15nov/AplikasiJasaCourierService/daftartarif.txt"));
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                String[]data = line.split(",");
                String provinsi = data[0];
                String kota = data[1].trim();
                double reguler = Double.parseDouble(data[2].trim());
                double express = Double.parseDouble(data[3].trim());
                double sds = Double.parseDouble(data[4].trim());
                double ons = Double.parseDouble(data[5].trim());
                double hdsreguler = Double.parseDouble(data[6].trim());
                
                FileTarif tarifFile = new FileTarif(provinsi, kota, reguler, express, sds, ons, sds);
                getTarif().add(tarifFile);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileTarifKreditDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the tarif
     */
    public List<FileTarif> getTarif() {
        return tarif;
    }

    /**
     * @param tarif the tarif to set
     */
    public void setTarif(List<FileTarif> tarif) {
        this.tarif = tarif;
    }
    
}

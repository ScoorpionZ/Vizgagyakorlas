/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galeriaprojekt;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Varadi.Akos
 */
public class Galaria extends KiallitasiTargy implements Cloneable{
    private String eleresiUt;
    private ArrayList<KiallitasiTargy> targy;

    public Galaria(String eleresiUt, ArrayList<KiallitasiTargy> targy, String keszito, String cim) {
        super(keszito, cim);
        this.eleresiUt = eleresiUt;
        this.targy = targy;
    }
    

    
    public void Letezik(){
        try {
            File file=new File(eleresiUt);
            System.out.println("megjelenites folyíamatban...");
        } catch (Exception e) {
            System.out.println("nem lehet megjeleniteni");
        }
    }

    public ArrayList<KiallitasiTargy> keszitorendez() {
            Collections.sort(targy, new keszitoComperto());
            return (ArrayList<KiallitasiTargy>) targy.clone();
        }
    
    public ArrayList<KiallitasiTargy> cimrendez() {
            Collections.sort(targy, new cimComparator());
            return (ArrayList<KiallitasiTargy>) targy.clone();
        }
     
    
}

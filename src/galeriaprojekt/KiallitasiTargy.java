/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galeriaprojekt;

/**
 *
 * @author Varadi.Akos
 */
public abstract class  KiallitasiTargy {
    private String keszito, cim;

    public KiallitasiTargy(String keszito, String cim) {
        this.keszito = keszito;
        this.cim = cim;
    }

    public String getKeszito() {
        return keszito;
    }

    public String getCim() {
        return cim;
    }


    
    
}

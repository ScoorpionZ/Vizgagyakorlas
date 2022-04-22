/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galeriaprojekt;

import java.text.Collator;
import java.util.Comparator;

/**
 *
 * @author Varadi.Akos
 */
public class keszitoComperto implements Comparator<KiallitasiTargy>{

    @Override
    public int compare(KiallitasiTargy o1, KiallitasiTargy o2) {
       Collator collator=Collator.getInstance();
       return collator.compare(o1.getKeszito(), o2.getKeszito());
    }
    
}

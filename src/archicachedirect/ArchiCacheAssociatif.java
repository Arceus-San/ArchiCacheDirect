/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archicachedirect;

import java.io.FileNotFoundException;

/**
 *
 * @author pedago
 */
public class ArchiCacheAssociatif {
    public static void main(String[] args) throws FileNotFoundException {
        for(int i=3; i<6 ;i++){
            CacheAsso cache = new CacheAsso((int) Math.pow(2, i),4);
            System.out.print("Nb entrées : 4 / "+"Nb Lignes : "+(int) Math.pow(2, i)+" ");
            System.out.println(cache.loadFile(32,i,"matrice10.txt"));
        }
        
    }
}

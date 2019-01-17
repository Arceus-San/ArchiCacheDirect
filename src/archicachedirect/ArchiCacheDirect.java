/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archicachedirect;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author pedago
 */
public class ArchiCacheDirect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        for(int i=2; i<8 ;i++){
            Cache cache = new Cache((int) Math.pow(2, i));
            System.out.print(i+" : ");
            System.out.println(cache.loadFile(32,i,"matrice10.txt"));
        }
        System.out.println("");
        for(int i=2; i<8 ;i++){
            Cache cache = new Cache((int) Math.pow(2, i));
            System.out.print(i+" : ");
            System.out.println(cache.loadFile(32,i,"alea10.txt"));
        }
    }
    
}

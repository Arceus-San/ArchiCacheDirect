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
        Cache cache = new Cache(8);
        System.out.println(cache.loadFile(32,3));
        int nblignes=2*2;
        int[] min ={};;
    }
    
}

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
public class ListeLignes extends ArrayList{
    
    public ListeLignes(String f) throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        
        File file = new File(f);
        input = new Scanner(file);
        
        while(input.hasNextLine()){
            String ligne = input.nextLine();
            String[] parts = ligne.split(":");
            this.add(parts[0]);
        }
    }
    
}

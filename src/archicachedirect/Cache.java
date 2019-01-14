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
public class Cache {
    
    private int cache[];
    private int tailleBloc;
    private int puiss_l;
    
    public Cache(int n){
        int temp[] = new int[n];
        for(int i=0;i<n;i++){
            temp[i]=-1;
        }
        this.cache=temp;
    }
    
    public ArrayList loadFile(int taillebloc,int puiss) throws FileNotFoundException{
        
        this.tailleBloc=taillebloc;
        this.puiss_l=puiss;
        
        Scanner input = new Scanner(System.in);
        File file = new File("matrice10.txt");
        
        int succes =0;
        int echecs=0;
        
        input = new Scanner(file);
        
        while(input.hasNextLine()){
            String lignefic = input.nextLine();
            String[] parts = lignefic.split(":");
            int val = Integer.parseInt(parts[0]);
            int ligne=(int) ((val/this.tailleBloc)%Math.pow(2, this.puiss_l));
            int etiquette=(int) ((val/this.tailleBloc)/Math.pow(2, this.puiss_l));
            
            if(this.cache[ligne]!=etiquette ){
                this.cache[ligne]=etiquette;
                echecs+=1;
            }else{
                succes+=1;
            }
        }
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(succes);
        res.add(echecs);
        res.add((5*succes)+(55*echecs));
        return res;
    }
    
}

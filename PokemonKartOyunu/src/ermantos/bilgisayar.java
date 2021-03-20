/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ermantos;

import java.util.ArrayList;
import java.util.Random;

public class bilgisayar extends Oyuncu{
    
    @Override
    public int kartSec(ArrayList<Pokemon> gercek) {
        Random r = new Random();
        int esik=gercek.size()-1;
        if(esik==0){
            return 0;
        }
        return r.nextInt(esik);
    }
    
}


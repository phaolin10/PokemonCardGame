/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ermantos;

import java.util.ArrayList;

public class Kullanıcı extends Oyuncu {

    @Override
    public int kartSec(ArrayList<Pokemon> gercek) {
        for (int i = 0; i < gercek.size(); i++) {
            
            if (gercek.get(i).KartKullanildimi()==true) {
              return i;
            }
            
        }
        return -1;
    }
    
    
    
}


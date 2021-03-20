/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ermantos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Bulbasaur extends Pokemon{
    int hasarPuanı=50;
     @Override
    public void butonAta(String foto, int x, int y, int z, int r) {
        super.butonAta("bulbasaur.png", x, y, z, r); //To change body of generated methods, choose Tools | Templates.
    }
    

    public Bulbasaur(String pokemonTip, String pokemonAdı) {
        super(pokemonTip, pokemonAdı);
         
    }

    public Bulbasaur() {
    }

    @Override
    public int getHasarPuanı() {
        return 50; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}


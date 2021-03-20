/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ermantos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Butterfree extends Pokemon {

    int hasarPuanı = 10;
     @Override
    public void butonAta(String foto, int x, int y, int z, int r) {
        super.butonAta("butterfree.jpg",  x, y, z, r); //To change body of generated methods, choose Tools | Templates.
    }

    public Butterfree(String pokemonTip, String pokemonAdı) {
        super(pokemonTip, pokemonAdı);
    }

    public Butterfree() {
    }

    @Override
    public int getHasarPuanı() {
        return 10; //To change body of generated methods, choose Tools | Templates.
    }

    
}

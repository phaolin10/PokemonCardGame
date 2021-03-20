/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ermantos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Squirtle extends Pokemon {
    int hasarPuanı = 30;
        @Override
    public void butonAta(String foto, int x, int y, int z, int r) {
        super.butonAta("Squirtle.png", x, y, z, r); //To change body of generated methods, choose Tools | Templates.
    }
     @Override
    public int getHasarPuanı() {
        return 30; //To change body of generated methods, choose Tools | Templates.
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ermantos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Pokemon {

    private int pokemonID;
    private int hasarPuanı ;
    private String pokemonTip;
    private String pokemonAdı;
    private boolean kartKullanildimi=false;
    private JButton button = new JButton();

    public Pokemon(String pokemonTip, String pokemonAdı) {
        this.pokemonTip = pokemonTip;
        this.pokemonAdı = pokemonAdı;
        
    }
   
    public Pokemon() {
       
        
    }

    public int getHasarPuanı() {
        return hasarPuanı;
    }

    public void setHasarPuanı(int hasarPuanı) {
        this.hasarPuanı = hasarPuanı;
    }
    

    public int getpokemonID() {
        return pokemonID;
    }

    public void setpokemonID(int a) {
        pokemonID = a;
    }

    public String getpokemonTip() {
        return pokemonTip;
    }

    public void setpokemonID(String b) {
        pokemonTip = b;
    }

    public String getpokemonAdı() {
        return pokemonAdı;
    }

    public void setpokemonAdı(String c) {
        pokemonAdı = c;
    }

   

    public boolean KartKullanildimi() {
        return kartKullanildimi;
    }
    

    public ImageIcon getResimYolu(ImageIcon resim) {
        return resim;
    }

    public void butonAta(String foto, int x, int y, int z, int r) {

        button.setIcon(new ImageIcon(this.getClass().getResource(foto)));
        button.setBounds(x, y, z, r);

    }

    public void ekle(JFrame Ata) {
        Ata.add(button);
        Ata.repaint();
        butonTık();
    }

    public void cikar(JFrame Ata) {

        Ata.remove(button);
        Ata.repaint();

    }

    public void butonTık() {
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                kartKullanildimi=true;
                
            }
        });
    }

}

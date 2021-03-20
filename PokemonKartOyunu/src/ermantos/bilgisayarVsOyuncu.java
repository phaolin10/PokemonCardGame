/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ermantos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author PC
 */
public class bilgisayarVsOyuncu {

    Random r = new Random();
    Kullanıcı kullanıcı = new Kullanıcı();
    bilgisayar bilgisayarnesne = new bilgisayar();
    JFrame anaFrame = new JFrame("Pokemon Oyunu");
    int[][] mevki1 = {{400, 60, 120, 150}, {620, 60, 120, 150}, {840, 60, 120, 150}};
    int[][] mevki2 = {{400, 500, 120, 150}, {620, 500, 120, 150}, {840, 500, 120, 150}};
    int[] ortaMevki1 = {520, 270, 120, 150};
    int[] ortaMevki2 = {740, 270, 120, 150};
    private ArrayList<Pokemon> deste = new ArrayList<>();
    private ArrayList<Pokemon> oyuncu = new ArrayList<>();
    private ArrayList<Pokemon> bilgisayar = new ArrayList<>();

    JLabel pcSkor = new JLabel("Skor:");
    JLabel oyuncuSkor = new JLabel("Skor:");
    Pikachu pikachu = new Pikachu();
    Psyduck psyduck = new Psyduck();
    Snorlax snorlax = new Snorlax();
    Squirtle squirtle = new Squirtle();
    Zubat zubat = new Zubat();
    Bulbasaur bulbasaur = new Bulbasaur();
    Butterfree butterfree = new Butterfree();
    Charmander charmander = new Charmander();
    Jigglypuff jigglypuff = new Jigglypuff();
    Meowth meowth = new Meowth();

    public bilgisayarVsOyuncu() {

        //anaFrame.setSize(1366,768);
        JLabel pcFoto = new JLabel();
        JLabel oyuncuFoto = new JLabel();
        JLabel pcAd = new JLabel("Bilgisayar");
        JLabel oyuncuAd = new JLabel("Oyuncu");

        pcFoto.setBounds(20, 60, 232, 217);
        oyuncuFoto.setBounds(1100, 400, 232, 217);
        pcAd.setBounds(100, 250, 100, 100);
        oyuncuAd.setBounds(1200, 520, 232, 217);
        pcSkor.setBounds(100, 220, 232, 217);
        oyuncuSkor.setBounds(1200, 550, 232, 217);
        pcFoto.setIcon(new ImageIcon(this.getClass().getResource("pc.jpg")));
        oyuncuFoto.setIcon(new ImageIcon(this.getClass().getResource("ash.jpg")));
        anaFrame.add(pcFoto);
        anaFrame.add(oyuncuFoto);
        anaFrame.add(pcAd);
        anaFrame.add(oyuncuAd);
        anaFrame.add(pcSkor);
        anaFrame.add(oyuncuSkor);

        anaFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        anaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        anaFrame.setLayout(null);
        anaFrame.setVisible(true);

    }

    public void kartDagit() {
        deste.add(0, pikachu);
        deste.add(1, bulbasaur);
        deste.add(2, zubat);
        deste.add(3, meowth);
        deste.add(4, butterfree);
        deste.add(5, snorlax);
        deste.add(6, squirtle);
        deste.add(7, charmander);
        deste.add(8, jigglypuff);
        deste.add(9, psyduck);

        // System.out.println(deste.get(0));
        int esik = 10, index;
        for (int i = 0; i < 3; i++) { // oyuncuya kartları dağıtıyor.
            index = r.nextInt(esik);
            oyuncu.add(deste.get(index));

            deste.remove(index);
            esik--;

        }
        for (int i = 0; i < 3; i++) { // oyuncuya kartları dağıtıyor.
            index = r.nextInt(esik);
            bilgisayar.add(deste.get(index));

            deste.remove(index);
            esik--;

        }

    }

    public void savas() throws InterruptedException {

        for (int i = 0; i < 3; i++) {

            oyuncu.get(i).butonAta("", mevki2[i][0], mevki2[i][1], mevki2[i][2], mevki2[i][3]);
            bilgisayar.get(i).butonAta("", mevki1[i][0], mevki1[i][1], mevki1[i][2], mevki1[i][3]);
            oyuncu.get(i).ekle(anaFrame);
            bilgisayar.get(i).ekle(anaFrame);
        }
        int döndür = -1;
        for (int i = 0; i < 5; i++) {
            while (döndür == -1) {
                döndür = kullanıcı.kartSec(oyuncu);
            }

            oyuncu.get(döndür).cikar(anaFrame);
            oyuncu.get(döndür).butonAta("", ortaMevki1[0], ortaMevki1[1], ortaMevki1[2], ortaMevki1[3]);
            oyuncu.get(döndür).ekle(anaFrame);

            int a = bilgisayarnesne.kartSec(oyuncu);
            bilgisayar.get(a).butonAta("", ortaMevki2[0], ortaMevki2[1], ortaMevki2[2], ortaMevki2[3]);
            bilgisayar.get(a).ekle(anaFrame);

            if (oyuncu.get(döndür).getHasarPuanı() < bilgisayar.get(a).getHasarPuanı()) {
                bilgisayarnesne.setskor(bilgisayarnesne.getskor() + 5);

            } else if (oyuncu.get(döndür).getHasarPuanı() > bilgisayar.get(a).getHasarPuanı()) {
                System.out.println(oyuncu.get(döndür).getHasarPuanı());

                kullanıcı.setskor(kullanıcı.getskor() + 5);
            } else {
                kullanıcı.setskor(kullanıcı.getskor());
                bilgisayarnesne.setskor(bilgisayarnesne.getskor());
            }
            pcSkor.setText("Skor: " + bilgisayarnesne.getskor());
            oyuncuSkor.setText("Skor: " + kullanıcı.getskor());
            Thread.sleep(2000);

            bilgisayar.get(a).cikar(anaFrame);
            oyuncu.get(döndür).cikar(anaFrame);
            oyuncu.remove(döndür);
            bilgisayar.remove(a);

            if (deste.size() > 0) {
                int yeni = r.nextInt(deste.size());
                oyuncu.add(döndür, deste.get(yeni));
                deste.remove(yeni);
                oyuncu.get(döndür).butonAta("", mevki2[döndür][0], mevki2[döndür][1], mevki2[döndür][2], mevki2[döndür][3]);
                oyuncu.get(döndür).ekle(anaFrame);
                yeni = r.nextInt(deste.size());
                bilgisayar.add(a, deste.get(yeni));
                deste.remove(yeni);
                bilgisayar.get(a).butonAta("", mevki1[a][0], mevki1[a][1], mevki1[a][2], mevki1[a][3]);
                bilgisayar.get(a).ekle(anaFrame);

            }

            döndür = -1;

        }
        String kazananOyuncu=" ";
        if (kullanıcı.getskor() > bilgisayarnesne.getskor()) {
            kazananOyuncu = "Oyuncu";
        }else if ( kullanıcı.getskor() == bilgisayarnesne.getskor())
        {
            kazananOyuncu="Berabere";
        } 
        
        else {
            kazananOyuncu = "Bilgisayar";
        }

        JFrame kazanan = new JFrame();
        JLabel kazananJLabel = new JLabel(kazananOyuncu);
        kazanan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        kazananJLabel.setText("Kazanan Oyuncu :"+kazananOyuncu);
        kazananJLabel.setBounds(20, 20, 200, 30);
        kazanan.add(kazananJLabel,BorderLayout.CENTER);
        kazanan.setSize(200, 200);
        kazanan.setLayout(null);
        kazanan.setVisible(true);
        
        anaFrame.dispose();

    }

}

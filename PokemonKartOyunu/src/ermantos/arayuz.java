package ermantos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ismail
 */
public class arayuz {

    private JFrame giriş;
    private JButton bilgisayar; // bilgisayar v bilgisayar
    private JButton kullanici; // kullanıcı v bilgisayar
    private JLabel oyuncuID;
    private JLabel oyuncuAdı;
    private JTextField yazdır;
    private JTextField yazdır1;
    private JButton tamamButon;
    private String isim1, isim2;
    public boolean tiklandiMiOyuncu = false;
    public boolean tiklandiMiBilgisayar = false;

    public arayuz() {
        giriş = new JFrame("girişarayüzü");
        int x = 1366, y = 768;

        giriş.setLayout(null);

        bilgisayar = new JButton("kullanıcı v bilgisayar ");
        giriş.add(bilgisayar);

        bilgisayar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Scanner a = new Scanner(System.in);
                giriş.dispose();
                JFrame giriş2 = new JFrame("girişarayüzü2");
                oyuncuID = new JLabel("oyuncuID");
                giriş2.getContentPane().add(oyuncuID);
                yazdır = new JTextField(20);
                giriş2.getContentPane().add(yazdır);

                oyuncuAdı = new JLabel("oyuncu adı ");
                giriş2.getContentPane().add(oyuncuAdı);
                yazdır1 = new JTextField(20);
                giriş2.getContentPane().add(yazdır1);

                tamamButon = new JButton("Tamam");
                tamamButon.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        isim1 = yazdır.getText();
                        isim2 = yazdır1.getText();
                        tiklandiMiOyuncu = true;
                        // System.out.println(isim1+"  "+isim2);
                    }
                });

                giriş2.add(tamamButon);
                tamamButon.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String oyuncuID = yazdır.getText();
                        String oyuncuAdı = yazdır1.getText();
                        Oyuncu.setoyuncuID(oyuncuID);
                    }
                }
                );

                giriş2.setTitle("");
                giriş2.setLayout(new FlowLayout());

                giriş2.setSize(x, y);
                giriş2.setVisible(true);

                giriş2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }

        });

        kullanici = new JButton("bilgisayar v bilgisayar ");
        giriş.add(kullanici);
        kullanici.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                JFrame giriş2 = new JFrame("girişarayüzü2");

                oyuncuAdı = new JLabel("oyuncu adı ");
                giriş2.getContentPane().add(oyuncuAdı);
                yazdır = new JTextField(20);
                giriş2.getContentPane().add(yazdır);

                tamamButon = new JButton("Tamam");
                tamamButon.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        isim1 = yazdır.getText();

                        System.out.println(isim1);
                        tiklandiMiBilgisayar = true;
                    }
                });

                giriş2.add(tamamButon);

                giriş2.setTitle("");
                giriş2.setLayout(new FlowLayout());

                giriş2.setSize(x, y);

                giriş2.setVisible(true);

                giriş2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }

        });

        giriş.setTitle("Pokemon");

        giriş.setLayout(new FlowLayout());

        giriş.setSize(x, y);

        giriş.setVisible(true);

        giriş.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

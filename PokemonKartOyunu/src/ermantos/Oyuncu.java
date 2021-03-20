/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ermantos;

import java.util.ArrayList;

public abstract class Oyuncu {
    public static String oyuncuID;
    public static String oyuncuAdı;
    public  int skor=0;// STATİC OLMAMALI
    public static String getoyuncuID()
    {
                return oyuncuID;
    }
    public static void setoyuncuID(String a)
    {
        oyuncuID=a;
    }
     public static String getoyuncuAdı()
    {
                return oyuncuAdı;
    }
    public static void setoyuncuAdı(String b)
    {
        oyuncuAdı = b;
    } 
     public int getskor()
    {
                return skor;
    }
    public void setskor(int c)
    {
        skor=c;
    }
    public abstract int kartSec(ArrayList<Pokemon> gercek); // abstract olarak tanimlardik.
    
    
}


package com.example.taller_listview;

import java.util.ArrayList;

public class Datos {

    private static ArrayList<Historial> historiales = new ArrayList();

    public static void guardar (Historial h){
        historiales.add(h);
    }
    public static ArrayList<Historial> obetener (){
        return historiales;
    }
}

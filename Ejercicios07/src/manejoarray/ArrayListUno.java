/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ArrayListUno {
    public static void main(String[] args) {
        
        // creación de un ArrayList
        
        ArrayList <Integer> arreglo = new ArrayList<>();
        
        arreglo.add(10);
        arreglo.add(20);
        arreglo.add(30);
        arreglo.add(40);
        arreglo.add(50);
        arreglo.add(60);
        
        for (int i = 0; i < arreglo.size(); i++) {
            System.out.println(arreglo.get(i));
        }
        /*
        ArrayList <String> arreglo2 = new ArrayList<>();
        ArrayList <Double> arreglo3 = new ArrayList<>();
        ArrayList <Boolean> arreglo4 = new ArrayList<>();
        */
    }
}

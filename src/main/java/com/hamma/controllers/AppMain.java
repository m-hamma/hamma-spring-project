/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hamma.controllers;

import java.util.ArrayList;
import java.util.Iterator;

import com.hamma.models.MemoryDiagram;

/**
 *
 * @author hamma
 */
public class AppMain {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator<Integer> it = list.iterator();
        //list.add(50);
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        
        //memory
        MemoryDiagram md1 = new MemoryDiagram();
        System.out.println(md1.getS());
        System.out.println(md1.getI());
        System.out.println(md1.getD());
        System.out.println(md1.getC());
        System.out.println(md1.getAl()[0]);
        System.out.println(md1.getAl()[1]);
    }

}

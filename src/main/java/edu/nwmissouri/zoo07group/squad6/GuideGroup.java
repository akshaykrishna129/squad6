/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

import java.util.ArrayList;

/**
 *
 * @author Vamsi Bhogireddy
 */
/**
 * 
 * Doctor group for Squad6 App
 */
public class GuideGroup {
     private static ArrayList<Guide> Gud;
     public static int create() {
        Gud = new ArrayList<>();
        
        Guide d = new Guide("Animal");
        Gud.add(d);
        Gud.add(new Guide("Animal"));
        Gud.add(new Guide("Animal"));

        return Gud.size();
    }
     public static void run() {
        System.out.println("####################");
        System.out.println("Hey - look at the Profession!");
        Gud.forEach(Guide -> {
            Guide.workableDays();
            Guide.experience();
            Guide.role();
            Guide.salary();
        });
        System.out.println("My Guide Attributes");
        System.out.println("#################");
    }

    
}
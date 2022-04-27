package com.cc.java;

import java.util.ArrayList;
import java.util.Collections;


public class App {
    
    public static void main(String[] args) {
     
      	// ArrayList (AL) anlegen ...
        // ArrayList<String> carMakers = new ArrayList<>();

        // output("AL: " + carMakers);
        // output("Elementenanzahl: " + carMakers.size());

        // // AL dynamisch füllen (JS --> push() / J --> add())
        // carMakers.add("Volvo");
		// carMakers.add("BMW");
		// carMakers.add("Ford");
		// carMakers.add("Honda");
		// carMakers.add("Tesla");

        // output("AL: " + carMakers);
        // output("Elementenanzahl: " + carMakers.size());
        
        // // Daten aus AL lesen
        // output("1. Element: " + carMakers.get(0));
        // output("Letztes Element: " + carMakers.get(carMakers.size()-1));

        // output(" ");
        // output("------- Iteration 1 -----------");

        // for (int i = 0; i < carMakers.size(); i++) {
        //     System.out.print(carMakers.get(i) + " ");
        // }

        // output(" ");
        // output("------- Iteration 2 -----------");

        // for (String boo : carMakers) {
        //     System.out.print(boo + " "); 
        // }

        // // Daten in AL ersetzen / Überschreiben
        // output(" ");
        // carMakers.set(1, "MB");
        // output("AL: " + carMakers);
        
        // output(" ");
        // output("------- Sortierung -----------");

        // Collections.sort(carMakers);
        // output("AL: " + carMakers);
        // output("1. Element: " + carMakers.get(0));
        
        // // Daten entfernen (JS --> pop(); J --> remove())
        // carMakers.remove(0);
        // output("AL: " + carMakers);
        // carMakers.remove(carMakers.size()-1);
        // output("AL: " + carMakers);

        // // AL leeren ...
        // carMakers.clear();
        // output("AL: " + carMakers);

        // int --> AL
        // ArrayList<String> strList = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();

        // int boo = 2;
        Integer boo = 2;
        output("Wert: " + boo.intValue());

        intList.add(10);
        intList.add(11);
        intList.add(12);

        output("AL: " + intList);


    }





    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}


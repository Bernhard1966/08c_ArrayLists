package com.cc.java;

import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) {
     
      	// ArrayList (AL) anlegen ...
        ArrayList<String> carMakers = new ArrayList<>();

        output("AL: " + carMakers);
        output("Elementenanzahl: " + carMakers.size());

        // AL dynamisch füllen (JS --> push() / J --> add())
        carMakers.add("Volvo");
		carMakers.add("BMW");
		carMakers.add("Ford");
		carMakers.add("Honda");
		carMakers.add("Tesla");

        output("AL: " + carMakers);
        output("Elementenanzahl: " + carMakers.size());
        
        // Daten aus AL lesen
        output("1. Element: " + carMakers.get(0));
        output("Letztes Element: " + carMakers.get(carMakers.size()-1));

    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}


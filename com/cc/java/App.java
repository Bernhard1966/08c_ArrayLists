package com.cc.java;

import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) {
        // ArryList  (AL) anlegen ....
        ArrayList<String> carMakers = new ArrayList<>();
        output("Al: " + carMakers);
        output("EleMentenanzahl " + carMakers.size());
        // AL dynamisch füllen (JS --> push() { J --> add()})
        carMakers.add("Volvo");

        carMakers.add("BMW");

        carMakers.add("Ford");

        carMakers.add("Honda");

        carMakers.add("Tesla");
        output("AL: " + carMakers);
     //  output("elemetenanzahl" + carMakers.length() );
        output("1. Element: " +  carMakers.get(0));
        output("letze  Element: " +  carMakers.get( carMakers.size() -1 ));
        for (int i = 0; i<carMakers.size(); i++){

            System.out.print(carMakers.get(i) + " ");
        }
        {

            output("" );
            output("------------iteration 2 ");
            for (String element : carMakers){
                System.out.println( element + " ");

            }
        }
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}


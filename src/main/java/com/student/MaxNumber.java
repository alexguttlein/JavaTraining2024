package com.student;

import java.util.Arrays;

public class MaxNumber {
    
    public MaxNumber(){};

    public long print(long number) {

        //convierto el long en string para ingresarlo en un vector de enteros
        int longitud = String.valueOf(number).length();
        int[] digitos = new int[longitud];

        for (int i = 0; i < longitud; i++){
            digitos[i] = (int)(number % 10);
            number = number / 10;
        }
        
        //ordeno el array de numeros
        Arrays.sort(digitos);

        //recorro el array de enteros (empezando por el final) 
        //y los agrego a una nueva cadena
        String numComoString = "";
        for (int i = longitud-1; i >= 0; i--){
            numComoString += digitos[i];
        }

        //convierto la cadena en long
        number = Long.parseLong(numComoString);

        return number;
    }
}
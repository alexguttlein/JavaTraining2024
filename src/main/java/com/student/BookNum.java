package com.student;

public class BookNum {
    
    public BookNum(){}

    public static long pageDigits(long pages) {

        long cantMaxDigitos = Long.toString(pages).length();
        long rTotal = 0;
        long pageTotal = 0;

        int i;
        for (i = 0; i < cantMaxDigitos-1; i++){
            pageTotal += 9 * (long)(Math.pow(10, i));
            rTotal += 9 * (long)(Math.pow(10, i)) * (i+1);
        }

        rTotal += (pages - pageTotal) * cantMaxDigitos;
        
        return rTotal;
    }
    
}

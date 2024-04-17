package com.student;

public class Main {
    public static void main(String[] args) {
/*        int[] marks = {1, 100, 20, 50, 85, 101};

        Student student = new Student("Alex", marks);
 
        System.out.println("number of marks: " + student.getNumberOfMarks());
        System.out.println("total sum of marks: " + student.getTotalSumOfMarks());
        System.out.println("maximim marks: " + student.getMaximumMark());
        System.out.println("minimum marks: " + student.getMinimumMark());
        System.out.println("average of marks: " + student.getAverageMarks());
*/
        System.out.println("MAX NUMBER");
        //MAX NUMBER 
        MaxNumber max = new MaxNumber();
        long n = 12345l;
        System.out.println(max.print(n));
        
        System.out.println("**************************************");
        
        //ROBOT
        System.out.println("ENSEÑAR PALABRAS A ROBOT");
        Robot vicky = new Robot();
        System.out.println(vicky.learnWord(""));
        System.out.println(vicky.learnWord("YOu"));
        System.out.println(vicky.learnWord("YOu"));
        System.out.println(vicky.learnWord("goodbye"));
        System.out.println(vicky.learnWord("thank"));
        System.out.println(vicky.learnWord("THank"));
        System.out.println(vicky.learnWord("Hello"));
        System.out.println(vicky.learnWord("wow!"));
        vicky.mostrar();
         
        System.out.println("**************************************");

        //LIBROS
        System.out.println("CONTADOR DIGITOS DE PAGINAS");
        //BookNum bookNum = new BookNum();
        //System.out.println(bookNum.pageDigits(100));

        System.out.println("**************************************");

        //BLOQUE
        System.out.println("CALCULAR MEDIDAS DE UN BLOQUE");
        Block b = new Block(new int[]{2,4,6});
        
        System.out.println(b.getWidth());
        System.out.println(b.getLength());
        System.out.println(b.getHeight());
        System.out.println(b.getVolume());
        System.out.println(b.getSurfaceArea());

        System.out.println("**************************************");

        //FRACCIONES
        System.out.println("SUMAR FRACCIONES");
        Fraction fraction = new Fraction(1434L, 15774L);
        System.out.println(fraction.add(new Fraction(1854L, 20394L)));

        System.out.println("**************************************");

    }
}
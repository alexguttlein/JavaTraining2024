package com.student;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private final int maxAscii = 255;
    private List<String> palabrasConocidas = new ArrayList<>();
    private List<Character> caracteresInvalidos = new ArrayList<>();

    public Robot(){
        initCaractInvalidos();
        initPalabrasConocidas();
    }

    private void initPalabrasConocidas() {
        String[] palabrasIniciales = {"I", "do", "not", "understand", "the", "input",
                                    "already", "know", "word", "Thank", "you", "for", "teaching", "me"};
        
        for (String c : palabrasIniciales){
            this.palabrasConocidas.add(c);
        }
    }

    private void initCaractInvalidos() {
        for (int i = 0; i < this.maxAscii; i++){
            if ((i < 65) || (i > 90 && i < 97) || (i > 122))
                this.caracteresInvalidos.add((char)i);
        }
    }

    private boolean compararStrings(String string){
        
        for (String s: this.palabrasConocidas){
            if (string.toLowerCase().equals(s.toLowerCase())){
                return true;
            }
        }
        return false;
    }


    public String learnWord(String string) {
        if (string.equals(""))
            return ("I do not understand the input");
            
        for (char c: string.toCharArray()){
            if (caracteresInvalidos.contains(c))
                return ("I do not understand the input");
        }

        if (compararStrings(string)){
            return ("I already know the word " + string);
        } else {
            this.palabrasConocidas.add(string);
            return ("Thank you for teaching me " + string);
        }

    }

    public void mostrar(){
        for (String s : this.palabrasConocidas){
            System.out.println(s);
        }
    }
}

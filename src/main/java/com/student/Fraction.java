package com.student;

public class Fraction implements Comparable<Fraction>
{
  private final long top;
  private final long bottom;

  public Fraction(long numerator, long denominator) {
      top = numerator;
      bottom = denominator;
  }

  @Override
  public int hashCode() { return 17 * Long.hashCode(top) + Long.hashCode(bottom); }    
  @Override
  public boolean equals(Object o) { return compareTo((Fraction)o) == 0; }    
  @Override
  public int compareTo(Fraction f2){ return Long.compare(top * f2.bottom, f2.top * bottom); }
  

  public Fraction add(Fraction f2) {    

    //calculo el multiplo comun minimo entre los denominadores para que sea el nuevo denominador
    long bottomComun = this.getBottom() * f2.getBottom();

    //calcula la suma de los nuevos numeradores obtenidos por el nuevo denominador
    long numeradorSuma = this.getTop() * f2.getBottom() + this.getBottom() * f2.getTop();
    System.out.println(numeradorSuma);
    System.out.println(bottomComun);
    //devuelvo la fraccion en su minima expresion posible
    return obtenerMinimaExpresion(numeradorSuma, bottomComun);
  }


  private Fraction obtenerMinimaExpresion(long numerador, long denominador) {
    //obtengo el maximo comun divisor  
    long mcd = mcd(numerador, denominador);
    
    numerador /= mcd;
    denominador /= mcd;

    return new Fraction(numerador, denominador);
  }


  private long mcd(long numerador, long denominador) {
      while (denominador != 0) { //20 / 8
          long temp = denominador; //4
          denominador = numerador % denominador; //0
          numerador = temp; //4
      }
      return numerador;
  }


  public long getTop(){
    return this.top;
  }


  public long getBottom(){
    return this.bottom;
  }


  @Override
  public String toString() {
    return String.valueOf(this.top) + "/" + String.valueOf(this.bottom);
  }
}

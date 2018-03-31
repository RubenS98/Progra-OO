/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
import java.io.*;
public class Fraccion{
  private int num;
  private int den;

  public Fraccion(int num, int den) throws ArithmeticException{
    if(den==0){
      throw new ArithmeticException("Denominador no puede ser igual a 0.");
    }
    if((num>0 && den<0) || (num<0 && den<0)){
      this.num=num*(-1);
      this.den=den*(-1);
    }
    else{
      this.num=num;
      this.den=den;
    }
  }

  public Fraccion(int num){
    this(num, 1);
  }

  public Fraccion(){
    this(0, 1);
  }

  public int getNumerador(){
    return num;
  }

  public int getDenominador(){
    return den;
  }

  public String toString(){
    return num+"/"+den;
  }

  public double toDouble(){
    return ((double)num/(double)den);
  }

  public Fraccion add(Fraccion f){
    int denominador;
    int numerador;
    Fraccion fr;
    if(den!=f.den){
      denominador=den*f.den;
      numerador=(num*f.den)+(f.num*den);
    }
    else{
      numerador=num+f.num;
      denominador=den;
    }

    fr=new Fraccion(numerador, denominador);
    return fr;
  }

  public Fraccion substract(Fraccion f){
    int denominador;
    int numerador;
    Fraccion fr;

    if(den!=f.den){
      denominador=den*f.den;
      numerador=(num*f.den)-(f.num*den);
    }
    else{
      numerador=num-f.num;
      denominador=den;
    }

    fr=new Fraccion(numerador, denominador);
    return fr;
  }

  public Fraccion multiply(Fraccion f){
    int denominador;
    int numerador;
    Fraccion fr;

    denominador=den*f.den;
    numerador=num*f.num;

    fr=new Fraccion(numerador, denominador);
    return fr;
  }

  public Fraccion divide(Fraccion f) throws ArithmeticException{
    int denominador;
    int numerador;
    Fraccion fr;

    denominador=den*f.num;
    numerador=num*f.den;

    if(denominador==0){
      throw new ArithmeticException("El denominador no puede dar 0.");
    }

    fr=new Fraccion(numerador, denominador);
    return fr;
  }

  public void toLowestTerms(){
    int num1=0;
    int num2=0;
    int gcd=0;

    if(num>den){
      num1=num;
      num2=den;
    }
    else{
      num1=den;
      num2=num;
    }

    gcd=gcd(num1, num2);

    if(gcd<0){
      num=(num/gcd)*(-1);
      den=den/gcd*(-1);
    }
    else{
      num=num/gcd;
      den=den/gcd;
    }
  }

  public static int gcd(int p, int q){
      int mcd=0;
      if(q==0){
        return p;
      }
      else{
        return gcd(q, p%q);
      }
  }

  public boolean equals(Object o){
    if(o instanceof Fraccion){
      Fraccion f=(Fraccion)o;
      if((num*f.den)==(den*f.num)){
        return true;
      }
      else{
        return false;
      }
    }
    else{
      return false;
    }
  }

}

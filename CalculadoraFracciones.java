/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
import java.io.*;
import java.util.*;
import java.lang.Object;
public class CalculadoraFracciones{
  public static void main(String[] args) {
      int opcion=0;
      Scanner lectura=new Scanner(System.in);
      System.out.println("Bienvenido a la Calculadora de Fracciones");


      do{
          System.out.println("Escriba el numero correspondiente a la opcion que quiera elegir.");
          System.out.println("\t1-Imprimir fraccion");
          System.out.println("\t2-Simplificar fraccion");
          System.out.println("\t3-Sumar fracciones");
          System.out.println("\t4-Restar fracciones");
          System.out.println("\t5-Multiplicar fracciones");
          System.out.println("\t6-Dividir fracciones");
          System.out.println("\t7-Calcular fraccion");
          System.out.println("\t8-Comparar fracciones");
          System.out.println("\t9-Salir");
          opcion=lectura.nextInt();
          System.out.println();
          switch(opcion){
              case 1:
                  printF();
                  break;
              case 2:
                  simpF();
                  break;
              case 3:
                  sumarF();
                  break;
              case 4:
                  restarF();
                  break;
              case 5:
                  multF();
                  break;
              case 6:
                  divF();
                  break;
              case 7:
                  calF();
                  break;
              case 8:
                  compF();
                  break;
              case 9:
                  System.out.println("Regrese pronto.");
                  break;
              default:
                  System.out.println("Esa opcion no es valida.");
                  break;
          }

      }while(opcion!=9);
  }

  public static void printF(){
      Scanner lectura=new Scanner(System.in);
      int numerador;
      int denominador;
      boolean valid=false;

      do{
      try{
          System.out.println("Imprimir Fracciones");
          System.out.println("Escriba el numerador.");
          numerador=lectura.nextInt();
          System.out.println("Escriba el denominador.");
          denominador=lectura.nextInt();

          Fraccion f=new Fraccion(numerador, denominador);
          System.out.println("La fraccion es: "+f);
          f.toLowestTerms();
          System.out.println("Simplificada: "+f);

          valid=true;
        }
        catch(ArithmeticException ae){
          System.err.println("ArithmeticException: " + ae.getMessage());
          System.out.println("Vuelva a intentarlo.");
          System.out.println();
        }
        catch(InputMismatchException ime){
          System.err.println("InputMismatchException: " + ime.getMessage());
          System.out.println("Entrada no es valida. Por favor escriba numeros enteros.");
          lectura.nextLine();
          System.out.println();
        }

      }while(valid==false);
      System.out.println();
  }

  public static void simpF(){
    Scanner lectura=new Scanner(System.in);
    int numerador;
    int denominador;
    boolean valid=false;

    do{
    try{
        System.out.println("Simplificar Fracciones");
        System.out.println("Escriba el numerador.");
        numerador=lectura.nextInt();
        System.out.println("Escriba el denominador.");
        denominador=lectura.nextInt();

        Fraccion f=new Fraccion(numerador, denominador);
        System.out.println("La fraccion es: "+f);
        f.toLowestTerms();
        System.out.println("La fraccion simplificada es: "+f);

        valid=true;
      }
      catch(ArithmeticException ae){
        System.err.println("ArithmeticException: " + ae.getMessage());
        System.out.println("Vuelva a intentarlo.");
        System.out.println();
      }
      catch(InputMismatchException ime){
        System.err.println("InputMismatchException: " + ime.getMessage());
        System.out.println("Entrada no es valida. Por favor escriba numeros enteros.");
        lectura.nextLine();
        System.out.println();
      }

    }while(valid==false);
    System.out.println();
  }

  public static void sumarF(){
    Scanner lectura=new Scanner(System.in);
    int numerador;
    int denominador;
    boolean valid=false;

    do{
    try{
        System.out.println("Sumar Fracciones");
        System.out.println("Escriba el numerador de la primera fraccion.");
        numerador=lectura.nextInt();
        System.out.println("Escriba el denominador de la primera fraccion.");
        denominador=lectura.nextInt();

        Fraccion f=new Fraccion(numerador, denominador);
        System.out.println("Primera fraccion: "+f);

        System.out.println("Escriba el numerador de la segunda fraccion.");
        numerador=lectura.nextInt();
        System.out.println("Escriba el denominador de la segunda fraccion.");
        denominador=lectura.nextInt();

        Fraccion f1=new Fraccion(numerador, denominador);
        System.out.println("Segunda fraccion: "+f1);

        Fraccion f2=f.add(f1);

        System.out.println(f+" + "+f1+" es igual a: "+f2);

        f2.toLowestTerms();
        System.out.println("La fraccion simplificada es: "+f2);

        valid=true;
      }
      catch(ArithmeticException ae){
        System.err.println("ArithmeticException: " + ae.getMessage());
        System.out.println("Vuelva a intentarlo.");
        System.out.println();
      }
      catch(InputMismatchException ime){
        System.err.println("InputMismatchException: " + ime.getMessage());
        System.out.println("Entrada no es valida. Por favor escriba numeros enteros.");
        lectura.nextLine();
        System.out.println();
      }

    }while(valid==false);
    System.out.println();
  }

  public static void restarF(){
    Scanner lectura=new Scanner(System.in);
    int numerador, denominador;
    boolean valid=false;

    do{
    try{
        System.out.println("Restar Fracciones");
        System.out.println("Escriba el numerador de la primera fraccion.");
        numerador=lectura.nextInt();
        System.out.println("Escriba el denominador de la primera fraccion.");
        denominador=lectura.nextInt();

        Fraccion f=new Fraccion(numerador, denominador);
        System.out.println("Primera fraccion: "+f);

        System.out.println("Escriba el numerador de la segunda fraccion.");
        numerador=lectura.nextInt();
        System.out.println("Escriba el denominador de la segunda fraccion.");
        denominador=lectura.nextInt();

        Fraccion f1=new Fraccion(numerador, denominador);
        System.out.println("Segunda fraccion: "+f1);

        Fraccion f2=f.substract(f1);

        System.out.println(f+" - "+f1+" es igual a: "+f2);

        f2.toLowestTerms();
        System.out.println("La fraccion simplificada es: "+f2);

        valid=true;
      }
      catch(ArithmeticException ae){
        System.err.println("ArithmeticException: " + ae.getMessage());
        System.out.println("Vuelva a intentarlo.");
        System.out.println();
      }
      catch(InputMismatchException ime){
        System.err.println("InputMismatchException: " + ime.getMessage());
        System.out.println("Entrada no es valida. Por favor escriba numeros enteros.");
        lectura.nextLine();
        System.out.println();
      }

    }while(valid==false);
    System.out.println();
  }

  public static void multF(){
    Scanner lectura=new Scanner(System.in);
    int numerador, denominador;
    boolean valid=false;

    do{
    try{
        System.out.println("Multiplicar Fracciones");
        System.out.println("Escriba el numerador de la primera fraccion.");
        numerador=lectura.nextInt();
        System.out.println("Escriba el denominador de la primera fraccion.");
        denominador=lectura.nextInt();

        Fraccion f=new Fraccion(numerador, denominador);
        System.out.println("Primera fraccion: "+f);

        System.out.println("Escriba el numerador de la segunda fraccion.");
        numerador=lectura.nextInt();
        System.out.println("Escriba el denominador de la segunda fraccion.");
        denominador=lectura.nextInt();

        Fraccion f1=new Fraccion(numerador, denominador);
        System.out.println("Segunda fraccion: "+f1);

        Fraccion f2=f.multiply(f1);

        System.out.println(f+" * "+f1+" es igual a: "+f2);

        f2.toLowestTerms();
        System.out.println("La fraccion simplificada es: "+f2);

        valid=true;
      }
      catch(ArithmeticException ae){
        System.err.println("ArithmeticException: " + ae.getMessage());
        System.out.println("Vuelva a intentarlo.");
        System.out.println();
      }
      catch(InputMismatchException ime){
        System.err.println("InputMismatchException: " + ime.getMessage());
        System.out.println("Entrada no es valida. Por favor escriba numeros enteros.");
        lectura.nextLine();
        System.out.println();
      }

    }while(valid==false);
    System.out.println();
  }

  public static void divF(){
    Scanner lectura=new Scanner(System.in);
    int numerador, denominador;
    boolean valid=false;

    do{
    try{
        System.out.println("Dividir Fracciones");
        System.out.println("Escriba el numerador de la primera fraccion.");
        numerador=lectura.nextInt();
        System.out.println("Escriba el denominador de la primera fraccion.");
        denominador=lectura.nextInt();

        Fraccion f=new Fraccion(numerador, denominador);
        System.out.println("Primera fraccion: "+f);

        System.out.println("Escriba el numerador de la segunda fraccion.");
        numerador=lectura.nextInt();
        System.out.println("Escriba el denominador de la segunda fraccion.");
        denominador=lectura.nextInt();

        Fraccion f1=new Fraccion(numerador, denominador);
        System.out.println("Segunda fraccion: "+f1);

        Fraccion f2=f.divide(f1);

        System.out.println(f+" / "+f1+" es igual a: "+f2);

        f2.toLowestTerms();
        System.out.println("La fraccion simplificada es: "+f2);

        valid=true;
      }
      catch(ArithmeticException ae){
        System.err.println("ArithmeticException: " + ae.getMessage());
        System.out.println("Vuelva a intentarlo.");
        System.out.println();
      }
      catch(InputMismatchException ime){
        System.err.println("InputMismatchException: " + ime.getMessage());
        System.out.println("Entrada no es valida. Por favor escriba numeros enteros.");
        lectura.nextLine();
        System.out.println();
      }

    }while(valid==false);
    System.out.println();
  }

  public static void calF(){
    Scanner lectura=new Scanner(System.in);
    int numerador;
    int denominador;
    boolean valid=false;

    do{
    try{
        System.out.println("Calcular Fracciones");
        System.out.println("Escriba el numerador.");
        numerador=lectura.nextInt();
        System.out.println("Escriba el denominador.");
        denominador=lectura.nextInt();

        Fraccion f=new Fraccion(numerador, denominador);
        System.out.println("La fraccion es: "+f);
        f.toLowestTerms();
        System.out.println("La fraccion simplificada es: "+f);
        System.out.println("La fraccion es equivalente a: "+f.toDouble());

        valid=true;
      }
      catch(ArithmeticException ae){
        System.err.println("ArithmeticException: " + ae.getMessage());
        System.out.println("Vuelva a intentarlo.");
        System.out.println();
      }
      catch(InputMismatchException ime){
        System.err.println("InputMismatchException: " + ime.getMessage());
        System.out.println("Entrada no es valida. Por favor escriba numeros enteros.");
        lectura.nextLine();
        System.out.println();
      }

    }while(valid==false);
    System.out.println();
  }

  public static void compF(){
    Scanner lectura=new Scanner(System.in);
    int numerador, denominador;
    boolean valid=false;
    boolean iguales;

    do{
    try{
        System.out.println("Comparar Fracciones");
        System.out.println("Escriba el numerador de la primera fraccion.");
        numerador=lectura.nextInt();
        System.out.println("Escriba el denominador de la primera fraccion.");
        denominador=lectura.nextInt();

        Fraccion f=new Fraccion(numerador, denominador);
        System.out.println("Primera fraccion: "+f);

        System.out.println("Escriba el numerador de la segunda fraccion.");
        numerador=lectura.nextInt();
        System.out.println("Escriba el denominador de la segunda fraccion.");
        denominador=lectura.nextInt();

        Fraccion f1=new Fraccion(numerador, denominador);
        System.out.println("Segunda fraccion: "+numerador+"/"+denominador);

        iguales=f.equals(f1);

        if(iguales==true){
          System.out.println(f+" y "+f1+" son fracciones equivalentes.");
        }
        else{
          System.out.println(f+" y "+f1+" no son fracciones equivalentes.");
        }

        valid=true;
      }
      catch(ArithmeticException ae){
        System.err.println("ArithmeticException: " + ae.getMessage());
        System.out.println("Vuelva a intentarlo.");
        System.out.println();
      }
      catch(InputMismatchException ime){
        System.err.println("InputMismatchException: " + ime.getMessage());
        System.out.println("Entrada no es valida. Por favor escriba numeros enteros.");
        lectura.nextLine();
        System.out.println();
      }

    }while(valid==false);
    System.out.println();
  }
}

/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
import java.util.*;
public class Kindle {
    private static ArrayList<Book> lista = new ArrayList<Book>();
    public static void main(String[] args) {
        int opcion=0;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Bienvenido a Kindle");
        Book libro = new Book("Dracula", "Bram Stoker", 516);

        lista.add(0, libro);

        do{
            System.out.println("Escriba el numero correspondiente a la opcion que quiera elegir.");
            System.out.println("\t1-Agregar libro a la biblioteca.");
            System.out.println("\t2-Leer libro.");
            System.out.println("\t3-Eliminar libro.");
            System.out.println("\t4-Imprimir libros.");
            System.out.println("\t5-Libro usado por ultima vez.");
            System.out.println("\t6-Salir.");
            opcion=lectura.nextInt();
            System.out.println();
            switch(opcion){
                case 1:
                    addBook();
                    break;
                case 2:
                readBook();
                    break;
                case 3:
                    deleteBook();
                    break;
                case 4:
                    printBooks();
                    break;
                case 5:
                lastBook();
                    break;
                case 6:
                    System.out.println("Regrese pronto.");
                    break;
                default:
                    System.out.println("Esa opcion no es valida.");
                    break;
            }

        }while(opcion!=6);
    }

    public static void addBook (){
        Scanner lectura=new Scanner(System.in);
        String titulo;
        String autor;
        int paginas;

        System.out.println("Add Book");
        System.out.println("Escriba el titulo del libro.");
        titulo=lectura.nextLine();
        System.out.println("Escriba el nombre del autor.");
        autor=lectura.nextLine();
        System.out.println("Escriba el numero de paginas que tiene el libro.");
        paginas=lectura.nextInt();

        Book libro = new Book(titulo, autor, paginas);

        lista.add(0, libro);
        System.out.println();
    }

    public static void readBook (){
        Scanner lectura=new Scanner(System.in);
        String titulo;
        boolean exists=false;
        String elemento;
        Book libro;

        System.out.println("Read Book");

        do{
            System.out.println("Escriba el titulo del libro que quiere leer.");
            titulo=lectura.nextLine();
            for(int i=0; i<lista.size(); i++){
                if(lista.get(i).getTitle().equalsIgnoreCase(titulo)){
                    elemento=lista.get(i).getTitle();
                    libro=lista.get(i);
                    exists=true;
                    System.out.println();
                    System.out.println("El usuario esta leyendo '" +elemento+"'.");
                    lista.remove(i);
                    lista.add(0, libro);
                }
            }
            if(exists==false){
                System.out.println("Ese libro no existe en la biblioteca.");
            }
        }while(exists==false);
        System.out.println();
    }

    public static void deleteBook (){
        Scanner lectura=new Scanner(System.in);
        String titulo;
        boolean exists=false;

        System.out.println("Delete Book");

        do{
            System.out.println("Escriba el titulo del libro que quiere eliminar.");
            titulo=lectura.nextLine();
            for(int i=0; i<lista.size(); i++){
                if(lista.get(i).getTitle().equalsIgnoreCase(titulo)){
                    lista.remove(i);
                    exists=true;
                    System.out.println();
                    System.out.println("Libro fue removido exitosamente.");
                }
            }
            if(exists==false){
                System.out.println("Ese libro no existe en la biblioteca.");
            }
        }while(exists==false);
        System.out.println();
    }

    public static void lastBook (){
        String titulo;

        System.out.println("RLast Book");

        titulo=lista.get(0).getTitle();

        System.out.println("El ultimo libro agregado o leido es '" +titulo+"'.");
        System.out.println();
    }

    public static void printBooks(){
        int count=0;

        System.out.println("Los libros disponibles en la biblioteca son:");
        System.out.println();

        for(int i=0; i<lista.size(); i++){
            if(lista!=null){
                System.out.println("Libro: "+lista.get(i).getTitle());
                System.out.println("Autor: "+lista.get(i).getAuthor());
                System.out.println("Numero de paginas: "+lista.get(i).getPages());
                count++;
            }
            System.out.println();
        }
        if(count==0){
            System.out.println("No hay libros.");
        }
        System.out.println();
    }
}

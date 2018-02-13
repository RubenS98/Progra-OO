public class StudentTest{
  public static void main(String[] args){
    Student s1 = new Student("Ruben Sanchez", 1759);
    s1.printStudent();

    System.out.println("Numero de unidades al principio: "+s1.getUnidades());

    s1.incrementUnits(200);

    System.out.println("Numero de unidades al final: "+s1.getUnidades());
  }
}

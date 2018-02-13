public class PersonaTest {
    public static void main(String[] args) {
        Persona cliente1 = new Persona();
        Persona cliente2 = new Persona("Marcela");

        cliente2.printPersona();

        cliente1.setNombre("Ruben");
        cliente1.setApellido("Sanchez");
        cliente1.setEdad(18);
        cliente1.setAlias("El Barto");

        cliente1.printPersona();
        System.out.println(cliente1.getEdad());
    }
}

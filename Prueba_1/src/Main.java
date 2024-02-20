
public class Main {
    public static void main(String[] args) {

        String nombre = "Johanna";
        String apellido = "Guevara";
        char ultimaLetra = apellido.charAt(apellido.length() - 1);

        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi apellido es " + apellido);

        System.out.println(nombre + " "  + apellido);

        System.out.println("Mi nombre tiene " + nombre.length() + " letras .");

        System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));

        System.out.println("La última letra de mi nombre es " + (nombre.length() - 1)+ " letras .");

        System.out.println("La última letra de mi nombre es " + ultimaLetra);




    }
}
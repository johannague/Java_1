import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Creamos un mapa de personas y sus habilidades

        Map<String, List<String>> personasYSkills = new HashMap<>();
        personasYSkills.put("Juan", List.of("Java", "Python", "C++"));
        personasYSkills.put("María", List.of("Java", "JavaScript"));
        personasYSkills.put("Carlos", List.of("Python", "HTML"));

        // Llamamos a la función para filtrar personas por habilidad

        List<String> personasConHabilidadJava = filtrarPersonasPorHabilidad(personasYSkills, "Java");

        // Imprimimos el resultado

        System.out.println("Personas con habilidad Java: " + personasConHabilidadJava);
    }

    public static List<String> filtrarPersonasPorHabilidad(Map<String, List<String>> personasYSkills, String habilidad) {
        List<String> personasConHabilidad = new ArrayList<>();

        // Recorremos el mapa de personas y habilidades

        for (Map.Entry<String, List<String>> entry : personasYSkills.entrySet()) {
            String persona = entry.getKey();
            List<String> skills = entry.getValue();

            // Verificamos si las habilidades de la persona incluyen la habilidad deseada

            if (skills.contains(habilidad)) {

                // Incluimos a la persona en la lista

                personasConHabilidad.add(persona);
            }
        }

        // Devolvemos la lista de personas con la habilidad deseada

        return personasConHabilidad;
    }
}
//**************************************************************//
//package Collection;
//
//Esta línea declara el paquete al que pertenece la clase GptExerc. Un paquete es simplemente
//una agrupación lógica de clases y otros recursos en Java.import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

//Estas líneas importan las clases necesarias del paquete java.util para usar las colecciones ArrayList, HashMap, List y Map en el código.
//
//
//public class GptExerc {
//
//    Esta línea declara la clase GptExerc. Todas las declaraciones de clase, campos, métodos, etc., deben estar dentro de los corchetes que siguen a esta línea.
//
//
//    public static void main(String[] args) {
//
//        Esta línea define el método principal main. Es el punto de entrada del programa. Se ejecuta cuando se inicia el programa y es el lugar donde comienza la ejecución.


// Creamos un mapa de personas y sus habilidades

//                Map<String, List<String>> personasYSkills = new HashMap<>();
//        personasYSkills.put("Juan", List.of("Java", "Python", "C++"));
//        personasYSkills.put("María", List.of("Java", "JavaScript"));
//        personasYSkills.put("Carlos", List.of("Python", "HTML"));
//
//        Estas líneas crean un mapa llamado personasYSkills que asigna nombres de personas a una lista de habilidades. Cada persona tiene asociada una lista de habilidades.
//

// Llamamos a la función para filtrar personas por habilidad

//        List<String> personasConHabilidadJava = filtrarPersonasPorHabilidad(personasYSkills, "Java");
//
//        Esta línea llama a la función filtrarPersonasPorHabilidad para filtrar las personas que tienen la habilidad "Java". El resultado se guarda en la lista personasConHabilidadJava.


// Imprimimos el resultado

//        System.out.println("Personas con habilidad Java: " + personasConHabilidadJava);
//
//        Esta línea imprime en la consola el resultado del filtrado, que son las personas que tienen la habilidad "Java".
//
//
//        public static List<String> filtrarPersonasPorHabilidad(Map<String, List<String>> personasYSkills, String habilidad) {
//
//            Esta línea declara el método filtrarPersonasPorHabilidad. Recibe como parámetros un mapa que asigna nombres de personas a listas de habilidades y una habilidad específica que se desea filtrar.
//
//
//            List<String> personasConHabilidad = new ArrayList<>();
//
//            Esta línea crea una lista llamada personasConHabilidad que se utilizará para almacenar los nombres de las personas que tienen la habilidad deseada.
//
//            for (Map.Entry<String, List<String>> entry : personasYSkills.entrySet()) {
//
//                Este bucle for itera sobre cada entrada en el mapa personasYSkills, que contiene nombres de personas y sus respectivas listas de habilidades.
//
//                String persona = entry.getKey();
//                List<String> skills = entry.getValue();

//                Estas líneas obtienen el nombre de la persona (persona) y la lista de habilidades de esa persona (skills) de la entrada actual del mapa.
//
//                if (skills.contains(habilidad)) {
//
//                    Esta línea verifica si la lista de habilidades de la persona (skills) contiene la habilidad especificada (habilidad).
//
//                            personasConHabilidad.add(persona);
//
//                    Si la persona tiene la habilidad especificada, se agrega su nombre (persona) a la lista personasConHabilidad.
//
//                    return personasConHabilidad;

 //                   Esta línea devuelve la lista de personas que tienen la habilidad especifica

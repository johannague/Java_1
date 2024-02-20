import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSkills_2
{
    private static Map<String, List<String>> peopleSkillsMap;

    public static void main(String[] args)
    {
        //declaro objeto de caracts de Lucia
        List<String> luciaSkills = new ArrayList<>();
        luciaSkills.add("Java");
        luciaSkills.add("Php");
        luciaSkills.add("Python");

        //declaro objeto de caracts de Fernando
        List<String> fernandoSkills = new ArrayList<>();
        fernandoSkills.add("C#");
        fernandoSkills.add("JavaScript");
        fernandoSkills.add("Kotlin");
        fernandoSkills.add("Scala");

        peopleSkillsMap = new HashMap<>();

        //Añado a la lista los objetos
        peopleSkillsMap.put("Lucia",luciaSkills);
        peopleSkillsMap.put("Fernando",fernandoSkills);

        System.out.println(peopleSkillsMap);

        var people = filterCandidates("Java");

        System.out.println(people);


    }

    public static List<String> filterCandidates(String skill)
    {
        List<String> people = new ArrayList<>();

        return people;
    }
}

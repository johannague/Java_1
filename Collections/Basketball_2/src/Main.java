import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BasketPlayer bp1 = new BasketPlayer("Yolo", "Solo", LocalDate.of(2002, 5, 16), 100, 40, 20, Position.C);
        BasketPlayer bp2 = new BasketPlayer("XD", "DX", LocalDate.of(1999, 6, 20), 87, 45, 12, Position.PF);
        BasketPlayer bp3 = new BasketPlayer("Pollito", "Pio", LocalDate.of(1994, 1, 1), 56, 215, 21, Position.SG);
        BasketPlayer bp4 = new BasketPlayer("Werrwer", "Efsefw", LocalDate.of(2000, 7, 8), 200, 56, 1, Position.PG);
        BasketPlayer bp5 = new BasketPlayer("Sponhnkjh", "Reaskdjaskdj", LocalDate.of(2004, 12, 12), 90, 32, 81, Position.SF);
        BasketPlayer bp6 = new BasketPlayer("Solo", "Yolo", LocalDate.of(2001, 5, 8), 60, 6, 21, Position.C);
        BasketPlayer bp7 = new BasketPlayer("Uwu", "Awa", LocalDate.of(2001, 5, 8), 80, 54, 12, Position.PF);
        BasketPlayer bp8 = new BasketPlayer("Owo", "Iwi", LocalDate.of(2004, 3, 6), 4, 32, 56, Position.SG);
        BasketPlayer bp9 = new BasketPlayer("Jdfkajslñdh", "Shdakjhsd", LocalDate.of(2004, 5, 3), 15, 56, 81, Position.PG);
        BasketPlayer bp10 = new BasketPlayer("Combo", "Wombo", LocalDate.of(2002, 12, 12), 400, 15, 65, Position.SF);

        ArrayList<BasketPlayer> team = new ArrayList<>();

        team.add(bp1);
        team.add(bp2);
        team.add(bp3);
        team.add(bp4);
        team.add(bp5);
        team.add(bp6);
        team.add(bp7);
        team.add(bp8);
        team.add(bp9);
        team.add(bp10);

        ArrayList<BasketPlayer> basePlayers = new ArrayList<>();
        ArrayList<BasketPlayer> escoltaPlayers = new ArrayList<>();
        ArrayList<BasketPlayer> aleroPlayers = new ArrayList<>();
        ArrayList<BasketPlayer> alaPivotPlayers = new ArrayList<>();
        ArrayList<BasketPlayer> pivotPlayers = new ArrayList<>();

        for (BasketPlayer jugador : team) {
            switch (jugador.getPosition()) {
                case PG -> basePlayers.add(jugador);
                case SG -> escoltaPlayers.add(jugador);
                case SF -> aleroPlayers.add(jugador);
                case PF -> alaPivotPlayers.add(jugador);
                case C -> pivotPlayers.add(jugador);
            }
        }
        HashMap<Position, List<BasketPlayer>> basketList = new HashMap<>();

        basketList.put(Position.PG, basePlayers);
        basketList.put(Position.SG, escoltaPlayers);
        basketList.put(Position.SF, aleroPlayers);
        basketList.put(Position.PF, alaPivotPlayers);
        basketList.put(Position.C, pivotPlayers);

        for (Position posicion : basketList.keySet()) {
            System.out.print(posicion + " ");
        }

        System.out.println();
        for (List<BasketPlayer> jugador : basketList.values()) {
            System.out.println(jugador);
        }
    }
}

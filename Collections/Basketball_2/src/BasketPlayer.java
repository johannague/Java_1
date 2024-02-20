import java.time.LocalDate;


public class BasketPlayer implements Comparable<BasketPlayer> {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private int nBaskets;
    private int assists;
    private int rebouncs;
    private Position position;

    public BasketPlayer(String surname, String name, LocalDate bornDate, int nBaskets, int assists, int rebouncs, Position position) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = bornDate;
        this.nBaskets = nBaskets;
        this.assists = assists;
        this.rebouncs = rebouncs;
        this.position = position;
    }

    public int calculateAge() {
        LocalDate now = LocalDate.now();
        return now.getYear() - this.dateOfBirth.getYear();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getnBaskets() {
        return nBaskets;
    }

    public int getAssists() {
        return assists;
    }

    public int getRebouncs() {
        return rebouncs;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + ", apellidos: " + surname + " y que juega en la posición: " + position;
    }

    @Override
    public int compareTo(BasketPlayer bp) {
        double resta = this.getnBaskets() - bp.getnBaskets();
        if (resta < 0) {
            return -1;
        } else if (resta > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}

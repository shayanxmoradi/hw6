package fotball;

public class Referee extends Person {
  private RefereeLevl refereeLevl;

    public Referee(String name, String lastName, String nationality, RefereeLevl refereeLevl) {
        super(name, lastName, nationality);
        this.refereeLevl = refereeLevl;
    }

    @Override
    double calculate() {
        return 0;
    }

    public RefereeLevl getRefereeLevl() {
        return refereeLevl;
    }

    public void setRefereeLevl(RefereeLevl refereeLevl) {
        this.refereeLevl = refereeLevl;
    }

    @Override
    public String toString() {
        return "Referee{" +
                "refereeLevl=" + refereeLevl +
                '}';
    }
}

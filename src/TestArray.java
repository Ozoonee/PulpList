import model.PulpFiction;

import java.util.Collection;

public class TestArray {

    public static void main(String[] args) {

        Collection<PulpFiction> dontsova = populateCollection();

    }

    private static Collection<PulpFiction> populateCollection() {

        PulpFiction[] dontsova = new PulpFiction[100];
        for (PulpFiction p : dontsova) {

            System.out.println(p.getName());

        }
        return null;
    }
}

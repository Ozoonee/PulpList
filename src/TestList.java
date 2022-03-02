import model.PulpFiction;
import service.ShowcaseList;

import java.util.ArrayList;
import java.util.List;

public class TestList {

    public static void main(String[] args) {

        //ShowcaseList sl = new ShowcaseList();


        //List<PulpFiction>dontsova = new ArrayList<>();
        // System.out.println(dontsova.size());

        List<PulpFiction> dontsova = populateList();

        System.out.println(dontsova);

    }

    private static List<PulpFiction> populateList() {

        List<PulpFiction> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            list.add(new PulpFiction("Донцова"));
            list.add(new PulpFiction("Устинова"));
            list.add(new PulpFiction("Минаев"));
            list.add(new PulpFiction("Глуховский"));
        }

        return list;


    }


}
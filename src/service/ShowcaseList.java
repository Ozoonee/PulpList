package service;

import model.PulpFiction;

import java.util.ArrayList;
import java.util.List;

public class ShowcaseList implements Showcase {

    List<PulpFiction> shit = new ArrayList<>();

    @Override
    public  boolean makeShit() {

        shit.add(new PulpFiction("Донцова"));
        shit.add(new PulpFiction("Устинова"));
        shit.add(new PulpFiction("Минаев"));


        return true;
    }
}


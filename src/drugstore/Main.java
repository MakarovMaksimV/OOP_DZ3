package drugstore;

import drugstore.components.Azitronite;
import drugstore.components.Penicillin;
import drugstore.components.Water;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitronite", 2D, 14);
        Component penicillin = new Penicillin("Penicillin", 1.6D, 6);

        List<Pharmacy> pharmacyList = new ArrayList<>();
        Pharmacy newPenicilin = new Pharmacy("Penicilin");
        newPenicilin.addComponents(penicillin,water);
        pharmacyList.add(newPenicilin);
        Pharmacy newAzitronite = new Pharmacy("Azitronite");
        newAzitronite.addComponents(azitronite,water);
        pharmacyList.add(newAzitronite);
        Pharmacy newAzitroPenicilin = new Pharmacy("Azitropenicilin");
        newAzitroPenicilin.addComponents(penicillin,water,azitronite);
        pharmacyList.add(newAzitroPenicilin);

        List<Component> components = new ArrayList<>();
        components.add(azitronite);
        components.add(water);
        components.add(penicillin);

        System.out.println(pharmacyList);
        Collections.sort(pharmacyList);
        System.out.println(pharmacyList);
    }
}

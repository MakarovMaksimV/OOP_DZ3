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
        Component vitasporin = new Penicillin("Vitasporin", 1.1D, 17);

        List<Pharmacy> pharmacyList = new ArrayList<>();


        Pharmacy pharm1 = new Pharmacy("Azitronite");
        pharm1.addComponents(azitronite,water);
        pharmacyList.add(pharm1);
        Pharmacy pharm2 = new Pharmacy("Vitasporin");
        pharm2.addComponents(vitasporin,water,water);
        pharmacyList.add(pharm2);
        Pharmacy pharm3 = new Pharmacy("Penicilin");
        pharm3.addComponents(penicillin,water);
        pharmacyList.add(pharm3);

        List<Component> components = new ArrayList<>();
        components.add(azitronite);
        components.add(water);
        components.add(penicillin);
        components.add(vitasporin);

        System.out.println("До сортировки" + pharmacyList);
        Collections.sort(pharmacyList);
        System.out.println("После сортировки" + pharmacyList);
    }
}

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
        Pharmacy newPenicilin = new Pharmacy();
        newPenicilin.addComponents(penicillin,water);
        pharmacyList.add(newPenicilin);
        Pharmacy newAzitronite = new Pharmacy();
        newAzitronite.addComponents(penicillin,water);
        pharmacyList.add(newAzitronite);
//        Pharmacy2 drug3 = new Pharmacy2();
//        drug3.addComponents(water, azitronite);
//        Pharmacy2 drug4 = new Pharmacy2();
//        drug4.addComponents(penicillin, water);

        List<Component> components = new ArrayList<>();
        components.add(azitronite);
        components.add(water);
        components.add(penicillin);



//        System.out.println(components);
//        Collections.sort(components);

        System.out.println(pharmacyList);
        Collections.sort(pharmacyList);
        System.out.println(pharmacyList);



//        Iterator<Component> iterator = drug1;
//        while (iterator.hasNext()) {
//            System.out.println(drug1.next().toString());
//        }

//        Iterator<Component> iterator2 = drug2;
//        while (iterator2.hasNext()) {
//            System.out.println(drug2.next().toString());
//        }

//        for (Component c : drug3) {
//            System.out.println(c);
//        }

    }
}

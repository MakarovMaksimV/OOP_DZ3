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

        Pharmacy p1 = new Pharmacy();
        p1.addComponents(penicillin,water);

        Pharmacy p2 = new Pharmacy();
        p2.addComponents(azitronite,water);

        Pharmacy2 p3 = new Pharmacy2();
        p3.addComponents(water, azitronite);
//
//        Pharmacy2 p4 = new Pharmacy2();
//        p3.addComponents(penicillin, water);
//
        List<Component> components = new ArrayList<>();

        components.add(azitronite);
        components.add(water);
        components.add(penicillin);

        System.out.println(components);
        Collections.sort(components);
        System.out.println(components);

//        Iterator<Component> iterator = p1;
//        while (iterator.hasNext()) {
//            System.out.println(p1.next().toString());
//        }
//
//        Iterator<Component> iterator2 = p2;
//        while (iterator2.hasNext()) {
//            System.out.println(p2.next().toString());
//        }

//        for (Component c : p3) {
//            System.out.println(c);
//        }

    }
}

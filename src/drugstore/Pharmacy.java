package drugstore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component>, Comparable<Pharmacy> {


    private List<Component> components = new ArrayList<>();
    private int index;
//    private Component component;


    public void addComponents(Component ... components) {
        for(Component c : components){
            this.components.add(c);
        }
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }


    @Override
    public int compareTo(Pharmacy o) {
        double sumOfValue1 = 0;
        double sumOfValue2 = 0;

            Component component1 = this.components.get(0);
            Component component2 = o.components.get(1);


            sumOfValue1 = component1.getTitle().length() + component1.getWeight() + component1.getPower();
            sumOfValue2 = component2.getTitle().length() + component2.getWeight() + component2.getPower();


        return (int) (sumOfValue1-sumOfValue2);

    }
}

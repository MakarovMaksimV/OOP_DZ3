package drugstore;

import java.util.*;

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
    public int compareTo(Pharmacy other) {
        double sumOfDrugs = 0;
        double sumOfOtherDrugs = 0;
        Collection <Component> c1FromThisDrugs = this.getComponent1();

        for(Component c1 : c1FromThisDrugs){
            sumOfDrugs += c1.getTitle().length() + c1.getWeight() + c1.getPower();
        }

        Collection <Component> otherFromThisDrugs = other.getComponent1();

        for(Component c1 : otherFromThisDrugs){
            sumOfOtherDrugs += c1.getTitle().length() + c1.getWeight() + c1.getPower();
        }
        return Double.compare(sumOfDrugs, sumOfOtherDrugs);
    }

    private Collection<Component> getComponent2() {
        return  components;
    }

    private Collection<Component> getComponent1() {
        return  components;

    }


//    @Override
//    public int compareTo(Pharmacy o) {
//        double sumOfValue1 = 0;
//        double sumOfValue2 = 0;
//
//            Component component1 = this.components.get(0);
//            Component component2 = o.components.get(1);
//            sumOfValue1 = component1.getTitle().length() + component1.getWeight() + component1.getPower();
//            sumOfValue2 = component2.getTitle().length() + component2.getWeight() + component2.getPower();
//        return (int) (sumOfValue1-sumOfValue2);
//
//    }
}

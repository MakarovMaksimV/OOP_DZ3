package drugstore;

import java.util.*;

public class Pharmacy implements Iterator<Component>, Comparable<Pharmacy> {
    private List<Component> components = new ArrayList<>();
    private int index;
    private  String name;
    public Pharmacy(String name) {
        this.name = name;
    }

    public void addComponents(Component ... components) {
        for(Component c : components){
            this.components.add(c);
        }
    }

    private Collection<Component> getComponent() {
        return  components;
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
        Collection <Component> c1FromThisDrugs = this.getComponent();
        for(Component c1 : c1FromThisDrugs){
            sumOfDrugs += c1.getTitle().length() + c1.getWeight() + c1.getPower();
        }
        Collection <Component> otherFromThisDrugs = other.getComponent();
        for(Component c1 : otherFromThisDrugs){
            sumOfOtherDrugs += c1.getTitle().length() + c1.getWeight() + c1.getPower();
        }
        return Double.compare(sumOfDrugs, sumOfOtherDrugs);
    }
    @Override
    public String toString() {
        return String.format("Название лекарства - %s ",name);
    }
}

package structural.composite.sample1;

import java.util.ArrayList;
import java.util.List;

class Composite implements Shape {
    private List<Shape> components = new ArrayList<>();

    void addComponent(Shape component) {
        components.add(component);
    }

    void removeComponent(Shape component) {
        components.remove(component);
    }

    @Override
    public void drew() {
        for (Shape component : components) {
            component.drew();
        }
    }
}

package creational.prototype.sample1;

class Human implements Copyable {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human [age=" + age + ", name=" + name + "]";
    }

    @Override
    public Object copy() {
        Human copy = new Human(age, name);
        return copy;
    }
}

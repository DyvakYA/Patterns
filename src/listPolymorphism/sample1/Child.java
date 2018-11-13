package listPolymorphism.sample1;

class Child extends Parent {

    private String description;

    public Child(String name, String description) {
        super(name);
        this.description = description;
    }

    @Override
    public void doAction() {
        System.out.println("do action! Child");
    }

    public void nothing() {
        System.out.println("do nothing");
    }

}

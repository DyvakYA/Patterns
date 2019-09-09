package behavioral.visitor.sample3;

//Body
class BodyElementTwo implements ElementTwo{
    @Override
    public void accept(Visitor2Two visitor) {
        visitor.visit(this);
    }
}

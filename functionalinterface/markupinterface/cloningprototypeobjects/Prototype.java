package markupinterface.cloningprototypeobjects;


class Prototype implements Cloneable {
    int id;
    String name;

    Prototype(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

package markupinterface.cloningprototypeobjects;

public class CloningPrototypeObjects {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p1 = new Prototype(1, "Original");
        Prototype p2 = (Prototype) p1.clone();

        System.out.println("Cloned Object: " + p2.name);
    }
}

// A class that is fully encapsulated

public class EncapsulationDemo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
// A java class to test the encapsulated class

class Test {
    public static void main(String arg[]) {
        EncapsulationDemo n = new EncapsulationDemo();
        n.setName("Robert");
        System.out.println(n.getName());
    }
}
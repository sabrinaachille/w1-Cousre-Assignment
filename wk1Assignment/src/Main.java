//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Course C1 = new Course();
        System.out.println(C1.getCode() + " " + C1.getName() + " " + C1.getID());
        C1.setCode(987654);
        C1.setName("James");
        C1.setID("CSC211");
        C1.print();
        C1 = new Course("Sabrina", "CSC211", 123456);
        C1.print();
    }
}
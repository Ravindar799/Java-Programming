 class Person {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Main {
    public static void main (String arr[]){
        Person p = new Person();
        p.setName("ravindar");
        System.out.println(p.getName());
    }
}

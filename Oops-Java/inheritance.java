class Parent {
    public void parentMethod() {
        System.out.println("I'm in parent class");
    }
}
class Child extends Parent {
    public void childMethod() {
        System.out.println("I'm in child class");
    }
}
class main {
    public static void main(String arr[]) {
        Parent p = new Parent();
        p.parentMethod();
        // we can't use parent reference to call chiid methods
        // p.childMethod();
        // here we get error
        // but we can use child reference to call both parent and child methods
        Child c = new Child();
        c.parentMethod();
        c.childMethod(); 
     }
} 

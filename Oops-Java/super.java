class Parent {
    int parentVariable = 10;
}
class Child extends Parent {
    int childVariable = 20;
}
class main {
    public static void main (String arr[]) {
        Parent p = new Parent();
        System.out.println(p.parentVariable);
        Child c = new Child();
        System.out.println(c.parentVariable);
        System.out.println(c.childVariable);
    }
}

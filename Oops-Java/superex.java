class Parent {
     Parent() {
        System.out.println("Inside the parent constructor");
    }
}
class Child extends Parent {
     Child() {
        // super();
        // it is not required use super method here implicitly compiler will provide
        System.out.println("Inside the child constructor");
        // super();
        // error: call to super must be first statement in constructor
        
   }
}
class main {
    public static void main (String arr[]) {
        Child child1 = new Child();

    }
}

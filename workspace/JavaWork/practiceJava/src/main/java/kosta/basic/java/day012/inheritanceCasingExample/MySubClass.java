package kosta.basic.java.day012.inheritanceCasingExample;

public class MySubClass extends MyClass {

    public MySubClass(String name) {
        super(name);
    }

    public static MySubClass doMath() {
        // Got the new instance of MyClass
        MyClass myClass = getNewMyClass();
        // And turned it into a MySubClass with myClass' properties.
        myClass = new MySubClass(myClass.getName());
        return (MySubClass) myClass;
    }

    public void sayBye() {
        System.out.println("Bye.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
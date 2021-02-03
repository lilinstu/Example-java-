package ClassDemo;

import java.awt.print.Pageable;

public class Main {

    public static void main(String[] args) {
            printClassInfo("".getClass());
            printClassInfo(Runnable.class);
            printClassInfo(java.time.Month.class);
            printClassInfo(String[].class);
            printClassInfo(int.class);
        /*
        if(args.length>0){
            create(args[0],10);
        }
        String s = "Hello";
        //Class cls = s.getClass();
        //Class cls = String.class;

        try{
            Class cls = Class.forName("java.lang.String");
            System.out.println(cls.getTypeName());
        }catch (ClassNotFoundException e){
            System.out.println("Not Found");
        }*/
    }
    static void create(String name,int age){
        Person p = new Person(name, age);
    }
    static void printClassInfo(Class cls) {
        System.out.println("Class name: " + cls.getName());
        System.out.println("Simple name: " + cls.getSimpleName());
        if (cls.getPackage() != null) {
            System.out.println("Package name: " + cls.getPackage().getName());
        }
        System.out.println("is interface: " + cls.isInterface());
        System.out.println("is enum: " + cls.isEnum());
        System.out.println("is array: " + cls.isArray());
        System.out.println("is primitive: " + cls.isPrimitive());
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

}
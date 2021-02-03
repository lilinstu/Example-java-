package GetFieldDemo;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws Exception {
        Class stdClass = Student.class;
        // 获取public字段"score":
        System.out.println(stdClass.getField("score"));
        // 获取继承的public字段"name":
        System.out.println(stdClass.getField("name"));
        // 获取private字段"grade":
        System.out.println(stdClass.getDeclaredField("grade"));
        //获取字段内部信息
        /**
         * getName()：返回字段名称，例如，"name"；
         * getType()：返回字段类型，也是一个Class实例，例如，String.class；
         * getModifiers()：返回字段的修饰符，它是一个int，不同的bit表示不同的含义。
         */
        Field fieldScore = stdClass.getDeclaredField("score");
        System.out.println(fieldScore.getName());
        System.out.println(fieldScore.getType());
        int m = fieldScore.getModifiers();
        Modifier.isFinal(m);
        System.out.println(Modifier.isFinal(m));
        Modifier.isPublic(m);
        System.out.println(Modifier.isPublic(m));
        Modifier.isProtected(m);
        System.out.println(Modifier.isProtected(m));
        Modifier.isPrivate(m);
        System.out.println(Modifier.isPrivate(m));
        Modifier.isStatic(m);
        System.out.println( Modifier.isStatic(m));
    }
}

class Student extends Person {
    public int score;
    private int grade;
}

class Person {
    public String name;
}
package GetFieldDemo;

import java.lang.reflect.Field;

public class getFieldMain {
    public static void main(String[] args) {
        PersonDemo field = new PersonDemo("xiaoying");
        Class personClass = field.getClass();
        try {
            Field f = personClass.getDeclaredField("name");
            try {
                f.setAccessible(true);
                Object value = f.get(field);
                System.out.println(value);
                f.set(field,"xiaofang");
                System.out.println(field.getName());
            }catch (IllegalAccessException e){
                System.out.println("IllegalAccessException");
            }
        }catch (NoSuchFieldException e){
            System.out.println("NoSuchFieldException");
        }
    }
}

class PersonDemo {
    private String name;

    public PersonDemo(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}

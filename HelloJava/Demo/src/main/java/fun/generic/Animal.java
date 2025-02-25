package fun.generic;

public abstract class Animal {
    private String name;
    private int age;

    //ptg to javabean
    //右键->source->generate getter and setter

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Animal{name = " + name + ", age = " + age + "}";
    }

    public abstract void eat();//抽象方法，类为抽象类，子类必须重写
}

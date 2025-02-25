package fun.generic;

public class HashiqiDog extends Dog{
    @Override
    public void eat() {
        System.out.println(this.getName()+this.getAge()+" HashiqiDog eat");
    }

    public HashiqiDog(String name, int age) {
        setName(name);
        setAge(age);

    }
}

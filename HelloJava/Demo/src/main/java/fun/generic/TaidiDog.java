package fun.generic;

public class TaidiDog extends Dog{
    @Override
    public void eat() {
        System.out.println(this.getName()+this.getAge()+" TaidiDog eat");
    }

    public TaidiDog(String name, int age) {
        setName(name);
        setAge(age);
    }
}

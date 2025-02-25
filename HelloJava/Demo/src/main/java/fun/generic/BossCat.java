package fun.generic;

public class BossCat extends Cat {
    @Override
    public void eat() {
        System.out.println(this.getName()+this.getAge()+" BossCat eat");
    }

    public BossCat(String name , int age) {
        setName(name);
        setAge(age);
    }
}

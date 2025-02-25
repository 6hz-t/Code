package fun.generic;

public class LihuaCat extends Cat {
    @Override
    public void eat() {
        System.out.println(this.getName()+this.getAge()+" LihuaCat eat");
    }

    public LihuaCat(String name, int age) {
        setName(name);
        setAge(age);
    }
}

package fun.generic;

import java.util.ArrayList;

public class main{
    public static void main(String[] args) {

        ArrayList<Dog> Dogs = new ArrayList<>();
        Dogs.add(new TaidiDog("泰迪", 3));
        Dogs.add(new HashiqiDog("哈士奇", 2));
        keepdog(Dogs);

        ArrayList<Cat> Cats = new ArrayList<>();
        Cats.add(new LihuaCat("狸花", 1));
        Cats.add(new BossCat("波斯", 5));
        keepcat(Cats);
    }
    //*************************
    //? extends Dog 表示上界通配符
    //? super Dog 表示下界通配符
    //泛型没有继承关系，但数据有继承性
    //*************************
    public static void keepdog(ArrayList<? extends Dog> Dogs)
    {
      for(Dog d : Dogs)
      {
        d.eat();
      }
    }
    public static void keepcat (ArrayList<? extends Cat> Cats)
    {
        for(Cat c : Cats)
        {
            c.eat();
        }
    }

}

  class Animal {
    String name;
    int age;
  
    // 主构造函数
    Animal(this.name, this.age, String sex);
  
    // 命名构造函数
    Animal.now(String name, int age)
        : this.name = name,
          this.age = age {
      print("Animal constructor with now");
    }
  
    // 方法
    void makeSound() {
      print("Animal sound");
    }
  
    void eat() {
      print("Animal eat");
    }
  
    void sleep() {
      print("Animal sleep");
    }
  
    void run() {
      print("Animal run");
    }
  }
  
  
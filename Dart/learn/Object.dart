import './Animal.dart';

class Person {
  String name = "张三";
  int age = 18;
  String sex = "男";
  String address = "北京";
  String phone = "12345678901";

  // 使用命名参数构造函数，便于扩展
  Person({
    required this.name,
    required this.age,
    required this.sex,
    required this.address,
    required this.phone,
  }) : assert(isValidPhone(phone), "Invalid phone number"),
       assert(age > 0, "Age must be positive"),
       assert(["男", "女"].contains(sex), "Sex must be '男' or '女'");

  // 校验手机号格式
  bool isValidPhone(String phone) {
    final RegExp phoneRegex = RegExp(r'^\d{11}$');
    return phoneRegex.hasMatch(phone);
  }

  void printInfo() {
    print(
      "姓名：${this.name}, ${this.age}岁, 性别：${this.sex}, 地址：${this.address}, 手机号：${this.phone}",
    );
  }

  // 自动生成 getter 和 setter
  String get getName => name;
  set setName(String newName) {
    if (newName.isNotEmpty) {
      name = newName;
    } else {
      throw ArgumentError("Name cannot be empty");
    }
  }

  int get getAge => age;
  set setAge(int newAge) {
    if (newAge > 0) {
      age = newAge;
    } else {
      throw ArgumentError("Age must be positive");
    }
  }

  String get getSex => sex;
  set setSex(String newSex) {
    if (["男", "女"].contains(newSex)) {
      sex = newSex;
    } else {
      throw ArgumentError("Sex must be '男' or '女'");
    }
  }

  String get getAddress => address;
  set setAddress(String newAddress) => address = newAddress;

  String get getPhone => phone;
  set setPhone(String newPhone) {
    if (isValidPhone(newPhone)) {
      phone = newPhone;
    } else {
      throw ArgumentError("Invalid phone number");
    }
  }

  // 私有属性和方法
  String _name = "张三";
  int _age = 18;
  void privateprintInfo() {
    print("姓名：$_name, $_age岁");
  }

  // 静态属性和方法
  static final String staticName = "张三"; // 设置为只读
  static void staticPrintInfo() {
    print("姓名：$staticName");
  }

}

void main() {
  // 对象
  Person.staticPrintInfo();
  Person p = Person(
    name: "张三",
    age: 18,
    sex: "男",
    address: "北京",
    phone: "12345678901",
  );
  p.printInfo(); // 输出对象信息

    // 继承
  class Dog extends Animal {
    Dog(String name, int age, String sex) : super(name, age, sex); // 调整为3个参数
  }

  // 多态
  class Cat extends Animal {
    Cat(String name, int age, String sex) : super(name, age, sex); // 调整为3个参数
    @override
    void makeSound() {
      print("喵喵喵");
    }
  }

  // 抽象类
  abstract class AbstractAnimal {
    void makeSound(); // 抽象方法
    void eat(); // 抽象方法
  }

  class Dog2 extends AbstractAnimal {
    @override
    void makeSound() {
      print("汪汪汪");
    }

    @override
    void eat() {
      print("狗吃狗粮");
    }
  }

  // 接口
  class Animal2 implements AbstractAnimal {
    @override
    void makeSound() {
      print("2动物叫");
    }

    @override
    void eat() {
      print("动物吃食物");
    }
  }

  // 接口实现
  class Dog3 implements Animal2 {
    @override
    void makeSound() {
      print("汪汪汪");
    }

    @override
    void eat() {
      print("狗吃骨头");
    }
  }
}
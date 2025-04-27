class Person {
  String name = "张三";
  int age = 18;
  String sex = "男";
  String address = "北京";
  String phone = "12345678901";
  Person(this.name, this.age, this.sex, this.address, this.phone);

  void printInfo() {
    print(
      "姓名：${this.name}, ${this.age}岁, 性别：${this.sex}, 地址：${this.address}, 手机号：${this.phone}",
    );
  }

  //getter和setter
  String get getName => name;
  set setName(String name) => this.name = name;
  int get getAge => age;
  set setAge(int age) => this.age = age;
  String get getSex => sex;
  set setSex(String sex) => this.sex = sex;
  String get getAddress => address;
  set setAddress(String address) => this.address = address;
  String get getPhone => phone;
  set setPhone(String phone) => this.phone = phone;
}

void main() {
  //对象
  Person p = Person("张三", 18, "男", "北京", "12345678901");
  p.printInfo(); // 输出对象信息
}

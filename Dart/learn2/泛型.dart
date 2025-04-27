//泛型

void main() {
  print(getdata(111)); // int类型
  print(getdata("111")); // String类型
  print(getdata(1.11)); // double类型
  print(getdata(true)); // bool类型
  print(getdata([1, 2, 3])); // List类型
}

T getdata<T>(T data) {
  print(data);
  return data;
}

class Person<T> {
  T name;
  T age;
  T sex;
  T address;
  T phone;

  Person(this.name, this.age, this.sex, this.address, this.phone);

  void printInfo() {
    print(
      "姓名：${this.name}, ${this.age}岁, 性别：${this.sex}, 地址：${this.address}, 手机号：${this.phone}",
    );
  }

  static void staticPrintInfo() {
    print("静态方法：静态方法可以直接通过类名调用，不需要实例化对象。");
  }
  // 泛型方法
  T getName() {
    return this.name;
  }
}

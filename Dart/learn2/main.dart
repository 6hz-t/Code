// 实现多个接口
// 1. 定义接口
abstract class Interface1 {
  void method1();
}

abstract class Interface2 {
  void method2();
}

// 2. 实现接口
class MyClass implements Interface1, Interface2 {
  @override
  void method1() {
    print("实现接口1的方法");
  }

  @override
  void method2() {
    print("实现接口2的方法");
  }
}

// 3. 使用mixins实现类似多继承的效果
mixin Mixin1 on Interface1, Interface2 {
  @override
  void method1() {
    print("Mixin1实现接口1的方法");
  }

  @override
  void method2() {
    print("Mixin1实现接口2的方法");
  }
}
// 4. 使用mixin实现接口
mixin Mixin2 {
  @override
  void method1() {
    print("Mixin2实现接口1的方法");
  }

  @override
  void method2() {
    print("Mixin2实现接口2的方法");
  }
}

class MyClass2 with Mixin2 {
  MyClass2() {
    print("MyClass2");
  }
  @override
  void method1() {
    print("MyClass2实现mixin接口1的方法");
  }

  @override
  void method2() {
    print("MyClass2实现mixin接口2的方法");
  }
}

// 5. 使用实现的类
void main() {
  MyClass obj = MyClass();
  obj.method1(); // 输出：实现接口1的方法
  obj.method2(); // 输出：实现接口2的方法
}

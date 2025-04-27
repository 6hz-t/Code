
void main() {
  //List

  //1
  List<int> a = [1, 2, 3, 4, 5];
  print(a);
  //2
  List<String> b = ['a', 'b', 'c', 'd', 'e'];
  b.add('vscode'); // 添加元素
  b.addAll(['f', 'g']); // 添加多个元素
  b.remove('a'); // 删除元素
  print(b);

  //运算符
  print(1 + 2); // 加法
  print(1 - 2); // 减法
  print(1 * 2); // 乘法
  print(1 / 2); // 除法
  print(1 ~/ 2); // 整除
  print(1 % 2); // 取余
  print(1 == 2);
  print(1 != 2);
  print(1 > 2);
  print(1 < 2);
  print(1 >= 2);
  print(1 <= 2);

  print(1 & 2); // 按位与
  print(1 | 0); // 按位或
  print(0 | 0);

  //类型转换
  int a1 = 1;
  double b1 = 2.0;
  String c = '3';
  bool d = true;
  print(a1.toString()); // int转String
  print(b1.toString()); // double转String
  print(c.toString()); // String转String
  print(d.toString()); // bool转String

  print(a1.toDouble()); // int转double
  print(b1.toInt()); // double转int
  print(int.parse(c)); // String转int

  //自执行方法
  (() {
    print('Hello World!');
    print("自执行"); // 获取对象类型
  })();
  //匿名函数
  var a2 = (int a, int b) {
    return a + b;
  };
  print(a2(1, 2)); // 输出 3
  //普通函数
  int add(int a, int b) {
    return a + b;
  }

  print(add(1, 2)); // 输出 3
}

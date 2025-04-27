import 'dart:io';

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

  print(b.length); // 获取长度
  print(b.isEmpty);
  print(b[4]); // 获取元素
  print(b.indexOf('c')); // 获取元素索引
  print(b.last); // 获取最后一个元素
  print(b.first); // 获取第一个元素
  print(b.reversed); // 反转列表
  print(b.sublist(1, 3)); // 获取子列表
  print(b.contains('a')); // 判断是否包含元素
  print(b.indexWhere((element) => element == 'a')); // 获取元素索引 

  

}
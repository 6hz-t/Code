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
  

}
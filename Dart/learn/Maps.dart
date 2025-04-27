void main() {
  
  // Map
  //1
  Map<String, int> a = {'a': 1, 'b': 2, 'c': 3};
  print(a);
  //2
  Map<String, String> b = {'name': 'vscode', 'age': '18'};
  b.addAll({'sex': '男'});
  b['name'] = 'vscode'; // 添加元素
  b['age'] = '18'; // 添加元素
  print(b); 

  var c = b['name']; // 获取元素
  print(c); // 获取元素

  //对象
  var d = {'name': 'vscode', 'age': 18};
  print(d['name']); // 获取元素


  //is关键词  判断对象是否为某个类型
  print('d is Map');


  




  
  
}
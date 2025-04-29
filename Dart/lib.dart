//常见库
/* import 'dart:async'; //异步编程
import 'dart:convert'; //JSON编解码 
import 'dart:io'; //文件操作
import 'dart:math'; //数学函数
import 'dart:typed_data'; //字节数据
import 'dart:typed_data'; //字节数据
import 'dart:ui'; //UI相关
import 'dart:isolate'; //隔离
import 'dart:html'; //Web相关
import 'dart:js'; //JavaScript相关
import 'dart:js_util'; //JavaScript工具函数
import 'dart:mirrors'; //反射
 */

import 'dart:math';
import 'dart:convert' as convert;
import 'package:http/http.dart' as http;

void main() async {
  min(666, 12);
  max(666, 12);
  sqrt(666);
  var url = 'http://124.221.15.13:8080/good/getGoodList';

  // 设置请求头以接受 UTF-8 编码的响应
  var response = await http.get(
    Uri.parse(url),
    headers: {'Accept': 'application/json; charset=utf-8'},
  );

  if (response.statusCode == 200) {
    print('Response status: ${response.statusCode}');
    // 请求成功，处理返回的数据
    var jsonResponse = convert.jsonDecode(response.body);
    print(jsonResponse);
  } else {
    // 请求失败，处理错误
    print('Request failed with status: ${response.statusCode}.');
  }
}

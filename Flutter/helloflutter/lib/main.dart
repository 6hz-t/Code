import 'dart:ui';

import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter',
      theme: ThemeData(primarySwatch: Colors.blue),
      home: Scaffold(
        appBar: AppBar(title: const Text('Flutter')),
        body: Row(
          //alignment: Alignment.Center,
          children: [MyGOGOGO(), MyGOGOGO(), MyGOGOGO()],
        ),
      ),
    );
  }
}

/* void main() {
  runApp(
    MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('HiFlutter'),
          backgroundColor: Colors.blue,
        ),
        body: Center(
          child: Container(
            //alignment: Alignment.Center,
            alignment: Alignment.center,
            width: 1111, // 1000,
            height: 808, // 800,
            child: Column(
              children: [
                const Text(
                  'Center.Container',
                  textAlign: TextAlign.center,
                  overflow: TextOverflow.ellipsis,
                  style: TextStyle(
                    fontSize: 30,
                    color: const Color.fromARGB(255, 0, 0, 0),
                    fontWeight: FontWeight.bold,
                  ),
                ), // Button text
                MyButton(
                  onPressed: () {
                    print('Button pressed');
                  },
                ),
                MyGOGOGO(),
              ],
            ),
          ),
        ),
      ),
    ),
  );
} */

class MyButton extends StatelessWidget {
  final VoidCallback onPressed;
  const MyButton({Key? key, required this.onPressed}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      child: Text(
        'Hot Reload Button',
        textAlign: TextAlign.center,
        overflow: TextOverflow.ellipsis,

        style: TextStyle(
          fontSize: 10,
          color: const Color.fromARGB(255, 0, 0, 0),
          fontWeight: FontWeight.bold,
        ),
      ), // Button text
      width: 200, // Button width
      height: 50, // Button height
      alignment: Alignment.center, // Center the text in the button
      margin: const EdgeInsets.fromLTRB(0, 10, 0, 0), // Button ma
      decoration: BoxDecoration(
        color: Colors.blue, // Button color
        borderRadius: BorderRadius.circular(10), // Button border radius
      ),
      //transform: Matrix4.rotationZ(0.1),
    );
  }
}

class MyGOGOGO extends StatelessWidget {
  const MyGOGOGO({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      width: 100,
      height: 600,
      margin: EdgeInsets.all(5),
      decoration: BoxDecoration(color: Colors.greenAccent),
      child: Column(
        children: [
          Text('Image network'),
          Image.network(
            'https://avatars.cdn.queniuqe.com/0ee392234f84c6a11c8872d312e0cd4ab5cb6598_full.jpg',
            fit: BoxFit.fill,
          ),
          Text('Round Image'),
          //Image.asset('assets/images/1.jpg'), // 本地图片
          RoundImage(),
          Text('ClipOvalImage'),
          ClipOvalImage(),
          Text('Image asset'),
          Image.asset('images/a.jpg', fit: BoxFit.fill),

          //Image.asset();
        ],
      ),
    );
  }
}

class RoundImage extends StatelessWidget {
  const RoundImage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      width: 100,
      height: 100,
      decoration: BoxDecoration(
        image: DecorationImage(
          image: NetworkImage(
            'https://avatars.cdn.queniuqe.com/0ee392234f84c6a11c8872d312e0cd4ab5cb6598_full.jpg',
          ),
          fit: BoxFit.fill,
        ),
        //shape: BoxShape.circle,
        border: Border.all(color: const Color.fromARGB(255, 0, 0, 0), width: 2),
        borderRadius: BorderRadius.circular(50),
      ),
      /* child: Image.network(
        'https://avatars.cdn.queniuqe.com/0ee392234f84c6a11c8872d312e0cd4ab5cb6598_full.jpg',
        width: 100,
        height: 100,
        fit: BoxFit.cover, 
      ),*/
    );
  }
}

//clipoval实现圆形图片
class ClipOvalImage extends StatelessWidget {
  const ClipOvalImage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      width: 100,
      height: 100,
      alignment: Alignment.center,
      child: ClipOval(
        child: Image.network(
          'https://avatars.cdn.queniuqe.com/0ee392234f84c6a11c8872d312e0cd4ab5cb6598_full.jpg',
        ),
      ),
    );
  }
}

//Container
//alignment: Alignment.Center,位置属性
//width: 100, // 高度
//height: 200, // 宽度属性
//decoration: BoxDecoration(
//border: Border.all(color: Colors.black, width: 2), // 边框属性
//color: Colors.red, // 背景颜色属性
//borderRadius: BorderRadius.circular(10), // 圆角属性
//),
//child: Column(
//children: [
//const Text('Press Me111'), // 按钮文本
//MyButton(
//onPressed: () {
//print('Button pressed');

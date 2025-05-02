import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Hi',
      theme: ThemeData(primarySwatch: Colors.blue),
      home: const MyHomePage(),
    );
  }
}

// class MyHomePage extends StatelessWidget {
//   const MyHomePage({Key? key}) : super(key: key);

//   @override
//   Widget build(BuildContext context) {
//     // TODO: implement build
//     return Scaffold(
//       appBar: AppBar(title: const Text('Hi'), backgroundColor: Colors.teal),
//       body: Center(child: Container(width: 120)),
//     );
//   }
// }

class MyHomePage extends StatelessWidget {
  const MyHomePage({Key? key}) : super(key: key);

  List<Widget> _initlist() {
    List<Widget> list = [];

    for (int i = 0; i < 50; i++) {
      list.add(
        ListTile(
          title: Text('Hello World ${i}'),
          subtitle: Text('This is a subtitle'),
          leading: Icon(Icons.home),
          trailing: Icon(Icons.arrow_forward),
        ),
      );
    }
    return list;
  }

  @override
  Widget build(Object context) {
    return Scaffold(
      appBar: AppBar(title: const Text('List Example')),
      body: ListView(children: _initlist()),
    );
  }
}

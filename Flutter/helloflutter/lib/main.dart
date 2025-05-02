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
      home: MyHomePage2(),
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
  List<String> list = [];
  MyHomePage({Key? key}) : super(key: key) {
    for (int i = 0; i < 50; i++) {
      list.add('Hello World ${i}');
    }
    ;
  }

  @override
  Widget build(BuildContext context) {
    return ListView.builder(
      itemBuilder: (context, index) {
        return ListTile(
          title: Text(list[index]),
          subtitle: const Text('This is a subtitle'),
          leading: const Icon(Icons.home),
          trailing: const Icon(Icons.arrow_forward),
        );
      },
    );
  }
}

class MyHomePage2 extends StatefulWidget {
  const MyHomePage2({Key? key}) : super(key: key);

  @override
  State<MyHomePage2> createState() => _MyHomePage2State();
}

class _MyHomePage2State extends State<MyHomePage2> {
  List<String> items = [];

  void addItem() {
    setState(() {
      items.add('Item ${items.length + 1}');
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('动态列表')),
      body: ListView.builder(
        itemCount: items.length,
        itemBuilder: (context, index) => ListTile(title: Text(items[index])),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: addItem,
        child: const Icon(Icons.add),
      ),
    );
  }
}

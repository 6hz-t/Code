import 'package:flutter/material.dart';

/*       void main() {
        runApp(MyApp());
      }


      class MyApp extends StatelessWidget {
        const MyApp({Key? key}) : super(key: key);
        @override
        Widget build(BuildContext context) {
          return MaterialApp(
            title: 'Flutter',
            theme: ThemeData(
              primarySwatch: Colors.blue,
            ),
            home: Scaffold(
              appBar: AppBar(
                title: const Text('Flutter'),
              ),
              body: Center(

                child: ElevatedButton(
                  onPressed: () {
                    print('Button pressed');
                    // Action to perform when the button is pressed
                  },
                  child: const Text('Press Me'),
                ),
              ),
            ),
          );
        }
        
      } */

void main() {
  runApp(
    MaterialApp(
      home: Scaffold(
        appBar: AppBar(title: const Text('Flutter')),
        body: Center(
          child: Container(
            //alignment: Alignment.Center,
            alignment: Alignment.center,
            width: 100,
            height: 50,
            decoration: BoxDecoration(
              color: Colors.grey, //背景颜色
              border: Border.all(width: 1, color: Colors.black), //边框
              borderRadius: BorderRadius.circular(10), //圆角
              boxShadow: [
                const BoxShadow(
                  color: Colors.grey,
                  spreadRadius: 5, // spreads the shadow
                  blurRadius: 7, // changes the blur radius
                  offset: const Offset(0, 3), // changes position of shadow
                ),
              ],

              //渐变 LinearGradient背景渐变 RadialGradient径向渐变 SweepGradient
              gradient: const LinearGradient(
                colors: [Colors.blue, Colors.green],
              ),
            ),
            child: const Text(
              ('NB666'),
              style: TextStyle(fontSize: 20, color: Colors.white),
            ),
          ),
        ),
      ),
    ),
  );
}

class MyButton extends StatelessWidget {
  const MyButton({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      width: 100,
      height: 50,
      decoration: BoxDecoration(
        color: Colors.blue,
        borderRadius: BorderRadius.circular(10),
        boxShadow: [
          const BoxShadow(
            color: Colors.grey,
            spreadRadius: 5,
            blurRadius: 7,
            offset: const Offset(0, 3),
          ),
        ],
      ),
      child: const Text('Press Me'),
    );
  }
}

@override
Widget build(BuildContext context) {
  return ElevatedButton(
    onPressed: () {
      print('Button pressed');
      // Action to perform when the button is pressed
    },
    child: const Text('Press Me'),
  );
}

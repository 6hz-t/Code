import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'NBA',
      theme: ThemeData(primarySwatch: Colors.blue),
      home: Scaffold(
        appBar: AppBar(title: const Text('NBA'), backgroundColor: Colors.teal),
        body: Container(
          width: 1000,
          height: 800,
          margin: EdgeInsets.fromLTRB(5, 0, 5, 5),
          decoration: BoxDecoration(color: Colors.white),
          //alignment: Alignment.Center,
          child: MyScrollView(),
        ),
      ),
    );
  }
}

class MyScrollView extends StatelessWidget {
  const MyScrollView({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return SingleChildScrollView(
      child: Column(
        children: <Widget>[
          ListTile(
            leading: Icon(Icons.home),
            title: Text('首页'),
            subtitle: Text('NBA'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.search),
            title: Text('搜索'),
            subtitle: Text('搜索NBA'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.settings),
            title: Text('设置'),
            subtitle: Text('设置NBA'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.person),
            title: Text('个人中心'),
            subtitle: Text('个人中心NBA'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.message),
            title: Text('消息'),
            subtitle: Text('消息NBA'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.notifications),
            title: Text('通知'),
            subtitle: Text('通知NBA'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.camera),
            title: Text('相机'),
            subtitle: Text('相机NBA'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.map),
            title: Text('地图'),

            subtitle: Text('地图NBA'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.music_note),
            title: Text('音乐'),
            subtitle: Text('音乐NBA'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.video_call),
            title: Text('视频'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.photo),
            title: Text('照片'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.file_copy),
            title: Text('文件'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.contact_mail),
            title: Text('联系人'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.calendar_today),
            title: Text('日历'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.alarm),
            title: Text('闹钟'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.location_on),
            title: Text('位置'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.shopping_cart),
            title: Text('购物车'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.favorite),
            title: Text('收藏'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.share),
            title: Text('分享'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.help),
            title: Text('帮助'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.feedback),
            title: Text('反馈'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.language),
            title: Text('语言'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.lock),
            title: Text('隐私'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.security),
            title: Text('安全'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.brightness_6),
            title: Text('主题'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.accessibility),
            title: Text('无障碍'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.storage),
            title: Text('存储'),
            subtitle: Text('存储NBA'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.backup),
            title: Text('备份'),
            subtitle: Text('备份NBA'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
          ListTile(
            leading: Icon(Icons.restore),
            title: Text('恢复'),
            subtitle: Text('恢复NBA'),
            trailing: Icon(Icons.chevron_right_sharp),
          ),
          Divider(),
        ],
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

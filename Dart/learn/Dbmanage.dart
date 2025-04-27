//接口数据库
class Dbmanage {
  //数据库连接
  static const String dbName = 'test.db';
  static const String dbPath = 'assets/db/$dbName';
  static const String dbVersion = '1.0.0';

  //数据库表
  static const String tableName = 'test_table';
  static const String columnId = 'id';
  static const String columnName = 'name';
  static const String columnAge = 'age';

  //数据库操作
  static Future<void> initDb() async {
    //初始化数据库
    print('Initializing database...');
  }
}

//数据库操作
class DbHelper {
  //数据库操作
  static Future<void> insert(String name, int age) async {
    //插入数据
    print('Inserting data...');
  }

  static Future<void> update(int id, String name, int age) async {
    //更新数据
    print('Updating data...');
  }

  static Future<void> delete(int id) async {
    //删除数据
    print('Deleting data...');
  }

  static Future<void> query() async {
    //查询数据
    print('Querying data...');
  }
}
 
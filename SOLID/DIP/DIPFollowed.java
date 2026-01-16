package com.learn.designPattern.SOLID.DIP;

//Abstraction (Interface)
interface Database {
 void save(String data);
}

//MySQL implementation (Low-level module)
class MySQLDatabase2 implements Database {
 @Override
 public void save(String data) {
     System.out.println(
         "Executing SQL Query: INSERT INTO users VALUES('" 
         + data + "');"
     );
 }
}

//MongoDB implementation (Low-level module)
class MongoDBDatabase2 implements Database {
 @Override
 public void save(String data) {
     System.out.println(
         "Executing MongoDB Function: db.users.insert({name: '" 
         + data + "'})"
     );
 }
}

//High-level module (Now loosely coupled via Dependency Injection)
class UserService2 {
 private final Database db;

 public UserService2(Database database) {
     this.db = database;
 }

 public void storeUser(String user) {
     db.save(user);
 }
}

public class DIPFollowed {
 public static void main(String[] args) {
     MySQLDatabase2 mysql = new MySQLDatabase2();
     MongoDBDatabase2 mongodb = new MongoDBDatabase2();

     UserService2 service1 = new UserService2(mysql);
     service1.storeUser("Aditya");

     UserService2 service2 = new UserService2(mongodb);
     service2.storeUser("Rohit");
 }
}

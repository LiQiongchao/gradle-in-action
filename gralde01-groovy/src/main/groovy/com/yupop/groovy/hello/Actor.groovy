package com.yupop.groovy.hello

/**
 * Groovy 类实现了 GroovyObject
 *
 * @Author: Qiongchao
 * @Version: 1.0.0
 * @Date: 2023/12/5
 */
 class Actor {
     /*
     定义一个属性时，可以使用具体的类型，也可以使用泛型
      */
//     int age;
     def age;
     var name;
     String gender;

     // 能不用具体的类型，就用def变量
//     String sayHello() {
     def sayHello() {
         def string = "Hello, I am ${name}"
         println(string)
         return string
     }
 }

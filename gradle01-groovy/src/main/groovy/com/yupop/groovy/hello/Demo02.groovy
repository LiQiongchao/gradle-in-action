package com.yupop.groovy.hello

/**
 * 作为脚本语言，Groovy支持多种方式定义方法
 * 作为脚本语言时，class继承Script，没有class
 * @Author: Qiongchao
 * @Version: 1.0.0
 * @Date: 2023/12/5
 */

def username = "李白"
println(username)

/**
 * 当类和脚本混合时，类名不能和文件名相同
 */
class Book {

}

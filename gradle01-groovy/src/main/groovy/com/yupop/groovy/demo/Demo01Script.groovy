package com.yupop.groovy.demo

/**
 *
 * @Author: Qiongchao
 * @Version: 1.0.0
 * @Date: 2023/12/5
 */
def notice = new Demo01BasicNotice()

// Groovy 类中提供了 getter setter方法
println(notice.getBookname())

// 小括号可以省略
def sale = notice.sale 100
//println(sale)
println sale

notice.bookname = "Groovy 入门"
println(notice.bookname)

notice["bookname"] = "Groovy 入门1"
println(notice["bookname"])

notice.setBookname("Groovy 入门2")
println(notice.getBookname())

//new Demo01BasicNotice(bookname: "Groovy 入门3", description: "desc")
def notice1 = new Demo01BasicNotice(bookname: "Groovy 入门3")
println(notice1.bookname)

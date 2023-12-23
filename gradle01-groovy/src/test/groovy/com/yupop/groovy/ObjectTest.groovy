package com.yupop.groovy

import com.yupop.groovy.demo.Demo01BasicNotice

/**
 *
 * @Author: Qiongchao
 * @Version: 1.0.0
 * @Date: 2023/12/23
 */

def notice = new Demo01BasicNotice()
//def notice = null
//notice?.description="hello"
// ?: 可以防止对象为空时继续操作报错
def var = notice?.description
println(var)




package com.demo.adapter;

/**
 * @program: designpattern
 * @description: 类的适配器模式
 * @author: zzy
 * @create: 2019-05-13 00:47
 **/
public class ClassAdapter {
    public static void call(target t){
        t.sampleOperation1();
        t.sampleOperation2();
    }

    public static void main(String[] args) {
        call(new Adapter());
    }
}

/**
 * 目标角色 所期待的接口
 */
interface target{
    /**
     *  这是源类Adaptee也有的方法
     */
    public void sampleOperation1();

    /**
     * 这是源类Adapteee没有的方法
     */
    public void sampleOperation2();
}

/**
 * 要被适配处理的类
 */
 class Adaptee {

    public void sampleOperation1(){}

}

class Adapter extends  Adaptee implements target{

    @Override
    public void sampleOperation2() {

    }
}




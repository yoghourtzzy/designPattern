package com.demo.adapter;

/**
 * @program: designpattern
 * @description: 对象适配器模式
 * @author: zzy
 * @create: 2019-05-13 23:07
 **/
public class ObjectAdapter {
    private static void execute(Target2 target2){

    }
    public static void main(String[] args) {
        execute(new Adapter2(new Adaptee2()));
    }
}
 interface Target2 {
    /**
     * 这是源类Adaptee也有的方法
     */
    public void sampleOperation1();
    /**
     * 这是源类Adapteee没有的方法
     */
    public void sampleOperation2();
}

class Adaptee2 {

    public void sampleOperation1(){}

}

class Adapter2 implements Target2   {
    private Adaptee2 adaptee;

    public Adapter2(Adaptee2 adaptee){
        this.adaptee = adaptee;
    }
    /**
     * 源类Adaptee有方法sampleOperation1
     * 因此适配器类直接委派即可
     */
    public void sampleOperation1(){
        this.adaptee.sampleOperation1();
    }
    /**
     * 源类Adaptee没有方法sampleOperation2
     * 因此由适配器类需要补充此方法
     */
    public void sampleOperation2(){
        //写相关的代码
    }
}



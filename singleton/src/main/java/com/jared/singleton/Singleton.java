package com.jared.singleton;

/**
 * @Author jared
 * 双重安全检测单例 饿汉式
 */
public class Singleton {
    private Singleton(){

    }
    private volatile static Singleton singleton;

    public static Singleton getInstance(){
        if(singleton == null){
            synchronized(Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}

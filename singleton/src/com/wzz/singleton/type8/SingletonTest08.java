package com.wzz.singleton.type8;

/**
 * 优缺点说明:
 * l)这借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建
 * 新的对象。
 * 2)这种方式是 Effective Java作者Josh Bloch提倡的方式
 * <p>
 * 3)结论:推荐使用
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.aaa;
        Singleton instance2 = Singleton.bbb;
        System.out.println(instance == instance2);

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        instance.sayOK();
    }
}

//使用枚举，可以实现单例, 推荐
enum Singleton {
    aaa, //属性
    bbb;

    public void sayOK() {
        System.out.println("ok~");
    }
}
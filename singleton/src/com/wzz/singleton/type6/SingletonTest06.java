package com.wzz.singleton.type6;

/**
 * 优缺点说明:
 *     l)Double-Check概念是多线程开发中常使用到的，如代码中所示，我们进行了两次if (singleton ==- null)检查，这
 *       样就可以保证线程安全了。
 *     2)这样，实例化代码只用执行一次，后面再次访问时，判断if (singleton ==- null)，直接return实例化对象，也避
 *       免的反复进行方法同步.
 *     3)线程安全;延迟加载:效率较高
 *     4)结论:在实际开发中，推荐使用这种单例设计模式
 */
public class SingletonTest06 {

	public static void main(String[] args) {
		System.out.println("双重检查");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());

	}

}

// 懒汉式(线程安全，同步方法)
class Singleton {
	private static volatile Singleton instance;

	private Singleton() {}

	//提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
	//同时保证了效率, 推荐使用

	public static synchronized Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}

		}
		return instance;
	}
}
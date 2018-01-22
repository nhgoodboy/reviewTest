/**
 * 
 */
/**
 * @author 80635
 *
 */
package singleton;

public class Singleton{
	
	//静态内部类加载方式  (懒汉式，延迟加载)
	private static class LazyHolder{
		private static final Singleton INSTANCE = new Singleton();
	}
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return LazyHolder.INSTANCE;
	}
	
	public static void main(String[] args) {
		System.out.println(Singleton.getInstance());
		
		System.out.println(SingletonEnum.INSTANCE.getInstance());
	}
}
package design_pattern.observer_pattern;

public class test {

	public static void main(String[] args) {
		Watched watched = new Watched();
		Watcher watcher = new Watcher(watched);
		watched.setData("哈哈个");
		watched.setData("哈哈个了");
	}
}

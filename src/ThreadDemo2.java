
public class ThreadDemo2 extends Thread{
	public static void main(String[] args) {

		ThreadDemo thread = new ThreadDemo();
		System.out.println(thread.getId());
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		System.out.println(thread.getState());
	}
}

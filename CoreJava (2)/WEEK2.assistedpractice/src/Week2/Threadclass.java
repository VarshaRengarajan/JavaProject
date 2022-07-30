package Week2;

public class Threadclass extends Thread {
	public void run(){
		System.out.println("The thread class is created");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadclass s=new Threadclass();
		s.start();

	}

}

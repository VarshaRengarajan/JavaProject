package Week2;
class Example{
	synchronized void printExample(int n){
		for(int i = 1;i<5;i++){
			System.out.println(n*i);  
		     try{  
		      Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
		   }  
		  
		 }  
		}  
		  
		class MyThread1 extends Thread{  
		Example t;  
		MyThread1(Example t){  
		this.t=t;  
		}  
		public void run(){  
		t.printExample(5);  
		}  
		  
		}  
		class MyThread2 extends Thread{  
		Example t;  
		MyThread2(Example t){  
		this.t=t;  
		}  
		public void run(){  
		t.printExample(100);  
		}  
		}  
		  
		public class Threadsyn{  
		public static void main(String args[]){  
		Example obj = new Example();//only one object  
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  
		}  
		  

			
}
	



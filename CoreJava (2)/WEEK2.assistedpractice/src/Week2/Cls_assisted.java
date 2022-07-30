package Week2;

public class Cls_assisted {
	String name;
	int roll_no;
	char sec;
	
	public Cls_assisted(String name,int roll_no,char sec){
		this.name=name;
		this.roll_no=roll_no;
		this.sec=sec;
		
		
	}
	public String getName(){
		return name;
	}
	public int getRoll_no(){
		return roll_no;
		
	}
	public char getSection(){
		return sec;
	}
	
	@Override
	public String toString(){
		return("I am "+this.getName()+" of section "+this.getSection()+" and my roll number is "+this.getRoll_no());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cls_assisted obj1=new Cls_assisted("sean",63,'B');
		System.out.println(obj1.toString());

	}

}

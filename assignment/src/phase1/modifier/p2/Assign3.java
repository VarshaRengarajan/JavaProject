package phase1.modifier.p2;

public class Assign3 {
	
	
		String name;
		int age;
		char section;
		char gender;
		int sub1;
		int sub2;
		int sub3;
		
		Assign3(){
			System.out.println("default");
		}
		
		Assign3(String name,int age,char section,char gender,int i,int j,int k){
		    this.name = name;
		    this.age = age;
		    this.section = section;
		    this.gender = gender;
			this.sub1=i;
			this.sub2=j;
			this.sub3=k;
			
		}
		Assign3(String name,int age,char section,char gender,int i,int j){
		    this.name = name;
		    this.age = age;
		    this.section = section;
		    this.gender = gender;
		    this.sub1=0;
			this.sub2=i;
			this.sub3=j;
		}
		void show(){
		    System.out.println("student info:"+("Name: "+this.name+",age: "+this.age+",section: "+this.section+",gender: "+this.gender));
		    System.out.println("subject marks of student:"+(this.sub1+","+this.sub2+","+this.sub3));
			System.out.println("total marks of student:"+(this.sub1+this.sub2+this.sub3));
			System.out.println("total percentage:"+((this.sub1+this.sub2+this.sub3)/3));
			System.out.println("-----------------------");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Assign3 s0=new Assign3();
			Assign3 s1=new Assign3("poyya",20,'b','m',54,96,56);  // passing 3 sub
			Assign3 s2=new Assign3("varu",18,'b','f',85,69);      // passing 2 sub
			Assign3 s3=new Assign3("raj",20,'b','m',10,62);     // passing 2 sub
			Assign3 s4=new Assign3("krish",18,'b','f',45,81,96);   // passing 3 sub
			s1.show();
			s2.show();
	        s3.show();
			s4.show();
		}

	}

	



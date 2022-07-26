package Assistedprojects;

public class Stringmodel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Methods of Strings");
		String st = new String("Hello all");
		System.out.println(st.length());
		
		
		String sub = new String("Welcome");//substring
		System.out.println(sub.substring(2));
		
		String s1="Hello";
		String s2="Heldo";
		System.out.println(s1.compareTo(s2));
		
		String s3="";
		System.out.println(s3.isEmpty());
		
		String s4="temple";
		System.out.println(s4.toUpperCase());
		
		String s6="chile";
		String replace=s6.replace('l', 'i');
		System.out.println(replace);
		
		String x="JavA";
		String y="JaVa";
		System.out.println(x.equals(y));
 
		System.out.println("\n");
		
		StringBuffer s=new StringBuffer("Welcome to Java!");
		s.append("Enjoy your learning");
		System.out.println(s);

		
		s.insert(0, 'H');
		System.out.println(s);
		
		StringBuffer si=new StringBuffer("Hello");
		si.replace(0, 2, "byl");
		System.out.println(si);
		
		si.delete(0, 1);
		System.out.println(si);
		
		//stringbuilder
		StringBuilder sb1=new StringBuilder("Good");
		sb1.append("Morning");
		System.out.println(sb1);

		System.out.println(sb1.delete(1, 2));

		System.out.println(sb1.insert(1, "Welcome"));

		System.out.println(sb1.reverse());
				
		//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		
		String str = "Hello"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer sbr1 = new StringBuffer(str); 
        sbr1.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr1); 
          
        // conversion from String object to StringBuilder 
        StringBuilder sb2 = new StringBuilder(str); 
        sb2.append("world"); 
        System.out.println("String to StringBuilder");
        System.out.println(sb2);              		
	}





		
	





		



	}



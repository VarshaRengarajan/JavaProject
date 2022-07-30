package Week2;
class Display
{
    protected void disp(char c)
    {
         System.out.println(c);
    }
    
    public void disp(char c, long num)  
    {
         System.out.println(c + " "+num);
    }
    
    double disp(int c)
    {
       System.out.println(c);
       return 0;
    } 
}

public class polymorp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display obj=new Display();
		obj.disp('t');
		obj.disp(5);
		obj.disp('B', 456);
		

	}

}

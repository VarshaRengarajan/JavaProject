package Week2;

public class Exceptioneg {
        void Division() throws ArithmeticException
        {
            int a=45,b=0,c;
            c = a / b;
            System.out.print("The result is : " +c);
        }
         public static void main(String[] args)
            {
            Exceptioneg T = new Exceptioneg();
             try
            {
                T.Division();
            }
            catch(ArithmeticException Ex)
            {
                System.out.print("\nError : " + Ex.getMessage());
            }
            System.out.print("\nEnd of program.");
        }
    }


	
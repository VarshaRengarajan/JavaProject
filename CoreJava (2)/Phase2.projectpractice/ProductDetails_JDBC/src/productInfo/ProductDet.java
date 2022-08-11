package productInfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductDet
 */
@WebServlet("/ProductDet")
public class ProductDet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	    private static final String url = "jdbc:mysql://localhost:3306/db_world";
	    private static final String user = "root";
	    private static final String password = "root";

	    // JDBC variables for opening and managing connection
	    private static Connection con;
	    private static Statement stmt;
	    private static ResultSet rs;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");

		PrintWriter out = response.getWriter();
		
		String query= "select * from Product where id = "+id;
    	
		try {     	
        	try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}  	
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();
    	
    	rs = stmt.executeQuery(query); 
    	if (rs.next()==false){
    	out.println("product not found");	
    	}
    	else{
    		
    	do{
    	
    	 
    	   int productid = rs.getInt(1); 
    	   String product_name = rs.getString(2); 
    	   int product_price = rs.getInt(3); 
    	   String product_category = rs.getString(4);
    	   out.printf("id : %d, product_name: %s, product_price: %d , product_category : %s %n", productid, product_name, product_price,product_category); 
    	}while(rs.next());}
    	
    	}   	       
    	catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }
   }}
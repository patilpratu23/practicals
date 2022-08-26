import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner; 

public class Bank {

	public static void main(String[] args) {
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Bank Code");
		String B_Code=sc.next();
		System.out.println("Enter the Bank Name");
		String B_Name=sc.next();
		System.out.println("Enter the Bank Address");
		String B_Address=sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:bank/pratiksha", "root", "pratiksha23");
			Statement s=con.createStatement();
			
			/*PreparedStatement ps=con.prepareStatement("insert into Bank(Bank_Code,Bank_Name,Bank_Address) values(?,?,?);");
			ps.setString(1,B_Code);
			ps.setString(2,B_Name);
			ps.setString(3,B_Address);
			
			
			ResultSet rs=s.executeQuery("select Bank_Code,Bank_Name,Bank_Address   from Bank") ;
			System.out.println("Bank_Code \t Bank_Name \t  Bank_Address");
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			while(rs.next()) 
			{
				System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t "+rs.getString(3));
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
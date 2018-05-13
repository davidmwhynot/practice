import java.sql.*;   // Needed for JDBC classes

/**
 * This program demonstrates how to connect to
 * a Java DB database using JDBC.
 */
public class TestConnection
{
   public static void main(String[] args)
   {
      // Create a named constant for the URL.
      // NOTE: This value is specific for Java DB.
      // final String DB_URL = "jdbc:derby:CoffeeDB";

      try
      {
         // Create a connection to the database.
				 Connection dbc = DriverManager.getConnection("jdbc:derby:college");
         System.out.println("Connection created.");

         // Close the connection.
         dbc.close();
         System.out.println("Connection closed.");
      }
      catch(Exception ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
      }
   }
}

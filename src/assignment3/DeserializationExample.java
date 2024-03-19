package assignment3;
import java.io.*;

public class DeserializationExample 
{
	   public static void main(String[] args) 
	   {
	        try
	        {
	            FileInputStream fileIn = new FileInputStream("product.ser");
	            ObjectInputStream in = new ObjectInputStream(fileIn);
	            Product product = (Product) in.readObject();
	            in.close();
	            fileIn.close();

	            System.out.println("Deserialized Product:");
	            product.printDetails();
	        } 
	        catch (IOException | ClassNotFoundException e) 
	        {
	            e.printStackTrace();
	        }
	    }
}

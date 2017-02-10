import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//ExecutorService pool = Executors.newCachedThreadPool();
	
		
	Employee emp = new Employee( 1,"ut") ;
	Employee emp2 = new Employee( 1,"piyush") ;
		
	/*System.out.println(emp.getName());
	
	FileOutputStream fileOut;
	try {
		fileOut = new FileOutputStream("D://employee.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(emp);
        out.close();
        fileOut.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	*/
	        

		try {
	         FileInputStream fileIn = new FileInputStream("D://employee.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         emp2 = (Employee) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i) {
	         i.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c) {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         return;
	      }
	
		System.out.println("Transient id is"+emp2.getId());
		System.out.println("satatic  field name is"+emp2.getName());
		System.out.println("Final field versioner"+emp2.getVersioner());
		
		
	}

}

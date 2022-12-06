//write a script to read the data from the Property File      1-11-22

package nishu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./Testdata/commondata.property");
		 Properties p = new Properties();
		 p.load(fis);
		 String Thane = p.getProperty("url");
		 String Andheri = p.getProperty("username");
		 String Vashi = p.getProperty("password");
		 
		 System.out.println(Thane);
		 System.out.println(Andheri);
		 System.out.println(Vashi);
		 
		
		
	}

}

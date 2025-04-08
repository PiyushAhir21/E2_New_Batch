package extra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromPropFile {
	public static void main(String[] args) throws IOException {
//		Step - 1 : Create java representation object of the physical file
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Basic_Selenium\\vtiger-crm-framework-m16\\src\\test\\resources\\commonData.properties");
		
		Properties pObj = new Properties();
//		Step - 2 : by using load(), load all the keys
		pObj.load(fis);
		
//		step - 3 : By using getProperty(), get the values
		String URL = pObj.getProperty("url");
		System.out.println();
	}
}

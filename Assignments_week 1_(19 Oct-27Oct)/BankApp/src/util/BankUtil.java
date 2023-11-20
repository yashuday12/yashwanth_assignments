package util;

import com.hdfc.service.BankImpTwo;
import com.hdfc.service.IBank;

public class BankUtil { 

	
	public static  IBank getBankObj() { 
		
		
		return  new BankImpTwo();
		
		
	}
	
	
}

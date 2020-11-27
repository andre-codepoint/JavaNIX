package com.epam.rd.java.basic.practice1;

public static String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
	public static void main(String[] args) {
    	    	//System.out.println(str2int("ZZ"));
    	    	//System.out.println(int2str(703));
    	    	//System.out.println(rightColumn("ZZ"));
    }
    public static int str2int(String number) {
    	int n = number.length();
    	int res = 0;
    	int i = 0;
    	while (i<n)
    	{
    		int p=pow(alph.length(),i);
    		int ind = alph.indexOf(number.charAt(n-i-1))+1;
    		//System.out.println(alph.length()+"^"+i+"="+p+"*"+ind);
    		res = res + p*ind;
    		i = i+1;
    	}
        return res;
    }
    
    public static int pow (long a, int b)
    {
    	int power = 1;
        for(int c = 0; c < b; c++)
            power *= a;
        return power;
    }
  
    public static String int2str(int columnNumber) 
    {     
        int dividend = columnNumber;   
        int i;
        String columnName = "";     
        int modulo;     
        while (dividend > 0)     
        {        
            modulo = (dividend - 1) % 26;         
            i = 65 + modulo;
            columnName = new Character((char)i).toString() + columnName;        
            dividend = (int)((dividend - modulo) / 26);    
        }       
        return columnName; 
    }

    public static String rightColumn(String number) {
        return (int2str(str2int(number)+1));
    	
    }
}

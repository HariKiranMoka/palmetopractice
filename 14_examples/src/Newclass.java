
 class RemoveChar {  
    public static void main(String[] args) {  
    	
        String s="abcde";
    	if(s.charAt(1)=='b')
		 {
			 String s1;
			 s1=s.substring(0,1);
			 System.out.println(s1.substring(2,s.length()));
		 }
		 
}  
 }

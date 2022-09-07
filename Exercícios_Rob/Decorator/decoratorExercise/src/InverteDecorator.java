
public class InverteDecorator extends FonteDeDadosDecorator{
	public InverteDecorator (FonteDeDados _dados) {
		super(_dados);
	}
	
	@Override
	public String resultado(){
		String string = super.resultado();
		String reverse =  reverseString(string);
		return reverse;
	}
	
	public static String reverseString(String str){  
	    char ch[]=str.toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	    }  
	    return rev;  
	}  
}



import java.util.regex.*;    
import java.util.*;   
public class EmailValidation {
	public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
          
        emails.add("rajeshTpoint@domain.co.in");  
        emails.add("rahulTpoint@domain.com");  
        emails.add("veenaTpoint.name@domain.com");  
        emails.add("siriTpoint#@domain.co.in");  
        emails.add("kavya'Tpoint@domain.com");  
        //Add invalid emails in list  
        emails.add(".raviTpoint@yahoo.com");  
        emails.add("reenaTpoint@domain.com.");  
        emails.add("jerryTpoint#domain.com");  
        emails.add("tomTpoint@domain..com");  
        //Regular Expression   
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate emails array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  

}

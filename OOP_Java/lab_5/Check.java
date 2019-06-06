package lab_5;

import java.util.regex.Pattern;

public class Check {
 
  static boolean nameCheck(String in)
  {
	 
	  if(Pattern.matches("^\\D{1,}$" , in ) )
		  return true;
	  else return false;
  }
  
  static boolean adressCheck(String in)
  {
	  if(Pattern.matches("^\\w{1,}$" , in ) )
		  return true;
	  else return false;
  }
  
  static boolean regDateCheck(String in)
  {
	  if(Pattern.matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$" , in)) 
		  return true;
	  else
		  return false;  
}}

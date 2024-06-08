package task10;

public class Ikshvaku {

	  public static void main(String a[]){
	   
	    String[] persons = new String[]{"ram", "Lakshmana"};

	   
	    String[] newpersons = new String[persons.length+2];


	    
	    for (int i=0; i<persons.length; i++)
	    {
	      newpersons[i] = persons[i];
	    }

	  
	    newpersons[newpersons.length-2]= "Bharata"; 
	    newpersons[newpersons.length-1]= "Shatrughna"; 
	  
	    for (String str: newpersons)
	    {
	      System.out.println(str);
	    }
	  }
	}


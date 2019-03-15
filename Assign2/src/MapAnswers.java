import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapAnswers {
	  
	private int id;  
  
	private Map<String,String> answers;  
	 
	public MapAnswers(int id, Map<String, String> answers) {
		super();
		this.id = id;
	
		this.answers = answers;
	}

	public MapAnswers() {
		super();
	}
	
	public void displayInfo(){  
	    System.out.println("question id:"+id);    
	    Set<Entry<String, String>> set=answers.entrySet();  
		Iterator<Entry<String, String>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<String,String> entry=itr.next();  
	        System.out.println("Question: "+entry.getKey()+" Answer: "+entry.getValue());  
	    }  
	}
}


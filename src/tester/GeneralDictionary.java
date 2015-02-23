package tester;

// @author Brian King

// Importing required classes

import java.util.SortedMap;
import java.util.TreeMap;

public class GeneralDictionary implements Dictionary {
    
    private SortedMap<String, String>map;
    
    public GeneralDictionary(){
        map = new TreeMap<String, String>();
        map.put("Book", "A set of printed pages, bound with a cover.");
        map.put("Editor","A person who edits.");
    }
    
    public String getDefinition(String word){
        return map.get(word);
    }
        
}

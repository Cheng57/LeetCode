import java.util.*;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        ArrayList<Character> al1 = new ArrayList<>();
        ArrayList<Character> al2 = new ArrayList<>();
        
        for(char c : ransomNote.toCharArray()){
            al1.add(c);
        }
        
        for(char c : magazine.toCharArray()){
            al2.add(c);
        }
        
        int count = 0;
        
        for(int i = 0; i< al1.size(); i++){
            if(al2.indexOf(al1.get(i)) >= 0){
                al2.remove(al1.get(i));
                count++;
            }
        }
        
        if(count == al1.size()){
            return true;
        }
        
        return false;
    }
}
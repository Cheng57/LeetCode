class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    
        for(int i = 0; i < ransomNote.length(); i++){
            
            char c = ransomNote.charAt(i);
            int matchingIndex = magazine.indexOf(c);
            
            if(matchingIndex == -1){
                return false;
            }
            
            magazine = magazine.substring(0, matchingIndex) +               magazine.substring(matchingIndex + 1);
        }
        
        return true;
    }
}
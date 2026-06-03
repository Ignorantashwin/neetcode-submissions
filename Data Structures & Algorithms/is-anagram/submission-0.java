class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()){
        return false;
       }
       int[] point = new int [26];
       for(int i = 0; i<s.length(); i++){
        point[s.charAt(i)- 'a'] ++ ;
        point[t.charAt(i)- 'a'] -- ;
       }
      for (int i = 0; i<26; i++){
        if(point[i]!= 0){
            return false;
        }
      }
      return true;
    }
}

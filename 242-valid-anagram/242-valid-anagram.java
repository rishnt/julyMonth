class Solution {
    public boolean isAnagram(String s, String t) {
           HashMap<Character,Integer> h=new HashMap<Character,Integer>();
        
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
                  if(h.containsKey(ch)){
                      h.put(ch,h.get(ch)+1);
                  }
            else{
                  h.put(ch,1);
            }
             }

    for(int j=0;j<t.length();j++){
        char ch1=t.charAt(j);
         if(h.containsKey(ch1)==false){
            return false;
            
        }
        
      else if(h.get(ch1)==1){
            h.remove(ch1);
                  }
                  else{
                      h.put(ch1,h.get(ch1)-1);
                  }
          }
        
        if(h.isEmpty())
        {
            return true;
        }
        return false;
                  }
                  }
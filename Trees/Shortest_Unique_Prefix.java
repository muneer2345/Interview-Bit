 class TrieNode{
    Map<Character,TrieNode> children;
    Map<Character,Integer> freq;
    boolean isEnd;
    
    public TrieNode()
    {
        children=new HashMap<Character,TrieNode>();
        freq=new HashMap<Character,Integer>();
        isEnd=false;
    }
    
}
public class Solution {
    TrieNode root;
    public ArrayList<String> prefix(ArrayList<String> A) {
          ArrayList<String> result=new ArrayList<String>();
        if(A==null || A.size()==0) return result;
        root=new TrieNode();
        for(String s:A)
        {
            insert(s);
        }
    
        return representation(A);
        
    }
    public void insert(String word)
    {
        TrieNode curr=root;
        for(char c:word.toCharArray())
        {
            if(curr.children.get(c)==null)
            {
                TrieNode node=new TrieNode();
                curr.children.put(c,node);
                curr.freq.put(c,1);
                curr=curr.children.get(c);
            }
            else
            {
            curr.freq.put(c,curr.freq.get(c)+1);
            curr=curr.children.get(c);
            }
        }
        curr.isEnd=true;
    }
    
    public ArrayList<String> representation(ArrayList<String> A)
    {  
        ArrayList<String> result=new ArrayList<String>();
        if(A==null) return result;
        
        for(String s:A)
        {
            TrieNode curr=root;
            StringBuilder sb=new StringBuilder();
            for(char c:s.toCharArray())
            {
                if(curr.children.get(c)!=null && curr.freq.get(c)==1)
                {
                    sb.append(c);
                    result.add(sb.toString());
                    break;
                }
                else if(curr.children.get(c)!=null && curr.freq.get(c)>1)
                {
                    sb.append(c);
                    curr=curr.children.get(c);
                    
                }
            
            }
        }
        return result;
    }
    
    
}

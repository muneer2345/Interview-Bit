public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        
        if(A.size()==0) return result;
        
        if(A==null) return result;
        
        int rows=A.size();
        int columns=A.get(0).size();
                 // System.out.println("R"+rows+"Y"+columns);
        for(int i=0;i<columns;i++)
        {
             ArrayList<Integer> test=new ArrayList<Integer>();
             
             test.add(A.get(0).get(i));
             
             int x=0;
             int y=i;
             // System.out.println("X"+x+"Y"+y);
             while( x>=0 && x< rows && y>=0 && y< columns)
             {
                 x=x+1;
                 y=y-1;
                 
                 if(x>=0 && x< rows && y>=0 && y< columns)
                 {
                      test.add(A.get(x).get(y));
                 }
                 
                 else
                 {
                     break;
                 }
                
                
             }
 
            result.add(test);
        }
    
    
    for(int j=1;j<rows;j++)
    {
        
        ArrayList<Integer> test=new ArrayList<Integer>();
        
        
        test.add(A.get(j).get(rows-1));
        
        int x=j;
        int y=rows-1;
        
        while( x>= 0 && x <rows && y >= 0 && y < columns )
        { 
                x=x+1;
                 y=y-1;
                 
                 if(x>=0 && x< rows && y>=0 && y< columns)
                 {
                      test.add(A.get(x).get(y));
                 }
                 
                 else
                 {
                     break;
                 }
                
             
        }
        
        result.add(test);
        
    }
    
    return result;
}
}

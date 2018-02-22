public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
	    
	   //ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
	   
	   if(a==null) return; 
	   int rows=a.size();
	   int columns=a.get(0).size();
	   
	   boolean firstRow=false;
	   boolean firstColumn=false;
	   
	   for(int i=0;i<rows;i++)
	   {
	       if(a.get(i).get(0)==0){
	       firstColumn=true;
	           break;
	       }
	   }
	   for(int j=0;j<columns;j++)
	   {
	       if(a.get(0).get(j)==0)
	       {
	       firstRow=true;
	       break;
	       }
	   }
	   
	   for(int i=1;i<rows;i++)
	   {
	       for(int j=1;j<columns;j++)
	       {
	           if(a.get(i).get(j)==0)
	           {
	               a.get(i).set(0,0);
	               a.get(0).set(j,0);
	           }
	       }
	   }
	   
	   //make rows zero
	   
	   for(int i=1;i<rows;i++)
	   {
	       if(a.get(i).get(0)==0)
	       {
	           for(int j=1;j<columns;j++)
	           {
	               a.get(i).set(j,0);
	           }
	       }
	   }
	   //make columns zer0
	   for(int i=1;i<columns;i++)
	   {
	       if(a.get(0).get(i)==0)
	       {
	           for(int j=1;j<rows;j++)
	           {
	               a.get(j).set(i,0);
	           }
	       }
	   }
	   
	   if(firstRow)
	   {
	       for(int i=0;i<columns;i++)
	       {
	           a.get(0).set(i,0);
	       }
	   }
	   if(firstColumn)
	   {
	       for(int i=0;i<rows;i++)
	       {
	           a.get(i).set(0,0);
	       }
	   }
	   
}
}
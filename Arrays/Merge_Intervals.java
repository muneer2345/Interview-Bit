/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result=new ArrayList<Interval>();
        if(intervals.size()==0)
        {
            intervals.add(newInterval);
            return intervals;
        }
            boolean b=false;
        //TreeMap<Integer,Integer> result=new TreeMap<Integer,Integer>();
        if(newInterval.start > newInterval.end)
        {
            int temp=newInterval.start;
            newInterval.start=newInterval.end;
            newInterval.end=temp;
        }
        
        int start_interval=newInterval.start;
        int end_interval=newInterval.end;
        if(newInterval.start <= intervals.get(0).start && newInterval.end >= intervals.get(intervals.size()-1).end)
        {
                int size=intervals.size()-1;
                while(size>=0)
                {
                    intervals.remove(size);
                    size--;
                }
                intervals.add(new Interval(start_interval,end_interval));
                
                return intervals;
        }
        ArrayList<Integer> list_removed=new ArrayList<Integer>();
        int new_start=Integer.MAX_VALUE;
        int new_end=Integer.MIN_VALUE;
     //   boolean b=false;
        for(int i=0;i<intervals.size();i++)
        {
               if(Math.max(intervals.get(i).start,start_interval) > Math.min(intervals.get(i).end,end_interval))
               {
                   //No overlap // Just add
                  // result.add(intervals.get(i));
                  
               }
               else
               {
                    b=true;
                    new_start=Math.min(new_start,Math.min(intervals.get(i).start,start_interval));
                    new_end=Math.max(new_end,Math.max(intervals.get(i).end,end_interval));
              //      System.out.println("START"+new_start+"END"+new_end);
                   list_removed.add(i);
                //   System.out.println("ADDING "+i);

               }
        }
        
        if(b==false)
        {
              if(newInterval.start <= intervals.get(0).start){
            intervals.add(0, newInterval);
        }
        else if(newInterval.start >= intervals.get(intervals.size()-1).start){
            intervals.add(intervals.size(), newInterval);
        }
        
           else{
            for(int i = 0; i < intervals.size()-1; i++){
                if(intervals.get(i).start < newInterval.start && newInterval.start < intervals.get(i+1).start){
                    intervals.add(i+1, newInterval);
                    
                    break;
                }
                
            }
                 }
        
        
        }
        else
        {
       
        int start_index=list_removed.get(0);
        int size=list_removed.size();
        
        while(size>0)
        {
            intervals.remove(start_index);
            size--;
        }
            
        
       // System.out.println("NEW START"+new_start+"NEW END"+new_end);
        
        intervals.add(start_index,new Interval(new_start,new_end));
        }
return intervals;
    }
}

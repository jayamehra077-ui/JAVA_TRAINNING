import java.util.*;
public class target_sum {


        public static void main(String[]args){

            int arr[]={1,7,5,2};
            HashMap<Integer,Integer>map=new HashMap();
            int target=9;
            for(int i=0;i<arr.length;i++){
                int diff=target-arr[i];
                if(map.containsKey(diff)){
                    System.out.println("elements of given index no. have the target sum=  "+map.get(diff)+""+i);
                    break;
                }
                map.put(arr[i],i);
            }
        }
    }


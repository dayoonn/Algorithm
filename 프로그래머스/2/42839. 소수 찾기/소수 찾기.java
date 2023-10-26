import java.util.*;

class Solution{
    
    static String[] arr_set;
    static String[] arr_per;
    
    static int n_set;
    static int n_per;
    
    static boolean[] visited_set;
    static boolean[] visited_per;
    
    static HashSet<Integer> prime=new HashSet<>();
    
    static String[] result_per;
    
    
    public int solution(String numbers) {
 
        
        arr_set=numbers.split("");
        n_set=arr_set.length;
        visited_set=new boolean[n_set];
        powerset(0);
        
        return prime.size();
    }
    
    public void powerset(int depth_set){
        if(depth_set==n_set){
        	List<String> list=new ArrayList<>();
            for(int i=0;i<n_set;i++) {
            	if(visited_set[i]==true)
            		list.add(arr_set[i]);
            }
            if(list.isEmpty()) return;
            permutation(list.toArray(new String[list.size()]));
            return ;
        }
        
       visited_set[depth_set]=false;
       powerset(depth_set+1);
       visited_set[depth_set]=true;
       powerset(depth_set+1);   
    }
    public void permutation(String[] arr_set) {
    	arr_per=arr_set;
    	result_per=new String[arr_per.length];
    	n_per=arr_per.length;
    	visited_per=new boolean[arr_per.length];
    	recur(0);
    	
    }
    public void recur(int depth_per) {
    if(depth_per==n_per) {
    	//소수찾기
    	String num_str=String.join("", result_per);
    	int num=Integer.parseInt(num_str);
    	isPrime(num);
    	return ;
    }
    for(int i=0;i<arr_per.length;i++) {
    	if(visited_per[i]==false) {
    		visited_per[i]=true;
    		result_per[depth_per]=arr_per[i];
    		recur(depth_per+1);
    		visited_per[i]=false;
    	}
    }
    	
    }
    public void isPrime(int num){
        boolean b=false;
        for(int i=2;i<num/2+1;i++){
            if(num%i==0) {
                b=true;
                break;
            }
        }
        if(!b&&num>1) prime.add(num);
    }
}

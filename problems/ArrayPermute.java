import java.util.ArrayList;
import java.util.List;

public class ArrayPermute {
	public static void main(String[] args) {
		int ar[]=new int[] {1,2,3};
		List<List<Integer>> permutations=permute(ar);
		System.out.println(permutations);
		
	}
	static public List<List<Integer>> permute(int[] nums) {
		   List<List<Integer>> list = new ArrayList<>();
		   // Arrays.sort(nums); // not necessary
		   backtrack(list, new ArrayList<>(), nums);
		   return list;
		}
	
	private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
		if(tempList.size() == nums.length){
		     list.add(new ArrayList<>(tempList));
		} 
		else{
	        for(int i = 0; i < nums.length; i++){ 
		         if(tempList.contains(nums[i])) continue; // element already exists, skip
			     tempList.add(nums[i]);
			     backtrack(list, tempList, nums);
			     tempList.remove(tempList.size() - 1);
	        }
		}
	}
		 
}
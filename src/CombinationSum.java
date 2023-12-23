import java.util.*;

public class CombinationSum {
    public static List<List<Integer>> result = new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates,target,new ArrayList<>(),0);
        return result;
    }
    private static void helper(int[] c,int t,List<Integer> l,int i){
        if(t==0){
            result.add(new ArrayList<>(l));
            return;
        }

        if(i>=c.length){
            return;
        }

        if(t>=c[i]){
            l.add(c[i]);
            helper(c,t-c[i],l,i);
            l.remove(l.size()-1);
        }
        helper(c,t,l,i+1);
    }

    public static void main(String[] args) {
        combinationSum(new int[]{2,3,5},8);
        System.out.println(result);
        List<Integer> l = new ArrayList<>();
        l.add(5);l.add(3);
        Collections.sort(l);
        System.out.println(l);
        System.out.println(result.contains(l));
    }
}

package algorithmsruntimeanalysisandbigonotation.comparedatastructureforsearching;
import java.util.*;
public class CompareDataStructureForSearching {
	    // Linear search in an array
	    public static boolean searchInArray(int[] arr, int target) {
	        for (int num : arr) {
	            if (num == target)
	                return true;
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        int dataSize = 1_000_000; // 1 million elements
	        int searchTarget = 987654;

	        // ---------- Preparing Dataset ----------
	        int[] array = new int[dataSize];
	        HashSet<Integer> hashSet = new HashSet<>();
	        TreeSet<Integer> treeSet = new TreeSet<>();

	        for (int i = 0; i < dataSize; i++) {
	            array[i] = i;
	            hashSet.add(i);
	            treeSet.add(i);
	        }

	        // ---------- Array Search ----------
	        long startArray = System.nanoTime();
	        boolean foundArray = searchInArray(array, searchTarget);
	        long endArray = System.nanoTime();
	        System.out.println("Found in Array? " + foundArray);
	        System.out.println("Array Search Time: " + (endArray - startArray) / 1_000_000.0 + " ms");

	        // ---------- HashSet Search ----------
	        long startHashSet = System.nanoTime();
	        boolean foundHashSet = hashSet.contains(searchTarget);
	        long endHashSet = System.nanoTime();
	        System.out.println("Found in HashSet? " + foundHashSet);
	        System.out.println("HashSet Search Time: " + (endHashSet - startHashSet) / 1_000_000.0 + " ms");

	        // ---------- TreeSet Search ----------
	        long startTreeSet = System.nanoTime();
	        boolean foundTreeSet = treeSet.contains(searchTarget);
	        long endTreeSet = System.nanoTime();
	        System.out.println("Found in TreeSet? " + foundTreeSet);
	        System.out.println("TreeSet Search Time: " + (endTreeSet - startTreeSet) / 1_000_000.0 + " ms");
	    }
	}

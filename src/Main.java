import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] input = {1,2,1,2,3,2,2,2,6,7,6};
        HashMap<String, Integer> tripletsCount = countTriplets(input);
        System.out.println("Triplets count: " + tripletsCount.size());
        for (String triplet : tripletsCount.keySet()) {
            System.out.println(triplet + " : " + tripletsCount.get(triplet));
        }
    }

    public static HashMap<String, Integer> countTriplets(int[] input) {
        HashMap<String, Integer> tripletsCount = new HashMap<String, Integer>();
        for (int i = 0; i < input.length - 2; i++) {
            for (int j = i + 1; j < input.length - 1; j++) {
                for (int k = j + 1; k < input.length; k++) {
                    if ((input[i] == input[j] || input[j] == input[k] || input[k] == input[i]) && !isConsecutive(input, i, j, k)) {
                        String triplet = input[i] + "," + input[j] + "," + input[k];
                        if (tripletsCount.containsKey(triplet)) {
                            tripletsCount.put(triplet, tripletsCount.get(triplet) + 1);
                        } else {
                            tripletsCount.put(triplet, 1);
                        }
                    }
                }
            }
        }
        return tripletsCount;
    }

    public static boolean isConsecutive(int[] input, int i, int j, int k) {
        return (input[i] == input[j] && input[j] == input[k]) || (input[i] == input[j] - 1 && input[j] == input[k] - 1) || (input[i] == input[j] + 1 && input[j] == input[k] + 1);
    }
}

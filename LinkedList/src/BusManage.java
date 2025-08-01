// Java program to find number of
// employees under every manager
import java.util.*;

class GFG {

    // Helper function to recursively count
    // the number of employees under a manager
    static int findEmployees(Map<String, List<String>> dataset,
                             Map<String, Integer> result, String mngr) {

        // if the result is already calculated
        if(result.get(mngr) != -1) {
            return result.get(mngr);
        }

        // if the manager is not present in the dataset
        if(!dataset.containsKey(mngr)) {
            result.put(mngr, 0);
            return 0;
        }

        // count the number of employees under the manager
        int count = 0;
        for(String i: dataset.get(mngr)) {

            if(result.get(i) != -1)
                count += result.get(i);
            else {
                result.put(i, findEmployees(dataset, result, i));
                count += result.get(i);
            }
        }
        result.put(mngr, count + dataset.get(mngr).size());
        return result.get(mngr);
    }

    // Function to find the count of
    // employees under each manager
    static List<Map.Entry<String, Integer>>
    findCount(List<List<String>> arr) {

        // to store the employees under each manager
        Map<String, List<String>> dataset = new HashMap<>();

        // to store the results
        Map<String, Integer> result = new HashMap<>();
        for(List<String> i: arr) {
            if(i.get(1).equals(i.get(0))) continue;
            dataset.putIfAbsent(i.get(1), new ArrayList<>());
            dataset.get(i.get(1)).add(i.get(0));

            // initialize the result with -1
            result.put(i.get(0), -1);
            result.put(i.get(1), -1);
        }

        for(Map.Entry<String, Integer> i: result.entrySet()) {

            // if the manager is not visited yet
            if(i.getValue() == -1) {
                findEmployees(dataset, result, i.getKey());
            }
        }

        List<Map.Entry<String, Integer>> res =
                new ArrayList<>(result.entrySet());

        // sort the result
        res.sort(Map.Entry.comparingByKey());
        return res;
    }

    public static void main(String[] args) {
        List<List<String>> arr = Arrays.asList(
                Arrays.asList("A", "C"),
                Arrays.asList("B", "C"),
                Arrays.asList("C", "F"),
                Arrays.asList("D", "E"),
                Arrays.asList("E", "F"),
                Arrays.asList("F", "F")
        );

        List<Map.Entry<String, Integer>> result = findCount(arr);

        for(Map.Entry<String, Integer> i: result) {
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }
}
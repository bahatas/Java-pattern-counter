package patterns;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueNumber implements FindPatternStrategy {
    @Override
    public String findPattern(List<String> input) {

        System.out.println(this.getClass().getName());

        Map<Integer, Integer> numberCount = new HashMap<>(); // map to store number count

        input.forEach(line -> {
            String[] tokens = line.split("\\s+"); // split line into tokens by whitespace
            for (String token : tokens) {
                try {
                    int number = Integer.parseInt(token); // parse token as integer
                    int count = numberCount.getOrDefault(number, 0); // get current count or default to 0
                    numberCount.put(number, count + 1); // increment count and put in map
                } catch (NumberFormatException e) {
                    // token is not a number, ignore it
                }
            }
        });

        // build number count string
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : numberCount.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}

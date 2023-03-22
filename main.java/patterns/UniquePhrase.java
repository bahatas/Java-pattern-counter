package patterns;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniquePhrase implements FindPatternStrategy {
    @Override
    public String findPattern(List<String> input) {

        System.out.println(this.getClass().getName());
        Map<String, Integer> phraseCount = new HashMap<>(); // map to store phrase count

        for (String line : input) {
            String[] tokens = line.split("\\s+"); // split line into tokens by whitespace
            for (int i = 0; i < tokens.length - 2; i++) {
                String phrase = tokens[i] + " " + tokens[i + 1] + " " + tokens[i + 2]; // build phrase
                int count = phraseCount.getOrDefault(phrase, 0); // get current count or default to 0
                phraseCount.put(phrase, count + 1); // increment count and put in map
            }
        }

        // build phrase count string
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : phraseCount.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}

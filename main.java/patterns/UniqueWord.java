package patterns;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueWord implements FindPatternStrategy{
    @Override
    public String findPattern(List<String> input) {


        System.out.println(this.getClass().getName());

        String[] words = input.stream().collect(Collectors.joining(" ")).replaceAll("\\d+", "").split("\\s+");
        System.out.println("words for uniwue word = " + Arrays.toString(words));
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (!word.equals("")){
                map.put(word, map.getOrDefault(word, 0)+1);
            }
        }
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, Integer> each : map.entrySet()) {
            builder.append(each.getKey()).append(", ").append(each.getValue()).append("\n");
        }
        return builder.toString();
    }
}

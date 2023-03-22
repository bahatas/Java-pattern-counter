package patterns;

import java.util.List;

@FunctionalInterface
public interface FindPatternStrategy {

    String findPattern(List<String> input);

}

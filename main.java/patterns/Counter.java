package patterns;


import java.util.List;

public class Counter {

    private List<String> list;
    private FindPatternStrategy findPatternStrategy;
    public Counter(List<String> list, FindPatternStrategy findPatternStrategy) {
        this.list = list;
        this.findPatternStrategy = findPatternStrategy;
    }

    /**
     * This is strategy design patern implementation
     * @param list
     * @return
     */
    public String count(List<String> list){
        return findPatternStrategy.findPattern(list);
    }
}



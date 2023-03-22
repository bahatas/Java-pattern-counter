import patterns.Counter;
import patterns.FindPatternStrategy;
import reader.MainReader;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, InterruptedException {

        if (args.length != 2) {
            System.err.println("Usage: java  <filename>, <LogicName> >> ");
            System.err.println("Usage: java -cp . App.java input.txt UniqueNumber");
            System.exit(1);
        }

        System.out.println("Application started reading arguments");
        Thread.sleep(2000);
        System.out.println("File Path = " + args[0]);
        System.out.println("Strategy = " + args[1]);


        MainReader mainReader = new MainReader();
        List<String> read = mainReader.read(args[0]);


        Class<FindPatternStrategy> findPatternStrategy = (Class<FindPatternStrategy>) Class.forName("patterns." + args[1]);
        FindPatternStrategy f = findPatternStrategy.getDeclaredConstructor().newInstance();


        Counter counter = new Counter(read, f);

        String result = counter.count(read);

        System.out.println("result = " + result);


    }
}

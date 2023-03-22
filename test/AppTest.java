import org.junit.jupiter.api.DisplayName;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Send valid args expect valid response")
    void validArgTest() throws ClassNotFoundException, InterruptedException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        String[] args = {"input.txt", "UniqueWord"};

        App.main(args);


    }
    @org.junit.jupiter.api.Test
    @DisplayName("Send in valid args expect exception")
    void invalidArgsTest() throws ClassNotFoundException, InterruptedException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        String[] args = {""};
        App.main(args);


    }
    @org.junit.jupiter.api.Test
    @DisplayName("Send in valid args expect exception")
    void invalidFilePath() throws ClassNotFoundException, InterruptedException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        String[] args = {"invalid.txt", "UniqueWord"};

        //todo make exception throws assertion for java.lang.RuntimeException: Check if file path is exist
        App.main(args);


    }
}
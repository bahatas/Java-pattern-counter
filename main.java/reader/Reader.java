package reader;

import java.io.IOException;
import java.util.List;

@FunctionalInterface
public interface Reader {

    List<String> read(String filePath) throws IOException;

}

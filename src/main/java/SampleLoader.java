import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SampleLoader {

    private static final String RESOURCES_PATH = "src" + File.separator + "main" + File.separator + "resources";

    public String loadAsString(String fileName) throws IOException {
        String filePath = RESOURCES_PATH + File.separator + fileName;
        Path path = Paths.get(new File(filePath).getAbsolutePath());
        return new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
    }
}

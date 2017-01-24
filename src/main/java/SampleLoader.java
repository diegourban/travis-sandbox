import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SampleLoader {

    private static final String RESOURCES_PATH = "src" + File.separator + "main" + File.separator + "resources";

    public String loadAsString(String fileName) throws IOException {
        String samplePath = RESOURCES_PATH + File.separator + fileName;
        Path inputPath = Paths.get(new File(samplePath).getAbsolutePath());
        byte[] inputBytes = Files.readAllBytes(inputPath);
        return new String(inputBytes, StandardCharsets.UTF_8);
    }
}

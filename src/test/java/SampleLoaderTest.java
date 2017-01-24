import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class SampleLoaderTest {

    @Test
    public void shouldLoadInputFileContentAsString() throws IOException {
        StringBuilder sb = new StringBuilder()
                .append(1)
                .append(System.lineSeparator())
                .append(2)
                .append(System.lineSeparator())
                .append(3);
        String expectedContent = sb.toString();

        SampleLoader sl = new SampleLoader();
        String content = sl.loadAsString("sample.in");

        assertEquals(expectedContent, content);
    }

    @Test
    public void shouldLoadOutputFileContentAsString() throws IOException {
        StringBuilder sb = new StringBuilder()
                .append(6)
                .append(System.lineSeparator());
        String expectedContent = sb.toString();

        SampleLoader sl = new SampleLoader();
        String content = sl.loadAsString("sample.out");

        assertEquals(expectedContent, content);
    }
}

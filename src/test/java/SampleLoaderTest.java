import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class SampleLoaderTest {

    @Test
    public void shouldLoadInputFileContentAsString() throws IOException {
        StringBuilder sb = new StringBuilder()
                .append("line 1")
                .append(System.lineSeparator())
                .append("line 2")
                .append(System.lineSeparator())
                .append("line 3")
                .append(System.lineSeparator());
        String expectedContent = sb.toString();

        SampleLoader sl = new SampleLoader();
        String content = sl.loadAsString("sample.in");

        assertEquals(expectedContent, content);
    }

}

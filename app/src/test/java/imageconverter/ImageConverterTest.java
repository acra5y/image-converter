package imageconverter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assume.*;
import java.net.URL;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import org.apache.batik.transcoder.TranscoderException;
import imageconverter.model.*;

public class ImageConverterTest {
    private URL getResource(String fileName) {
        return ImageConverterTest.class.getClassLoader().getResource(fileName);
    }

    @Test
    public void testConvert() throws URISyntaxException, IOException, TranscoderException {
        URL resourceToConvert = this.getResource("test.svg");
        String expectedFileName = "test.png";

        assumeTrue(expectedFileName + " should not exist before converting", this.getResource(expectedFileName) == null);

        String inputPath = resourceToConvert.getPath();
        Arguments arguments = Arguments.valueOf(
            InputLocation.valueOf(inputPath),
            OutputLocation.valueOf(inputPath.replace(".svg", ".png"))
        );

        ImageConverter.convertImage(arguments);

        assertNotNull(expectedFileName + " should have been created", this.getResource(expectedFileName));
    }
}

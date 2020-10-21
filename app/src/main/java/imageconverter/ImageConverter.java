package imageconverter;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.batik.transcoder.*;
import org.apache.batik.transcoder.image.PNGTranscoder;

public class ImageConverter {
    public static void convertImage() {
        String svgUriImputLocation = "http://localhost:3000/public/favicon.svg";

        try (FileOutputStream outputStream = new FileOutputStream("./test.png")) {
            TranscoderInput transcoderInput = new TranscoderInput(svgUriImputLocation);
            TranscoderOutput transcoderOutput = new TranscoderOutput(outputStream);

            PNGTranscoder pngTranscoder = new PNGTranscoder();
            pngTranscoder.transcode(transcoderInput, transcoderOutput);
        } catch (IOException | TranscoderException ex) {
            System.out.println("Exception Thrown: " + ex);
        }
    }
}

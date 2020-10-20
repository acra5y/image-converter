package imageconverter;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.batik.transcoder.*;
import org.apache.batik.transcoder.image.PNGTranscoder;

public class ImageConverter {
    public static void convertImage() {
        try {
            String svgUriImputLocation = "http://localhost:3000/public/favicon.svg";
            TranscoderInput transcoderInput = new TranscoderInput(svgUriImputLocation);

            FileOutputStream outputStream = new FileOutputStream("./test.png");
            TranscoderOutput transcoderOutput = new TranscoderOutput(outputStream);

            PNGTranscoder pngTranscoder = new PNGTranscoder();
            pngTranscoder.transcode(transcoderInput, transcoderOutput);

            outputStream.flush();
            outputStream.close();

        } catch (IOException | TranscoderException ex) {
            System.out.println("Exception Thrown: " + ex);
        }
    }
}

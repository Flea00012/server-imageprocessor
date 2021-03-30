package sample;

import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    String filePath = "./Photos/image.jpg";

    @Test
    public void when_userClicksUploadButton_then_uploadImageToTheServer() {
        BufferedImage = ImageIO.read(filePath, "jpg",);

    }


}
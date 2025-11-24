import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

import java.awt.*;

public class FaceDetector {
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        CascadeClassifier faceDetector = new CascadeClassifier("src/res/haarcascade_frontalface_alt2.xml");
        Mat image = Imgcodecs.imread("face.jpg");
        if (image.empty()) {
            System.out.println("Image is empty");
            return;
        }
        MatOfRect faceDetection = new MatOfRect();
        faceDetector.detectMultiScale(image, faceDetection);
        for (Rect rect : faceDetection.toArray()) {
            Imgproc.rectangle(image,rect,new Scalar(255,0,0),1);

        Imgcodecs.imwrite("OutputFace.jpg", image);
        System.out.println("Image Detection Successful.");
        }
    }
}

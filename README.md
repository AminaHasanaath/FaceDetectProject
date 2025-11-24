# Face Detection in Java using OpenCV

This project demonstrates how to detect human faces in an image using Java and OpenCV’s Haar Cascade classifier.  
It loads an input image, converts it to grayscale, applies histogram equalization for better contrast, runs the Haar Cascade face detector, draws bounding boxes around detected faces, and saves the output image.

---

## Features
- Loads JPEG or PNG images.
- Uses OpenCV's haarcascade_frontalface_alt2.xml classifier for improved accuracy.
- Converts input to grayscale for optimal detection.
- Applies histogram equalization to reduce noise and improve contrast.
- Outputs an image with rectangles drawn around detected faces.

---

## Project Structure

---

## Notes
- Haar Cascades work best for frontal, well-lit faces.
- Detection accuracy may vary based on image quality or number of people.
- For higher accuracy, modern deep-learning detectors (OpenCV DNN) are recommended.

---
## Learnings
• how to integrate OpenCV into Java
• how Haar Cascade face detection works
• how to load and use XML classifiers
• how to read, process, and write images in Java
• how to draw detection rectangles on images
• how image coordinates (x, y, width, height) actually work
• why detection accuracy depends on image quality and model limits
• how to debug file-paths, classifier loading, and wrong outputs

## License
This project is released for educational purposes only.

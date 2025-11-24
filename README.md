# Java Face Detector Mini-Project

A simple Java project demonstrating *face detection* using the *OpenCV* library. The program detects faces in an input image and marks them with rectangles.

---

## 🖼 Project Overview

This project allows you to:
- Load an image using OpenCV.
- Detect faces using Haar Cascade Classifier (haarcascade_frontalface_default.xml).
- Draw rectangles around detected faces.
- Save the output image with the highlighted faces.

  ## 📁 Project Structure


> *Note:* Large OpenCV binaries (.dll or .exe) are *not included* in the repo. Download OpenCV separately and configure java.library.path.

---

## ⚙ Setup Instructions

1. *Install OpenCV*  
   Download OpenCV from [OpenCV official site](https://opencv.org/releases/). Extract the files and locate:
   - opencv-4120.jar (Java library)
   - opencv_java4120.dll (native library)

2. *Include Libraries in Project*
   - Add opencv-4120.jar to your project’s build path.
   - Set the java.library.path to the folder containing opencv_java4120.dll.

3. *Add Haar Cascade XML*
   - Copy haarcascade_frontalface_default.xml into src/resources/.

4. *Add Input Image*
   - Place an image named face.jpg in the project root (or update path in code).

5. *Compile and Run Program*
   ```bash
   javac -cp ".;lib/opencv-4120.jar" src/FaceDetector.java
   java -cp ".;lib/opencv-4120.jar" -Djava.library.path=lib FaceDetector

6. Check Output
The program will generate face.jpg with rectangles marking detected faces.

## ✅ What I Learned
1. How to integrate OpenCV with Java.
2. How Haar Cascade classifiers detect faces.
3. Reading and writing images using OpenCV (Mat, Imgcodecs).
4. Drawing shapes (rectangles) on images (Imgproc.rectangle()).
5. Handling native libraries (.dll) in Java projects.
6. Debugging OpenCV errors (empty images, incorrect XML, wrong detection).
7. Managing project structure and external resources.
8. Using Git/GitHub for version control and handling large files.

---

## ⚠ Notes
- Detection may vary depending on image size, lighting, and face angles.
- For multiple faces, the program draws multiple rectangles.
- Always use the official Haar cascade XMLs provided by OpenCV for best results.
- Large binaries like .dll or .exe are excluded from the repo. Users must download them separately.



---
## 💡 Tips for GitHub
Use .gitignore to exclude *.dll or *.exe files to avoid push errors.
You can provide a link in your README to download OpenCV binaries instead of storing them in the repo.
Always pull from remote before pushing to avoid merge conflicts.


---







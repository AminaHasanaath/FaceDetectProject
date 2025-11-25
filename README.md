# 👁️ Java Face Detector — Mini Project

A simple but powerful Java project that performs **face detection** using **OpenCV**.
The program scans an image, detects human faces using a pretrained Haar Cascade model, and highlights them using rectangles.

---

## 🧠 Tech Stack

<img src="https://skillicons.dev/icons?i=java,opencv,github,idea" height="85" />
<b>Java • openCV • GitHub •ideaL</b>


---

## 📸 Project Overview

This project demonstrates:

* Reading images in Java using OpenCV
* Detecting faces using Haar Cascade Model (`haarcascade_frontalface_default.xml`)
* Drawing rectangles around detected faces
* Saving the output image with detected faces

💡 *Perfect beginner project for learning Java + Computer Vision.*

---

## 📂 Project Structure

```plaintext
FaceDetectionProject/
├── lib/
│   └── opencv_java4120.dll              # Native library (NOT pushed to GitHub)
├── src/
│   ├── resources/
│   │   └── haarcascade_frontalface_default.xml
│   └── FaceDetector.java                # Main program
├── face.jpg                             # Input image
└── README.md
```

⚠ **Note:** Large OpenCV binaries (`.dll`, `.jar`) should NOT be pushed to GitHub.
Instead, users must download them manually.

---

## ⚙️ Setup Instructions

### **1️⃣ Install OpenCV**

Download the latest release from:
🔗 [https://opencv.org/releases/](https://opencv.org/releases/)

Find these files inside the extracted folder:

* `opencv-4120.jar`
* `opencv_java4120.dll`

---

### **2️⃣ Add Dependencies to Your Project**

* Add **opencv-4120.jar** to your Build Path
* Add the folder containing the `.dll` to:

```
-Djava.library.path=lib
```

---

### **3️⃣ Add Haar Cascade File**

Place inside:

```
src/resources/haarcascade_frontalface_default.xml
```

---

### **4️⃣ Add Input Image**

Place any image as:

```
face.jpg
```

(or change the filename inside the code)

---

### **5️⃣ Compile & Run**

```bash
javac -cp ".;lib/opencv-4120.jar" src/FaceDetector.java
java -cp ".;lib/opencv-4120.jar" -Djava.library_path=lib FaceDetector
```

---

### **6️⃣ Output**

A new **face.jpg** file is generated with rectangles drawn around the detected faces.

---

## 💡 What I Learned

✔ Integrating **OpenCV with Java**
✔ Understanding **Haar Cascade** classifier
✔ Reading & writing images using OpenCV (`Mat`, `Imgcodecs`)
✔ Drawing on images (`Imgproc.rectangle()`)
✔ Handling native OpenCV libraries (`.dll`)
✔ Debugging vision errors (empty Mat, wrong path, detection issues)
✔ Organizing Java projects with external resources
✔ Using **Git/GitHub** with large-file exclusions

---

## ⚠ Important Notes

* Accuracy depends on lighting, face size, and angle
* Haar cascade should be the **official OpenCV XML**
* `.dll` / `.exe` files **must NOT be pushed** to GitHub
* Use a `.gitignore` for binaries

Example:

```gitignore
*.dll
*.exe
*.jar
```

---

## 📝 Tips for GitHub

* Provide a link to download OpenCV instead of including it
* Keep your repo lightweight and clean
* Add a sample output screenshot if possible

---

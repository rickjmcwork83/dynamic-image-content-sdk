# Kotlin Multiplatform SDK

This is a simple Kotlin Multiplatform (KMP) SDK that:
- Parses JSON containing `imageURL` and `text`
- Displays the image and text **natively** on Android, iOS, and JavaScript.

## 🚀 Usage

### 1️⃣ **Parse JSON**
```kotlin
val jsonString = """
    {
        "imageURL": "https://haieng.com/wp-content/uploads/2017/10/test-image-500x500.jpg",
        "text": "This is a test text from KMP."
    }
""".trimIndent()

val data = JsonParser.parse(jsonString)

Render on Each Platform

Android
val renderer = PlatformRenderer(context, layout)
renderer.render(data)

iOS
val renderer = PlatformRenderer()
renderer.render(data)

JavaScript
const data = {
  imageURL: "https://haieng.com/wp-content/uploads/2017/10/test-image-500x500.jpg",
  text: "This is a test text from KMP."
};
const renderer = new PlatformRenderer();
renderer.render(data);





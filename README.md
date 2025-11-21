
# Appium Task 1

This project automates a simple login-logout scenario user flow in the **Sauce Labs Demo App** using **Appium**, **Java**, and **TestNG**.

---

Demo
https://github.com/omarshoap/AppiumTask1/blob/main/Demo.mp4

## Task Requirements

The automation script performs the following steps:

1. Connect a Maven-based Appium project to an Android device or emulator.
2. Install and launch the APK:
   **[https://github.com/saucelabs/my-demo-app-android/releases/download/2.2.0/mda-2.2.0-25.apk](https://github.com/saucelabs/my-demo-app-android/releases/download/2.2.0/mda-2.2.0-25.apk)**
3. Log in using the *default credentials*.
4. Add any product to the shopping cart.
5. Proceed with checkout and complete the order.
6. Logout from the application.



##  my Json Rerpresntation in (Appium Inspector)

```json
{
  "platformName": "Android",
  "appium:options": {
    "platformVersion": "16.0",
    "deviceName": "emulator-5554",
    "automationName": "uiAutomator2",
    "app": "C:\\Users\\Dynabook\\Downloads\\mda-2.2.0-25.apk",
    "noReset": false
  }
}
```




# Few-Annotations-using-TestNG
Assignment 3 W10D1 - SDA - Software QA Bootcamp

# Table of contents
* [Question](#question)
* [Answer](#answer)
* [Output Screenshots](#output-screenshots)

---
# Question
Use at least 5 annotations in a TestNG class to assert any of website error messages.

---

# Answer
I used [Twitter](https://twitter.com/i/flow/login) website
Before running the code, there are some steps that need to take considered:

## First:
Setup the [JDK](https://www.oracle.com/java/technologies/downloads/),[Eclipse](https://www.eclipse.org/)
Then Setup Latest [Web Driver](https://chromedriver.chromium.org/downloads) for Chrome Driver. 

Donwload the necessary jar files:
- [Selenium](https://www.selenium.dev/downloads/) (Lastest).
- [TestNG](http://www.java2s.com/Code/Jar/t/Downloadtestng685jar.htm)  (Lastest).
- [jcommander](http://www.java2s.com/Code/Jar/j/Downloadjcommanderjar.htm)  (Lastest). 

## Second:
Add them as a library in the classpath of the project
- _click-reight on the file project >Build path > configure Bild path > Java Build Path > Libraries > classpath > add external JARs > Apply and close_.

## Third:
I opened the website, then take web elements, and then add them to the code.

I used `AssertEquals()` method to compare the actual and expected results. If both the actual and expected results are same, then the assertion pass with no exception and the test case is marked as "passed".

The `annotations` that I used in this code are `@BeforeSuite`, `@BeforeTest`,  `@AfterMethod`, `@AfterSuite`, and `@Test` .

---

# Output Screenshots:

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/185622773-4ba27209-8450-4b8e-b559-2b916d55d29e.png" width=80% height=80%>


https://user-images.githubusercontent.com/48597284/185622802-86f1b219-5a2a-4016-8289-26f761815ee2.mp4



</p>

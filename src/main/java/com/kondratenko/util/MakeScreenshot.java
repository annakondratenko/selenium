//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import ru.yandex.qatools.allure.annotations.Attachment;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//
////package com.kondratenko.util;
////
/////**
//// * Created by annak on 10.04.2017.
//// */
//public class MakeScreenshot{
//
//    @Attachment(value = "{0}", type = "image/png")
//
//    public byte[] saveImageAttach(String attachName) {
//
//       try {
//
//            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//
//            return toByteArray(scrFile);
//
//        } catch (Exception e) { e.printStackTrace(); }
//
//       return new byte[0];
//
//    }
//
//    private static byte[] toByteArray(File file) throws IOException {
//
//       return Files.readAllBytes(Paths.get(file.getPath()));
//
//    }
//}

package com.linuxhint.tess4j;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadTextFromImageOrPDF {

    private static Tesseract getTesseract() {
        Tesseract instance = new Tesseract();
        instance.setDatapath("C:\\Users\\atuls\\AppData\\Local\\Temp\\tess4j\\tessdata");
        instance.setLanguage("eng");
        //instance.setHocr(true);
        return instance;
    }

    public static void main(String[] args) throws TesseractException {

        Tesseract tesseract = getTesseract();
        //File file = new File("d:/jars/instructions-for-adding-your-logo.pdf");
         File file = new File("d:/jars/Personal Bank Statement Template.pdf");
        String result = tesseract.doOCR(file);
        System.out.println(result);
    }
}

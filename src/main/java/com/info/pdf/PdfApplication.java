package com.info.pdf;

import com.info.pdf.service.impl.EditPdfFromExistingTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PdfApplication {

    public static void main(String[] args) {
        SpringApplication.run(PdfApplication.class, args);
        String message = EditPdfFromExistingTemplate.editPdf();
        System.out.println("\n======== " + message + " ========");
    }

}

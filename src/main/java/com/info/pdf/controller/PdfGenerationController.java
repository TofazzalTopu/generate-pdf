package com.info.pdf.controller;

import com.info.pdf.service.PdfGenerationService;
import com.itextpdf.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
@RequestMapping
public class PdfGenerationController {

    @Autowired
    private PdfGenerationService pdfGenerationService;

    @GetMapping(value = "/pdf")
    public void generate() throws IOException {
        pdfGenerationService.generateUsingPdfBox();
    }

    @GetMapping(value = "/itext-pdf")
    public void generateUsingItextPdf() {
        pdfGenerationService.generateUsingItextPdf();
    }
}

package com.info.pdf.controller;

import com.info.pdf.service.impl.EditPdfFromExistingTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PdfGenerationController {

    @GetMapping(value = "/editPdf")
    public ResponseEntity<?> editPdf() {
        String message = EditPdfFromExistingTemplate.editPdf();
        System.out.println("\n======== " + message + " ========");
        return ResponseEntity.ok(message);
    }
}

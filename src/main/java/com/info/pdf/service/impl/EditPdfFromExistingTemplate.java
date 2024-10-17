package com.info.pdf.service.impl;

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.util.Map;

@Slf4j
public class EditPdfFromExistingTemplate {

    public static final String DEST = "./file/Edited_Account_Statement_Adobe_copy.pdf";
    public static final String SRC = "./file/Original_Account_Statement_Adobe_copy.pdf";

    public static void main(String[] args) {
        editPdf();
    }

    public static String editPdf() {
        String message = "PDF not edited";
        try {
            PdfDocument pdf = new PdfDocument(new PdfReader(new File(SRC)), new PdfWriter(new File(DEST)));
            PdfAcroForm form = PdfAcroForm.getAcroForm(pdf, true);
            Map<String, PdfFormField> fields = form.getAllFormFields();

            fields.get("Distribution Date").setValue("18-10-2-24").setReadOnly(true).setFontSize(10);
            fields.get("Account Number").setValue("1234567890").setReadOnly(true).setFontSize(10);
            fields.get("Investment Amount").setValue("5000").setReadOnly(true).setFontSize(10);
            fields.get("Current Shares").setValue("1200").setReadOnly(true).setFontSize(10);
            fields.get("Distriubtion Rate").setValue("50").setReadOnly(true).setFontSize(10);
            fields.get("Inception to Date Amount").setValue("1000").setReadOnly(true).setFontSize(10);
            fields.get("Owner Salutation").setValue("Jhone Doe").setReadOnly(true).setFontSize(10);
            fields.get("Bank Name").setValue("Federal Bank").setReadOnly(true).setFontSize(10);
            fields.get("Investor Current Address 1").setValue("Investor Current Address 1").setReadOnly(true).setFontSize(10);
            fields.get("Investor Current Address 2").setValue("Investor Current Address 2").setReadOnly(true).setFontSize(10);
            fields.get("City, State Zip").setValue("City, State Zip").setReadOnly(true).setFontSize(10);
            fields.get("Investor Names").setValue("Investor Names").setReadOnly(true).setFontSize(10);
            fields.get("Fund Name").setValue("Fund Name").setReadOnly(true).setFontSize(10);
            fields.get("Broker Dealer Name").setValue("Broker Dealer Name").setReadOnly(true).setFontSize(10);
            fields.get("Rep Name 1").setValue("Rep Name 1").setReadOnly(true).setFontSize(10);
            fields.get("Rep Name 2").setValue("Rep Name 2").setReadOnly(true).setFontSize(10);
            fields.get("Rep Phone Number").setValue("Rep Phone Number").setReadOnly(true).setFontSize(10);
            pdf.close();
            message = "PDF edited successfully!";
        } catch (Exception e) {
            log.error("Exception on editing pdf file: " + e.getMessage());
        }
        return message;
    }
}

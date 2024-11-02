package com.example.demo.Service;

import java.io.ByteArrayOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.model.Resume;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class PdfService {
    private static final Logger logger = LoggerFactory.getLogger(PdfService.class);

    public byte[] generateResumePdf(Resume resume) {
        Document document = new Document();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        try {
            PdfWriter.getInstance(document, outputStream);
            document.open();

            // Add content to the PDF
            document.add(new Paragraph("Resume"));
            document.add(new Paragraph("Name: " + resume.getUser().getName()));
            document.add(new Paragraph("Email: " + resume.getUser().getEmail()));
            document.add(new Paragraph("Education: " + resume.getEducation()));
            document.add(new Paragraph("Experience: " + resume.getExperience()));

            document.close();
        } catch (DocumentException e) {
            logger.error("Error generating PDF", e);
        }

        return outputStream.toByteArray();
    }
}


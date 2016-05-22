package ru.kpfu.itis.nigmatullina.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import org.springframework.web.servlet.view.document.AbstractPdfView;

/*
 * Created by ramilanigmatullina on 05.05.16.
 */

public class PDFView extends AbstractPdfView {


    @Override
    protected void buildPdfDocument(Map<String, Object> map, Document document, PdfWriter pdfWriter,
                                    HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        Paragraph header1 = new Paragraph(new Chunk("Zetta", FontFactory.getFont(FontFactory.HELVETICA, 30)));
        Paragraph header2 = new Paragraph(new Chunk("Contact us", FontFactory.getFont(FontFactory.HELVETICA, 25)));
        Paragraph p1 = new Paragraph(new Chunk("Stores: 020 3645 0000"));
        Paragraph p2 = new Paragraph(new Chunk("Shop online: 020 3645 0015"));
        Paragraph p3 = new Paragraph(new Chunk("Our phone lines are open:", FontFactory.getFont(FontFactory.HELVETICA, 20)));
        Paragraph p4 = new Paragraph(new Chunk("Monday - Friday: 09:00AM – 08:00PM"));
        Paragraph p5 = new Paragraph(new Chunk("Saturday: 09:00AM - 6:00PM"));
        Paragraph p6 = new Paragraph(new Chunk("Sunday: 10:00AM – 05:00PM"));
        Paragraph p7 = new Paragraph(new Chunk("E-mail", FontFactory.getFont(FontFactory.HELVETICA, 20)));
        Paragraph p8 = new Paragraph(new Chunk("Contact us anytime and will get back to you as soon as possible."));
        Paragraph p9 = new Paragraph(new Chunk("zetta@gmail.com", FontFactory.getFont(FontFactory.HELVETICA, 10)));
        Paragraph p10 = new Paragraph(new Chunk("Chat", FontFactory.getFont(FontFactory.HELVETICA, 20)));
        Paragraph p11 = new Paragraph(new Chunk("Have a chat with us 8AM-8PM weekdays, 8AM-6PM Saturday, and 9AM-5PM Sunday."));
        Paragraph p12 = new Paragraph(new Chunk("Order and Collection Points", FontFactory.getFont(FontFactory.HELVETICA, 20)));
        Paragraph p13 = new Paragraph(new Chunk("Phone: 0203 645 0018"));
        Paragraph p14 = new Paragraph(new Chunk("Our phone lines are open:", FontFactory.getFont(FontFactory.HELVETICA, 20)));
        Paragraph p15 = new Paragraph(new Chunk("Monday - Friday: 09:00AM – 08:00PM"));
        Paragraph p16 = new Paragraph(new Chunk("Saturday: 09:00AM - 6:00PM"));
        Paragraph p17 = new Paragraph(new Chunk("Sunday: 10:00AM – 05:00PM"));
        Paragraph n = new Paragraph(new Chunk("\n"));

        document.add(header1);
        document.add(header2);
        document.add(p1);
        document.add(p2);
        document.add(n);
        document.add(p3);
        document.add(p4);
        document.add(p5);
        document.add(p6);
        document.add(n);
        document.add(p7);
        document.add(p8);
        document.add(p9);
        document.add(n);
        document.add(p10);
        document.add(p11);
        document.add(n);
        document.add(p12);
        document.add(p13);
        document.add(n);
        document.add(p14);
        document.add(p15);
        document.add(p16);
        document.add(p17);
    }
}

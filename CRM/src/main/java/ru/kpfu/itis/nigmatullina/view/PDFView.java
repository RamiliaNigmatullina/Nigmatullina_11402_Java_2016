package ru.kpfu.itis.nigmatullina.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import ru.kpfu.itis.nigmatullina.entity.Door;

/*
 * Created by ramilanigmatullina on 05.05.16.
 */

public class PDFView extends AbstractPdfView {


    @Override
    protected void buildPdfDocument(Map<String, Object> map, Document document, PdfWriter pdfWriter, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        Door door = (Door) map.get("door");

        Paragraph header = new Paragraph(new Chunk("Generate Pdf USing Spring Mvc", FontFactory.getFont(FontFactory.HELVETICA, 30)));
        Paragraph by = new Paragraph(new Chunk("Author " + door.getName() + " " + door.getDescription()));

        document.add(header);
        document.add(by);
    }
}

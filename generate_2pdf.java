package resume_builder;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class generate_2pdf {
    private static final String pdf_path = "C:\\Java Projects\\New folder";
    private static final String pdf_name = "resume.pdf";

    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        Document document = new Document();
        PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(new File(pdf_path + pdf_name)));
        document.open();

        //  Creating header
        Font font= FontFactory.getFont(FontFactory.COURIER_BOLD,23, BaseColor.BLUE);
        Chunk chunk1 = new Chunk("               Resume Builder              ",font);

        document.add(chunk1);

        document.close();

    }
}

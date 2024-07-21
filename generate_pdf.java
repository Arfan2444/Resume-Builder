package resume_builder;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class generate_pdf {
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("resume.pdf"));
        document.open();
        Font font = FontFactory.getFont(FontFactory.COURIER, 14, BaseColor.BLACK);
        Font font2 = FontFactory.getFont(FontFactory.COURIER, 20, BaseColor.BLACK);
        Paragraph para2 = new Paragraph("--------Personal Information--------", font2);
        Paragraph para3 = new Paragraph("Name : " + frame_2.choice1 +
                "\n" + "Father name : " + frame_2.choice2 +
                "\n" + "Email : " + frame_2.choice3 +
                "\n" + "Date of Birth : " + frame_2.choice4 + "/" + frame_2.choice5 + "/" + frame_2.choice6 +
                "\n" + "Address : " + frame_2.choice7, font);
        Paragraph para4 = new Paragraph("--------Qualification--------", font2);
        Paragraph para5 = new Paragraph("Program : " + frame_2.choice26 +
                "\n" + "Grade : " + frame_2.choice8 +
                "\n" + "Institution : " + frame_2.choice10 +
                "\n" + "Passing Year : " + frame_2.choice8
                , font);
        Paragraph para6 = new Paragraph("--------Skills--------",font2);
        Paragraph para7 = new Paragraph("Technical Skills : "+frame_2.choice11+","+frame_2.choice12+
                "\n"+"Languages : "+frame_2.choice13+","+frame_2.choice14,font);
        Paragraph para8 = new Paragraph("--------Projects--------",font2);
        Paragraph para9 = new Paragraph("Project Names : "+frame_2.choice15+","+frame_2.choice18+
                "\n"+"Technology used : "+frame_2.choice16+","+frame_2.choice19+
                "\n"+"Duration : "+frame_2.choice17+","+frame_2.choice20,font);
        Paragraph para10 = new Paragraph("--------Experience--------",font2);
        Paragraph para11 = new Paragraph("Organization Names : "+frame_2.choice15+","+frame_2.choice18+
                "\n"+"Technology used : "+frame_2.choice16+","+frame_2.choice19+
                "\n"+"Duration : "+frame_2.choice17+","+frame_2.choice20,font);

        document.add(para2);
        document.add(para3);
        document.add(para4);
        document.add(para5);
        document.add(para6);
        document.add(para7);
        document.add(para8);
        document.add(para9);
        document.close();
    }
}

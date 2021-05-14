package pantallas;

import java.io.FileOutputStream;
import java.util.Date;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class POI {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HSSFWorkbook excel = new HSSFWorkbook();
		HSSFSheet hoja1 = excel.createSheet("FirstExcelSheet");
		HSSFRow filaL1 = hoja1.createRow(1);
		HSSFCell cell = filaL1.createCell(0);
		cell.setCellValue("Título");
		
		HSSFRow filaL2 = hoja1.createRow(2);
		HSSFRow filaL3 = hoja1.createRow(3);
		HSSFRow filaL4 = hoja1.createRow(4);
		HSSFRow filaL5 = hoja1.createRow(5);
		HSSFRow filaL6 = hoja1.createRow(6);
		HSSFRow filaL7 = hoja1.createRow(7);
		HSSFRow filaL8 = hoja1.createRow(8);

		
		/*
		DataFormat format = workbook.createDataFormat();
		CellStyle dateStyle = workbook.createCellStyle();
		dateStyle.setDataFormat(format.getFormat("dd.mm.yyyy"));
		cell.setCellStyle(dateStyle);
		cell.setCellValue(new Date());
		*/
		
		filaL1.createCell(1).setCellValue("Categoría");
		filaL1.createCell(2).setCellValue("Autor");
		filaL1.createCell(3).setCellValue("Cantidad");
		
		filaL2.createCell(0).setCellValue("Vuelta prohibida");
		filaL2.createCell(1).setCellValue("Narrativa");
		filaL2.createCell(2).setCellValue("Joaquín Hurtado Pérez");
		filaL2.createCell(3).setCellValue("134");
		
		filaL3.createCell(0).setCellValue("La zarza ardiente");
		filaL3.createCell(1).setCellValue("Narrativa");
		filaL3.createCell(2).setCellValue("Andrés Kaiser");
		filaL3.createCell(3).setCellValue(231);
		
		filaL4.createCell(0).setCellValue("Tratado de las espirales");
		filaL4.createCell(1).setCellValue("Narrativa");
		filaL4.createCell(2).setCellValue("Victor Roberto Carrancá");
		filaL4.createCell(3).setCellValue("378");
		
		filaL5.createCell(0).setCellValue("La nariz roja de Stalin");
		filaL5.createCell(1).setCellValue("Narrativa");
		filaL5.createCell(2).setCellValue("Imanol Canevada");
		filaL5.createCell(3).setCellValue("234");
		
		filaL6.createCell(0).setCellValue("Okigbo vs Las transnacionales");
		filaL6.createCell(1).setCellValue("Narrativa");
		filaL6.createCell(2).setCellValue("Luis Felipe Lomelí");
		filaL6.createCell(3).setCellValue("120");
		
		filaL7.createCell(0).setCellValue("Barcos para armar");
		filaL7.createCell(1).setCellValue("Poesía");
		filaL7.createCell(2).setCellValue("Jesús Ramón Ibarra");
		filaL7.createCell(3).setCellValue("145");
		
		
		
		
		hoja1.autoSizeColumn(0);
		hoja1.autoSizeColumn(1);
		hoja1.autoSizeColumn(2);
		hoja1.autoSizeColumn(3);
		hoja1.autoSizeColumn(4);
		hoja1.autoSizeColumn(5);
		hoja1.autoSizeColumn(6);
		hoja1.autoSizeColumn(7);
		hoja1.autoSizeColumn(8);

		
		excel.write(new FileOutputStream("excel.xls"));
		excel.close();
		
	}

}

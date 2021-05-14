import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Iterator;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;



public class Ejecucion {
	static obLibro Vuelta = new obLibro("Vuelta prohibida","Narrativa", "Joaquín Hurtado Pérez");
	static obLibro Lazarza = new obLibro("La zarza ardiente","Narrativa", "Andrés Kaiser");
	static obLibro Tratado = new obLibro("Tratado de las espirales","Narrativa", "Victor Roberto Carrancá");
	static obLibro Lanariz = new obLibro("La nariz roja de Stalin","Narrativa", "Imanol Canevada");
	static obLibro Okigbo = new obLibro("Okigbo vs Las transnacionales","Narrativa", "Luis Felipe Lomelí");
	
	static obLibro Porboca = new obLibro("Por boca de la sombra","Poesía", "Luis Jorge Boone");
	static obLibro Espejo = new obLibro("Espejo de doble filo","Poesía", "Iván Trejo");
	static obLibro Descripcion = new obLibro("Descripcion de la mentira", "Poesía", "Antonio Gamoneda");
	static obLibro Oscura = new obLibro("Oscura", "Poesía", "Julian Herbert");
	static obLibro Iceberg = new obLibro("Iceberg negro", "Poesía", "Balam Rodrigo");
	static obLibro Yasabes = new obLibro("Ya sabes que no veo de noche", "Poesía", "Claudia Domingo");
	static obLibro UnHervidero = new obLibro("Un hervidero de pájaros marinos", "Poesía", "María Baranda");
	static obLibro Rio = new obLibro("Río Interior","Poesía", "José Antonio Banda");
	static obLibro Barcos = new obLibro("Barcos para armar","Poesía", "Jesús Ramón Ibarra");
	
	public static void main(String[] args)throws IOException{
		InventarioLibros();
		LocalizacionBodega();
		prueba();
		
	}
	
	private static void InventarioLibros() throws IOException {
		Workbook excel = new HSSFWorkbook();
		Sheet hoja1 = excel.createSheet("Hoja libros");
		Row filaL1 = hoja1.createRow(1);
		Cell cell = filaL1.createCell(0);
		cell.setCellValue("Título");
		
		Row filaL2 = hoja1.createRow(2);
		Row filaL3 = hoja1.createRow(3);
		Row filaL4 = hoja1.createRow(4);
		Row filaL5 = hoja1.createRow(5);
		Row filaL6 = hoja1.createRow(6);
		Row filaL7 = hoja1.createRow(7);
		Row filaL8 = hoja1.createRow(8);
		Row filaL9 = hoja1.createRow(9);
		Row filaL10 = hoja1.createRow(10);
		Row filaL11 = hoja1.createRow(11);
		Row filaL12 = hoja1.createRow(12);
		Row filaL13 = hoja1.createRow(13);
		Row filaL14 = hoja1.createRow(14);
		Row filaL15 = hoja1.createRow(15);
		
		
		/*
		DataFormat format = workbook.createDataFormat();
		CellStyle dateStyle = workbook.createCellStyle();
		dateStyle.setDataFormat(format.getFormat("dd.mm.yyyy"));
		cell.setCellStyle(dateStyle);
		cell.setCellValue(new Date());
		*/
		
		filaL1.createCell(1).setCellValue("Categoría");
		filaL1.createCell(2).setCellValue("Autora");
		filaL1.createCell(3).setCellValue("Cantidad");
		
		filaL2.createCell(0).setCellValue(Vuelta.getTitulo());
		filaL2.createCell(1).setCellValue(Vuelta.getCategoria());
		filaL2.createCell(2).setCellValue(Vuelta.getAutor());
		filaL2.createCell(3).setCellValue(134);
		
		filaL3.createCell(0).setCellValue(Lazarza.getTitulo());
		filaL3.createCell(1).setCellValue(Lazarza.getCategoria());
		filaL3.createCell(2).setCellValue(Lazarza.getAutor());
		filaL3.createCell(3).setCellValue(231);
		
		filaL4.createCell(0).setCellValue(Tratado.getTitulo());
		filaL4.createCell(1).setCellValue(Tratado.getCategoria());
		filaL4.createCell(2).setCellValue(Tratado.getAutor());
		filaL4.createCell(3).setCellValue(378);
		
		filaL5.createCell(0).setCellValue(Lanariz.getTitulo());
		filaL5.createCell(1).setCellValue(Lanariz.getCategoria());
		filaL5.createCell(2).setCellValue(Lanariz.getAutor());
		filaL5.createCell(3).setCellValue(234);
		
		filaL6.createCell(0).setCellValue(Okigbo.getTitulo());
		filaL6.createCell(1).setCellValue(Okigbo.getCategoria());
		filaL6.createCell(2).setCellValue(Okigbo.getAutor());
		filaL6.createCell(3).setCellValue(120);
		
		filaL7.createCell(0).setCellValue(Porboca.getTitulo());
		filaL7.createCell(1).setCellValue(Porboca.getCategoria());
		filaL7.createCell(2).setCellValue(Porboca.getAutor());
		filaL7.createCell(3).setCellValue(184);
		
		filaL8.createCell(0).setCellValue(Espejo.getTitulo());
		filaL8.createCell(1).setCellValue(Espejo.getCategoria());
		filaL8.createCell(2).setCellValue(Espejo.getAutor());
		filaL8.createCell(3).setCellValue(126);
		
		filaL9.createCell(0).setCellValue(Descripcion.getTitulo());
		filaL9.createCell(1).setCellValue(Descripcion.getCategoria());
		filaL9.createCell(2).setCellValue(Descripcion.getAutor());
		filaL9.createCell(3).setCellValue(125);
		
		filaL10.createCell(0).setCellValue(Oscura.getTitulo());
		filaL10.createCell(1).setCellValue(Oscura.getCategoria());
		filaL10.createCell(2).setCellValue(Oscura.getAutor());
		filaL10.createCell(3).setCellValue(325);
		
		filaL11.createCell(0).setCellValue(Iceberg.getTitulo());
		filaL11.createCell(1).setCellValue(Iceberg.getCategoria());
		filaL11.createCell(2).setCellValue(Iceberg.getAutor());
		filaL11.createCell(3).setCellValue(195);
		
		filaL12.createCell(0).setCellValue(Yasabes.getTitulo());
		filaL12.createCell(1).setCellValue(Yasabes.getCategoria());
		filaL12.createCell(2).setCellValue(Yasabes.getAutor());
		filaL12.createCell(3).setCellValue(235);
		
		filaL13.createCell(0).setCellValue(UnHervidero.getTitulo());
		filaL13.createCell(1).setCellValue(UnHervidero.getCategoria());
		filaL13.createCell(2).setCellValue(UnHervidero.getAutor());
		filaL13.createCell(3).setCellValue(140);
		
		filaL14.createCell(0).setCellValue(Rio.getTitulo());
		filaL14.createCell(1).setCellValue(Rio.getCategoria());
		filaL14.createCell(2).setCellValue(Rio.getAutor());
		filaL14.createCell(3).setCellValue(175);
		
		filaL15.createCell(0).setCellValue(Barcos.getTitulo());
		filaL15.createCell(1).setCellValue(Barcos.getCategoria());
		filaL15.createCell(2).setCellValue(Barcos.getAutor());
		filaL15.createCell(3).setCellValue(145);
		
		
		
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
	
	private static void prueba() throws IOException {
		
		HSSFWorkbook archivo = new HSSFWorkbook();
		HSSFSheet sheet = archivo.createSheet("prueba");
		
		obLibro[] Libros= new obLibro[13];	
		Libros[0] = Vuelta;
		Libros[1] = Lazarza;
		Libros[2] = Tratado;
		Libros[3] = Lanariz;
		Libros[4] = Okigbo;
		
		Libros[5] = Porboca;
		Libros[6] = Espejo;
		Libros[7] = Descripcion;
		Libros[8] = Oscura;
		Libros[9] = Iceberg;
		Libros[10] = Yasabes;
		Libros[11] = UnHervidero;
		Libros[12] = Rio;
		Libros[13] = Barcos;
		
		HSSFRow encabezado = sheet.createRow(1);
		
		encabezado.createCell(0).setCellValue("Título");
		encabezado.createCell(1).setCellValue("Categoría");
		encabezado.createCell(2).setCellValue("Autor");
		encabezado.createCell(3).setCellValue("Cantidad");
		
		for(int i=0; i< Libros.length ; i++) {

			
			HSSFRow filas = sheet.createRow(i);
		
			filas.createCell(1).setCellValue(Libros[i].getTitulo());
			filas.createCell(2).setCellValue(Libros[i].getCategoria());	
			filas.createCell(3).setCellValue(Libros[i].getAutor());
			filas.createCell(4).setCellValue(Libros[i].getCantidad());
			Iterator<Row> iterador = sheet.rowIterator();
			
			
		}

				
		
		
		archivo.write(new FileOutputStream("archivo.xlsx"));
		archivo.close();
		
		
	}
	
	private static void LocalizacionBodega() throws IOException {
		
		HSSFWorkbook excel = new HSSFWorkbook();
		HSSFSheet hoja2 = excel.createSheet("Bodega");
		HSSFRow filaL1 = hoja2.createRow(1);
		HSSFCell cell = filaL1.createCell(0);
		cell.setCellValue("Título");
		
		HSSFRow filaL2 = hoja2.createRow(2);
		HSSFRow filaL3 = hoja2.createRow(3);
		HSSFRow filaL4 = hoja2.createRow(4);
		HSSFRow filaL5 = hoja2.createRow(5);
		HSSFRow filaL6 = hoja2.createRow(6);
		HSSFRow filaL7 = hoja2.createRow(7);
		HSSFRow filaL8 = hoja2.createRow(8);
		HSSFRow filaL9 = hoja2.createRow(9);
		HSSFRow filaL10 = hoja2.createRow(10);
		HSSFRow filaL11 = hoja2.createRow(11);
		HSSFRow filaL12 = hoja2.createRow(12);
		HSSFRow filaL13 = hoja2.createRow(13);
		HSSFRow filaL14 = hoja2.createRow(14);
		HSSFRow filaL15 = hoja2.createRow(15);
		
		
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
		
		filaL2.createCell(0).setCellValue(Vuelta.getTitulo());
		filaL2.createCell(1).setCellValue(Vuelta.getCategoria());
		filaL2.createCell(2).setCellValue(Vuelta.getAutor());
		filaL2.createCell(3).setCellValue(114);
		
		filaL3.createCell(0).setCellValue(Lazarza.getTitulo());
		filaL3.createCell(1).setCellValue(Lazarza.getCategoria());
		filaL3.createCell(2).setCellValue(Lazarza.getAutor());
		filaL3.createCell(3).setCellValue(131);
		
		filaL4.createCell(0).setCellValue(Tratado.getTitulo());
		filaL4.createCell(1).setCellValue(Tratado.getCategoria());
		filaL4.createCell(2).setCellValue(Tratado.getAutor());
		filaL4.createCell(3).setCellValue(278);
		
		filaL5.createCell(0).setCellValue(Lanariz.getTitulo());
		filaL5.createCell(1).setCellValue(Lanariz.getCategoria());
		filaL5.createCell(2).setCellValue(Lanariz.getAutor());
		filaL5.createCell(3).setCellValue(134);
		
		filaL6.createCell(0).setCellValue(Okigbo.getTitulo());
		filaL6.createCell(1).setCellValue(Okigbo.getCategoria());
		filaL6.createCell(2).setCellValue(Okigbo.getAutor());
		filaL6.createCell(3).setCellValue(100);
		
		filaL7.createCell(0).setCellValue(Porboca.getTitulo());
		filaL7.createCell(1).setCellValue(Porboca.getCategoria());
		filaL7.createCell(2).setCellValue(Porboca.getAutor());
		filaL7.createCell(3).setCellValue(124);
		
		filaL8.createCell(0).setCellValue(Espejo.getTitulo());
		filaL8.createCell(1).setCellValue(Espejo.getCategoria());
		filaL8.createCell(2).setCellValue(Espejo.getAutor());
		filaL8.createCell(3).setCellValue(106);
		
		filaL9.createCell(0).setCellValue(Descripcion.getTitulo());
		filaL9.createCell(1).setCellValue(Descripcion.getCategoria());
		filaL9.createCell(2).setCellValue(Descripcion.getAutor());
		filaL9.createCell(3).setCellValue(95);
		
		filaL10.createCell(0).setCellValue(Oscura.getTitulo());
		filaL10.createCell(1).setCellValue(Oscura.getCategoria());
		filaL10.createCell(2).setCellValue(Oscura.getAutor());
		filaL10.createCell(3).setCellValue(225);
		
		filaL11.createCell(0).setCellValue(Iceberg.getTitulo());
		filaL11.createCell(1).setCellValue(Iceberg.getCategoria());
		filaL11.createCell(2).setCellValue(Iceberg.getAutor());
		filaL11.createCell(3).setCellValue(125);
		
		filaL12.createCell(0).setCellValue(Yasabes.getTitulo());
		filaL12.createCell(1).setCellValue(Yasabes.getCategoria());
		filaL12.createCell(2).setCellValue(Yasabes.getAutor());
		filaL12.createCell(3).setCellValue(135);
		
		filaL13.createCell(0).setCellValue(UnHervidero.getTitulo());
		filaL13.createCell(1).setCellValue(UnHervidero.getCategoria());
		filaL13.createCell(2).setCellValue(UnHervidero.getAutor());
		filaL13.createCell(3).setCellValue(101);
		
		filaL14.createCell(0).setCellValue(Rio.getTitulo());
		filaL14.createCell(1).setCellValue(Rio.getCategoria());
		filaL14.createCell(2).setCellValue(Rio.getAutor());
		filaL14.createCell(3).setCellValue(135);
		
		filaL15.createCell(0).setCellValue(Barcos.getTitulo());
		filaL15.createCell(1).setCellValue(Barcos.getCategoria());
		filaL15.createCell(2).setCellValue(Barcos.getAutor());
		filaL15.createCell(3).setCellValue(125);
		
		
		hoja2.autoSizeColumn(0);
		hoja2.autoSizeColumn(1);
		hoja2.autoSizeColumn(2);
		hoja2.autoSizeColumn(3);
		hoja2.autoSizeColumn(4);
		hoja2.autoSizeColumn(5);
		hoja2.autoSizeColumn(6);
		hoja2.autoSizeColumn(7);
		hoja2.autoSizeColumn(8);
		
		
		excel.write(new FileOutputStream("excela.xls"));
		excel.close();
	}

}

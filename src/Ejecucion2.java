import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Ejecucion2 {
	static obLibro Vuelta = new obLibro("Vuelta prohibida","Narrativa", "Joaqu�n Hurtado P�rez");
	static obLibro Lazarza = new obLibro("La zarza ardiente","Narrativa", "Andr�s Kaiser");
	static obLibro Tratado = new obLibro("Tratado de las espirales","Narrativa", "Victor Roberto Carranc�");
	static obLibro Lanariz = new obLibro("La nariz roja de Stalin","Narrativa", "Imanol Canevada");
	static obLibro Okigbo = new obLibro("Okigbo vs Las transnacionales","Narrativa", "Luis Felipe Lomel�");
	
	static obLibro Porboca = new obLibro("Por boca de la sombra","Poes�a", "Luis Jorge Boone");
	static obLibro Espejo = new obLibro("Espejo de doble filo","Poes�a", "Iv�n Trejo");
	static obLibro Descripcion = new obLibro("Descripcion de la mentira", "Poes�a", "Antonio Gamoneda");
	static obLibro Oscura = new obLibro("Oscura", "Poes�a", "Julian Herbert");
	static obLibro Iceberg = new obLibro("Iceberg negro", "Poes�a", "Balam Rodrigo");
	static obLibro Yasabes = new obLibro("Ya sabes que no veo de noche", "Poes�a", "Claudia Domingo");
	static obLibro UnHervidero = new obLibro("Un hervidero de p�jaros marinos", "Poes�a", "Mar�a Baranda");
	static obLibro Rio = new obLibro("R�o Interior","Poes�a", "Jos� Antonio Banda");
	static obLibro Barcos = new obLibro("Barcos para armar","Poes�a", "Jes�s Ram�n Ibarra");
	

	public Ejecucion2() {
		
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws IOException {
		inventario();
	}
	
	public static void inventario() throws IOException{
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
		
		encabezado.createCell(1).setCellValue("T�tulo");
		encabezado.createCell(2).setCellValue("Categor�a");
		encabezado.createCell(3).setCellValue("Autor");
		encabezado.createCell(4).setCellValue("Cantidad");
		
		for(int i=1; i< Libros.length ; i++) {

			
			HSSFRow filas = sheet.createRow(i+1);
			
			for(int e= 0; e<4; e++){
		
			filas.createCell(1).setCellValue(Libros[i].getTitulo());
			filas.createCell(2).setCellValue(Libros[i].getCategoria());	
			filas.createCell(3).setCellValue(Libros[i].getAutor());
			filas.createCell(4).setCellValue(Libros[i].getCantidad());
			
			
			}
		}

				
		
		
		archivo.write(new FileOutputStream(new File("archivo.xls")));
		archivo.close();
		
		
	}
	}



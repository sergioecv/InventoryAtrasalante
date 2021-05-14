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



public class libLoc {
	private String localizacion;
	private int cantidad;
	
	public libLoc(String localizacion, int cantidad) {
		this.localizacion = localizacion;
		this.cantidad = cantidad;
	}
	
	

}

package selenium;

import data.Xls_Reader;

public class ReadDataFromExcel {

	public static void main(String[] args) {
Xls_Reader d = new Xls_Reader("/Users/gurindersingh/Selenium/testing/NikulTest.xlsx");
		
		System.out.println(d.getCellData("Data1", "Name", 3));
		String correctEmail = d.getCellData("Data1", 1, 2);
		System.out.println(correctEmail);
		
		String browser = d.getCellData("Data1", "Browser", 2);
		System.out.println(browser);
		
		System.out.println(d.getRowCount("Data1"));
		System.out.println(d.getColumnCount("Data1"));
		
		//d.setCellData("Data1", "Name", 11, "testing11");
		System.out.println(d.getCellData("Data1", "Name", 11));
		System.out.println(d.getRowCount("Data1"));
		
		//d.addColumn("Data1", "Browser");
		System.out.println(d.getColumnCount("Data1"));
				
		d.removeColumn("Data1", 7);
		//d.setCellData("Data1", "Browser", 2, "Chrome");
		System.out.println(d.getCellData("Data1", "Browser", 1));

	}

}

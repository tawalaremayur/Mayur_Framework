package com.resonantiatechnologie.amazon.utility;


	
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	public class PropertyFileReader {
		
		public void propertyFileReaderMethod(){
			try {
				Constants.fis = new FileInputStream(Constants.propertyFilePath);
				Constants.property = new Properties();
				Constants.property.load(Constants.fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
	}


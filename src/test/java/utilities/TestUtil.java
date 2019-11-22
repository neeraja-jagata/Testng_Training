package utilities;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import listenersTest.TestBase;

public class TestUtil extends TestBase {

	public static String captureScreenshot(String methodName) throws IOException {

		Date d = new Date();
		String fileName = methodName+d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		String filePath=".//screenshot//" + fileName ;
		File finalScreenshot= new File(filePath);
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, finalScreenshot);
		System.out.println(finalScreenshot.getAbsolutePath());
		System.out.println(finalScreenshot.getCanonicalPath());

		return finalScreenshot.getAbsolutePath();
		
	}
	
	// make zip of reports
			public static void zip(String filepath){
			 	try
			 	{
			 		File inFolder=new File(filepath);
			 		File outFolder=new File("Reports.zip");
			 		ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(outFolder)));
			 		BufferedInputStream in = null;
			 		byte[] data  = new byte[1000];
			 		String files[] = inFolder.list();
			 		for (int i=0; i<files.length; i++)
			 		{
			 			in = new BufferedInputStream(new FileInputStream
			 			(inFolder.getPath() + "/" + files[i]), 1000);  
			 			out.putNextEntry(new ZipEntry(files[i])); 
			 			int count;
			 			while((count = in.read(data,0,1000)) != -1)
			 			{
			 				out.write(data, 0, count);
			 			}
			 			out.closeEntry();
		  }
		  out.flush();
		  out.close();
			 	
		}
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  } 
		 }	
	
}

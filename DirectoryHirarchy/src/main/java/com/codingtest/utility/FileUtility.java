package com.codingtest.utility;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * This class provides all utility method for this application.
 * 
 * @author ronak_2
 *
 */
public class FileUtility {

	/**
	 * This method is converts MM/dd/yyyy HH:mm:ss format..
	 * 
	 * @param file
	 * @return
	 */
	public String convertToDateandTimeFormat(File file) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		String dateTtime = sdf.format(file.lastModified());
		return dateTtime;

	}

	/**
	 * This method converts file size in user readable format.
	 * 
	 * @param file
	 * @return
	 */
	public String convertFileSize(File file) {
		int unit = 1024;
		long bytes = file.length();
		if (bytes < unit) {
			return bytes + " B";
		}
		int exp = (int) (Math.log(bytes) / Math.log(unit));
		char pre = ("kMGTPE").charAt(exp == 0 ? 0 : exp - 1);
		return String.format("%.1f %sB", bytes / Math.pow(unit, exp), pre);

	}

	/**
	 * This method prints file names.
	 * 
	 * @param file
	 */
	public void printListofFiles(File file) {
		String printString = file.getName();
		System.out.println(printString);
	}

	/**
	 * This method print file names, timestamp and size of file.
	 * 
	 * @param file
	 */
	public void printListofFileswithDetails(File file) {
		StringBuilder sb = new StringBuilder();
		sb.append(file.getName());
		sb.append(" | ");
		sb.append(convertToDateandTimeFormat(file));
		sb.append(" | ");
		sb.append(convertFileSize(file));
		System.out.println(sb);
	}

}

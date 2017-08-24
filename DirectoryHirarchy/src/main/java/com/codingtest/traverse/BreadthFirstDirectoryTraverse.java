package com.codingtest.traverse;

import java.io.File;
import java.util.ArrayDeque;

import com.codingtest.utility.FileUtility;

/**
 * @author ronak_2
 *
 */
public class BreadthFirstDirectoryTraverse {

	/**
	 * This method iterates through directory structure based in breadth first
	 * search algorithm
	 * 
	 * @param aDir
	 * @param number
	 */
	public void bredthFirstTraverse(File aDir, String number) {
		ArrayDeque<File> listofFiles = new ArrayDeque<File>();
		FileUtility utility = new FileUtility();
		listofFiles.push(aDir);
		if ("1".equals(number)) {
			utility.printListofFiles(aDir);
		} else {
			utility.printListofFileswithDetails(aDir);
		}
		while (!listofFiles.isEmpty()) {
			File temp = listofFiles.pop();
			File[] files = temp.listFiles();
			for (File file : files) {
				if ("1".equals(number)) {
					utility.printListofFiles(file);
				} else {
					utility.printListofFileswithDetails(file);
				}
				if (file.isHidden())
					continue;
				if (file.isDirectory()) {
					listofFiles.addLast(file);
					continue;
				}
			}

		}
	}

}

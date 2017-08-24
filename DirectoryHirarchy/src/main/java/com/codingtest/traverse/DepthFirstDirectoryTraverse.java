package com.codingtest.traverse;

import java.io.File;
import java.util.Stack;

import com.codingtest.utility.FileUtility;

/**
 * @author ronak_2
 *
 */
public class DepthFirstDirectoryTraverse {

	/**
	 * This method iterates through directory structure based in depth first search
	 * algorithm
	 * 
	 * @param aDir
	 * @param number
	 */
	public void depthFirstTraverse(File aDir, String number) {
		Stack<File> stack = new Stack<File>();
		FileUtility utility = new FileUtility();
		stack.push(aDir);
		while (!stack.isEmpty()) {
			File file = stack.pop();
			if (file.isHidden()) {
				continue;
			} else if (file.isDirectory()) {
				if ("1".equals(number)) {
					utility.printListofFiles(file);
				} else {
					utility.printListofFileswithDetails(file);
				}
				for (File tempFile : file.listFiles()) {
					stack.push(tempFile);
				}
			} else if (file.isFile()) {
				if ("1".equals(number)) {
					utility.printListofFiles(file);
				} else {
					utility.printListofFileswithDetails(file);
				}
			}
		}
	}
}

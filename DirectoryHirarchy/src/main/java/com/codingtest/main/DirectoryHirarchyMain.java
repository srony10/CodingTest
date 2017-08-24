package com.codingtest.main;

import java.io.File;

import com.codingtest.traverse.TarverseDirectoryandFilesIteration;
import com.codingtest.userinput.UserInput;

/**
 * This application use for traversing folder structure or Directory Structure.
 * 
 * @author ronak_2
 *
 */
public class DirectoryHirarchyMain {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		UserInput userInput = new UserInput();
		TarverseDirectoryandFilesIteration traverseDirectory = new TarverseDirectoryandFilesIteration();
		File aDirectory = userInput.getFileFromFileLocation();
		traverseDirectory.traverseDirectorywithUserInput(userInput, aDirectory);
	}

}

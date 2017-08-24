package com.codingtest.userinput;

import static java.lang.System.out;

import java.io.File;
import java.util.Scanner;

/**
 * This class provides user inputs.
 * 
 * @author ronak_2
 *
 */
public class UserInput {

	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * This method provides directory location enter by user.
	 * 
	 * @return
	 */
	public File getFileFromFileLocation() {
		System.out.println("Please provide Directory location");

		String directoryLocation = scanner.next();
		if (null == directoryLocation || directoryLocation.isEmpty()) {
			out.println("Please provide valid file location");
		}
		File aDirectory = new File(directoryLocation);
		return aDirectory;
	}

	/**
	 * This method provides traversal algorithm selected by user.
	 * 
	 * @return
	 */
	public String getTraversalMethodFromUser() {

		out.println("Please Enter number to choose traverse method:");
		out.println("1. Traverse using depth first search");
		out.println("2. traverse using breadth first search");
		String traversalmethod = scanner.next();
		return traversalmethod;
	}

	/**
	 * This method provides information view details to print based on user input.
	 * 
	 * @return
	 */
	public String getSelectedViewType() {
		System.out.println("Please enter number to choose view directory structure:");
		System.out.println("1. Direcorty/File name");
		System.out.println("2. Directory/File name with Date modified and Size");
		String view = scanner.next();
		return view;
	}

}

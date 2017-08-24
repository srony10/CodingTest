package com.codingtest.traverse;

import java.io.File;

import com.codingtest.userinput.UserInput;

/**
 * @author ronak_2
 *
 */
public class TarverseDirectoryandFilesIteration {

	/**
	 * This method is for select traverse algorithm based on user input
	 * 
	 * @param userInput
	 * @param aDirectory
	 */
	public void traverseDirectorywithUserInput(UserInput userInput, File aDirectory) {
		String selectedTraversalMethod = userInput.getTraversalMethodFromUser();
		String selectedViewMethod = userInput.getSelectedViewType();
		if ("1".equals(selectedTraversalMethod)) {
			depthFirstDirectoryTraverse(aDirectory, selectedViewMethod);
		} else if ("2".equals(selectedTraversalMethod)) {
			breadthFirstDirectoryTraverse(aDirectory, selectedViewMethod);
		} else {
			System.out.println("Invalid Entry");
			System.exit(0);
		}
	}

	/**
	 * 
	 * @param aDirectory
	 * @param selectedViewMethod
	 */
	public void breadthFirstDirectoryTraverse(File aDirectory, String selectedViewMethod) {
		BreadthFirstDirectoryTraverse bfdt = new BreadthFirstDirectoryTraverse();
		bfdt.bredthFirstTraverse(aDirectory, selectedViewMethod);

	}

	/**
	 * @param aDirectory
	 * @param selectedViewMethod
	 */
	public void depthFirstDirectoryTraverse(File aDirectory, String selectedViewMethod) {
		DepthFirstDirectoryTraverse dfdt = new DepthFirstDirectoryTraverse();
		dfdt.depthFirstTraverse(aDirectory, selectedViewMethod);
	}
}

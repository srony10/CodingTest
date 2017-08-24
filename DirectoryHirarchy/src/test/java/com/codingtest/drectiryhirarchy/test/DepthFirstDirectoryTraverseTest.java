/**
 * 
 */
package com.codingtest.drectiryhirarchy.test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.codingtest.traverse.TarverseDirectoryandFilesIteration;

/**
 * @author ronak_2
 *
 */
@RunWith(JUnit4.class)
public class DepthFirstDirectoryTraverseTest {
	private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	static TarverseDirectoryandFilesIteration tdf = new TarverseDirectoryandFilesIteration();
	static File file;
	final String expectedOutput = 
			"java\r\n" 
			+ "com\r\n" 
			+ "codingtest\r\n" 
			+ "utility\r\n" 
			+ "FileUtility.java\r\n"
			+ "userinput\r\n" 
			+ "UserInput.java\r\n" 
			+ "traverse\r\n" 
			+ "TarverseDirectoryandFilesIteration.java\r\n"
			+ "DepthFirstDirectoryTraverse.java\r\n" 
			+ "BreadthFirstDirectoryTraverse.java\r\n" 
			+ "main\r\n"
			+ "DirectoryHirarchyMain.java\r\n";

	@BeforeClass
	public static void makeDirectory() {

		file = new File("src/main/java");
		System.setOut(new PrintStream(outContent));
		tdf.depthFirstDirectoryTraverse(file, "1");
	}

	@Test
	public void traverseOrderWithDepthFirstAlgorithmTestwithWholeOutput() {

		assertEquals(expectedOutput, (outContent.toString()));

	}

	@Test
	public void traverseOrderWithDepthFirstAlgorithmTest() {

		assertEquals("java\r\n" + "com\r\n" + "codingtest\r\n" + "utility\r\n" + "FileUtility.java",
				(outContent.toString()).substring(0, 48));

	}

}

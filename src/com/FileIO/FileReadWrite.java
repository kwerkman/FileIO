package com.FileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("./sample.txt");
		
		var path1 = path;
		System.out.println(path1);
		
		
		String fileContent = Files.readString(path);
		System.out.println(fileContent);
		
		String newFileContent = fileContent.replace("Line", "LINES");
		Path newFilePath = Paths.get("./sample-new.txt");
				Files.writeString(newFilePath, newFileContent);
		
		
	}

}

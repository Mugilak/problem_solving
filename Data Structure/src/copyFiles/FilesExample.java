package copyFiles;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;

public class FilesExample {
	private Scanner input = new Scanner(System.in);
	private String originalPath, copyPath;

	public HashMap<String, Long> start() {
		return getInput();
	}

	private HashMap<String, Long> getInput() {
		System.out.println("Enter Absolute path of folder to copy : ");
		this.originalPath = input.nextLine();
		System.out.println("Enter Absolute path of folder where you want  to copy : ");
		this.copyPath = input.nextLine();
		File originalFile = new File(originalPath);
		File copyFile = new File(copyPath);
		if (originalFile.exists() && copyFile.exists()) {
			return fetchFiles(originalFile);
		}
		return null;
	}

	private HashMap<String, Long> fetchFiles(File originalFile) {
		long size;
		HashMap<String, Long> map = new HashMap<>();
		String[] files = originalFile.list(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return true;
			}
		});
		for (String file : files) {
			Path path = Paths.get(originalFile + "\\" + file);
			try {
				size = Files.size(path);
				map.put(file, size);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return map;
	}

	public void copyFile(String string, String fileName) throws IOException {
		File file = new File(originalPath + "\\" + string);
		File copyLocation = new File(copyPath + "\\" + fileName);
		Files.copy(file.toPath(), copyLocation.toPath());
	}
}

// C:\Users\91638\OneDrive\Documents\path
// C:\Users\91638\OneDrive\Documents\copyPath

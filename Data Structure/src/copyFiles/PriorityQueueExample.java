package copyFiles;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	private FilesExample fileObject;
	private HashMap<String, Long> files;

	PriorityQueueExample() {
		fileObject = new FilesExample();
	}

	public static void main(String[] args) {
		PriorityQueueExample object = new PriorityQueueExample();
		object.addFiles();
	}

	private void addFiles() {
		files = fileObject.start();
		Queue<Map.Entry<String, Long>> queue = new PriorityQueue<>((a, b) -> {
			return (int) (a.getValue() - b.getValue());
		});
		for (Map.Entry<String, Long> map : files.entrySet()) {
			queue.offer(map);
		}
		System.out.println(queue);
		pollFiles(queue,1);
	}

	private void pollFiles(Queue<Map.Entry<String, Long>> queue, int i) {
		if (queue.isEmpty()) {
			System.out.println("Successfully done !");
			return;
		}
		Entry<String, Long> value = queue.poll();
		try {
			fileObject.copyFile(value.getKey(), "newFile"+i);
		} catch (IOException e) {
			System.out.println("Cannot Copied ..");
//			e.printStackTrace();
		}
		pollFiles(queue,i+1);
	}

}

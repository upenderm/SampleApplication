package com.test.samples.java8features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.stream.Stream;

public class LargeFileHandling {

	public static void main(String[] args) {
		Instant startTime = Instant.now();
//		try (Stream<String> lines = Files.lines(Paths.get("C:\\BigFile\\BigFileForJavaTesting.txt"))) {
		try (Stream<String> lines = Files.lines(Paths.get("C:\\BigFile\\SmallFile.txt"))) {
			lines.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Instant endTime = Instant.now();
		System.out.println(">>----->" + endTime.compareTo(startTime));
	}

}

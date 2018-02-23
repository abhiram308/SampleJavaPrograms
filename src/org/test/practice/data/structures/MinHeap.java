package org.test.practice.data.structures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Heap {
	int size;
	int maxSize;
	int[] elements;
}

public class MinHeap {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Heap heap = new Heap();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter heap size: ");
		heap.setMaxSize(Integer.parseInt(br.readLine()));
		System.out.println("Enter elements: ");
		heap.setMaxSize(Integer.parseInt(br.readLine()));
	}
}

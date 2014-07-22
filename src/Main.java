
import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import parse.XMLParser;
import sort.BubbleSort;
import sort.ISort;
import sort.QuickSort;
import sort.SortFactory;


public class Main {

	public static void main(String[] args) {
		int[] data = { 20, 1, 4, 632, 3, 100 };
		int[] result = new int[data.length];
				
		SortFactory factory = new SortFactory("config.xml");
		ISort isort = factory.getinstance();

		System.out.println("Original Data");
		printDataArray(data);

		System.out.println("Sorted Data");
		result = isort.sort(data);
		printDataArray(result);
	}

	private static void printDataArray(int[] data) {
		for(int i=0 ; i<data.length-1 ; i++)
			System.out.print(data[i] + ", ");
		System.out.print(data[data.length-1]);
		System.out.println("");
	}

}

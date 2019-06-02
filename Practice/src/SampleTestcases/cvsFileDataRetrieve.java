package SampleTestcases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;

public class cvsFileDataRetrieve {
	public static void main(String[] args) throws Exception {
		CSVReader reader = new CSVReader(new FileReader("C:\\Users\\altaf\\Desktop\\demo.csv"));
		List<String[]> li = reader.readAll();
		System.out.println("Total number of rows is " + li.size());
		Iterator<String[]> i1 = li.iterator();

		while (i1.hasNext()) {
			String[] str = i1.next();

			System.out.println("Values are ");

			for (int i = 0; i < str.length; i++) {

				System.out.println(" " + str[i]);

			}
			System.out.println("   ");
		}

	}
}

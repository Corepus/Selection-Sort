import java.util.*;

public class SelectionSorter {

	public static void selectionSort(ArrayList<String> wordList) {
		int index = 0;
		for (int i = wordList.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++)  {
				if (wordList.get(j).compareTo(wordList.get(index)) > 0) {
					index = j;
				}
			}
			Collections.swap(wordList, index, i);
		}
		
	}
}

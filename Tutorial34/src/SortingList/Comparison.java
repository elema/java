package SortingList;

import java.util.Comparator;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
		int i0 = arg0.length();
		int i1 = arg1.length();
		if (i0 > i1) {
			return 1;
		} else if (i0 < i1) {
			return -1;
		}
		return 0;
	}
}
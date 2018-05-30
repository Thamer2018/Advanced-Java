public class SingleList {

	String item[] = new String[5];
	int itemSize = 0;
	int currentLoc;

	public void addItems(String element) {
		if (element != null) {
			item[itemSize] = element;
			itemSize++;
		}
	}

	public void deleteItems(String element) {
		int flag = 0;
		if (itemSize > 0) {
			for (int i = 0; i < itemSize; i++) {
				if (item[i] == element) {
					flag = 1;
					currentLoc = i;
					break;
				}
			}
			if (flag == 0)
				System.out.println("No such element to delete such as '" + element + "'");
			else if (flag == 1) {
				for (int i = currentLoc + 1; i < itemSize; i++) {
					item[currentLoc] = item[i];
					currentLoc++;
				}
				itemSize--;
				System.out.println("'" + element + "' element is deleted");
			}
		}
	}

	public void viewItems() {
		if (itemSize > 0) {
			System.out.println("The elements in the Single Linked List are: ");
			for (int i = 0; i < itemSize; i++) {
				System.out.print(item[i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String a[]) {

		SingleList s = new SingleList();

		s.addItems("a");
		s.addItems("b");
		s.addItems("c");
		s.viewItems();

		s.deleteItems("b");
		s.viewItems();

		s.addItems("d");

		s.addItems("e");

		s.deleteItems("s");
		s.viewItems();

		s.deleteItems("a");
		s.viewItems();

		s.addItems("f");
		s.viewItems();

		s.deleteItems("a");
		s.viewItems();

		s.addItems("g");
		s.viewItems();

		s.deleteItems("c");
		s.viewItems();

		s.addItems("h");
		s.viewItems();
	}

}

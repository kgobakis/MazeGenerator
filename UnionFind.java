
public class UnionFind {

Cell cell;
int count = 0;

	public void makeset (Cell cell) {
		cell.head = new LLAddOnly ();
		cell.head.add(cell);
		count++;
	}
	
	public LLAddOnly find (Cell cell) {
		return cell.head;
	}
	
	public void union (Cell cell1, Cell cell2) {
		cell1.head.last.next = cell2.head.first;
		Cell temp = cell2.head.first;
		cell1.head.last = cell2.head.last;
		while(temp.next != null) {
			temp.head = cell1.head;
			temp = temp.next;
		}
		cell2.head.last.head = cell1.head;
		
                                
	}


	
	
}

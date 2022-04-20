package homework;

public interface BoardService {
//메소드
	
	public int ADD = 1;
	public int MOD = 2;
	public int DEL = 3;
	public int SEARCH = 4;
	public int LIST = 5;
	
	void addBoard(Board bo);
	void modBoard(int A );
	void delBoard(int B);
	void searchBoard(int c);
	void findBoard(Board bo);
	void exitBoard(Board bo);
	
	
	
	
}

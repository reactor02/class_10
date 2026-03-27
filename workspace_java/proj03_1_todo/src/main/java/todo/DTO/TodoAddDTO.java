package todo.DTO;

public class TodoAddDTO {
	
	private String contents;


	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	
	@Override
	public String toString() {
		return "TodoAddDTO [contents=" + contents + "]";
	}
	
}

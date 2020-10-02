package modelo;

public class Position {
	private int page,
				position,
				global_position;

	public Position(int page, int position, int global_position) {
		super();
		this.page = page;
		this.position = position;
		this.global_position = global_position;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}



	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getGlobal_position() {
		return global_position;
	}

	public void setGlobal_position(int global_position) {
		this.global_position = global_position;
	}
	
	
}

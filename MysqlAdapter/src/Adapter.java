
public class Adapter implements Target {
	private Adaptee adaptada;
	
	public Adapter(Adaptee adaptada) {
		super();
		this.adaptada = adaptada;
	}
	public void insert() {
		adaptada.insertMysql();
	}
	public void select() {
		adaptada.selectMysql();
	}
	public void update() {
		adaptada.updateMysql();
	}
	public void delete() {
		adaptada.deleteMysql();
	}
}

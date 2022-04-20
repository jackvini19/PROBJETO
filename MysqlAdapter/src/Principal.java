
public class Principal {
		public static void main(String[]args) {
			Adaptee adaptada = new Adaptee();
			Adapter adapter = new Adapter(adaptada);
			Cliente cliente = new Cliente(adapter);
		}
}

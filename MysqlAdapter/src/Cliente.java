
public class Cliente {
		private Target alvo;

		public Cliente(Target alvo) {
			super();
			this.alvo = alvo;
		}
		public void inserir() {
			alvo.insert();
		}
		public void select() {
			alvo.select();
		}
		public void update() {
			alvo.update();
		}
		public void delete() {
			alvo.delete();
		}
}

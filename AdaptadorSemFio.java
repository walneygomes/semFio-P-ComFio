
public class AdaptadorSemFio implements Fio {

	Onda semFio;

	public AdaptadorSemFio() {
		this.semFio = new Wireless();
	}

	@Override
	public void configuraRede(String usuario, String senha) {
		semFio.configuraRede(usuario, senha);

	}

	@Override
	public void velocidadeDados() {
		semFio.velocidadeDados();

	}

}

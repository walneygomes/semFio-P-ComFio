
public class Wireless implements Onda {

	@Override
	public void configuraRede(String usuario, String senha) {
		if ("admin".equals(usuario) && "admin".equals(senha)) {
			System.out.print("Conectado");
		}

	}

	@Override
	public void velocidadeDados() {
		System.out.print("velocidade de 100,35 MBps");

	}

}

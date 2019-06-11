
public class FioRede implements Fio {

	@Override
	public void configuraRede(String usuario, String senha) {
		if ("admin".equals(usuario) && "admin".equals(senha)) {
			System.out.print("Conectado");
		}

	}

	@Override
	public void velocidadeDados() {
		System.out.print("velocidade de 10,35 MBps");

	}
}

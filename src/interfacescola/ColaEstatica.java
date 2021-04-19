package interfacescola;

public class ColaEstatica <T> implements ICola <T> {
	
	private T[] cola = null;
	private T primero;
	private T ultimo;
	
	static final int TAM_POR_DEFECTO = 4;
	
	public ColaEstatica() {
		this.cola = (T[]) new Object[TAM_POR_DEFECTO];
		
	}

	public boolean esVacia() {
		return primero == null;
	}
	public boolean esLlena() {
		return ultimo == null;
	}
	
	public void vaciar() {
		primero=null;
		ultimo=null;
	}
	
	public void poner (T x) {
		
	}
	public void mostrar (T x) {
		
		
	}
	public T sacar() {
		T x = null;
		return x;
	}
	

}

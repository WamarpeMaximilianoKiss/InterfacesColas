package interfacescola;

public interface ICola <T> {
	public boolean esVacia();
	public boolean esLlena();
	public void poner(T x);
	public T sacar();
	public void mostrar(T x);
	public void vaciar();
}

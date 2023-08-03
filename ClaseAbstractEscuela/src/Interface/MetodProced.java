package Interface;

public interface MetodProced {
	public void guardar(Object obj);

	public void editar(int indice, Object obj);
	
	public void eliminar(int indice);
	
	public Object buscar(int indice);
	
	public void listar();
}

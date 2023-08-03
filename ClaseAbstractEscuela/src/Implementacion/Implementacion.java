package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Interface.MetodProced;
import Model.Alumno;

public class Implementacion implements MetodProced {

	List<Object> listaObj = new ArrayList<Object>();

	@Override
	public void guardar(Object obj) {
		// TODO Auto-generated method stub
		listaObj.add(obj);
	}

	@Override
	public void editar(int indice, Object obj) {
		// TODO Auto-generated method stub
		listaObj.set(indice, obj);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		listaObj.remove(indice);
	}

	@Override
	public Object buscar(int indice) {
		// TODO Auto-generated method stub
		return listaObj.get(indice);
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		System.out.println(listaObj);
	}

	// Metodo personalizado--- INDICE Y DESCRIPCION
	public void indiceDescrip() {
		System.out.println("Registros en la lista");
		for (int i = 0; i < listaObj.size(); i++) {
			if (listaObj.get(i).getClass().equals(Alumno.class)) {
				Alumno alumno = (Alumno) listaObj.get(i);
				System.out.printf("[%d] \n" + alumno.getNombre(), i);
			}
		}
	}
}

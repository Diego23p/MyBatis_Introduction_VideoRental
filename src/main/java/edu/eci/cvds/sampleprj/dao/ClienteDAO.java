package edu.eci.cvds.sampleprj.dao;

import java.util.List;

import edu.eci.cvds.samples.entities.Cliente;
import edu.eci.cvds.samples.entities.Item;
import edu.eci.cvds.samples.entities.ItemRentado;

public interface ClienteDAO {
	
	public Cliente load(int docu) throws PersistenceException;
	
	public List<Cliente> load() throws PersistenceException;

	public List<ItemRentado> items(int idcliente) throws PersistenceException;

	public void agregarCliente(Cliente c) throws PersistenceException;

	public void vetar(long docu, boolean estado) throws PersistenceException;

}

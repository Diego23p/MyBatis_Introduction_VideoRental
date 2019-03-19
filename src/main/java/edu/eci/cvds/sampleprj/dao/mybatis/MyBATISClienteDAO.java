package edu.eci.cvds.sampleprj.dao.mybatis;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.sampleprj.dao.ClienteDAO;
import edu.eci.cvds.sampleprj.dao.PersistenceException;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ClienteMapper;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ItemMapper;
import edu.eci.cvds.samples.entities.Cliente;
import edu.eci.cvds.samples.entities.Item;
import edu.eci.cvds.samples.entities.ItemRentado;

public class MyBATISClienteDAO implements ClienteDAO{
	
	@Inject
	  private ClienteMapper clienteMapper;
	
	@Override
	  public Cliente load(int docu) throws PersistenceException {
		  try{
		      return clienteMapper.consultarCliente(docu);
		  }
		  catch(org.apache.ibatis.exceptions.PersistenceException e){
		      throw new PersistenceException("Error al consultar el item "+docu,e);
		  }
	  }
	
	@Override
	  public List<Cliente> load() throws PersistenceException {
		  try{
		      return clienteMapper.consultarClientes();
		  }
		  catch(org.apache.ibatis.exceptions.PersistenceException e){
		      throw new PersistenceException("Error al consultar el item",e);
		  }
	  }

	@Override
	public List<ItemRentado> items(int idcliente) throws PersistenceException{
		try{
		      return clienteMapper.consultarItems(idcliente);
		  }
		  catch(org.apache.ibatis.exceptions.PersistenceException e){
		      throw new PersistenceException("Error al consultar el item",e);
		  }
	}

	@Override
	public void agregarCliente(Cliente c) throws PersistenceException {
		try{
		      clienteMapper.agregarCliente(c);
		  }
		  catch(org.apache.ibatis.exceptions.PersistenceException e){
		      throw new PersistenceException("Error al consultar el item",e);
		  }
	}

	@Override
	public void vetar(long docu, boolean estado) throws PersistenceException {
		try{
		      clienteMapper.vetar(docu,estado);
		  }
		  catch(org.apache.ibatis.exceptions.PersistenceException e){
		      throw new PersistenceException("Error al consultar el item",e);
		  }
		
	}

}

package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.samples.entities.Cliente;
import edu.eci.cvds.samples.entities.ItemRentado;

/**
 *
 * @author 2106913
 */
public interface ClienteMapper {
	
	public Cliente consultarCliente(@Param("idcli") int id);
    
    
    /**
     * Registrar un nuevo item rentado asociado al cliente identificado
     * con 'idc' y relacionado con el item identificado con 'idi'
     * @param id
     * @param idit
     * @param fechainicio
     * @param fechafin 
     */
    public void agregarItemRentadoACliente(
    		@Param("id") int id, 
    		@Param("idit") int idit, 
    		@Param("fein") Date fechainicio,
    		@Param("fefi") Date fechafin);

    /**
     * Consultar todos los clientes
     * @return 
     */
    public List<Cliente> consultarClientes();


	public List<ItemRentado> consultarItems(@Param("id") int idcliente);


	public Object agregarCliente(@Param("cliente") Cliente c);


	public void vetar(@Param("docu")long docu,@Param("estado") boolean estado);
    
}

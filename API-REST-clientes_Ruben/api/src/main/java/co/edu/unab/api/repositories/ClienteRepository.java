package co.edu.unab.api.repositories;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import co.edu.unab.api.models.ClienteModel;

@Repository
public interface ClienteRepository extends MongoRepository<ClienteModel , String> {
    
    ArrayList<ClienteModel> findByNombre(String nombre);

    @Query(value = "{'address.ciudad':?0,'address.departamento':?1}", fields="{'nombre':1,'apellido':1}")
    ArrayList<ClienteModel> clienteCiudadxDepartamento(String ciudad , String departamento);
      
    ArrayList<ClienteModel> findByPuntosGreaterThanEqual(Long puntos);
    ArrayList<ClienteModel> findByPuntosLessThanEqual(Long puntos);

    @Query(value = "{'productos.nombre':?0,'productos.precio':?1}", fields="{'nombre':1,'apellido':1}")
    ArrayList<ClienteModel> productoNombrexPrecio(String nombre , int precio);

    @Query(value = "{'address.ciudad':?0}", fields="{'nombre':1,'apellido':1}")
    ArrayList<ClienteModel> clientePorCiudad(String ciudad);

    @Query(value = "{'nombre':?0,'apellido':?1}")
    ArrayList<ClienteModel> clientePorNombreYApellido(String nombre , String apellido);

}


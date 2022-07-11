package com.tienda.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.tienda.entidades.Cliente;
// la anotaci�n @Repository suele utilizarse para las clases DAO (permite inyectar posteriormente un objeto de esta clase en el controlador)
@Repository
public class ClienteDAOImpl implements ClienteDAO {
// se inyecta el sessionFactory de Hibernate (configurado en el archivo spring-mvcservlet.xml.xml)
// el sessionFactory depende de un datasource (tambi�n configurado en el archivo spring-mvc-servlet.xmlg.xml)
// el nombre del objeto debe coincidir con el id del bean asociado (sessionFactory en este caso)
@Autowired
private SessionFactory sessionFactory;
@Override
// la anotaci�n @Transactional inicia y finaliza una transacci�n de Hibernate de forma autom�tica (no ser� necesario escribir session.beginTransaction() y session.getTransaction().commit())
@Transactional
public List<Cliente> getClientes() {
Session currentSession = sessionFactory.getCurrentSession();
// crea la consulta, la ejecuta y la retorna 
Query<Cliente> query = currentSession.createQuery("from Cliente order by apellidos",
Cliente.class);
return query.getResultList();
}
}
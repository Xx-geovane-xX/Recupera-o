/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.GasUsuarios;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u05682855140
 */
<<<<<<< HEAD
<<<<<<< HEAD
public class UsuariosDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
=======
=======
>>>>>>> 73bfd72e5a9a447735fa1425ee65e26daf609117
public class UsuariosDAO extends DAO_Abstract{

    @Override
    public void insert(Object object) {
       session.beginTransaction();
       session.save(object);
       session.getTransaction().commit();
    }

    @Override 
    public void update(Object object) {
       session.beginTransaction();
        session.flush();
       session.clear();
       session.update(object);
       session.getTransaction().commit();
<<<<<<< HEAD
>>>>>>> 73bfd72e5a9a447735fa1425ee65e26daf609117
=======
>>>>>>> 73bfd72e5a9a447735fa1425ee65e26daf609117
    }

    @Override
    public void delete(Object object) {
<<<<<<< HEAD
<<<<<<< HEAD
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
=======
=======
>>>>>>> 73bfd72e5a9a447735fa1425ee65e26daf609117
       session.beginTransaction();
       session.flush();
       session.clear();
       session.delete( object);
       session.getTransaction().commit();
<<<<<<< HEAD
>>>>>>> 73bfd72e5a9a447735fa1425ee65e26daf609117
=======
>>>>>>> 73bfd72e5a9a447735fa1425ee65e26daf609117
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasUsuarios.class);
        criteria.add(Restrictions.eq("gasIdusuarios", id));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista.get(0);
    }

    @Override
    public List listALL() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasUsuarios.class);
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }
<<<<<<< HEAD
<<<<<<< HEAD

    public List buscar(String campo, String valor) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasUsuarios.class);
        criteria.add(Restrictions.eq(campo, valor));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }

    public List listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasUsuarios.class);
        criteria.add(Restrictions.like("gasNome", "%" + nome + "%"));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }

    public List listAtivoNome(String ativo, String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasUsuarios.class);
        criteria.add(Restrictions.like("gasAtivo", "%" + ativo + "%"));
        criteria.add(Restrictions.like("gasNome", "%" + nome + "%"));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }

    public List listAtivo(String ativo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasUsuarios.class);
        criteria.add(Restrictions.like("gasAtivo", "%" + ativo + "%"));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }

=======
=======
>>>>>>> 73bfd72e5a9a447735fa1425ee65e26daf609117
    
   
    public List buscar( String campo, String valor){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasUsuarios.class);
        criteria.add(Restrictions.eq( campo , valor));
        List Lista = criteria.list();
        session.getTransaction().commit(); 
        return Lista;
    }
    
     
       
        
    
<<<<<<< HEAD
>>>>>>> 73bfd72e5a9a447735fa1425ee65e26daf609117
=======
>>>>>>> 73bfd72e5a9a447735fa1425ee65e26daf609117
}

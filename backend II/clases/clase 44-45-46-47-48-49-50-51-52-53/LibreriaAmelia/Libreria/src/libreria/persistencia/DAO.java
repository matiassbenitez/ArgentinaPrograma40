package libreria.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DAO<T> {

    protected final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("LibreriaPU");
    protected EntityManager em = EMF.createEntityManager();

    protected void conectar() {
        try {
            if (!em.isOpen()) {
                em = EMF.createEntityManager();
            }
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
            em.close();
        }
    }

    protected void desconectar() {
        if (em != null) {
            try {
                if (em.isOpen()) {
                    em.close();
                }
            } catch (Exception e) {
                System.out.println("Error");
                e.printStackTrace();
            }
        }
    }

    protected void agregar(T object) {
        if (object != null) {
            try {
                conectar();
                em.getTransaction().begin();
                em.persist(object);
                em.getTransaction().commit();
            } catch (Exception e) {
                System.out.println("Error");
                e.printStackTrace();
                em.getTransaction().rollback();
            } finally {
                desconectar();
            }
        }
    }

    protected void modificar(T object) {
        if (object != null) {
            try {
                conectar();
                em.getTransaction().begin();
                em.merge(object);
                em.getTransaction().commit();
            } catch (Exception e) {
                System.out.println("Error");
                e.printStackTrace();
                em.getTransaction().rollback();
            } finally {
                desconectar();
            }
        }
    }

    protected void eliminar(T object) {
        if (object != null) {
            try {
                conectar();
                em.getTransaction().begin();
                T managedObject = em.merge(object);
                em.remove(managedObject);
                em.getTransaction().commit();
            } catch (Exception e) {
                System.out.println("Error");
                e.printStackTrace();
                em.getTransaction().rollback();
            } finally {
                desconectar();
            }
        }
    }
    
    
    


}

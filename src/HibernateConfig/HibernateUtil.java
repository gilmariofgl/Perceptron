
package HibernateConfig;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Creando a session padrão para o (hibernate.cfg.xml) 
            // Configuração dos arquivos.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Mensagem de exceção
            System.err.println("Falha na criação da sessão inicial." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

package perceptron.modelos.dao;
/*
 * @author Francisco Gilmário de Lima
 */

import HibernateConfig.HibernateUtil;
import java.util.List;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Session;
import org.hibernate.Transaction;
import perceptron.modelos.Perceptron;
import perceptron.telas.Principal;

public class PerceptronDao {

    // Instanciando o modelo Administrador
    Perceptron perceptron = new Perceptron();

    // Generico
    public Perceptron getAdministrador() {
        return perceptron;
    }

    public void setPerceptron(Perceptron perceptron) {
        this.perceptron = perceptron;
    }

    // Verifica se já tem um Administrador cadastrado
    public static Perceptron verificaAcesso(Perceptron perceptron) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();

        Perceptron logins = (Perceptron) sessao.createCriteria(Perceptron.class).add(Restrictions.eq("id", new Integer(perceptron.getId()))).uniqueResult();
        sessao.close();
        return logins;
    }

    // Salva ou Atualiza o Administrador
    public void salvarAtualizarPerceptron(Perceptron perceptron) {
        Session sessao;
        sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        if (Principal.atualizar) {
            sessao.update(perceptron);
        } else {
            sessao.save(perceptron);
        }
        transacao.commit();
        sessao.close();
    }

    // Lista o Administrador
    public Perceptron recebePerceptron() {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        List<Perceptron> perceptronEncontrado = (List<Perceptron>) sessao.createCriteria(Perceptron.class).add(Restrictions.ne("id", 0)).list();
        sessao.close();
        setPerceptron(perceptronEncontrado.get(0));
        return perceptronEncontrado.get(0);
    }

    public static Perceptron pesquisaUsuario(Perceptron perceptron) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();

        Perceptron logins = (Perceptron) sessao.createCriteria(Perceptron.class).add(Restrictions.eq("login", perceptron.getLogin())).uniqueResult();
        sessao.close();
        return logins;
    }

    public static Perceptron pesquisaSenha(Perceptron perceptron) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();

        Perceptron logins = (Perceptron) sessao.createCriteria(Perceptron.class).add(Restrictions.eq("senha", perceptron.getSenha())).uniqueResult();
        sessao.close();
        return logins;
    }
}

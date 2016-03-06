package Services.DAL.Impl;

import Model.Aluno;
import Services.DAL.AlunoDAL;
import org.apache.log4j.Logger;

import javax.ejb.Stateless;

/**
 * Created by ramon on 06/03/16.
 */

@Stateless
public class AlunoDalImpl extends BaseDAL implements AlunoDAL {
    private final Logger logger = Logger.getLogger(AlunoDalImpl.class);

    public boolean inserirAluno(Aluno aluno) {

        try {
            logger.debug("Passando por Implementação DAL de aluno");
            getManager().getTransaction().begin();
            getManager().persist(aluno);
            getManager().getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


}

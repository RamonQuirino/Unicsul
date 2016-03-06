package Services.Impl;

import Services.AlunoService;
import Services.DAL.AlunoDAL;

import javax.ejb.EJB;

/**
 * Created by ramon on 06/03/2016.
 */

public class AlunoServiceImpl implements AlunoService {

    @EJB
    private AlunoDAL alunoDAL;

    public Model.Aluno getAluno(Integer idAluno) {
        return null;
    }

    public boolean inserirAluno(Model.Aluno aluno) {
        if (alunoDAL != null) {
            return alunoDAL.inserirAluno(aluno);
        }
        return false;
    }
}

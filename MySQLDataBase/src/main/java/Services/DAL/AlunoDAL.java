package Services.DAL;

import Model.Aluno;

import javax.ejb.Local;

/**
 * Created by ramon on 06/03/16.
 */

@Local
public interface AlunoDAL {
    boolean inserirAluno(Aluno aluno);
}

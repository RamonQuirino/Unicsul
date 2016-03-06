package database;

import Model.Aluno;
import Services.AlunoService;
import Services.DAL.Impl.AlunoDalImpl;
import Services.Impl.AlunoServiceImpl;
import org.apache.log4j.Logger;
import org.junit.Test;


/**
 * Created by ramon on 06/03/2016.
 */
public class TesteBanco {
    private final Logger logger = Logger.getLogger(AlunoDalImpl.class);

    @Test
    public void testConnection() {


        logger.debug("Iniciando metodo de Teste");
        Aluno aluno = new Aluno();
        aluno.setNome("Ramon QUirino");
        AlunoService alunoService = new AlunoServiceImpl();

        alunoService.inserirAluno(aluno);
    }
}

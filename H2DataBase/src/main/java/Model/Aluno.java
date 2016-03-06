package Model;

import javax.persistence.*;

/**
 * Created by ramon on 06/03/2016.
 */

@Entity
@Table(name="TB_ALUNO")
public class Aluno {

    @Id
    @GeneratedValue
    @Column(name = "ID_ALUNO")
    private Integer AlunoID;

    @Column(name = "NOME_ALUNO")
    private String Nome;

    public Integer getAlunoID() {
        return AlunoID;
    }

    public void setAlunoID(Integer alunoID) {
        AlunoID = alunoID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }


}


package Telas;

import java.io.Serializable;
import java.util.List;

public class Relatorio implements Serializable {
    public static void gerarRelatorio(List<CadastroInstituicaoTela> Instituicoes) {
        System.out.println("Relatório:");
      
        for (CadastroInstituicaoTela Instituicao : Instituicoes) {
            System.out.println("Escola: " + Instituicao.jtfNome.getText());
            System.out.println("Endereco: " + Instituicao.jtfEndereco.getText());
            System.out.println("Id: " + Instituicao.jtfIdInstituicao.getText());
            System.out.println("Ano de fundacao: " + Instituicao.jtfAnoFundacao.getText());
            System.out.println("-----------------------");
        }
    }
      public static void gerarRelatorio2(List<CadastroDiretorTela> Diretores) {
        System.out.println("Relatório:");
        
        for (CadastroDiretorTela Diretor : Diretores) {
            System.out.println("Diretor: " + Diretor.getNome());
            System.out.println("Id do diretor: " + Diretor.getID());
            System.out.println("Data de contratacao: " + Diretor.getDataContratacao());
            System.out.println("-----------------------");
        }
         
    }
      public static void gerarRelatorio3(List<CadastroProfessorTela> Professores) {
        System.out.println("Relatório:");
        
        for (CadastroProfessorTela Professor : Professores) {
            System.out.println("Professor: " + Professor.getNome());
            System.out.println("Id do professor: " + Professor.getID());
            System.out.println("Data de contratacao: " + Professor.getDataContratacao());
            System.out.println("Disciplina: " + Professor.getDisciplina());
            System.out.println("-----------------------");
        }
      }
      
      static void gerarRelatorio4(List<CadastroAlunoTela> Alunos) {
        System.out.println("Relatório:");
        
        for (CadastroAlunoTela Aluno : Alunos) {
            System.out.println("Aluno: " + Aluno.getNome());
            System.out.println("Matricula: " + Aluno.getMatricula());
            System.out.println("Serie: " + Aluno.getSerie());
            System.out.println("Data de inscricao: " + Aluno.getDataInscricao());
            System.out.println("-----------------------");
        }
      }

     public static void gerarRelatorio5(List<CadastroCursoTela> Cursos) {
        System.out.println("Relatório:");
        
        for (CadastroCursoTela Curso : Cursos) {
            System.out.println("Curso: " + Curso.getNome());
            System.out.println("Codigo: " + Curso.getID());
            System.out.println("Descricao: " + Curso.getDescricao());
            System.out.println("Ano de inicio: " + Curso.getDataInicio());
            System.out.println("-----------------------");
        }
      }
}
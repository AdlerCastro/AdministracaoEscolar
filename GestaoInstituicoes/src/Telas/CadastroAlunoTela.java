package Telas;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroAlunoTela extends FormPadrao{
  
    //Títulos
    JLabel jlNomeAluno;
    JLabel jlMatricula;
    JLabel jlSerie;
    JLabel jlDataInscricao;
    
    //Caixas de texto
    JTextField jtfNomeAluno;
    JTextField jtfMatricula;
    JTextField jtfSerie;
    JTextField jtfDataInscricao;
    
    private String Nome;
    private String Matricula;
    private String Serie;
    private String DataInscricao;

    public String getNome() {
        return Nome;
    }

    public String getMatricula() {
        return Matricula;
    }

    public String getSerie() {
        return Serie;
    }

    public String getDataInscricao() {
        return DataInscricao;
    }
    
    
    
     public CadastroAlunoTela(){
        setTitle("Cadastro de Aluno");
    }

    @Override
    public void InicializarComponentes() {
        //Nome
        jlNomeAluno = new JLabel("Nome:");
        jlNomeAluno.setBounds(40, 80, 40, 25);
        jpnFormulario.add(jlNomeAluno);
        
        jtfNomeAluno = new JTextField();
        jtfNomeAluno.setBounds(120, 80, 300, 25);
        jpnFormulario.add(jtfNomeAluno);
        
        //Matricula
        jlMatricula = new JLabel("Matrícula:");
        jlMatricula.setBounds(30, 110, 70, 25);
        jpnFormulario.add(jlMatricula);
        
        jtfMatricula = new JTextField();
        jtfMatricula.setBounds(120, 110, 70, 25);
        jpnFormulario.add(jtfMatricula);
        
        //Série
        jlSerie = new JLabel("Série:");
        jlSerie.setBounds(40, 140, 40, 25);
        jpnFormulario.add(jlSerie);
        
        jtfSerie = new JTextField();
        jtfSerie.setBounds(120, 140, 70, 25);
        jpnFormulario.add(jtfSerie);
        
        //Data de Inscricao
        jlDataInscricao = new JLabel("Data de Inscricao:");
        jlDataInscricao.setBounds(10, 170, 140, 25);
        jpnFormulario.add(jlDataInscricao);
        
        jtfDataInscricao = new JTextField();
        jtfDataInscricao.setBounds(120, 170, 100, 25);
        jpnFormulario.add(jtfDataInscricao);
    }

    @Override
    public void salvarDadosInstituicao() {
        this.Nome = jtfNomeAluno.getText();
        this.Matricula = jtfMatricula.getText();
        this.Serie = jtfSerie.getText();
        this.DataInscricao = jtfDataInscricao.getText();
        
        System.out.println(" Nome: " + this.Nome + " Data de Inscrição: " +this.DataInscricao + " Série: " + this.Serie + " Matricula: " + this.Matricula);
    }

    @Override
    public void limparCampos() {
        
    }

}

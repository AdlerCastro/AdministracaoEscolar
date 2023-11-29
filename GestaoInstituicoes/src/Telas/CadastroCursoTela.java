package Telas;

import javax.swing.JLabel;
import javax.swing.JTextField;

class CadastroCursoTela extends FormPadrao{

    //Títulos
    JLabel jlNomeCurso;
    JLabel jlID;
    JLabel jlDescricao;
    JLabel jlDataInicio;
    
    //Caixas de texto
    JTextField jtfNomeCurso;
    JTextField jtfID;
    JTextField jtfDescricao;
    JTextField jtfDataInicio;
    
    private String Nome;
    private String ID;
    private String Descricao;
    private String DataInicio;

    public String getNome() {
        return Nome;
    }

    public String getID() {
        return ID;
    }

    public String getDescricao() {
        return Descricao;
    }

    public String getDataInicio() {
        return DataInicio;
    }
    
    
    
    @Override
    public void InicializarComponentes() {
        //Nome
        jlNomeCurso = new JLabel("Nome:");
        jlNomeCurso.setBounds(40, 80, 40, 25);
        jpnFormulario.add(jlNomeCurso);
        
        jtfNomeCurso = new JTextField();
        jtfNomeCurso.setBounds(120, 80, 300, 25);
        jpnFormulario.add(jtfNomeCurso);
        
        //Matricula
        jlID = new JLabel("Matrícula:");
        jlID.setBounds(30, 110, 70, 25);
        jpnFormulario.add(jlID);
        
        jtfID = new JTextField();
        jtfID.setBounds(120, 110, 70, 25);
        jpnFormulario.add(jtfID);
        
        //Série
        jlDescricao = new JLabel("Série:");
        jlDescricao.setBounds(40, 140, 40, 25);
        jpnFormulario.add(jlDescricao);
        
        jtfDescricao = new JTextField();
        jtfDescricao.setBounds(120, 140, 70, 25);
        jpnFormulario.add(jtfDescricao);
        
        //Data de Inscricao
        jlDataInicio = new JLabel("Data de Inscricao:");
        jlDataInicio.setBounds(10, 170, 140, 25);
        jpnFormulario.add(jlDataInicio);
        
        jtfDataInicio = new JTextField();
        jtfDataInicio.setBounds(120, 170, 100, 25);
        jpnFormulario.add(jtfDataInicio);
    }

    @Override
    public void salvarDadosInstituicao() {
        
    }

    @Override
    public void limparCampos() {
        this.Nome = jtfNomeCurso.getText();
        this.ID = jtfID.getText();
        this.Descricao = jtfDescricao.getText();
        this.DataInicio = jtfDataInicio.getText();
        
        System.out.println(" Nome: " + this.Nome + " Data de Criação: " +this.DataInicio + " Descrição: " + this.Descricao + " Id: " + this.ID);
    } 
    
}

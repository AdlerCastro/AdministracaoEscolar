package Telas;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroDiretorTela extends FormPadrao{
    
    //Títulos
    JLabel jlNomeDiretor;
    JLabel jlDataContratacao;
    JLabel jlIdDiretor;
    
    //Caixas de texto
    JTextField jtfNomeDiretor;
    JTextField jtfDataContratacao;
    JTextField jtfIdDiretor;
    
    private String Nome;
    private String DataContratacao;
    private String ID;

    public String getNome() {
        return Nome;
    }

    public String getDataContratacao() {
        return DataContratacao;
    }

    public String getID() {
        return ID;
    }
    
    public CadastroDiretorTela(){
        setTitle("Cadastro de Diretor");
    }

    @Override
    public void InicializarComponentes() {
        //Nome
        jlNomeDiretor = new JLabel("Nome:");
        jlNomeDiretor.setBounds(50, 80, 40, 25);
        jpnFormulario.add(jlNomeDiretor);
        
        jtfNomeDiretor = new JTextField();
        jtfNomeDiretor.setBounds(135, 80, 300, 25);
        jpnFormulario.add(jtfNomeDiretor);
        
        //Data de Contratação
        jlDataContratacao = new JLabel("Data de Contratação:");
        jlDataContratacao.setBounds(10, 110, 120, 25);
        jpnFormulario.add(jlDataContratacao);
        
        jtfDataContratacao = new JTextField();
        jtfDataContratacao.setBounds(135, 110, 100, 25);
        jpnFormulario.add(jtfDataContratacao);
        
        //Id Diretor
        jlIdDiretor = new JLabel("ID:");
        jlIdDiretor.setBounds(60, 140, 40, 25);
        jpnFormulario.add(jlIdDiretor);
        
        jtfIdDiretor = new JTextField();
        jtfIdDiretor.setBounds(135, 140, 100, 25);
        jpnFormulario.add(jtfIdDiretor);
    }

    @Override
    public void salvarDadosInstituicao() {
        this.Nome = jtfNomeDiretor.getText();
        this.DataContratacao  = jtfDataContratacao.getText();
        this.ID = jtfIdDiretor.getText();
        
        System.out.println(" Nome: " + this.Nome + " Ano Contratção: " +this.DataContratacao + " Id: " + this.ID);
    }

    @Override
    public void limparCampos() {
        
    }

  
}

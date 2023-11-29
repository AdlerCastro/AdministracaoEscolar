package Telas;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroInstituicaoTela extends FormPadrao implements Serializable {
    //Títulos
    JLabel jlNome;
    JLabel jlAnoFundacao;
    JLabel jlEndereco;
    JLabel jlIdInstituicao;
    
    //Caixas de texto
    JTextField jtfNome;
    JTextField jtfAnoFundacao;
    JTextField jtfEndereco;
    JTextField jtfIdInstituicao;
    
    private String Nome;
    private String AnoFundacao;
    private String Endereco;
    private String IdInstituicao;
    
    public CadastroInstituicaoTela(){
        setTitle("Cadastro de Instituições");
    }

    public String getNome() {
        return this.Nome;
    }

    public String getAnoFundacao() {
        return this.AnoFundacao;
    }

    public String getEndereco() {
        return this.Endereco;
    }

    public String getIdInstituicao() {
        return this.IdInstituicao;
    }

    @Override
    public void InicializarComponentes() {
        
        //Nome
        jlNome = new JLabel("Nome:");
        jlNome.setBounds(30, 80, 40, 25);
        jpnFormulario.add(jlNome);
        
        jtfNome = new JTextField();
        jtfNome.setBounds(115, 80, 300, 25);
        jpnFormulario.add(jtfNome);
        
        //Ano de Fundação
        jlAnoFundacao = new JLabel("Ano de Fundação:");
        jlAnoFundacao.setBounds(10, 110, 100, 25);
        jpnFormulario.add(jlAnoFundacao);
        
        jtfAnoFundacao = new JTextField();
        jtfAnoFundacao.setBounds(115, 110, 300, 25);
        jpnFormulario.add(jtfAnoFundacao);
        
        //Id Instituição
        jlIdInstituicao = new JLabel("ID:");
        jlIdInstituicao.setBounds(40, 140, 40, 25);
        jpnFormulario.add(jlIdInstituicao);
        
        jtfIdInstituicao = new JTextField();
        jtfIdInstituicao.setBounds(115, 140, 100, 25);
        jpnFormulario.add(jtfIdInstituicao);
        
        //Endereço da Instituição
        jlEndereco = new JLabel("Endereço:");
        jlEndereco.setBounds(20, 170, 70, 25);
        jpnFormulario.add(jlEndereco);
        
        jtfEndereco = new JTextField();
        jtfEndereco.setBounds(115, 170, 300, 25);
        jpnFormulario.add(jtfEndereco);
    }
    
    
    
    @Override
    public void salvarDadosInstituicao() {
        
        this.Nome = jtfNome.getText();
        this.AnoFundacao  = jtfAnoFundacao.getText();
        this.Endereco = jtfEndereco.getText();
        this.IdInstituicao = jtfIdInstituicao.getText();
        
        System.out.println("Nome: " + this.Nome + " Ano Fundação: " +this.AnoFundacao + " Endereço: " + this.Endereco + " Id: " + this.IdInstituicao);
    }

    @Override
    public void limparCampos() {


    }
}

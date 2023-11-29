package Telas;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroInstituicaoTela extends FormPadrao {
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
    
    public CadastroInstituicaoTela(){
        setTitle("Cadastro de Instituições");
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
}

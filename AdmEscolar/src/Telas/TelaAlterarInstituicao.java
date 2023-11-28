package Telas;

import Controle.AlterarInstituicaoControle;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaAlterarInstituicao extends FormPadrao{
        //Nome
        JLabel jlNomeInstituicao;
        JTextField jtfNomeInstituicao;
        
        //Id
        JLabel jlIdInstituicao;
        JTextField jtfIdInstituicao;
        
    public TelaAlterarInstituicao(){
        setTitle("Gerenciamento de Instituições");
    }

    @Override
    public void inicializarComponentes() {
        //Nome
        jlNomeInstituicao = new JLabel("Nome:");
        jlNomeInstituicao.setBounds(9, 10, 50, 25);
        jpnFormulario.add(jlNomeInstituicao);
        
        jtfNomeInstituicao = new JTextField();
        jtfNomeInstituicao.setBounds(50,10,300,25);
        jpnFormulario.add(jtfNomeInstituicao);
        
        //Id
        jlIdInstituicao = new JLabel("Identificação:");
        jlIdInstituicao.setBounds(9, 40, 100, 25);
        jpnFormulario.add(jlIdInstituicao);
        
        jtfIdInstituicao = new JTextField();
        jtfIdInstituicao.setBounds(90,40,300,25);
        jpnFormulario.add(jtfIdInstituicao);
    }
    
    //Instancia de Controle
    AlterarInstituicaoControle AIC = new AlterarInstituicaoControle();

    @Override
    public void salvarTela() {
        AIC.salvarControle(jtfNomeInstituicao.getText(), jtfIdInstituicao.getText());
    }
}

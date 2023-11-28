package Telas;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaAlterarInstituicao extends FormPadrao{
        JLabel jlNomeInstituicao;
        JTextField jtfNomeInstituicao;
        
    public TelaAlterarInstituicao(){
        setTitle("Gerenciamento de Instituições");
    }

    @Override
    public void inicializarComponentes() {
        jlNomeInstituicao = new JLabel("Nome:");
        jlNomeInstituicao.setBounds(9, 10, 50, 25);
        jpnFormulario.add(jlNomeInstituicao);
        
        jtfNomeInstituicao = new JTextField();
        jtfNomeInstituicao.setBounds(50,10,300,25);
        jpnFormulario.add(jtfNomeInstituicao);
        
        
    }
    
    //Instancia de Controle
    AlterarInstituicaoControle AIC = new AlterarInstituicaoControle();

    @Override
    public void salvarVisao() {
        AIC.salvarControle();
    }
}

package Telas;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroProfessorTela extends FormPadrao {
    
    //Títulos
    JLabel jlNomeProf;
    JLabel jlIdProfessor;
    JLabel jlDisciplina;
    JLabel jlDataContratacao;
    
    //Caixas de texto
    JTextField jtfNomeProf;
    JTextField jtfIdProfessor;
    JTextField jtfDisciplina;
    JTextField jtfDataContratacao;
    
    public CadastroProfessorTela(){
        setTitle("Cadastro de Professor");
    }

    @Override
    public void InicializarComponentes() {
        //Nome
        jlNomeProf = new JLabel("Nome:");
        jlNomeProf.setBounds(50, 80, 40, 25);
        jpnFormulario.add(jlNomeProf);
        
        jtfNomeProf = new JTextField();
        jtfNomeProf.setBounds(135, 80, 300, 25);
        jpnFormulario.add(jtfNomeProf);
        
        //Id Professor
        jlIdProfessor = new JLabel("Id:");
        jlIdProfessor.setBounds(60, 110, 100, 25);
        jpnFormulario.add(jlIdProfessor);
        
        jtfIdProfessor = new JTextField();
        jtfIdProfessor.setBounds(135, 110, 70, 25);
        jpnFormulario.add(jtfIdProfessor);
        
        //Disciplina
        jlDisciplina = new JLabel("Disciplina:");
        jlDisciplina.setBounds(40, 140, 100, 25);
        jpnFormulario.add(jlDisciplina);
        
        jtfDisciplina = new JTextField();
        jtfDisciplina.setBounds(135, 140, 100, 25);
        jpnFormulario.add(jtfDisciplina);
        
        //Data de Contratação
        jlDataContratacao = new JLabel("Data de Contratação:");
        jlDataContratacao.setBounds(10, 170, 120, 25);
        jpnFormulario.add(jlDataContratacao);
        
        jtfDataContratacao = new JTextField();
        jtfDataContratacao.setBounds(135, 170, 100, 25);
        jpnFormulario.add(jtfDataContratacao);
    }
}

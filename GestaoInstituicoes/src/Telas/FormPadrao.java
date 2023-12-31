/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Telas;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.*;

abstract public class FormPadrao extends javax.swing.JInternalFrame {

    private List<CadastroInstituicaoTela> Instituicoes = new ArrayList();
    private List<CadastroDiretorTela> Diretores = new ArrayList();
    private List<CadastroProfessorTela> Professores = new ArrayList();
    private List<CadastroAlunoTela> Alunos = new ArrayList();
    private List<CadastroCursoTela> Cursos = new ArrayList();
    private static final String FILE_NAME = "escolas.ser";
    private static final String FILE_NAME2 = "diretores.ser";
    private static final String FILE_NAME3 = "professores.ser";
    private static final String FILE_NAME4 = "alunos.ser";
    private static final String FILE_NAME5 = "cursos.ser";
    
    //Métodos abstratos da subclasse
    abstract public void InicializarComponentes();
    abstract public void salvarDadosInstituicao();
    abstract public void limparCampos();
    
    //Criando aspectos do Java Swing por Codificação
    JLabel jlConsulta;
    JTextField jtfConsulta;
    
    //Construtor
    public FormPadrao() {
        
        initComponents();
        HabilitarBotoes(true);
        
        //Inicializar componentes das subclasses
        InicializarComponentes();
        
        jtfIDBD.setEnabled(false);
        jtfDescricao.setEnabled(false);
        HabilitarCampos(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBotoes = new javax.swing.JPanel();
        jbNovo = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jpnFormulario = new javax.swing.JPanel();
        jlIDBD = new javax.swing.JLabel();
        jtfIDBD = new javax.swing.JTextField();
        jlDescricao = new javax.swing.JLabel();
        jtfDescricao = new javax.swing.JTextField();
        jpnConsulta = new javax.swing.JPanel();
        jbRelatorioInstituicao = new javax.swing.JButton();
        jbRelatorioDiretores = new javax.swing.JButton();
        jbRelatorioProfessores = new javax.swing.JButton();
        jbRelatorioAlunos = new javax.swing.JButton();
        jbRelatorioCursos = new javax.swing.JButton();

        setMaximizable(true);
        setTitle("Cadastro");

        jpBotoes.setBackground(new java.awt.Color(255, 255, 153));

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBotoesLayout = new javax.swing.GroupLayout(jpBotoes);
        jpBotoes.setLayout(jpBotoesLayout);
        jpBotoesLayout.setHorizontalGroup(
            jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNovo)
                .addGap(18, 18, 18)
                .addComponent(jbEditar)
                .addGap(18, 18, 18)
                .addComponent(jbExcluir)
                .addGap(51, 51, 51)
                .addComponent(jbSalvar)
                .addGap(18, 18, 18)
                .addComponent(jbCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(jbFechar)
                .addContainerGap())
        );
        jpBotoesLayout.setVerticalGroup(
            jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo)
                    .addComponent(jbEditar)
                    .addComponent(jbExcluir)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar)
                    .addComponent(jbFechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnFormulario.setBackground(new java.awt.Color(255, 255, 153));

        jlIDBD.setText("ID no Banco de Dados");

        jtfIDBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIDBDActionPerformed(evt);
            }
        });

        jlDescricao.setText("Descrição");

        javax.swing.GroupLayout jpnFormularioLayout = new javax.swing.GroupLayout(jpnFormulario);
        jpnFormulario.setLayout(jpnFormularioLayout);
        jpnFormularioLayout.setHorizontalGroup(
            jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlIDBD)
                    .addGroup(jpnFormularioLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jtfIDBD, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82)
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnFormularioLayout.setVerticalGroup(
            jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIDBD)
                    .addComponent(jlDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfIDBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        jpnConsulta.setBackground(new java.awt.Color(255, 255, 153));

        jbRelatorioInstituicao.setText("Relatório Instituicao");
        jbRelatorioInstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRelatorioInstituicaoActionPerformed(evt);
            }
        });

        jbRelatorioDiretores.setText("Relatório Diretores");
        jbRelatorioDiretores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRelatorioDiretoresActionPerformed(evt);
            }
        });

        jbRelatorioProfessores.setText("Relatório Professores");
        jbRelatorioProfessores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRelatorioProfessoresActionPerformed(evt);
            }
        });

        jbRelatorioAlunos.setText("Relatório Alunos");
        jbRelatorioAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRelatorioAlunosActionPerformed(evt);
            }
        });

        jbRelatorioCursos.setText("Relatório Cursos");
        jbRelatorioCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRelatorioCursosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnConsultaLayout = new javax.swing.GroupLayout(jpnConsulta);
        jpnConsulta.setLayout(jpnConsultaLayout);
        jpnConsultaLayout.setHorizontalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnConsultaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbRelatorioInstituicao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbRelatorioDiretores, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbRelatorioProfessores, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbRelatorioAlunos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbRelatorioCursos, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jpnConsultaLayout.setVerticalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbRelatorioInstituicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbRelatorioDiretores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbRelatorioProfessores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbRelatorioAlunos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbRelatorioCursos)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        HabilitarBotoes(false);
        HabilitarCampos(true);
        //Focar na caixa de texto ao pressionar
        jtfDescricao.requestFocus();
        limparCampos();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        HabilitarBotoes(false);
        HabilitarCampos(true);
        jtfDescricao.requestFocus();
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        HabilitarBotoes(false);
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        HabilitarBotoes(true);
        HabilitarCampos(false);
        salvarDadosInstituicao();
        
        
        limparCampos();
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        HabilitarBotoes(true);
        HabilitarCampos(false);
        limparCampos();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtfIDBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIDBDActionPerformed
        
    }//GEN-LAST:event_jtfIDBDActionPerformed

    private void jbRelatorioInstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRelatorioInstituicaoActionPerformed
        Relatorio.gerarRelatorio(Instituicoes);
        
    }//GEN-LAST:event_jbRelatorioInstituicaoActionPerformed

    private void jbRelatorioDiretoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRelatorioDiretoresActionPerformed
        Relatorio.gerarRelatorio2(Diretores);
    }//GEN-LAST:event_jbRelatorioDiretoresActionPerformed

    private void jbRelatorioProfessoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRelatorioProfessoresActionPerformed
        Relatorio.gerarRelatorio3(Professores);
    }//GEN-LAST:event_jbRelatorioProfessoresActionPerformed

    private void jbRelatorioAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRelatorioAlunosActionPerformed
        Relatorio.gerarRelatorio4(Alunos);
    }//GEN-LAST:event_jbRelatorioAlunosActionPerformed

    private void jbRelatorioCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRelatorioCursosActionPerformed
        Relatorio.gerarRelatorio5(Cursos);
    }//GEN-LAST:event_jbRelatorioCursosActionPerformed
    
    //Metodo para habilitar os botoes
    public void HabilitarBotoes(boolean Status){
        jbNovo.setEnabled(Status);
        jbEditar.setEnabled(Status);
        jbExcluir.setEnabled(Status);
        
        jbSalvar.setEnabled(!Status);
        jbCancelar.setEnabled(!Status);
}
    
    //Metodo para Habilitar os campos de edição
    public void HabilitarCampos(boolean Status){
        jtfDescricao.setEnabled(Status);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbCancelar;
    public javax.swing.JButton jbEditar;
    public javax.swing.JButton jbExcluir;
    public javax.swing.JButton jbFechar;
    public javax.swing.JButton jbNovo;
    public javax.swing.JButton jbRelatorioAlunos;
    public javax.swing.JButton jbRelatorioCursos;
    public javax.swing.JButton jbRelatorioDiretores;
    public javax.swing.JButton jbRelatorioInstituicao;
    public javax.swing.JButton jbRelatorioProfessores;
    public javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlIDBD;
    private javax.swing.JPanel jpBotoes;
    public javax.swing.JPanel jpnConsulta;
    public javax.swing.JPanel jpnFormulario;
    public javax.swing.JTextField jtfDescricao;
    public javax.swing.JTextField jtfIDBD;
    // End of variables declaration//GEN-END:variables

}

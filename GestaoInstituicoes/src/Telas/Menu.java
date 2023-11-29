package Telas;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmbCadastro = new javax.swing.JMenu();
        jmInstituicao = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmPessoas = new javax.swing.JMenu();
        jmiDiretor = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmiProfessor = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jmiAluno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Instituições");
        setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jmbCadastro.setText("Cadastro");

        jmInstituicao.setText("Instituição");
        jmInstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmInstituicaoActionPerformed(evt);
            }
        });
        jmbCadastro.add(jmInstituicao);
        jmbCadastro.add(jSeparator1);

        jmPessoas.setText("Pessoas");

        jmiDiretor.setText("Diretor");
        jmiDiretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDiretorActionPerformed(evt);
            }
        });
        jmPessoas.add(jmiDiretor);
        jmPessoas.add(jSeparator2);

        jmiProfessor.setText("Professor");
        jmiProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProfessorActionPerformed(evt);
            }
        });
        jmPessoas.add(jmiProfessor);
        jmPessoas.add(jSeparator3);

        jmiAluno.setText("Aluno");
        jmiAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlunoActionPerformed(evt);
            }
        });
        jmPessoas.add(jmiAluno);

        jmbCadastro.add(jmPessoas);

        jMenuBar1.add(jmbCadastro);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmInstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmInstituicaoActionPerformed
        CadastroInstituicaoTela telaInstituicoes = new CadastroInstituicaoTela();
        jDesktop.add(telaInstituicoes);
        telaInstituicoes.setVisible(true);
    }//GEN-LAST:event_jmInstituicaoActionPerformed

    private void jmiDiretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDiretorActionPerformed
        CadastroDiretorTela telaDiretor = new CadastroDiretorTela();
        jDesktop.add(telaDiretor);
        telaDiretor.setVisible(true);
    }//GEN-LAST:event_jmiDiretorActionPerformed

    private void jmiProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProfessorActionPerformed
        CadastroProfessorTela telaProfessor = new CadastroProfessorTela();
        jDesktop.add(telaProfessor);
        telaProfessor.setVisible(true);
    }//GEN-LAST:event_jmiProfessorActionPerformed

    private void jmiAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlunoActionPerformed
        CadastroAlunoTela telaAluno = new CadastroAlunoTela();
        jDesktop.add(telaAluno);
        telaAluno.setVisible(true);
    }//GEN-LAST:event_jmiAlunoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem jmInstituicao;
    private javax.swing.JMenu jmPessoas;
    private javax.swing.JMenu jmbCadastro;
    private javax.swing.JMenuItem jmiAluno;
    private javax.swing.JMenuItem jmiDiretor;
    private javax.swing.JMenuItem jmiProfessor;
    // End of variables declaration//GEN-END:variables
}

package Telas;

import javax.swing.JFrame;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktop = new javax.swing.JDesktopPane();
        jmbBarraMenu = new javax.swing.JMenuBar();
        jmInstituicoes = new javax.swing.JMenu();
        jmiRelatório = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jmiAlterarInstituicao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administração Escolar");
        setResizable(false);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        jmInstituicoes.setMnemonic('I');
        jmInstituicoes.setText("Instituições");

        jmiRelatório.setText("Gerar Relatório");
        jmiRelatório.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRelatórioActionPerformed(evt);
            }
        });
        jmInstituicoes.add(jmiRelatório);
        jmInstituicoes.add(jSeparator4);

        jmiAlterarInstituicao.setText("Alterar Instituição");
        jmiAlterarInstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlterarInstituicaoActionPerformed(evt);
            }
        });
        jmInstituicoes.add(jmiAlterarInstituicao);

        jmbBarraMenu.add(jmInstituicoes);

        setJMenuBar(jmbBarraMenu);

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

        setSize(new java.awt.Dimension(816, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiRelatórioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRelatórioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiRelatórioActionPerformed

    private void jmiAlterarInstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlterarInstituicaoActionPerformed
        TelaAlterarInstituicao novaInstituicao = new TelaAlterarInstituicao();
        jDesktop.add(novaInstituicao);
        novaInstituicao.setVisible(true);
    }//GEN-LAST:event_jmiAlterarInstituicaoActionPerformed

     public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenu jmInstituicoes;
    private javax.swing.JMenuBar jmbBarraMenu;
    private javax.swing.JMenuItem jmiAlterarInstituicao;
    private javax.swing.JMenuItem jmiRelatório;
    // End of variables declaration//GEN-END:variables
}

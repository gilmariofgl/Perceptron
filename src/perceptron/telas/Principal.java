package perceptron.telas;

import java.awt.Toolkit;
import java.util.Random;

/**
 * @author Francisco Gilmário de Lima
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Perceptron
     */
    public Principal() {
        initComponents();
        randomizar();
        icone();
        painel.setVisible(false);
        rotuloAbrir.setVisible(false);
        rotuloSalvar.setVisible(false);
        rotuloNovo.setVisible(false);
        rotuloErro.setVisible(false);
    }
    public double w0, w1, w2, w3, y, v1 = 0, v2 = 0, v3 = 0;
    public int x1, x2, x3;
    public boolean ver;
    public static boolean atualizar;

    public void randomizar() {
        Random random = new Random();

        w0 = random.nextDouble() / 10;
        w1 = random.nextDouble() / 10;
        w2 = random.nextDouble() / 10;
        w3 = random.nextDouble() / 10;
    }

    public void erro(double valorY) {
        // n = taxa de aprendizado
        double n = 0.05;

        if (valorY >= 1) {
            w0 = w0 + (n * (0 - valorY) * (-1));
            w1 = w1 + (n * (0 - valorY) * (x1));
            w2 = w2 + (n * (0 - valorY) * x2);
            w3 = w3 + (n * (0 - valorY) * x3);

        } else {
            w0 = w0 + (n * (1 - valorY) * (-1));
            w1 = w1 + (n * (1 - valorY) * (x1));
            w2 = w2 + (n * (1 - valorY) * x2);
            w3 = w3 + (n * (1 - valorY) * x3);

        }
        informacoes();

    }

    public void informacoes() {
        valorW0.setText("W0 " + String.valueOf(w0));
        valorW1.setText("W1 " + String.valueOf(w1));
        valorW2.setText("W2 " + String.valueOf(w2));
        valorW3.setText("W3 " + String.valueOf(w3));

        somaW0.setText("S0 " + (-1 * w0));
        somaW1.setText("S1 " + v1);
        somaW2.setText("S2 " + v2);
        somaW3.setText("S3 " + v3);

        valorY.setText("Y " + y);

    }

    private void icone() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/perceptron/imagens/icone32.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo = new javax.swing.JPanel();
        soma = new javax.swing.JLabel();
        nomeclaturaX1 = new javax.swing.JTextField();
        entradaX1 = new javax.swing.JTextField();
        nomeclaturaX2 = new javax.swing.JTextField();
        entradaX2 = new javax.swing.JTextField();
        nomeclaturaX3 = new javax.swing.JTextField();
        entradaX3 = new javax.swing.JTextField();
        nomeclaturaY0 = new javax.swing.JTextField();
        nomeclaturaY1 = new javax.swing.JTextField();
        saidaNomeclatura = new javax.swing.JTextField();
        imagemPerceptron = new javax.swing.JLabel();
        rotuloErro = new javax.swing.JLabel();
        erro = new javax.swing.JLabel();
        rotuloSalvar = new javax.swing.JLabel();
        salvar = new javax.swing.JLabel();
        rotuloNovo = new javax.swing.JLabel();
        novo = new javax.swing.JLabel();
        rotuloAbrir = new javax.swing.JLabel();
        abrir = new javax.swing.JLabel();
        visualizar = new javax.swing.JLabel();
        painel = new javax.swing.JPanel();
        valorY = new javax.swing.JLabel();
        valorW0 = new javax.swing.JLabel();
        valorW1 = new javax.swing.JLabel();
        valorW2 = new javax.swing.JLabel();
        valorW3 = new javax.swing.JLabel();
        somaW0 = new javax.swing.JLabel();
        somaW1 = new javax.swing.JLabel();
        somaW2 = new javax.swing.JLabel();
        somaW3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PERCEPTRON");
        setResizable(false);

        fundo.setBackground(new java.awt.Color(255, 255, 255));
        fundo.setLayout(null);

        soma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                somaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                somaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                somaMouseReleased(evt);
            }
        });
        fundo.add(soma);
        soma.setBounds(140, 50, 410, 160);

        nomeclaturaX1.setBorder(null);
        fundo.add(nomeclaturaX1);
        nomeclaturaX1.setBounds(40, 9, 90, 20);

        entradaX1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        entradaX1.setBorder(null);
        fundo.add(entradaX1);
        entradaX1.setBounds(20, 38, 80, 30);

        nomeclaturaX2.setBorder(null);
        fundo.add(nomeclaturaX2);
        nomeclaturaX2.setBounds(40, 80, 90, 20);

        entradaX2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        entradaX2.setBorder(null);
        fundo.add(entradaX2);
        entradaX2.setBounds(20, 110, 80, 30);

        nomeclaturaX3.setBorder(null);
        fundo.add(nomeclaturaX3);
        nomeclaturaX3.setBounds(40, 152, 90, 20);

        entradaX3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        entradaX3.setBorder(null);
        fundo.add(entradaX3);
        entradaX3.setBounds(20, 182, 80, 30);

        nomeclaturaY0.setBorder(null);
        fundo.add(nomeclaturaY0);
        nomeclaturaY0.setBounds(590, 56, 160, 20);

        nomeclaturaY1.setBorder(null);
        fundo.add(nomeclaturaY1);
        nomeclaturaY1.setBounds(590, 82, 160, 20);

        saidaNomeclatura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        saidaNomeclatura.setBorder(null);
        saidaNomeclatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saidaNomeclaturaActionPerformed(evt);
            }
        });
        fundo.add(saidaNomeclatura);
        saidaNomeclatura.setBounds(560, 110, 190, 30);

        imagemPerceptron.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perceptron/imagens/perceptronDesativada.png"))); // NOI18N
        fundo.add(imagemPerceptron);
        imagemPerceptron.setBounds(10, 10, 760, 232);

        rotuloErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotuloErro.setText("Erro");
        fundo.add(rotuloErro);
        rotuloErro.setBounds(24, 350, 40, 14);

        erro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perceptron/imagens/erroPequeno.png"))); // NOI18N
        erro.setText("erro");
        erro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                erroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                erroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                erroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                erroMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                erroMouseReleased(evt);
            }
        });
        fundo.add(erro);
        erro.setBounds(20, 300, 50, 50);

        rotuloSalvar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotuloSalvar.setText("Salvar");
        fundo.add(rotuloSalvar);
        rotuloSalvar.setBounds(80, 350, 50, 14);

        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perceptron/imagens/salvarPequeno.png"))); // NOI18N
        salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salvarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salvarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                salvarMouseReleased(evt);
            }
        });
        fundo.add(salvar);
        salvar.setBounds(80, 300, 50, 50);

        rotuloNovo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotuloNovo.setText("Novo");
        fundo.add(rotuloNovo);
        rotuloNovo.setBounds(140, 350, 50, 14);

        novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perceptron/imagens/novoPequeno.png"))); // NOI18N
        novo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                novoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                novoMouseExited(evt);
            }
        });
        fundo.add(novo);
        novo.setBounds(140, 300, 50, 50);

        rotuloAbrir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotuloAbrir.setText("Abrir");
        fundo.add(rotuloAbrir);
        rotuloAbrir.setBounds(203, 350, 40, 14);

        abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perceptron/imagens/abrirPequeno.png"))); // NOI18N
        abrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                abrirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                abrirMouseExited(evt);
            }
        });
        fundo.add(abrir);
        abrir.setBounds(200, 300, 50, 50);

        visualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perceptron/imagens/verNao.png"))); // NOI18N
        visualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visualizarMouseClicked(evt);
            }
        });
        fundo.add(visualizar);
        visualizar.setBounds(440, 300, 60, 50);

        painel.setBackground(new java.awt.Color(250, 250, 255));

        valorY.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        valorW0.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        valorW1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        valorW2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        valorW3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        somaW0.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        somaW1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        somaW2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        somaW3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valorY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addComponent(valorW0, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(somaW0, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addComponent(valorW1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(somaW1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addComponent(valorW2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(somaW2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addComponent(valorW3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(somaW3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valorW0, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(somaW0, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valorW1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(somaW1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valorW2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(somaW2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valorW3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(somaW3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(valorY, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fundo.add(painel);
        painel.setBounds(500, 280, 270, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saidaNomeclaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saidaNomeclaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saidaNomeclaturaActionPerformed

    private void somaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_somaMouseClicked

        if (!entradaX1.getText().equals("")) {
            v1 = (Integer.parseInt(entradaX1.getText())) * w1;
        } else {
            v1 = 0;
        }

        if (!entradaX2.getText().equals("")) {
            v2 = (Integer.parseInt(entradaX2.getText())) * w2;
        } else {
            v2 = 0;
        }

        if (!entradaX3.getText().equals("")) {
            v3 = (Integer.parseInt(entradaX3.getText())) * w3;
        } else {
            v3 = 0;
        }

        y = (-1 * w0) + v1 + v2 + v3;

        if (y >= 1) {
            saidaNomeclatura.setText(nomeclaturaY1.getText());
        } else {
            saidaNomeclatura.setText(nomeclaturaY0.getText());
        }

        informacoes();

    }//GEN-LAST:event_somaMouseClicked

    private void somaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_somaMousePressed
        imagemPerceptron.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perceptron/imagens/perceptronAtivada.png")));
    }//GEN-LAST:event_somaMousePressed

    private void somaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_somaMouseReleased
        imagemPerceptron.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perceptron/imagens/perceptronDesativada.png")));
    }//GEN-LAST:event_somaMouseReleased

    private void erroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_erroMouseClicked
        erro(y);
    }//GEN-LAST:event_erroMouseClicked

    private void salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarMouseClicked

    }//GEN-LAST:event_salvarMouseClicked

    private void visualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visualizarMouseClicked

        if (ver) {
            visualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perceptron/imagens/verNao.png")));

            painel.setVisible(false);

            ver = false;
        } else {
            visualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perceptron/imagens/verSim.png")));

            painel.setVisible(true);

            ver = true;
        }
    }//GEN-LAST:event_visualizarMouseClicked

    private void erroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_erroMouseReleased
        erro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perceptron/imagens/erroPequeno.png")));
    }//GEN-LAST:event_erroMouseReleased

    private void erroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_erroMousePressed
        erro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perceptron/imagens/erroGrande.png")));
    }//GEN-LAST:event_erroMousePressed

    private void salvarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarMousePressed
        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perceptron/imagens/salvarGrande.png")));
    }//GEN-LAST:event_salvarMousePressed

    private void salvarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarMouseReleased
        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perceptron/imagens/salvarPequeno.png")));
    }//GEN-LAST:event_salvarMouseReleased

    private void erroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_erroMouseEntered
        rotuloErro.setVisible(true);
    }//GEN-LAST:event_erroMouseEntered

    private void erroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_erroMouseExited
        rotuloErro.setVisible(false);
    }//GEN-LAST:event_erroMouseExited

    private void salvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarMouseEntered
        rotuloSalvar.setVisible(true);
    }//GEN-LAST:event_salvarMouseEntered

    private void salvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarMouseExited
        rotuloSalvar.setVisible(false);
    }//GEN-LAST:event_salvarMouseExited

    private void novoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoMouseEntered
        rotuloNovo.setVisible(true);
    }//GEN-LAST:event_novoMouseEntered

    private void novoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoMouseExited
        rotuloNovo.setVisible(false);
    }//GEN-LAST:event_novoMouseExited

    private void abrirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirMouseEntered
        rotuloAbrir.setVisible(true);
    }//GEN-LAST:event_abrirMouseEntered

    private void abrirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirMouseExited
        rotuloAbrir.setVisible(false);
    }//GEN-LAST:event_abrirMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abrir;
    private javax.swing.JTextField entradaX1;
    private javax.swing.JTextField entradaX2;
    private javax.swing.JTextField entradaX3;
    private javax.swing.JLabel erro;
    private javax.swing.JPanel fundo;
    private javax.swing.JLabel imagemPerceptron;
    private javax.swing.JTextField nomeclaturaX1;
    private javax.swing.JTextField nomeclaturaX2;
    private javax.swing.JTextField nomeclaturaX3;
    private javax.swing.JTextField nomeclaturaY0;
    private javax.swing.JTextField nomeclaturaY1;
    private javax.swing.JLabel novo;
    private javax.swing.JPanel painel;
    private javax.swing.JLabel rotuloAbrir;
    private javax.swing.JLabel rotuloErro;
    private javax.swing.JLabel rotuloNovo;
    private javax.swing.JLabel rotuloSalvar;
    private javax.swing.JTextField saidaNomeclatura;
    private javax.swing.JLabel salvar;
    private javax.swing.JLabel soma;
    private javax.swing.JLabel somaW0;
    private javax.swing.JLabel somaW1;
    private javax.swing.JLabel somaW2;
    private javax.swing.JLabel somaW3;
    private javax.swing.JLabel valorW0;
    private javax.swing.JLabel valorW1;
    private javax.swing.JLabel valorW2;
    private javax.swing.JLabel valorW3;
    private javax.swing.JLabel valorY;
    private javax.swing.JLabel visualizar;
    // End of variables declaration//GEN-END:variables
}

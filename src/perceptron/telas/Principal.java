package perceptron.telas;

import java.awt.Toolkit;
import java.util.Random;

public final class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        randomizar();
        icone();
        painelVisualizar.setVisible(false);
        rotuloAbrir.setVisible(false);
        rotuloSalvar.setVisible(false);
        rotuloNovo.setVisible(false);
        rotuloErro.setVisible(false);
    }
    public double w0, w1, w2, w3, y, v1 = 0, v2 = 0, v3 = 0;
    public int x1, x2, x3;
    public boolean ver;

    public void randomizar() {
        Random randomizar = new Random();

        w0 = randomizar.nextDouble() / 10;
        w1 = randomizar.nextDouble() / 10;
        w2 = randomizar.nextDouble() / 10;
        w3 = randomizar.nextDouble() / 10;
    }

    // Muda o valor do peso caso tenha errado
    public void erro(double valorY) {
        // n = taxa de aprendizado
        double n = 0.05;
        // Fórmula: w = w + n (y - y) * x
        // peso = peso + taxa de aprendizado + (saida esperada - saida atual) * entrada
        if (valorY >= 1) {
            w0 = w0 + (n * (0 - valorY) * (-1));
            w1 = w1 + (n * (0 - valorY) * x1);
            w2 = w2 + (n * (0 - valorY) * x2);
            w3 = w3 + (n * (0 - valorY) * x3);
        } else {
            w0 = w0 + (n * (1 - valorY) * (-1));
            w1 = w1 + (n * (1 - valorY) * x1);
            w2 = w2 + (n * (1 - valorY) * x2);
            w3 = w3 + (n * (1 - valorY) * x3);
        }
        // Atualiza as informações
        informacoes();
    }

    // Apenas informações
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

    // Muda o ícone
    private void icone() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/perceptron/imagens/icone32.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo = new javax.swing.JPanel();
        nomeTitulo = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        rotuloErro = new javax.swing.JLabel();
        erro = new javax.swing.JLabel();
        rotuloSalvar = new javax.swing.JLabel();
        salvar = new javax.swing.JLabel();
        rotuloNovo = new javax.swing.JLabel();
        novo = new javax.swing.JLabel();
        rotuloAbrir = new javax.swing.JLabel();
        abrir = new javax.swing.JLabel();
        visualizar = new javax.swing.JLabel();
        painelVisualizar = new javax.swing.JPanel();
        valorY = new javax.swing.JLabel();
        valorW0 = new javax.swing.JLabel();
        valorW1 = new javax.swing.JLabel();
        valorW2 = new javax.swing.JLabel();
        valorW3 = new javax.swing.JLabel();
        somaW0 = new javax.swing.JLabel();
        somaW1 = new javax.swing.JLabel();
        somaW2 = new javax.swing.JLabel();
        somaW3 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PERCEPTRON");
        setResizable(false);

        fundo.setBackground(new java.awt.Color(255, 255, 255));
        fundo.setLayout(null);

        nomeTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nomeTitulo.setBorder(null);
        fundo.add(nomeTitulo);
        nomeTitulo.setBounds(30, 25, 740, 30);

        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perceptron/imagens/titulo.png"))); // NOI18N
        fundo.add(titulo);
        titulo.setBounds(25, 20, 750, 40);

        rotuloErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotuloErro.setText("Erro");
        fundo.add(rotuloErro);
        rotuloErro.setBounds(20, 360, 40, 14);

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
        erro.setBounds(20, 310, 50, 50);

        rotuloSalvar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotuloSalvar.setText("Salvar");
        fundo.add(rotuloSalvar);
        rotuloSalvar.setBounds(80, 360, 50, 14);

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
        salvar.setBounds(80, 310, 50, 50);

        rotuloNovo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotuloNovo.setText("Novo");
        fundo.add(rotuloNovo);
        rotuloNovo.setBounds(140, 360, 50, 14);

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
        novo.setBounds(140, 310, 50, 50);

        rotuloAbrir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotuloAbrir.setText("Abrir");
        fundo.add(rotuloAbrir);
        rotuloAbrir.setBounds(200, 360, 40, 14);

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
        abrir.setBounds(200, 310, 50, 50);

        visualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perceptron/imagens/verNao.png"))); // NOI18N
        visualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visualizarMouseClicked(evt);
            }
        });
        fundo.add(visualizar);
        visualizar.setBounds(370, 310, 60, 50);

        painelVisualizar.setBackground(new java.awt.Color(250, 250, 255));

        valorY.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        valorW0.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        valorW1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        valorW2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        valorW3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        somaW0.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        somaW1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        somaW2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        somaW3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        javax.swing.GroupLayout painelVisualizarLayout = new javax.swing.GroupLayout(painelVisualizar);
        painelVisualizar.setLayout(painelVisualizarLayout);
        painelVisualizarLayout.setHorizontalGroup(
            painelVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVisualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valorY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelVisualizarLayout.createSequentialGroup()
                        .addGroup(painelVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelVisualizarLayout.createSequentialGroup()
                                .addComponent(valorW0, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(somaW0, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelVisualizarLayout.createSequentialGroup()
                                .addComponent(valorW1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(somaW1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelVisualizarLayout.createSequentialGroup()
                                .addComponent(valorW2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(somaW2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelVisualizarLayout.createSequentialGroup()
                                .addComponent(valorW3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(somaW3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelVisualizarLayout.setVerticalGroup(
            painelVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVisualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valorW0, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(somaW0, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valorW1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(somaW1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valorW2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(somaW2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valorW3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(somaW3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(valorY, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fundo.add(painelVisualizar);
        painelVisualizar.setBounds(430, 290, 270, 70);

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
        soma.setBounds(130, 90, 420, 190);

        nomeclaturaX1.setBorder(null);
        fundo.add(nomeclaturaX1);
        nomeclaturaX1.setBounds(50, 69, 90, 20);

        entradaX1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        entradaX1.setBorder(null);
        fundo.add(entradaX1);
        entradaX1.setBounds(30, 98, 80, 30);

        nomeclaturaX2.setBorder(null);
        fundo.add(nomeclaturaX2);
        nomeclaturaX2.setBounds(50, 140, 90, 20);

        entradaX2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        entradaX2.setBorder(null);
        fundo.add(entradaX2);
        entradaX2.setBounds(30, 170, 80, 30);

        nomeclaturaX3.setBorder(null);
        fundo.add(nomeclaturaX3);
        nomeclaturaX3.setBounds(50, 213, 90, 20);

        entradaX3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        entradaX3.setBorder(null);
        fundo.add(entradaX3);
        entradaX3.setBounds(30, 242, 80, 30);

        nomeclaturaY0.setBorder(null);
        fundo.add(nomeclaturaY0);
        nomeclaturaY0.setBounds(600, 143, 160, 20);

        nomeclaturaY1.setBorder(null);
        fundo.add(nomeclaturaY1);
        nomeclaturaY1.setBounds(600, 116, 160, 20);

        saidaNomeclatura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        saidaNomeclatura.setBorder(null);
        saidaNomeclatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saidaNomeclaturaActionPerformed(evt);
            }
        });
        fundo.add(saidaNomeclatura);
        saidaNomeclatura.setBounds(570, 170, 190, 30);

        imagemPerceptron.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perceptron/imagens/perceptronDesativada.png"))); // NOI18N
        fundo.add(imagemPerceptron);
        imagemPerceptron.setBounds(20, 70, 760, 232);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saidaNomeclaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saidaNomeclaturaActionPerformed

    }//GEN-LAST:event_saidaNomeclaturaActionPerformed

    private void somaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_somaMouseClicked
        // Verifica se tem algum texto        
        if (!entradaX1.getText().equals("")) {
            // Atribue o valor da entrada multiplicado com o peso
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

        // Soma os valores multiplicados e dá o resultado dasaída (y)
        y = (-1 * w0) + v1 + v2 + v3;

        if (y >= 1) {
            saidaNomeclatura.setText(nomeclaturaY1.getText());
        } else {
            saidaNomeclatura.setText(nomeclaturaY0.getText());
        }

        // Atualiza as informações
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
            painelVisualizar.setVisible(false);
            ver = false;
        } else {
            visualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perceptron/imagens/verSim.png")));
            painelVisualizar.setVisible(true);
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
    private javax.swing.JTextField nomeTitulo;
    private javax.swing.JTextField nomeclaturaX1;
    private javax.swing.JTextField nomeclaturaX2;
    private javax.swing.JTextField nomeclaturaX3;
    private javax.swing.JTextField nomeclaturaY0;
    private javax.swing.JTextField nomeclaturaY1;
    private javax.swing.JLabel novo;
    private javax.swing.JPanel painelVisualizar;
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
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel valorW0;
    private javax.swing.JLabel valorW1;
    private javax.swing.JLabel valorW2;
    private javax.swing.JLabel valorW3;
    private javax.swing.JLabel valorY;
    private javax.swing.JLabel visualizar;
    // End of variables declaration//GEN-END:variables
}

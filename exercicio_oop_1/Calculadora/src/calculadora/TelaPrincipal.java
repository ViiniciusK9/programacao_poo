package calculadora;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author vinicius koncicoski
 * @github ViiniciusK9
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private String primeiroNumero;
    private String operador;
    private String segundoNumero;
    
    /**
     * Creates new form TelaPrincipal
     */
    
    public TelaPrincipal() {
        this.primeiroNumero = "";
        this.operador = "";
        this.segundoNumero = "";
        initComponents();
    }

    public String getPrimeiroNumero() {
        return primeiroNumero;
    }

    public void setPrimeiroNumero(String primeiroNumero) {
        this.primeiroNumero = primeiroNumero;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(String segundoNumero) {
        this.segundoNumero = segundoNumero;
    }
    
    public boolean verificarOperador(){
        if (this.operador.equals("")) {
            return false;
        } else {
            return true;
        }
    } 
    
    public boolean verificarPrimeiroNumero(){
        if (this.primeiroNumero.equals("")) {
            return false;
        } else {
            return true;
        }
    }
    
    public boolean verificarSegundoNumero(){
        if (this.segundoNumero.equals("")) {
            return false;
        } else {
            return true;
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edtTela = new javax.swing.JTextField();
        btnMultiplicacao = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();
        btnUm = new javax.swing.JButton();
        btnDois = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnAdicao = new javax.swing.JButton();
        btnQuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnSubtracao = new javax.swing.JButton();
        btnSete = new javax.swing.JButton();
        btnOito = new javax.swing.JButton();
        btnNove = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        edtTela.setEditable(false);
        edtTela.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        edtTela.setToolTipText("");

        btnMultiplicacao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMultiplicacao.setText("*");
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });

        btnZero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnDivisao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDivisao.setText("/");
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });

        btnResultado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnResultado.setText("=");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });

        btnUm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUm.setText("1");
        btnUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUmActionPerformed(evt);
            }
        });

        btnDois.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDois.setText("2");
        btnDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoisActionPerformed(evt);
            }
        });

        btnTres.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTres.setText("3");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnAdicao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdicao.setText("+");
        btnAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicaoActionPerformed(evt);
            }
        });

        btnQuatro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnQuatro.setText("4");
        btnQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuatroActionPerformed(evt);
            }
        });

        btnCinco.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnSeis.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSeis.setText("6");
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnSubtracao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSubtracao.setText("-");
        btnSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtracaoActionPerformed(evt);
            }
        });

        btnSete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSete.setText("7");
        btnSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeteActionPerformed(evt);
            }
        });

        btnOito.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnOito.setText("8");
        btnOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOitoActionPerformed(evt);
            }
        });

        btnNove.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNove.setText("9");
        btnNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoveActionPerformed(evt);
            }
        });
        btnNove.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnNoveKeyPressed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLimpar.setText("C");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtTela)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnUm, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDois, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnSete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnOito, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNove, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(edtTela, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDois, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOitoActionPerformed
        if (verificarOperador()) {
            // tem operador
            this.segundoNumero += "8";
            this.edtTela.setText(this.primeiroNumero + this.operador + this.segundoNumero);
        } else {
            // n??o tem operador
            this.primeiroNumero += "8";
            this.edtTela.setText(this.primeiroNumero);
        }
    }//GEN-LAST:event_btnOitoActionPerformed

    private void btnNoveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNoveKeyPressed
    }//GEN-LAST:event_btnNoveKeyPressed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        this.edtTela.setText("");
        this.primeiroNumero = "";
        this.operador = "";
        this.segundoNumero = "";
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmActionPerformed
        if (verificarOperador()) {
            // tem operador
            this.segundoNumero += "1";
            this.edtTela.setText(this.primeiroNumero + this.operador + this.segundoNumero);
        } else {
            // n??o tem operador
            this.primeiroNumero += "1";
            this.edtTela.setText(this.primeiroNumero);
        }
    }//GEN-LAST:event_btnUmActionPerformed

    private void btnDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoisActionPerformed
        if (verificarOperador()) {
            // tem operador
            this.segundoNumero += "2";
            this.edtTela.setText(this.primeiroNumero + this.operador + this.segundoNumero);
        } else {
            // n??o tem operador
            this.primeiroNumero += "2";
            this.edtTela.setText(this.primeiroNumero);
        }
    }//GEN-LAST:event_btnDoisActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        if (verificarOperador()) {
            // tem operador
            this.segundoNumero += "3";
            this.edtTela.setText(this.primeiroNumero + this.operador + this.segundoNumero);
        } else {
            // n??o tem operador
            this.primeiroNumero += "3";
            this.edtTela.setText(this.primeiroNumero);
        }
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuatroActionPerformed
        if (verificarOperador()) {
            // tem operador
            this.segundoNumero += "4";
            this.edtTela.setText(this.primeiroNumero + this.operador + this.segundoNumero);
        } else {
            // n??o tem operador
            this.primeiroNumero += "4";
            this.edtTela.setText(this.primeiroNumero);
        }
    }//GEN-LAST:event_btnQuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        if (verificarOperador()) {
            // tem operador
            this.segundoNumero += "5";
            this.edtTela.setText(this.primeiroNumero + this.operador + this.segundoNumero);
        } else {
            // n??o tem operador
            this.primeiroNumero += "5";
            this.edtTela.setText(this.primeiroNumero);
        }
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        if (verificarOperador()) {
            // tem operador
            this.segundoNumero += "6";
            this.edtTela.setText(this.primeiroNumero + this.operador + this.segundoNumero);
        } else {
            // n??o tem operador
            this.primeiroNumero += "6";
            this.edtTela.setText(this.primeiroNumero);
        }
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeteActionPerformed
        if (verificarOperador()){
            // tem operador
            this.segundoNumero += "7";
            this.edtTela.setText(this.primeiroNumero + this.operador + this.segundoNumero);
        } else {
            // n??o tem operador
            this.primeiroNumero += "7";
            this.edtTela.setText(this.primeiroNumero);
        }
    }//GEN-LAST:event_btnSeteActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        if (verificarOperador()) {
            // tem operador
            this.segundoNumero += "0";
            this.edtTela.setText(this.primeiroNumero + this.operador + this.segundoNumero);
        } else {
            // n??o tem operador
            this.primeiroNumero += "0";
            this.edtTela.setText(this.primeiroNumero);
        }
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoveActionPerformed
        if (verificarOperador()) {
            // tem operador
            this.segundoNumero += "9";
            this.edtTela.setText(this.primeiroNumero + this.operador + this.segundoNumero);
        } else {
            // n??o tem operador
            this.primeiroNumero += "9";
            this.edtTela.setText(this.primeiroNumero);
        }
    }//GEN-LAST:event_btnNoveActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
        if (verificarSegundoNumero()) {
            JOptionPane.showMessageDialog(this, "Segundo numero ja foi digitado!");
        } else if (!verificarPrimeiroNumero()) {
            JOptionPane.showMessageDialog(this, "Digite o primeiro numero antes da operacao!");
        } else if (verificarOperador()) {
            JOptionPane.showMessageDialog(this, "Operador ja selecionado!");
        } else {
            this.operador = " * ";
            this.edtTela.setText(this.primeiroNumero + this.operador);
        }
        
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        if (verificarSegundoNumero()) {
            JOptionPane.showMessageDialog(this, "Segundo numero ja foi digitado!");
        } else if (!verificarPrimeiroNumero()) {
            JOptionPane.showMessageDialog(this, "Digite o primeiro numero antes da operacao!");
        } else if (verificarOperador()) {
            JOptionPane.showMessageDialog(this, "Operador ja selecionado!");
        } else {
            this.operador = " / ";
            this.edtTela.setText(this.primeiroNumero + this.operador);
        }
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicaoActionPerformed
        if (verificarSegundoNumero()) {
            JOptionPane.showMessageDialog(this, "Segundo numero ja foi digitado!");
        } else if (!verificarPrimeiroNumero()) {
            JOptionPane.showMessageDialog(this, "Digite o primeiro numero antes da operacao!");
        } else if (verificarOperador()) {
            JOptionPane.showMessageDialog(this, "Operador ja selecionado!");
        } else {
            this.operador = " + ";
            this.edtTela.setText(this.primeiroNumero + this.operador);
        }
    }//GEN-LAST:event_btnAdicaoActionPerformed

    private void btnSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtracaoActionPerformed
        if (verificarSegundoNumero()) {
            JOptionPane.showMessageDialog(this, "Segundo numero ja foi digitado!");
        } else if (!verificarPrimeiroNumero()) {
            JOptionPane.showMessageDialog(this, "Digite o primeiro numero antes da operacao!");
        } else if (verificarOperador()) {
            JOptionPane.showMessageDialog(this, "Operador ja selecionado!");
        } else {
            this.operador = " - ";
            this.edtTela.setText(this.primeiroNumero + this.operador);
        }
    }//GEN-LAST:event_btnSubtracaoActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        if (verificarOperador() && verificarPrimeiroNumero() && verificarSegundoNumero()) {
            int primeiroNumConvertido = Integer.parseInt(this.primeiroNumero);
            int segundoNumConvertido = Integer.parseInt(this.segundoNumero);
            int resultado = 0;
            
            switch (this.operador) {
                case " + ": 
                    try {
                        resultado = Operacoes.adicao(primeiroNumConvertido, segundoNumConvertido);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e.getMessage());
                        resultado = 0;
                    }
                    
                    break;
                case " - ":  
                    try {
                        resultado = Operacoes.subtracao(primeiroNumConvertido, segundoNumConvertido);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e.getMessage());
                        resultado = 0;
                    }
                    break;
                case " / ": 
                    
                    try {
                        resultado = Operacoes.divisao(primeiroNumConvertido, segundoNumConvertido);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e.getMessage());
                        resultado = 0;
                    }
                    break;
                case " * ":
                    try {
                        resultado = Operacoes.multiplicacao(primeiroNumConvertido, segundoNumConvertido);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e.getMessage());
                        resultado = 0;
                    }
                    break;
            } 
            
            String auxResultado = String.valueOf(resultado);
            this.primeiroNumero = auxResultado;
            this.operador = "";
            this.segundoNumero = "";
            
            this.edtTela.setText(auxResultado);
            
        } else {
            JOptionPane.showMessageDialog(this, "Equacao invalida!");
        }
    }//GEN-LAST:event_btnResultadoActionPerformed

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
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());     
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicao;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnDois;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnNove;
    private javax.swing.JButton btnOito;
    private javax.swing.JButton btnQuatro;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSete;
    private javax.swing.JButton btnSubtracao;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUm;
    private javax.swing.JButton btnZero;
    private javax.swing.JTextField edtTela;
    // End of variables declaration//GEN-END:variables
}

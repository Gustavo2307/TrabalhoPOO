package TrabalhoPOO;

/**
 *
 * @author victo
 */
public class TelaSabor extends javax.swing.JFrame {
    public double valSabor=0;
    public TelaSabor() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboMassa = new javax.swing.JComboBox<>();
        comboBebida = new javax.swing.JComboBox<>();
        comboSabor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSalvarSabor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboMassa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tradicional", "Integral" }));
        comboMassa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMassaActionPerformed(evt);
            }
        });

        comboBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "       ", "Coca", "Sprite", "Pepsi", "Guaraná" }));
        comboBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBebidaActionPerformed(evt);
            }
        });

        comboSabor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atum", "Bacon", "Baiana", "Bauru", "Brócolis", "Calabresa", "Camarão", "Canadense", "Escarola", "Executiva", "Frango c/ Catupiry", "Francesa", "Lombo", "Marguerita", "Mussarela", "2 queijos", "4 queijos", "5 queijos", "Peito de perú", "Peperoni", "Portugusa", "Rúcula", "Toscana" }));
        comboSabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSabor(evt);
            }
        });

        jLabel1.setText("Massa");

        jLabel2.setText("Sabor");

        jLabel3.setText("Bebida");

        btnSalvarSabor.setText("Salvar");
        btnSalvarSabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarSaborActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSabor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboMassa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvarSabor)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMassa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(btnSalvarSabor)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboMassaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMassaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMassaActionPerformed

    private void comboSabor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSabor
        
        //setvalSabor(sab);
        

    }//GEN-LAST:event_comboSabor


    

    private void btnSalvarSaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarSaborActionPerformed
        int mas = (int)comboMassa.getSelectedIndex();
        int sab = (int)comboSabor.getSelectedIndex();
        int beb = (int)comboBebida.getSelectedIndex();
        Pizza p = new Pizza();
        Principal pri = new Principal();
        p.setPreco(mas, sab, beb);
        System.out.println(p.getPreco());
                 
            setVisible(false);
            pri.setVisible(true);
            
    }//GEN-LAST:event_btnSalvarSaborActionPerformed

    private void comboBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBebidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBebidaActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSabor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarSabor;
    private javax.swing.JComboBox<String> comboBebida;
    private javax.swing.JComboBox<String> comboMassa;
    private javax.swing.JComboBox<String> comboSabor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

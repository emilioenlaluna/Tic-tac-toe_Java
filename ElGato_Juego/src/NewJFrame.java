    import java.util.Random;
    import java.awt.Toolkit;
    import  java.awt.Color;
    import javax.swing.JOptionPane;
    
public class NewJFrame extends javax.swing.JFrame {

    
    public Boolean turno;
    
    public NewJFrame() {
        initComponents();
        
        Random numero = new Random();
        if(numero.nextInt(2)==0)
               turno=true;
        else
            turno=false;
        turnos();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/gato.png")));
        jLabel3.setText("El ganador es: ?");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("El Gato");

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 0, 48)); // NOI18N
        jLabel1.setText("El Gato");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N

        jButton10.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        jButton10.setText("Reiniciar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(26, 26, 26)
                                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGap(28, 28, 28)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(214, 214, 214)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(356, 356, 356)
                                    .addComponent(jButton10)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void turnos(){
      
        if(turno==true){
            turno=true;
            jLabel2.setText("Turno de las X");
            //jLabel1.setText("");
        }else{
            turno=false;
            jLabel2.setText("Turno de las O");
        }
        comprobar();
    }
    public void botones(){
      jButton1.setEnabled(true);
      jButton2.setEnabled(true);
      jButton3.setEnabled(true);
      jButton4.setEnabled(true);
      jButton5.setEnabled(true);
      jButton6.setEnabled(true);
      jButton7.setEnabled(true);
      jButton8.setEnabled(true);
      jButton9.setEnabled(true);
    }
    public void reiniciar(){
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
      jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
      jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
      jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
      jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
      jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
      jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
      jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));     
      jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
      botones();
      jButton1.setBackground(new Color(255,255,255, 255));
      jButton2.setBackground(new Color(255,255,255, 255));
      jButton3.setBackground(new Color(255,255,255, 255));
      jButton4.setBackground(new Color(255,255,255, 255));
      jButton5.setBackground(new Color(255,255,255, 255));
      jButton6.setBackground(new Color(255,255,255, 255));
      jButton7.setBackground(new Color(255,255,255, 255));
      jButton8.setBackground(new Color(255,255,255, 255));
      jButton9.setBackground(new Color(255,255,255, 255));
      jLabel3.setText("El ganador es: ?");
     botones();
      
       Random numero = new Random();
        if(numero.nextInt(2)==0)
               turno=true;
        else
            turno=false;
        
        turnos();
         botones();
    }
  
    void ganador(){
        int input = JOptionPane.showConfirmDialog(null, 
                "Quiere jugar de nuevo", "Jugar otra vez", 
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if(input==0){
            reiniciar();
            botones();
        }else{
            System.exit(0); 
        }
        botones();
        reiniciar();
    }
    public void comprobar(){
            if( jButton1.getBackground().equals(Color.red)&&
            jButton2.getBackground().equals(Color.red)&& 
            jButton3.getBackground().equals(Color.red)){
                       jLabel3.setText("El ganador es la tacha");
                       botones();
                       JOptionPane.showMessageDialog(null, "El ganador es la tacha");
                       reiniciar();
                       ganador();
                       
                       
            }
            if( (jButton4.getBackground().equals(Color.red))&&
            (jButton5.getBackground().equals(Color.red))&& 
            (jButton6.getBackground().equals(Color.red))){
                        jLabel3.setText("El ganador es la tacha");
                        botones();
                        JOptionPane.showMessageDialog(null, "El ganador es la tacha");
                       reiniciar();
                       ganador();
                       
            }
            if( (jButton7.getBackground().equals(Color.red))&&
            (jButton8.getBackground().equals(Color.red))&& 
            (jButton9.getBackground().equals(Color.red))){
                       jLabel3.setText("El ganador es la tacha");
                        botones();
                       JOptionPane.showMessageDialog(null, "El ganador es la tacha");
                       reiniciar();
                       ganador();
                      
            }
            if( (jButton1.getBackground().equals(Color.red))&&
            (jButton4.getBackground().equals(Color.red))&& 
            (jButton7.getBackground().equals(Color.red))){
                jLabel3.setText("El ganador es la tacha");
                 botones();
                JOptionPane.showMessageDialog(null, "El ganador es la tacha");
                
                reiniciar();
                   botones();
                   ganador();
            }
            if( (jButton2.getBackground().equals(Color.red))&&
            (jButton5.getBackground().equals(Color.red))&& 
            (jButton8.getBackground().equals(Color.red))){
                       jLabel3.setText("El ganador es la tacha");
                        botones();
                       JOptionPane.showMessageDialog(null, "El ganador es la tacha");
                       reiniciar();
                       ganador();
   
            }
            if( (jButton3.getBackground().equals(Color.red))&&
            (jButton6.getBackground().equals(Color.red))&& 
            (jButton9.getBackground().equals(Color.red))){
                      jLabel3.setText("El ganador es la tacha");
                       botones();
                      JOptionPane.showMessageDialog(null, "El ganador es la tacha");
                      reiniciar();
                      ganador();
            }
            if( (jButton1.getBackground().equals(Color.red))&&
            (jButton5.getBackground().equals(Color.red))&& 
            (jButton9.getBackground().equals(Color.red))){
            jLabel3.setText("El ganador es la tacha");
             botones();
            JOptionPane.showMessageDialog(null, "El ganador es la tacha");
            
            reiniciar();
            botones();
            ganador();
            }
                    
            if( (jButton3.getBackground().equals(Color.red))&&
            (jButton5.getBackground().equals(Color.red))&& 
            (jButton7.getBackground().equals(Color.red))){
            jLabel3.setText("El ganador es la tacha");
             botones();
            JOptionPane.showMessageDialog(null, "El ganador es la tacha");
            reiniciar();
            ganador();
            }
            //validando ahora con verdes
            if( jButton1.getBackground().equals(Color.green)&&
            jButton2.getBackground().equals(Color.green)&& 
            jButton3.getBackground().equals(Color.green)){
                       jLabel3.setText("El ganador es circulo");
                       botones();
                       JOptionPane.showMessageDialog(null, "El ganador es circulo");
                        reiniciar();
                        ganador();
            }
            if( (jButton4.getBackground().equals(Color.green))&&
            (jButton5.getBackground().equals(Color.green))&& 
            (jButton6.getBackground().equals(Color.green))){
              jLabel3.setText("El ganador es circulo");
              botones();
              JOptionPane.showMessageDialog(null, "El ganador es circulo");
                        reiniciar();
                        botones();
                        ganador();

            }
            if( (jButton7.getBackground().equals(Color.green))&&
            (jButton8.getBackground().equals(Color.green))&& 
            (jButton9.getBackground().equals(Color.green))){
                       jLabel3.setText("El ganador es circulo");
                        botones();
                       JOptionPane.showMessageDialog(null, "El ganador es circulo");
                        reiniciar();
                        ganador();
            }
            if( (jButton1.getBackground().equals(Color.green))&&
            (jButton4.getBackground().equals(Color.green))&& 
            (jButton7.getBackground().equals(Color.green))){
                       jLabel3.setText("El ganador es circulo");
                        botones();
                       JOptionPane.showMessageDialog(null, "El ganador es circulo");
                        reiniciar();
                        ganador();
                        
            }
            if( (jButton2.getBackground().equals(Color.green))&&
            (jButton5.getBackground().equals(Color.green))&& 
            (jButton8.getBackground().equals(Color.green))){
                       jLabel3.setText("El ganador es circulo");
                        botones();
                       JOptionPane.showMessageDialog(null, "El ganador es circulo");
                        reiniciar();
                        ganador();
                       
            }
            if( (jButton3.getBackground().equals(Color.green))&&
            (jButton6.getBackground().equals(Color.green))&& 
            (jButton9.getBackground().equals(Color.green))){
                       jLabel3.setText("El ganador es circulo");
                        botones();
                       JOptionPane.showMessageDialog(null, "El ganador es circulo");
                        reiniciar();
                        ganador();
                        

            }
            if( (jButton1.getBackground().equals(Color.green))&&
            (jButton5.getBackground().equals(Color.green))&& 
            (jButton9.getBackground().equals(Color.green))){
            jLabel3.setText("El ganador es circulo");
             botones();
            JOptionPane.showMessageDialog(null, "El ganador es circulo");
                        reiniciar();
                        ganador();
                        
            }
                    
            if( (jButton3.getBackground().equals(Color.green))&&
            (jButton5.getBackground().equals(Color.green))&& 
            (jButton7.getBackground().equals(Color.green))){
            jLabel3.setText("El ganador es circulo");
             botones();
            JOptionPane.showMessageDialog(null, "El ganador es circulo");
                        reiniciar();
                        ganador();
                        
            
            }
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        jButton1.setEnabled(false);
            if (turno==true){
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tacha.png")));
            turno=false;
           jButton1.setBackground(Color.red);
            }
            else{
            turno=true;
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo.png"))); 
            jButton1.setBackground(Color.green);
            }
            turnos(); 
            
            comprobar();
            
          
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setEnabled(false);      
        if (turno==true){
            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tacha.png")));
            turno=false;
           jButton2.setBackground(Color.red);
            }
            else{
            turno=true;
            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo.png"))); 
            jButton2.setBackground(Color.green);
            }
            turnos(); 
            
            comprobar();
            
       
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
              
         jButton3.setEnabled(false);if (turno==true){
            jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tacha.png")));
            turno=false;
           jButton3.setBackground(Color.red);
            }
            else{
            turno=true;
            jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo.png")));
            jButton3.setBackground(Color.green);
            }
            turnos();
             
            comprobar();
           
       
         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         jButton4.setEnabled(false);     
        if (turno==true){
            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tacha.png")));
            turno=false;
           jButton4.setBackground(Color.red);
            }
            else{
            turno=true;
            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo.png")));
            jButton4.setBackground(Color.green);
            }
            turnos(); 
            
            comprobar();
           
          
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setEnabled(false);      
        if (turno==true){
            jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tacha.png")));
            turno=false;
           jButton5.setBackground(Color.red);
            }
            else{
            turno=true;
            jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo.png")));
            jButton5.setBackground(Color.green);
            }
            turnos(); 
            
            comprobar();
            
          
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setEnabled(false);      
        if (turno==true){
            jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tacha.png")));
            jButton6.setBackground(Color.red);
            turno=false;
           
            }
            else{
            turno=true;
            jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo.png"))); 
            jButton6.setBackground(Color.green);
            }
            turnos(); 
           
           comprobar();
            
          
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setEnabled(false);     
        if (turno==true){
            jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tacha.png")));
            jButton7.setBackground(Color.red);
            turno=false;
           
            }
            else{
            turno=true;
            jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo.png"))); 
            jButton7.setBackground(Color.green);
            }
            turnos(); 
            comprobar();

         
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setEnabled(false);      
        if (turno==true){
            jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tacha.png")));
            turno=false;
           jButton8.setBackground(Color.red);
            }
            else{
            turno=true;
            jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo.png")));
            jButton8.setBackground(Color.green);
            }
            turnos(); 
           
           comprobar();
           

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setEnabled(false);     
        if (turno==true){
            jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tacha.png")));
            turno=false;
           jButton9.setBackground(Color.red);
            }
            else{
            turno=true;
            jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circulo.png"))); 
            jButton9.setBackground(Color.green);
            }
            turnos(); 
           
            comprobar();
             
          
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      reiniciar();
      botones();
    }//GEN-LAST:event_jButton10ActionPerformed
         
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

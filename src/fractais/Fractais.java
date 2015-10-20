package fractais;

/**
 *
 * @author Marcos Pereira Lourinho 10/2015
 * facebook.com/marcospereira22
 * instagram: @marcospereira_7
 * github.com/marcospereira7
 * 
 * Fractals Demo: 
 *  1 - Mandelbrot Set 
 *  2 - Triangle Sierpinski
 * 
 */

import java.awt.Color;
import java.awt.Graphics;

public class Fractais extends javax.swing.JFrame{
    
   private Graphics g;
     
     
    public Fractais() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Mandelbrot = new javax.swing.JButton();
        Painel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_sierpinski = new javax.swing.JButton();
        btn_Limpa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Mandelbrot.setText("Conjunto de Mandelbrot");
        btn_Mandelbrot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MandelbrotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setText("FRACTAIS");

        btn_sierpinski.setText("Triângulo de Sierpinski");
        btn_sierpinski.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sierpinskiActionPerformed(evt);
            }
        });

        btn_Limpa.setText("Limpar");
        btn_Limpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Limpa, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sierpinski, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Mandelbrot, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Mandelbrot, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_sierpinski, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Limpa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_MandelbrotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MandelbrotActionPerformed
        imprimeMandelbrot(Painel.getGraphics());
    }//GEN-LAST:event_btn_MandelbrotActionPerformed

    private void btn_sierpinskiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sierpinskiActionPerformed
        imprimeSierpinski(Painel.getGraphics());
    }//GEN-LAST:event_btn_sierpinskiActionPerformed

    private void btn_LimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpaActionPerformed
        Painel.updateUI();
    }//GEN-LAST:event_btn_LimpaActionPerformed

      public void imprimeMandelbrot(Graphics g) {
	  int j = -1;
	  while(++j<300) {
		  int i = -1;
		  while(++i<300) {
			  float x = 0f;
			  float y = 0f;
			  int v = 0;
			  for(; v < 40 && (x * x + y * y)/2f < 2f; v++) {
				  float t = i/100f - 2f + x * x - y * y;
				  y = j/100f - 1.57f + x * y * 2f;
				  x = t;
			  }
			  g.setColor(new Color(0f, (v==40)?0f:(float)Math.pow(v, 1f/2f)/6.325f, 0f));
			  g.drawRect(i,j,1,1);
		  }
	  }
    }    
         
    public void imprimeSierpinski(Graphics g){
        int a = 300;
        int l = 360;
        desenhaSierpinski(g, 4, (l-10)/2, 20, l-40, a-20, 40, a-20);
    }  
    
int nivel = 5;

void desenhaSierpinski(Graphics g, int n, int x1, int y1, int x2, int y2, int x3, int y3){

        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x1,y1,x3,y3);
        g.drawLine(x2,y2,x3,y3);

        subTriangulo
        (
            g, 
            n,
            (x1 + x2) / 2, 
            (y1 + y2) / 2, 
            (x1 + x3) / 2, 
            (y1 + y3) / 2, 
            (x2 + x3) / 2, 
            (y2 + y3) / 2  
        );            
}    

void subTriangulo(Graphics g, int n, int x1, int y1, int x2, int y2, int x3, int y3){   
    
        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x1,y1,x3,y3);
        g.drawLine(x2,y2,x3,y3);
                
    if(Math.sqrt((double)(Math.pow(x2-x1, 2)) + (double)(Math.pow(y2-y1, 2))) > 2)
    {
        //Triangulo 1
        subTriangulo
        (
            g, 
            n+1,
            (x1 + x2) / 2 + (x2 - x3) / 2, 
            (y1 + y2) / 2 + (y2 - y3) / 2, 
            (x1 + x2) / 2 + (x1 - x3) / 2, 
            (y1 + y2) / 2 + (y1 - y3) / 2, 
            (x1 + x2) / 2, 
            (y1 + y2) / 2  
        );
        
        //Triangulo 2
        subTriangulo
        (
            g, 
            n+1,
            (x3 + x2) / 2 + (x2 - x1) / 2, 
            (y3 + y2) / 2 + (y2 - y1) / 2, 
            (x3 + x2) / 2 + (x3 - x1) / 2, 
            (y3 + y2) / 2 + (y3 - y1) / 2,
            (x3 + x2) / 2, 
            (y3 + y2) / 2  
        );
        
        //Triangulo 3
        subTriangulo
        (
            g, 
            n+1,
            (x1 + x3) / 2 + (x3 - x2) / 2, 
            (y1 + y3) / 2 + (y3 - y2) / 2, 
            (x1 + x3) / 2 + (x1 - x2) / 2, 
            (y1 + y3) / 2 + (y1 - y2) / 2,
            (x1 + x3) / 2,
            (y1 + y3) / 2         
        );                
    }             
}
          
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fractais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel;
    private javax.swing.JButton btn_Limpa;
    private javax.swing.JButton btn_Mandelbrot;
    private javax.swing.JButton btn_sierpinski;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ox;

//import Register;

/**
 *
 * @author ADMIN
 */
public class OX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     java.awt.EventQueue.invokeLater(new Runnable() {
          public void run () {
               new Register().setVisible(true);
           }
       });
        
// TODO code application logic here
    }

    private static class Register {

        public Register() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}

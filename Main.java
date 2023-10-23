package exemplografico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExemploGrafico {

    public static void main(String[] args) {
         
            JFrame frame =  new JFrame("Exemplo JTextField");
        
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);
            
             JPanel panel = new JPanel();         
            frame.add(panel);
                     
            //Texto em Cima tipo um titulo sei la
             JLabel label = new JLabel("Digite seu nome");          
            panel.add(label);           
 
            //Caixa de texto
            JTextField textField = new JTextField(20);            
            panel.add(textField);

                        
            JButton button = new JButton("Saudacao");
            panel.add(button);
            
            
            JLabel saudacaoLabel = new JLabel();
            panel.add(saudacaoLabel);
            
            //Panel e uma div           
            button.addActionListener(new ActionListener() {
                
           
                public void actionPerformed(ActionEvent e) {
                    
                    //Obtem o etxto inserido na caixa de texto
                   String nome = textField.getText();
              
                if(!nome.isEmpty()){
                    
                    saudacaoLabel.setText("Ola  " + nome);
                }
                
                else {
                    
                    saudacaoLabel.setText("Digite seu nome");
                }
                    
                }
            });
                        
                frame.setVisible(true);

            
            
            
            
            
            
            
            
            
            
     /*
     
       JFrame janela =  new JFrame("Exemplo Swing");

        janela.setSize(400, 200);

        JButton botao = new JButton("Clique-me");

        botao.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.printf("Botao foi Clicado");
        }
    });

    
    janela.add(botao);   
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    janela.setVisible(true);
;
     */   
 
        
        
    
        
        
    }
}

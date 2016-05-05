import java.awt.BorderLayout;  
import java.awt.Color;  
import javax.swing.BorderFactory;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  
import javax.swing.UIManager;  
  
public class Board extends JFrame {  
  
      
    private static final long serialVersionUID = 1L;  
      
    JPanel jp=new JPanel();  
    private Spot[][] spots = new Spot[6][6];
          
    public Board(int gridSize){
    	
        super();
    	jp.setLayout(null);  
        for(int i=0;i<6;i++)  
            for(int j=0;j<6;j++)  
            {   this.spots[i][j]= new Spot(i,j);
                Color color=Color.white;  
                JLabel label=new JLabel();  
                label.setSize(gridSize, gridSize);  
                label.setLocation(i*gridSize, j*gridSize);  
                if((i+j)%2==0)  
                     color=Color.black;  
                  
                label.setOpaque(true);  
                label.setBackground(color);  
                //set the border black
                label.setBorder(BorderFactory.createLineBorder(Color.black));  
                jp.add(label);  
                //put Jpanel on JFrame  
                add(jp, BorderLayout.CENTER);  
            }  
    }  
  
    public static void main(String[] args) {  
  
        try {  
            //use the windows' style
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());    
        }catch (Exception e) {  
            e.printStackTrace();  
        }  
         Board chessBord=new Board(100);  //size of the small square
         chessBord.setSize(610,635);  //size of all
         chessBord.setLocationRelativeTo(null);        //put the windows in middle
         chessBord.setVisible(true);  
         chessBord.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
          
    
    }
    public Spot getSpot(int x, int y) {
        return spots[x][y];
        }
}  

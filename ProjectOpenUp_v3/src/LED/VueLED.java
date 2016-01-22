/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: S219
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: VueLED
//!	Generated Date	: Wed, 6, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/LED/VueLED.java
*********************************************************************/

package LED;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;


//----------------------------------------------------------------------------
// LED/VueLED.java                                                                  
//----------------------------------------------------------------------------

//## package LED 


//## class VueLED 
public class VueLED extends JPanel implements Observer {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    protected Color display;        //## attribute display 

    
    // Constructors
    
    //## operation VueLED() 
    public  VueLED() {
        //#[ operation VueLED() 
        //#]
        display = Color.gray;
        initComponents();
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(display);
        g.fillOval(4, 4, this.getWidth()-8, this.getHeight()-8);
        g.drawOval(0, 0, this.getWidth(), this.getHeight());
        g.drawOval(1,1 , this.getWidth()-2, this.getHeight()-2);
        
    }
        
    //## auto_generated 
    public Color getDisplay() {
        return display;
    }
    
    //## auto_generated 
    public void setDisplay(Color p_display) {
        display = p_display;
        repaint();
    }
    
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
		
	}
}
/*********************************************************************
    File Path    : DefaultComponent/DefaultConfig/LED/VueLED.java
*********************************************************************/
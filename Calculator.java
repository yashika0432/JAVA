import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame{
    private JTextField display;

    private double operand1=0;
    private double operand2=0;
    private String operator="";
    private boolean newInput=true;
    private boolean hasResult=false;


    private static final Color BG=new Color(28,28,30);
    private static final Color DISPLAY_BG=new Color (18,18,20);
    private static final Color NUM_BG=new Color(58,58,60);
    private static final Color NUM_HOVER  = new Color(80,  80,  82);
    private static final Color OP_BG      = new Color(255, 159,  10);
    private static final Color OP_HOVER   = new Color(255, 185,  60);
    private static final Color FUNC_BG    = new Color(99,  99, 102);
    private static final Color FUNC_HOVER = new Color(125,125, 128);
    private static final Color TEXT_WHITE = Color.WHITE;
    private static final Color TEXT_BLACK = Color.BLACK;
}
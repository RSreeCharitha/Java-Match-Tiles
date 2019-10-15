import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class GameOfTiles extends JFrame {
    JButton b[] = new JButton[16];
    GameOfTiles() {
        super("Game of Tiles");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for(int i=0;i<16;i++)
            b[i] = new JButton();
        ImageIcon i1 = new ImageIcon("Icon1.png"); ImageIcon i2 = new ImageIcon("Icon2.png");
        ImageIcon i3 = new ImageIcon("Icon3.png"); ImageIcon i4 = new ImageIcon("Icon4.png");
        ImageIcon i5 = new ImageIcon("Icon5.png"); ImageIcon i6 = new ImageIcon("Icon6.png");
        ImageIcon i7 = new ImageIcon("Icon7.png"); ImageIcon i8 = new ImageIcon("Icon8.png");

        b[0].setIcon(i1); b[13].setIcon(i1); b[1].setIcon(i2); b[10].setIcon(i2);
        b[11].setIcon(i3); b[2].setIcon(i3); b[3].setIcon(i4); b[12].setIcon(i4);
        b[4].setIcon(i5); b[15].setIcon(i5); b[5].setIcon(i6); b[8].setIcon(i6);
        b[6].setIcon(i7); b[14].setIcon(i7); b[7].setIcon(i8); b[9].setIcon(i8);
		
		for(int i=0;i<16;i++)
			b[i].setBounds(200*(i/4),40+200*(i%4),200,200);		
		
        b[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int p=0;p<16;p++){
                    if(p==0 || p==13) continue;
                    else b[p].setEnabled(true);
                }
                b[0].setEnabled(false);
                if(!b[0].isEnabled() && !b[13].isEnabled()) {
                    remove(b[0]);
                    remove(b[13]);
                    revalidate();
                    repaint();
                }
            }
        });
        b[13].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int p=0;p<16;p++){
                    if(p==0 || p==13) continue;
                    else b[p].setEnabled(true);
                }
                b[13].setEnabled(false);
                if(!b[13].isEnabled() && !b[0].isEnabled()) {
                    remove(b[13]);
                    remove(b[0]);
                    revalidate();
                    repaint();
                }
            }
        });//set 1
        b[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int p=0;p<16;p++){
                    if(p==1 || p==10) continue;
                    else b[p].setEnabled(true);
                }
                b[1].setEnabled(false);
                if(!b[1].isEnabled() && !b[10].isEnabled()) {
                    remove(b[1]);
                    remove(b[10]);
                    revalidate();
                    repaint();
                }
            }
        });
        b[10].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int p=0;p<16;p++){
                    if(p==1 || p==10) continue;
                    else b[p].setEnabled(true);
                }
                b[10].setEnabled(false);
                if(!b[10].isEnabled() && !b[1].isEnabled()) {
                    remove(b[1]);
                    remove(b[10]);
                    revalidate();
                    repaint();
                }
            }
        });//set 2
        b[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int p=0;p<16;p++) {
                    if (p == 2 || p == 11) continue;
                    else b[p].setEnabled(true);
                }
                b[2].setEnabled(false);
                if(!b[2].isEnabled() && !b[11].isEnabled()) {
                    remove(b[2]);
                    remove(b[11]);
                    revalidate();
                    repaint();
                }
            }
        });
        b[11].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int p=0;p<16;p++) {
                    if (p == 2 || p == 11) continue;
                    else b[p].setEnabled(true);
                }
                b[11].setEnabled(false);
                if(!b[11].isEnabled() && !b[2].isEnabled()) {
                    remove(b[2]);
                    remove(b[11]);
                    revalidate();
                    repaint();
                }
            }
        });//set 3
        b[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int p=0;p<16;p++) {
                    if (p == 3 || p == 12) continue;
                    else b[p].setEnabled(true);
                }
                b[3].setEnabled(false);
                if(!b[3].isEnabled() && !b[12].isEnabled()) {
                    remove(b[3]);
                    remove(b[12]);
                    revalidate();
                    repaint();
                }
            }
        });
        b[12].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int p=0;p<16;p++) {
                    if (p == 3 || p == 12) continue;
                    else b[p].setEnabled(true);
                }
                b[12].setEnabled(false);
                if(!b[12].isEnabled() && !b[3].isEnabled()) {
                    remove(b[12]);
                    remove(b[3]);
                    revalidate();
                    repaint();
                }
            }
        });//set 4
        b[4].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int p=0;p<16;p++) {
                    if (p == 4 || p == 15) continue;
                    else b[p].setEnabled(true);
                }
                b[4].setEnabled(false);
                if(!b[4].isEnabled() && !b[15].isEnabled()) {
                    remove(b[4]);
                    remove(b[15]);
                    revalidate();
                    repaint();
                }
            }
        });
        b[15].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int p=0;p<16;p++) {
                    if (p == 4 || p == 15) continue;
                    else b[p].setEnabled(true);
                }
                b[15].setEnabled(false);
                if(!b[15].isEnabled() && !b[4].isEnabled()) {
                    remove(b[15]);
                    remove(b[4]);
                    revalidate();
                    repaint();
                }
            }
        });//set 5
        b[5].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int p=0;p<16;p++) {
                    if (p == 5 || p == 8) continue;
                    else b[p].setEnabled(true);
                }
                b[5].setEnabled(false);
                if(!b[5].isEnabled() && !b[8].isEnabled()) {
                    remove(b[5]);
                    remove(b[8]);
                    revalidate();
                    repaint();
                }
            }
        });
        b[8].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    for(int p=0;p<16;p++) {
                        if (p == 5 || p == 8) continue;
                        else b[p].setEnabled(true);
                    }
                b[8].setEnabled(false);
                if(!b[8].isEnabled() && !b[5].isEnabled()) {
                    remove(b[8]);
                    remove(b[5]);
                    revalidate();
                    repaint();
                }
            }
        });//set 6
        b[6].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int p=0;p<16;p++) {
                    if (p == 6 || p == 14) continue;
                    else b[p].setEnabled(true);
                }
                b[6].setEnabled(false);
                if(!b[6].isEnabled() && !b[14].isEnabled()) {
                    remove(b[6]);
                    remove(b[14]);
                    revalidate();
                    repaint();
                }
            }
        });
        b[14].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int p=0;p<16;p++) {
                    if (p == 6 || p == 14) continue;
                    else b[p].setEnabled(true);
                }
                b[14].setEnabled(false);
                if(!b[14].isEnabled() && !b[6].isEnabled()) {
                    remove(b[14]);
                    remove(b[6]);
                    revalidate();
                    repaint();
                }
            }
        });//set 7
        b[7].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int p=0;p<16;p++) {
                    if (p == 7 || p == 9) continue;
                    else b[p].setEnabled(true);
                }
                b[7].setEnabled(false);
                if(!b[7].isEnabled() && !b[9].isEnabled()) {
                    remove(b[7]);
                    remove(b[9]);
                    revalidate();
                    repaint();
                }
            }
        });
        b[9].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int p=0;p<16;p++) {
                    if (p == 7 || p == 9) continue;
                    else b[p].setEnabled(true);
                }
                b[9].setEnabled(false);
                if(!b[9].isEnabled() && !b[7].isEnabled() ) {
                    remove(b[9]);
                    remove(b[7]);
                    revalidate();
                    repaint();
                }
            }
        });//set 8
        for(int i=0;i<16;i++)
            add(b[i]);
        setSize(810, 885);
        //setLayout(new GridLayout(4,4));
		setLayout(null);
        setVisible(true);
    }
    public static void main(String arg[]){
        new GameOfTiles();
    }
}
package DigitalClock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.text.SimpleDateFormat;

public class MyWindows extends JFrame {
    private JLabel timeLabel;
    private JLabel clockLabel;
    private JLabel dateTitle;
    private JLabel dateLabel;
    private final Font font=new Font("",Font.BOLD,35);
    private final Font font1=new Font ("",Font.BOLD,20);

    MyWindows(){
        super.setTitle("my clock");
        super.setSize(400,400);
        super.setLocation(500,250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.createGUI();
        this.startClock();
        super.setVisible(true);
    }

    public void createGUI(){
        timeLabel =new JLabel("TIME");
        clockLabel=new JLabel("Clock");
        dateTitle =new JLabel("DATE");
        dateLabel=new JLabel("Calender");
        timeLabel.setFont(font);
        clockLabel.setFont(font1);
        dateTitle.setFont(font);
        dateLabel.setFont(font1);
        timeLabel.setHorizontalAlignment(JLabel.CENTER);
        clockLabel.setHorizontalAlignment(JLabel.CENTER);
        dateTitle.setHorizontalAlignment(JLabel.CENTER);
        dateLabel.setHorizontalAlignment(JLabel.CENTER);
        this.setLayout(new GridLayout(2,2));
        this.add(timeLabel);
        this.add(clockLabel);
        this.add(dateTitle);
        this.add(dateLabel);
    }

    public void startClock(){
        Timer timer=new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d=new Date();
                SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss a");
                String dateTime=sdf.format(d);
                clockLabel.setText(dateTime);
                SimpleDateFormat sdf1=new SimpleDateFormat("dd MM yyyy");
                String date=sdf1.format(d);
                dateLabel.setText(date);
            }
        });
        timer.start();
    }
}

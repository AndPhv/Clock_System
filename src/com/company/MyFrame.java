package com.company;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame
{
//    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
//    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;

    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("System clock");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(false);


        timeFormat = new SimpleDateFormat("hh:mm:ss a");
//        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("dd MM yyyy");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
        timeLabel.setForeground(Color.RED);
        timeLabel.setBackground(Color.BLACK);
        timeLabel.setOpaque(true);

//        dayLabel = new JLabel();
//        dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Verdana", Font.PLAIN, 25));
        dateLabel.setForeground(Color.RED);
        dateLabel.setBackground(Color.BLACK);
        dateLabel.setOpaque(true);

        this.add(dateLabel);
//        this.add(dayLabel);
        this.add(timeLabel);

        this.setVisible(true);

        setTime();
    }
    public void setTime()
    {
        while (true)
        {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

//            day = dayFormat.format(Calendar.getInstance().getTime());
//            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
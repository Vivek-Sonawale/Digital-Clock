import java.awt.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class frame extends JFrame {
    Calendar calendar; // intance of calendar abtract class
    SimpleDateFormat simpleDateFormat; // concret class
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel Jtimelable;
    JLabel Jdaylable;
    JLabel Jdatelable;
    String Time, Day, Date;

    frame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Digital Clock");
        this.setSize(350, 220);

        simpleDateFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMM dd,yyyy");

        Jtimelable = new JLabel();
        Jdaylable = new JLabel();
        Jdatelable = new JLabel();

        Time = simpleDateFormat.format(Calendar.getInstance().getTime());
        Day = dayFormat.format(Calendar.getInstance().getTime());
        Date = dateFormat.format(Calendar.getInstance().getTime());

        Jtimelable.setText(Day);
        Jdaylable.setText(Time);
        Jdatelable.setText(Date);

        this.add(Jtimelable);
        this.add(Jdaylable);
        this.add(Jdatelable);
        this.getContentPane().setBackground(Color.BLACK);

        // Set foreground (font) color for labels
        Jtimelable.setForeground(Color.GREEN);
        Jdaylable.setForeground(Color.GREEN);
        Jdatelable.setForeground(Color.GREEN);

        // FONT
        Jtimelable.setFont(new Font("Verdena", Font.BOLD, 55));
        Jdaylable.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        Jdatelable.setFont(new Font("Times New Roman", Font.PLAIN, 35));

        this.setLayout(new FlowLayout());

        this.setVisible(true);
        setTime();

    }

  

    public void setTime() {
        while (true) {
            Time = simpleDateFormat.format(Calendar.getInstance().getTime());
            Jtimelable.setText(Time);

            Day = dayFormat.format(Calendar.getInstance().getTime());
            Jdaylable.setText(Day);

            Date = dateFormat.format(Calendar.getInstance().getTime());
            Jdatelable.setText(Date);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

package slowner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Launcher");

        JButton button = new JButton("Launch");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    launch();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        frame.getContentPane().add(button, BorderLayout.CENTER);

        frame.setResizable(false);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void launch() throws IOException {
        while(true) {
            Desktop d = Desktop.getDesktop();
            Random r = new Random();

            File file = new File("pewdiepie>t-gay.txt");
            FileWriter fileW = new FileWriter(file);
            BufferedWriter fileB = new BufferedWriter(fileW);

            for (int i = 0; i <= 666; i++) {
                String[] tgay = {"01100010 01101001 01110100 01100011 01101000 00100000 01101100 01100001 01110011 01100001 01100111 01101110 01100001 ", "01110100 00101101 01100111 01100001 01111001 "};
                String result = tgay[r.nextInt(tgay.length)];

                fileB.write(result);
                fileB.newLine();
            }

            fileB.close();
            d.open(file);

            for (int j = Integer.MAX_VALUE; j <= 666; j++) {
                String[] links = {
                        "https://www.google.fr/#q=u%20r%20bad%20lol%20" + j,
                        "https://www.google.fr/#q=lul%20" + j,
                        "https://www.google.fr/#q=bitch%20lasagna" + j,
                        "https://www.google.fr/#q=t-gay" + j,
                        "https://www.google.fr/#q=sub%20bot" + j
                };
                String result = links[r.nextInt(links.length)];

                try {
                    d.browse(new URI(result));
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

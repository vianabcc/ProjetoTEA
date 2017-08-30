package view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JFileChooser;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.discovery.NativeDiscovery;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import uk.co.caprica.vlcj.player.MediaPlayerEventAdapter;


public class ControlPlayer {

    private final JFrame frame;
    private final EmbeddedMediaPlayerComponent mediaPlayerComponent;
    private final JButton pauseButton;
    private final JButton rewindButton;
    private final JButton skipButton;
    private static JFileChooser ourFileSelector = new JFileChooser();
    private String mediaPath = "";

    public static void main(final String[] args) {
        new NativeDiscovery().discover();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {    
                new ControlPlayer(args);
            }
        });
    }

    public ControlPlayer(String[] args) {
        String vlcPath = "lib";
        File ourFile;
        
        // Define o modo de seleção para somente arquivos para selecionar a mídia
        ourFileSelector.setFileSelectionMode(JFileChooser.FILES_ONLY);
        // Abre o JFileChooser
        ourFileSelector.showSaveDialog(null);
        // Pega o arquivo do JFileChooser
        ourFile = ourFileSelector.getSelectedFile();
        // Pega o caminho do arquivo
        mediaPath = ourFile.getAbsolutePath();
           
        frame = new JFrame("Player de Vídeo");
        frame.setBounds(100, 100, 600, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                mediaPlayerComponent.getMediaPlayer().pause();
                mediaPlayerComponent.release();
                System.exit(0);
            }
        });
        
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        
        mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
        contentPane.add(mediaPlayerComponent, BorderLayout.CENTER);
        
        JPanel controlsPane = new JPanel();
        pauseButton = new JButton();
        pauseButton.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/control_pause_blue.png")));
        pauseButton.setToolTipText("Play/pause");
        controlsPane.add(pauseButton);
        
        rewindButton = new JButton();
        rewindButton.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/control_rewind_blue.png")));
        rewindButton.setToolTipText("Voltar");
        controlsPane.add(rewindButton);
        
        skipButton = new JButton();
        skipButton.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/control_fastforward_blue.png")));
        skipButton.setToolTipText("Ir para frente");
        controlsPane.add(skipButton);
        
        contentPane.add(controlsPane, BorderLayout.SOUTH);
        
        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mediaPlayerComponent.getMediaPlayer().pause();
            }
        });

        rewindButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mediaPlayerComponent.getMediaPlayer().skip(-5000);
            }
        });

        skipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mediaPlayerComponent.getMediaPlayer().skip(5000);
            }
        });
        
        mediaPlayerComponent.getMediaPlayer().addMediaPlayerEventListener(new MediaPlayerEventAdapter() {
            public void playing(MediaPlayer mediaPlayer) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        frame.setTitle(String.format(
                            "Player de Vídeo- %s",
                            mediaPlayerComponent.getMediaPlayer().getMediaMeta().getTitle()
                        ));
                    }
                });
            }

            public void finished(MediaPlayer mediaPlayer) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        mediaPlayerComponent.getMediaPlayer().pause();
                        closeWindow();
                    }
                });
            }

            public void error(MediaPlayer mediaPlayer) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        JOptionPane.showMessageDialog(
                            frame,
                            "Failed to play media",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                        );
                        mediaPlayerComponent.getMediaPlayer().pause();
                        closeWindow();
                    }
                });
            }
        });
        
        frame.setContentPane(contentPane);
        frame.setVisible(true);
        
        mediaPlayerComponent.getMediaPlayer().playMedia(mediaPath);
        mediaPlayerComponent.getMediaPlayer().pause();
    }

    ControlPlayer(String vlcPath, String mediaPath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void closeWindow() {
        mediaPlayerComponent.getMediaPlayer().pause();
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
    }
}

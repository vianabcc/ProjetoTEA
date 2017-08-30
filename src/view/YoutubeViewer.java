package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;

import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;

public class YoutubeViewer{
    public String url;

    public YoutubeViewer(String url){
        this.url = url;
    
        NativeInterface.open();
        
        JFrame frame = new JFrame("Reprodução de Áudio/Vídeo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(getBrowserPanel(), BorderLayout.CENTER);
        frame.setSize(800, 600);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
        
        NativeInterface.runEventPump();
       
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                NativeInterface.close();
            }
        }));
    }
    
    public JPanel getBrowserPanel() {
        JPanel webBrowserPanel = new JPanel(new BorderLayout());
        JWebBrowser webBrowser = new JWebBrowser();
        webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
        webBrowser.setBarsVisible(false);
        webBrowser.navigate(url);
        return webBrowserPanel;
    }
}
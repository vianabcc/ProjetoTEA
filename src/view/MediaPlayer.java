/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;
import com.sun.jna.NativeLibrary;
import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;

public class MediaPlayer {

    // Declaração e inicialização do Frame
    private JFrame ourFrame = new JFrame();
    // Declaração do nosso Componente Media Player
    private EmbeddedMediaPlayerComponent ourMediaPlayer;
    // Declaração e inicialização de uma string para guardar a URL
    private String mediaPath = "";

    MediaPlayer(String vlcPath, String mediaURL){
        // Pega a URL da mídia
        this.mediaPath = mediaURL;
        // Mostra a API onde a biblioteca VLC está localizada
        NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), vlcPath);
        // Inicializa nosso componente de mídia
        ourMediaPlayer = new EmbeddedMediaPlayerComponent();
        // Define nosso Content Pane do Frame para nosso0 media player
        ourFrame.setContentPane(ourMediaPlayer);
        // Define o tamanho do Frame
        ourFrame.setSize(900, 500);
        // Define a localização inicial
        ourFrame.setLocation(200, 100);
        // Define a visibilidade
        ourFrame.setVisible(true);
        // Define operação de fechamento padrão
        ourFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    public void run(){
        // Executa o arquivo que foi selecionado
        ourMediaPlayer.getMediaPlayer().playMedia(mediaPath);
    }
}
package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class Controller implements Initializable{

	@FXML
	private MediaView MediaBox;
	@FXML
	private Button playbtn, pausebtn, resetbtn;
	
	private File file;
	@FXML
	private Media media;
	@FXML
	private MediaPlayer mediaplayer;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		file=new File("F:\\Users\\monab\\eclipse-workspace\\MediaVideo\\src\\application\\short.mp4");
		media=new Media(file.toURI().toString());
		mediaplayer=new MediaPlayer(media);
		MediaBox.setMediaPlayer(mediaplayer);
		
	}
	
	public void playMedia(ActionEvent event) {
		mediaplayer.play();
	}
	public void pauseMedia(ActionEvent event) {
		
		mediaplayer.pause();
		
	}
	public void resetMedia(ActionEvent event) {
		if(mediaplayer.getStatus()!=MediaPlayer.Status.READY) {
			
			mediaplayer.seek(Duration.seconds(0.0));
		}
		
	}
	
	
	
	
	
}

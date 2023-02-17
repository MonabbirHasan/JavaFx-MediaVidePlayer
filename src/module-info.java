module MediaVideo {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.media;
	requires javafx.base;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
}

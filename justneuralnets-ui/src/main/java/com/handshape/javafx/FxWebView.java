package com.handshape.javafx;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static javafx.concurrent.Worker.State;

public class FxWebView {

    private final JFXPanel fXPanel = new JFXPanel();
    private final JFrame frame;

    public FxWebView(final String url) {
        frame = new JFrame(url);
        frame.setSize(800, 600);
        frame.setContentPane(fXPanel);
        try {
            SwingUtilities.invokeAndWait(() -> this.frame.setVisible(true));
        } catch (InterruptedException | InvocationTargetException ex) {
            Logger.getLogger(FxWebView.class.getName()).log(Level.SEVERE, null, ex);
        }
        Platform.runLater(() -> {
            // Create the FxWebView
            WebView webView = new WebView();

            // Create the WebEngine
            final WebEngine webEngine = webView.getEngine();

            // LOad the Start-Page
            webEngine.load(url);

            // Update the stage title when a new web page title is available
            webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<State>() {
                @Override
                public void changed(ObservableValue<? extends State> ov, State oldState, State newState) {
                    if (newState == State.SUCCEEDED) {
                        String title = webEngine.getLocation();
                        SwingUtilities.invokeLater(() -> frame.setTitle(title));
                    }
                }
            });
            /*
            // Create the VBox
            VBox root = new VBox();
            // Add the FxWebView to the VBox
            root.getChildren().add(webView);

            // Set the Style-properties of the VBox
            root.setStyle("-fx-padding: 10;"
                    + "-fx-border-style: solid inside;"
                    + "-fx-border-width: 2;"
                    + "-fx-border-insets: 5;"
                    + "-fx-border-radius: 5;"
                    + "-fx-border-color: blue;");
             */
            // Create the Scene
            Scene scene = new Scene(webView);
//                // Add  the Scene to the Stage
            fXPanel.setScene(scene);
//                // Display the Stage
//                stage.show();
        });
    }
}

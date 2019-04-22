package com.capstone.insole.webapp.ui.view;

import com.capstone.insole.webapp.app.ClassifierExecutor;
import com.capstone.insole.webapp.app.HasLogger;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
public class MainView extends VerticalLayout implements HasLogger {

    private final String pythonPath = "C:\\Users\\agazor\\Anaconda3\\envs\\tf_gpu\\python";
    private final String pythonScriptPath = "C:\\Users\\agazor\\Desktop\\WEB\\examply.py";

    public MainView() {

        getLogger().debug("Starting app!");

        Button button = new Button("Click me",
                event -> {
                    Notification.show("Clicked!");
                    getLogger().info("A user clicked the button!");

                    ClassifierExecutor.execute(pythonPath, pythonScriptPath);
                    ClassifierExecutor.injectLines(pythonPath, pythonScriptPath);
                });


        add(button);
    }
}

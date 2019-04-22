package com.capstone.insole.webapp.ui.view;

import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the login-view.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("login-view")
@HtmlImport("src/view/login-view.html")
@Route("login")
public class LoginView extends PolymerTemplate<LoginView.LoginViewModel> {

    /**
     * Creates a new LoginView.
     */
    public LoginView() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between LoginView and login-view.html
     */
    public interface LoginViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

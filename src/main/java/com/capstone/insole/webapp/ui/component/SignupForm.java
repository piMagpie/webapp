package com.capstone.insole.webapp.ui.component;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the signup-form.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("signup-form")
@HtmlImport("src/view/signup-form.html")
public class SignupForm extends PolymerTemplate<SignupForm.SignupFormModel> {

    /**
     * Creates a new SignupForm.
     */
    public SignupForm() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between SignupForm and signup-form.html
     */
    public interface SignupFormModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}

package com.stepanov.wicket_springboot_2.Home;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Panel;

public class FormPanel extends Panel {

    public FormPanel(String id) {
        super(id);
        Label label = new Label("label", "Мой Label");
        add(label);
        add(new TextField<String>("textfield"));
        add(new Button("submitButton"));
        add(new Button("resetButton"));
    }
}

package com.stepanov.wicket_springboot_2.Home;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.TextField;

public class FormPage extends WebPage {

    public FormPage() {
        Label label = new Label("label", "Мой Label");
        add(label);
        add(new TextField<String>("textfield"));
    }
}

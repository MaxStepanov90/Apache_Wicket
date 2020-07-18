package com.stepanov.wicket_springboot_2.Home;

import org.apache.wicket.markup.html.WebPage;

public class FormPage extends WebPage {

    public FormPage() {
        add(new FormPanel("formPanel1"));
        add(new FormPanel("formPanel2"));
    }
}

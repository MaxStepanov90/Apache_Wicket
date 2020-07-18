package com.stepanov.wicket_springboot_2.Home;

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.TextField;

@WicketHomePage
public class HomePage extends WebPage {

    public HomePage() {

        Label label = new Label("label", "Мой Label");
        add(label);
        add(new TextField<String>("textfield"));
    }
}

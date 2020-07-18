package com.stepanov.wicket_springboot_2.Home;

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.behavior.AttributeAppender;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;

@WicketHomePage
public class HomePage extends WebPage {

    public HomePage() {
        add(new Link<FormPage>("linkId") {
            @Override
            public void onClick() {
                setResponsePage(FormPage.class);
            }
        });
        Label label = new Label("label", "Test");
        label.add(new AttributeModifier("style", "font-weight: bold"));
        label.add(new AttributeAppender("style", "font-size: 20px; color: red"));
        add(label);
    }
}

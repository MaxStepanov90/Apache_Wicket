package com.stepanov.wicket_springboot_2.Home;

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;
import org.apache.wicket.markup.html.WebPage;
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
    }
}

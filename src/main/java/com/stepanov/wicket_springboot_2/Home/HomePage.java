package com.stepanov.wicket_springboot_2.Home;

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.Model;

@WicketHomePage
public class HomePage extends WebPage {

    public HomePage() {
        add(new Link<FormPage>("linkId") {
            @Override
            public void onClick() {
                setResponsePage(FormPage.class);
            }
        });

        Label label = new Label("thanks", "Спасибо за Регистрацию!");
        label.add(new AttributeModifier("style", "font-size: 25px; color: blue"));
        label.setVisible(false);
        add(label);

        Form form = new Form("form") {
            @Override
            protected void onSubmit() {
                label.setVisible(true);
                super.onSubmit();
            }
        };
        form.add(new Label("name", "Введите имя"));
        form.add(new Label("surname", "Введите фамилию"));
        form.add(new TextField("nameText", Model.of("")));
        form.add(new TextField("surnameText", Model.of("")));
        form.add(new Button("submit"));
        add(form);

        final int messages = 1;
        WebMarkupContainer webMarkupContainer = new WebMarkupContainer("messages") {
            @Override
            protected void onConfigure() {
                super.onConfigure();
                setVisible(messages > 0);
            }
        };
        webMarkupContainer.add(new Label("amountOfMessages", messages));
        add(webMarkupContainer);

        OwnFragment ownFragment = new OwnFragment("content", "fragment", this);
        add(ownFragment);

        Label label1 = new Label("test1", "test string 1");
        add(label1);
        Label label2 = new Label("test2", "test string 2");
        add(label2);

        label1.setVisible(false);
    }
}

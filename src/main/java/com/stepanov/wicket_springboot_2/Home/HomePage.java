package com.stepanov.wicket_springboot_2.Home;

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.behavior.AttributeAppender;
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

        Label label = new Label("thanks","Спасибо за Регистрацию!");
        label.add(new AttributeModifier("style","font-size: 25px; color: blue"));
        label.setVisible(false);
        add(label);

        Form form = new Form("form"){
            @Override
            protected void onSubmit() {
                label.setVisible(true);
                super.onSubmit();
            }
        };
        form.add(new Label("name","Введите имя"));
        form.add(new Label("surname","Введите фамилию"));
        form.add(new TextField("nameText", Model.of("")));
        form.add(new TextField("surnameText", Model.of("")));
        form.add(new Button("submit"));
        add(form);

    }
}

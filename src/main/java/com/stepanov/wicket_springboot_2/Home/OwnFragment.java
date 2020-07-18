package com.stepanov.wicket_springboot_2.Home;

import org.apache.wicket.MarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Fragment;

public class OwnFragment extends Fragment {
    public OwnFragment(String id, String markupId, MarkupContainer markupProvider) {
        super(id, markupId, markupProvider);
        add(new Label("fragmentLabel","Content Fragment"));

    }
}

package com.evn.evn_retrofit_template.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "channel", strict = false)
public class RssChannel {
    @Element(name = "title")
    private String title;

    @ElementList(name = "item", inline = true)
    private List<RssItem> items;
}

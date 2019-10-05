package com.evn.evn_retrofit_template.model;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "rss", strict = false)
public class News {
    @Element(name = "channel")
    private RssChannel rssChannel;
}


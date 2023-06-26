package cn.w3home.springbootweb.entity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        log.debug("Greeting constructor");
        this.id = id;
        this.content = content;
    }

    public long getId() {
        log.debug("getId: " + id);
        return id;
    }

    public String getContent() {
        log.debug("getContent: " + content);
        return content;
    }
}

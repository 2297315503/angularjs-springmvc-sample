package com.hantsylabs.restexample.springmvc.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Hantsy Bai<hantsy@gmail.com>
 *
 */
public class PostDetails implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    private Long id;

    private String title;

    private String content;

    private Date createdDate;

    private Date lastModifiedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }


    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public String toString() {
        return "PostDetails{" + "id=" + id + ", title=" + title + ", content=" + content + ", createdDate=" + createdDate + ", lastModifiedDate=" + lastModifiedDate + '}';
    }

}

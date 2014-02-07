/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.petjar.entities;

/**
 *
 * @author THIISENAL
 */
public class ArticleContent {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLeadtext() {
        return leadtext;
    }

    public void setLeadtext(String leadtext) {
        this.leadtext = leadtext;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Boolean isIsVideoAttached() {
        return isVideoAttached;
    }

    public void setIsVideoAttached(Boolean isVideoAttached) {
        this.isVideoAttached = isVideoAttached;
    }

    public Boolean isIsPictureAttached() {
        return isPictureAttached;
    }

    public void setIsPictureAttached(Boolean isPictureAttached) {
        this.isPictureAttached = isPictureAttached;
    }
   private String title;
   private String leadtext;
   private String body;
   private Boolean isVideoAttached;
   private Boolean isPictureAttached;
}

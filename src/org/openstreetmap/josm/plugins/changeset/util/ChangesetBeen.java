/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openstreetmap.josm.plugins.changeset.util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;

/**
 *
 * @author ruben
 */
public class ChangesetBeen  {

    String date;
    String user;
    int changesetId;
    int delete;
    int create;
    int modify;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getChangesetId() {
        return changesetId;
    }

    public void setChangesetId(int changesetId) {
        this.changesetId = changesetId;
    }

    public int getDelete() {
        return delete;
    }

    public void setDelete(int delete) {
        this.delete = delete;
    }

    public int getCreate() {
        return create;
    }

    public void setCreate(int create) {
        this.create = create;
    }

    public int getModify() {
        return modify;
    }

    public void setModify(int modify) {
        this.modify = modify;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}

package com.cxby.web.forms;

import org.apache.struts.action.ActionForm;

import java.awt.*;
import java.sql.Blob;

/**
 * Created by liweiting on 15-5-17.
 */
public class BookForm extends ActionForm {
    private int id;           //书号
    private String name;      //书名
    private double price;     //价格
    private int type;         //类型
    private String productor; //出版社
    private int hot;          //热度


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }


}

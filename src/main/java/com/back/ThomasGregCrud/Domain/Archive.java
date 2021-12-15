package com.back.ThomasGregCrud.Domain;

public class Archive {

    private int id;
    private String company;
    private String box;
    private String bag;
    private String folder;
    private String document;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getCompany() {return company;}
    public void setCompany(String company) {this.company = company;}

    public String getBox() {return box;}
    public void setBox(String box) {this.box = box;}

    public String getBag() {return bag;}
    public void setBag(String bag) {this.bag = bag;}

    public String getFolder() {return folder;}
    public void setFolder(String folder) {this.folder = folder;}

    public String getDocument() {return document;}
    public void setDocument(String document) {this.document = document;}
}

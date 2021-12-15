package com.back.ThomasGregCrud.Persistence.Entity;

import javax.persistence.*;

@Entity
@Table(name = "archivo")
public class Archivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String empresa;
    private String caja;
    private String bolsa;
    private String carpeta;
    private String documento;

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getEmpresa() {return empresa;}
    public void setEmpresa(String empresa) {this.empresa = empresa;}

    public String getCaja() {return caja;}
    public void setCaja(String caja) {this.caja = caja;}

    public String getBolsa() {return bolsa;
    }public void setBolsa(String bolsa) {this.bolsa = bolsa;}

    public String getCarpeta() {return carpeta;}
    public void setCarpeta(String carpeta) {this.carpeta = carpeta;}

    public String getDocumento() {return documento;}
    public void setDocumento(String documento) {this.documento = documento;}
}
package com.github.sujankumarmitra.msscbreweryclient.model.v1;

import java.util.Objects;

public class ApiBeerV1 {

    private String id;
    private String name;
    private String style;
    private Long upc;

    public ApiBeerV1() {
    }

    public ApiBeerV1(String id, String name, String style, Long upc) {
        this.id = id;
        this.name = name;
        this.style = style;
        this.upc = upc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Long getUpc() {
        return upc;
    }

    public void setUpc(Long upc) {
        this.upc = upc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApiBeerV1 apiBeer = (ApiBeerV1) o;
        return Objects.equals(id, apiBeer.id) && Objects.equals(name, apiBeer.name) && Objects.equals(style, apiBeer.style) && Objects.equals(upc, apiBeer.upc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, style, upc);
    }

    @Override
    public String toString() {
        return "ApiBeerV1{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", style='" + style + '\'' +
                ", upc=" + upc +
                '}';
    }
}

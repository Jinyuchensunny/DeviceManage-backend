package zjc.devicemanage.org.model;

import lombok.ToString;

@ToString
public class Deviceclass {
    private Integer id;

    private String name;

    public Deviceclass(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Deviceclass() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}
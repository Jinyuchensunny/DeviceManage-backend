package zjc.devicemanage.org.model;

import lombok.ToString;

@ToString
public class Device {
    private Integer id;

    private Integer dcId;

    private String name;

    public Device(Integer id, Integer dcId, String name) {
        this.id = id;
        this.dcId = dcId;
        this.name = name;
    }

    public Device() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDcId() {
        return dcId;
    }

    public void setDcId(Integer dcId) {
        this.dcId = dcId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}
package kr.co.fastcampus.cafego.domain;

public class Restaurant {

    private final long id;
    private String name;
    private String address;


    public Restaurant(long id, String name, String address) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getInformation() {
        return name + " in " +address;
    }
}

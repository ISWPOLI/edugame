package sample.listadodetutores;

public class Person {
    private String name;
    private String priceHour;
    private String ciudad;
    private String tutoria;

    public Person(String name, String priceHour, String ciudad, String tutoria) {
        this.priceHour = priceHour;
        this.name = name;
        this.ciudad = ciudad;
        this.tutoria = tutoria;
    }

    public String getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(String priceHour) {
        this.priceHour = priceHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTutoria() {
        return tutoria;
    }

    public void setTutoria(String tutoria) {
        this.tutoria = tutoria;
    }
}

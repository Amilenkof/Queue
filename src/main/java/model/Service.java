package model;
//Класс с описание оказываемых услуг
public class Service {

    private final int idService;
    private final String name;

    public Service(int id, String name) {
        this.name = name;
        this.idService = id;
    }
}

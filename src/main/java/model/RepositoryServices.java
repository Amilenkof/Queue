package model;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

//хранилище всех предоставляемых услуг
@Component
@Scope
public class RepositoryServices {
    private  HashMap <Integer,Service> allServices;

    public RepositoryServices() {
        this.allServices = new HashMap<>();
    }

    public HashMap<Integer, Service> getAllServices() {
        return allServices;
    }

    public void setAllServices(HashMap<Integer, Service> allServices) {
        this.allServices = allServices;
    }
    @PostConstruct
    @Bean(name="repositoryServices")
    public Map<Integer,Service> setUp () {
        RepositoryServices repositoryServices=new RepositoryServices();
        repositoryServices.getAllServices().put(1, new Service(1, "Оформление дебетовых карт"));
        repositoryServices.getAllServices().put(2, new Service(2, "Оформление кредитных карт"));
        repositoryServices.getAllServices().put(3, new Service(3, "Консультация по кредитным продуктам"));
        repositoryServices.getAllServices().put(4, new Service(4, "Оплата по счетам"));
        repositoryServices.getAllServices().put(5, new Service(5, "Оформление брокерского счета"));
        repositoryServices.getAllServices().put(6, new Service(6, "Консультации по трастам"));
        repositoryServices.getAllServices().put(7, new Service(7, "Ипотека"));
        return allServices;
    }
}

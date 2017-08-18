package info.thuannho.jsfshop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import info.thuannho.jsfshop.entity.Car;
//import org.primefaces.showcase.domain.Car;
import info.thuannho.jsfshop.service.CarService;
	 
@ManagedBean
@ViewScoped
public class CarouselView implements Serializable {
	     
	    private List<Car> cars; 
	     
	    private Car selectedCar;
	     
	   // @ManagedProperty("service")
	    private CarService service;
	     
	    @PostConstruct
	    public void init() {
	    	cars = new ArrayList<Car>();
	    	service = new CarService();
	        cars = service.createCars(9);
	    }
	 
	    public List<Car> getCars() {
	        return cars;
	    }
	 
	    public void setService(CarService service) {
	        this.service = service;
	    }
	 
	    public Car getSelectedCar() {
	        return selectedCar;
	    }
	 
	    public void setSelectedCar(Car selectedCar) {
	        this.selectedCar = selectedCar;
	    }
	}



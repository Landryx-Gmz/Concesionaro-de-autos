
package mypc.automovil.logica;

import java.util.List;
import mypc.automovil.persistencia.ControladoraPersistencia;

public class Controladora {
    //1 LLamamos a la controladora de la persistencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarAutomovil(String modelo, String marca, String motor, String color,//metodo creado por la controladora de la logica 
            String patente, int cantPuertas) {

 //2 Creamos una nueva variable isntanciada para poder traer todos los parametros para despues guardarlos
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
 //3 Delegamos en el control de la persistencia para que se guarde en la base de datos craeando el metodo en la controladora de persistencia      
        controlPersis.agregarAutomovil(auto);
        
    }

    public List<Automovil> traerAutos() {
        return controlPersis.traerAutos();
    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);//Creamos el metodo que arrastramos creando desde el boton eliminar de consultarAutomovil
        
    }

    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, 
            String color, String patente, int cantPuertas) {
    auto.setModelo(modelo);
    auto.setMarca(marca);
    auto.setMotor(motor);
    auto.setColor(color);
    auto.setPatente(patente);
    auto.setCantPuertas(cantPuertas);
    
    //Pedimos a persistencia que modifique
    controlPersis.modificarAuto(auto);
    
    }

   
    
}

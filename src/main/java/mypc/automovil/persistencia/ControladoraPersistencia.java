
package mypc.automovil.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mypc.automovil.logica.Automovil;
import mypc.automovil.persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
 //1 Creamos una instancia para que la controladora pueda guardas los datos nuevos en la BD para obtener todos lo metodos del JPA controller
    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {//metodo creado desde la controladora de la logica
        autoJpa.create(auto);//2 Utilizamos el metodo para crear desde el JPA controller pasando nuestra variable donde se encutntran los datos
    }
//IMPORTANTE: Una vez llegados a este punto es muy iportante declarar las depencidencias mediante mysql-connector-java-0.0.30 para que no nos de error en Dependencies.

    public List<Automovil> traerAutos() {
        return autoJpa.findAutomovilEntities();
    }

    public void borrarAuto(int idAuto) {//Metodo Arrastrado desde el boton de eliminar de consultaAuto , utilizamos el metod destroy de JPA
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAuto(int idAuto) {
        return autoJpa.findAutomovil(idAuto);
    }

    public void modificarAuto(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    
    
}

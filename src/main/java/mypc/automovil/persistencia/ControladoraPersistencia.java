
package mypc.automovil.persistencia;

import mypc.automovil.logica.Automovil;

public class ControladoraPersistencia {
 //1 Creamos una instancia para que la controladora pueda guardas los datos nuevos en la BD para obtener todos lo metodos del JPA controller
    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {//metodo creado desde la controladora de la logica
        autoJpa.create(auto);//2 Utilizamos el metodo para crear desde el JPA controller pasando nuestra variable donde se encutntran los datos
    }
//IMPORTANTE: Una vez llegados a este punto es muy iportante declarar las depencidencias mediante mysql-connector-java-0.0.30 para que no nos de error en Dependencies.
    
}

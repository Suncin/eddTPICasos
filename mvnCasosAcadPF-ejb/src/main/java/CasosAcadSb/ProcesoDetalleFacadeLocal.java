/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasosAcadSb;

import java.util.List;
import javax.ejb.Local;
import tpi.casosacadpf.libreriamavencasosacadpf.ProcesoDetalle;

/**
 *
 * @author debian
 */
@Local
public interface ProcesoDetalleFacadeLocal {

     boolean create(ProcesoDetalle procesoDetalle);

    //void edit(ProcesoDetalle procesoDetalle);

    boolean editar(ProcesoDetalle procesoDetalle);
    
    boolean remove(ProcesoDetalle procesoDetalle);

    ProcesoDetalle find(Object id);

    List<ProcesoDetalle> findAll();

    List<ProcesoDetalle> findRange(int[] range);

    int count();
    
}

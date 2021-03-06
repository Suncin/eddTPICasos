/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasosAcadSb;

import java.util.List;
import javax.ejb.Local;
import tpi.casosacadpf.libreriamavencasosacadpf.Paso;

/**
 *
 * @author debian
 */
@Local
public interface PasoFacadeLocal {

    boolean create(Paso paso);

    //void edit(Paso paso);
    boolean editar(Paso paso);

    boolean remove(Paso paso);

    Paso find(Object id);

    List<Paso> findAll();

    List<Paso> findRange(int[] range);

    int count();

}

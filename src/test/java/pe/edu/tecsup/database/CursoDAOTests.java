package pe.edu.tecsup.database;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pe.edu.tecsup.database.dao.CursoDAO;
import pe.edu.tecsup.database.model.Curso;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CursoDAOTests {

    @Autowired
    CursoDAO cursoDAO;

    @Test
    public void verifyList() {

        List <Curso> cursos = cursoDAO.list();
        
        for (Curso curso : cursos) {
            System.out.println(curso.getId());
            System.out.println(curso.getNombre());
            System.out.println(curso.getCodigo());
            
        }
        Assert.assertTrue(cursos.size() > 0);
    }

   // @Test
    public void verifyFind() {
        Curso curso = cursoDAO.get(1l);
        System.out.println(curso.getNombre());
        Assert.assertTrue(curso.getId() == 1l);
    }

    @Test
    public void verifySave() {

        Curso curso = new Curso();
        curso.setCodigo("1030");
        curso.setNombre("Nuevo Programa  jose luis");
        curso.setNombre("......");

        cursoDAO.save(curso);
        Assert.assertTrue(curso.getId() != null);
    }

//    @Test
//    public void verifyUpdate() {
//
//        // cambiar el código para validar
//        Programa programa = new Programa();
//        programa.setId(15l);
//        programa.setCodigo("1030");
//        programa.setNombre("Programa Modificado por jose luis");
//
//        programaDAO.update(programa);
//        Assert.assertTrue(programaDAO.get(15l).getCodigo().equals("1030"));
//    }


//    @Test
//    public void verifyUpdate() {
//
//        // cambiar el código para validar
//        Programa programa = new Programa();
//        programa.setId(15);
//        programa.setCodigo("1030");
//        programa.setNombre("Programa Modificado por jose luis");
//
//        programaDAO.update(programa);
//        Assert.assertTrue(programaDAO.get(15).getCodigo());
//    }    
    

//    @Test
//    public void verifyDelete() {
//
//        Programa programa = new Programa();
//        programa.setId(58l);
//        programaDAO.delete(programa);
//
//        Assert.assertTrue(programaDAO.get(58l) == null);
//    }

}



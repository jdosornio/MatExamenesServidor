/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.facade;

import java.util.List;
import modelo.dao.DAOServiceLocator;
import modelo.dto.CursoDTO;
import modelo.dto.TemaDTO;

/**
 *
 * @author ivan
 */
public class CursoFACADE extends BaseFACADE<CursoDTO, Integer> {
    
    /**
     * Obtener los temas de un curso
     * @param curso el curso
     * @return los temas de dicho curso
     */
    public List<TemaDTO> obtenerTemasDeCurso(CursoDTO curso) {
        List<TemaDTO> listaTemas;
        
        listaTemas = DAOServiceLocator.getCursoDAO().obtenerTemas(curso);
        return listaTemas;
    }
}
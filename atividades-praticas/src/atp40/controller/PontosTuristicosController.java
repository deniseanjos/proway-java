package controller;

import dao.PontosTuristicosDao;
import model.PontosTuristicos;

public class PontosTuristicosController extends BaseController<PontosTuristicos> {
    
    public PontosTuristicosController(){
        super(new PontosTuristicosDao());
    }
}

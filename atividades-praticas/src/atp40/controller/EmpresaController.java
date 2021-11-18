package controller;

import dao.EmpresaDao;
import model.Empresa;

public class EmpresaController extends BaseController<Empresa>{

    public EmpresaController(){
        super(new EmpresaDao());
    }
    
}

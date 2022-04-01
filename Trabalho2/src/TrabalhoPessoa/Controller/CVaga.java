/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoPessoa.Controller;

import TrabalhoPessoa.Model.Vaga;
import java.util.ArrayList;
import TrabalhoPessoaJF.PessoaJF;

/**
 *
 * @author Rafael
 */
public class CVaga implements InterfaceController<Vaga>{

    ArrayList<Vaga> vagas = new ArrayList<>();
    int idVaga = 1;
    
    @Override
    public void add(Vaga o) {
        vagas.add(o);
    }

    @Override
    public ArrayList<Vaga> getAll() {
        return vagas;
    }

    @Override
    public boolean deletar(Vaga o) {
        boolean del = vagas.remove(o);
        return  del;
    }

    @Override
    public Vaga getByDoc(String d) {
       return null;
    }

    @Override
    public int gerarId() {
        return idVaga++;
    }
    
    public void mokVagas(){
        Vaga v1 = new Vaga();
        v1.setIdVaga(gerarId());
        v1.setTpVaga("Carro");
        v1.setC(PessoaJF.cadCarros.getByDoc("CHS6647"));
        vagas.add(v1);
        
        Vaga v2 = new Vaga();
        v2.setIdVaga(gerarId());
        v2.setTpVaga("Carro");
        v2.setC(PessoaJF.cadCarros.getByDoc("IPP1234"));
        vagas.add(v2);
    }
    
}

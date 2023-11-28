package Controle;

import DAO.AlterarInstituicaoDAO;
import Interface.InterfaceControle;
import Modelo.AlterarInstituicaoModelo;

public class AlterarInstituicaoControle implements InterfaceControle {
    
    AlterarInstituicaoModelo AIM = new AlterarInstituicaoModelo();
    AlterarInstituicaoDAO AID = new AlterarInstituicaoDAO();
    
    @Override
    public void salvarControle(Object... valor) {
        AIM.setIdInstituicao((int)valor[0]);
        AIM.setNomeInstituicao((String)valor[1]);
        
        //Enviar os dados para o DAO
        AID.salvarDAO(AIM);
    }

    @Override
    public void excluirControle(Object... valor) {
        
    }
    
}

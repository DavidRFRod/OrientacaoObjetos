/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import controle.Conexao;
import java.sql.Connection; 

/**
 * @since 08/08/2018
 * @author David Raphael Freitas Rodrigues
 */
public class TestaConexao {

    public static void main(String[] args) {
        Connection conexao = Conexao.getConexao();
        Conexao.setFechaConexao(conexao);
    }

}

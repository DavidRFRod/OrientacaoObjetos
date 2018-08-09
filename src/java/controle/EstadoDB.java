/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Estado;

/**
 *
 * @author 43083
 */
public class EstadoDB {
    
    public static ArrayList getEstados(Connection conexao) {
        ArrayList lista = new ArrayList();
        try{
            Statement st = conexao.createStatement(rs);
            ResultSet rs = st.executeQuery("SELECT * FROM estado");
            while( rs.next()){
                String sigla = rs.getString("est_sigla");
                String nome = rs.getString("nome");
                Estado estado =  new Estado(sigla, nome);
                lista.add(estado);
            }
            catch(SQLException erro){
                   System.out.println("Erro de SQL:" + erro.Message());
                   System.out.println("Erro de SQL:" + erro.Message());
                    }
        }
        return lista;
    }
}

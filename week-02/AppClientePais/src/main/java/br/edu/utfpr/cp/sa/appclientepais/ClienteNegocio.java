package br.edu.utfpr.cp.sa.appclientepais;

import java.util.HashSet;
import java.util.Set;

public class ClienteNegocio implements INegocio<Cliente>{

    private Set<Cliente> lista;

    public ClienteNegocio() {
        lista = new HashSet<>();
    }

    @Override
    public void incluir(Cliente cliente) throws ObjetoJaExisteException {
        if (!lista.add(cliente))
            throw new ObjetoJaExisteException();
    }

    @Override
    public Set<Cliente> listar() {
        return lista;
    }
}

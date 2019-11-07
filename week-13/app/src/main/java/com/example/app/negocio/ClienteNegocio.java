package com.example.app.negocio;

import com.example.app.negocio.dominio.ClienteDTO;
import com.example.app.negocio.dominio.PaisDTO;
import com.example.app.negocio.excecao.ObjetoJaExisteException;
import com.example.app.persistencia.ClienteDAO;
import com.example.app.persistencia.PaisDAO;
import java.util.HashSet;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ClienteNegocio implements INegocio<ClienteDTO>{

    private final ClienteDAO clienteDAO;

    @Override
    public void incluir(ClienteDTO cliente) throws ObjetoJaExisteException {
        if (clienteDAO.findById(Long.valueOf(cliente.getId())).isPresent())
            throw new ObjetoJaExisteException();
        
        clienteDAO.save(ClienteDTO.EntityFromDTO(cliente));
    }

    @Override
    public Set<ClienteDTO> listar() {
        return ClienteDTO.DTOsFromEntities(clienteDAO.findAll());
    }
}

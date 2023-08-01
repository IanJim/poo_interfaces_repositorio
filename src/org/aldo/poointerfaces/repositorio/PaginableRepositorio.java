package org.aldo.poointerfaces.repositorio;

import org.aldo.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}

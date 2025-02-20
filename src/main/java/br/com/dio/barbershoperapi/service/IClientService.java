package br.com.dio.barbershoperapi.service;

import br.com.dio.barbershopui.entity.ClientEntity;

public interface IClientService {

    ClientEntity save(final ClientEntity entity);

    ClientEntity update(final ClientEntity entity);

    void delete(final long id);

}

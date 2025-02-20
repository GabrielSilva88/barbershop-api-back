package br.com.dio.barbershoperapi.service;

import br.com.dio.barbershopui.entity.ScheduleEntity;

public interface IScheduleService {

    ScheduleEntity save(final ScheduleEntity entity);

    void delete(final long id);

}

package gal.san.clemente.tarefa_4_orm.model.converter;

import java.util.List;

public interface IConverter<C, E> {
    List<E> converterKToE(C from);
}

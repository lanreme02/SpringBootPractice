package com.ibokoko;
import com.ibokoko.ResultParam;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
interface MyRepository extends CrudRepository<ResultParam, Long> {


}

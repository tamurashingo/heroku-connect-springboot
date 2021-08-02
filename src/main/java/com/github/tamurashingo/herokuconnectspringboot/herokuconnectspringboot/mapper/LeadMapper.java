package com.github.tamurashingo.herokuconnectspringboot.herokuconnectspringboot.mapper;

import com.github.tamurashingo.herokuconnectspringboot.herokuconnectspringboot.model.Lead;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LeadMapper {

    @Select(
        " SELECT"
      + "   id, "
      + "   externalid, "
      + "   firstname, "
      + "   lastname "
      + " FROM "
      + "  lead "
      + " ORDER BY "
      + "   createddate "
    )
    List<Lead> selectAll();
}

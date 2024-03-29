package runstatic.cloudexamples.cloudwebexample.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import runstatic.cloudexamples.cloudwebexample.entity.Message;

import java.util.List;

/**
 * @author chenmoand
 */
@Mapper
public interface MessageMapper extends tk.mybatis.mapper.common.Mapper<Message> {

    List<Message> queryAllDesc(String fieldName);

}

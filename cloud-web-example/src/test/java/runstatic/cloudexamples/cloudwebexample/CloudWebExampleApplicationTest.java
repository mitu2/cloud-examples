package runstatic.cloudexamples.cloudwebexample;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import runstatic.cloudexamples.cloudwebexample.mapper.MessageMapper;

/**
 * @author chenmoand
 */
@SpringBootTest
class CloudWebExampleApplicationTest {

    @Autowired
    private MessageMapper mapper;
    @Autowired
    private ApplicationContext context;

    @Test
    void testMessageMapper() {
        try (Page<?> ignored = PageHelper.startPage(1, 1)) {
            mapper.queryAllDesc("nsensitive");
        }
        // MybatisAutoConfiguration mybatisAutoConfiguration = context.getBean(MybatisAutoConfiguration.class);
        // System.out.println(mybatisAutoConfiguration);
        PageHelperAutoConfiguration pageHelperAutoConfiguration = context.getBean(PageHelperAutoConfiguration.class);
        System.out.println(pageHelperAutoConfiguration);


    }

}
package com.juzi.jwzx.bean;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 时间
 *
 * @author Juzi
 * @date 2019/9/12 12:10
 * Blog https://juzibiji.top
 */
@Data
@Accessors(chain = true)
public class JwzxDate {
    
    /**
     * 学年
     */
    private String studyYear;
    
    /**
     * 学期（1/2）
     */
    private String term;
    
    /**
     * 第几周
     */
    private Integer week;
    
    /**
     * 星期几(1-7)
     */
    private Integer day;
    
}

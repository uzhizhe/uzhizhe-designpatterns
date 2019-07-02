package com.uzhizhe.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author qingjiang.li
 * @since 2019-07-01 3:59 PM
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
@Builder()
public class Book {


    private Integer id;
    private String name;
    private String price;
    private Date createTime;

}

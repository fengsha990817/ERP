package com.example.backend.mapper;

import com.example.backend.entity.TableReturnEntity;
import org.apache.ibatis.annotations.*;

@Mapper
public interface TableEntityMapper {

    @Results(id="TableReturnEntityMap", value = {
            @Result(column = "is_approval", property = "isApproval"),
            @Result(column = "info_state", property = "infoState"),
            @Result(column = "date_create", property = "dateCreate"),
            @Result(column = "date_update", property = "dateUpdate"),
            @Result(column = "goods_type", property = "goodsType"),
            @Result(column = "warehouse_type", property = "warehouseType"),
            @Result(column = "page_number", property = "pageNumber"),
            @Result(column = "product_name", property = "productName"),
            @Result(column = "amount_type", property = "amountType"),
            @Result(column = "buy_in_staff", property = "buyInStaff")
    })
    @Select("select * from goods where manufacture = #{manufacture}")
    TableReturnEntity findEntityByManufacture(String manufacture);

    @ResultMap("TableReturnEntityMap")
    @Select("select * from goods where page_number = #{pageNumber}")
    TableReturnEntity findEntityByPageNumber(String pageNumber);


}

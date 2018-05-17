package secondhandtrade.paltform.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import secondhandtrade.paltform.model.TradeDetail;

public interface TradeDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_detail
     *
     * @mbggenerated Thu May 17 21:51:15 CST 2018
     */
    int deleteByPrimaryKey(@Param("tId") String tId, @Param("pId") String pId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_detail
     *
     * @mbggenerated Thu May 17 21:51:15 CST 2018
     */
    int insert(TradeDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_detail
     *
     * @mbggenerated Thu May 17 21:51:15 CST 2018
     */
    TradeDetail selectByPrimaryKey(@Param("tId") String tId, @Param("pId") String pId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_detail
     *
     * @mbggenerated Thu May 17 21:51:15 CST 2018
     */
    List<TradeDetail> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_detail
     *
     * @mbggenerated Thu May 17 21:51:15 CST 2018
     */
    int updateByPrimaryKey(TradeDetail record);
}
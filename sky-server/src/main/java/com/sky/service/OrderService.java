package com.sky.service;

import com.sky.dto.OrdersSubmitDTO;
import com.sky.vo.OrderSubmitVO;

public interface OrderService {

	/**
	 * 提交订单。
	 * 这里返回的是后端生成的下单结果，而不是前端提交的请求数据，
	 * 支付页会依赖返回值中的订单金额和下单时间做展示与倒计时。
	 */
	OrderSubmitVO submitOrder(OrdersSubmitDTO ordersSubmitDTO);
}

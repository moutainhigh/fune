package com.d2c.shop.modules.order.controller;

import com.d2c.shop.common.api.base.extension.BaseExcelCtrl;
import com.d2c.shop.modules.order.model.PurchDO;
import com.d2c.shop.modules.order.query.PurchQuery;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BaiCai
 */
@Api(description = "采购单管理")
@RestController
@RequestMapping("/back/purch")
public class PurchController extends BaseExcelCtrl<PurchDO, PurchQuery> {

}

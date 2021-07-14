package asia.asoulcnki.api.controller;

import asia.asoulcnki.api.common.response.ApiResult;
import asia.asoulcnki.api.persistence.service.IASPropService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("prop")
@Api(tags = "动态配置相关")
public class ASPropController {

    @Autowired
    private IASPropService asPropService;

    @GetMapping("banner")
    @ApiOperation("获取横幅配置")
    public ApiResult<Map<String, Object>> handlerGetBanner() {
        return ApiResult.ok(asPropService.getBanner());
    }


}

package asia.asoulcnki.api.persistence.service.impl;

import asia.asoulcnki.api.common.constant.PropConstant;
import asia.asoulcnki.api.common.constant.PropTypeEnum;
import asia.asoulcnki.api.common.util.JSONUtil;
import asia.asoulcnki.api.persistence.service.IASPropService;
import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class ASPropServiceImpl implements IASPropService {
    private final static Logger log = LoggerFactory.getLogger(ASPropServiceImpl.class);

    @Value("${secure.expire}")
    private Double expire;

    @Override
    public Map<String, Object> getBanner() {
        Map<String, Object> bannerProp = JSONUtil.readJSON2Map(PropConstant.BANNER_PROP);
        if (bannerProp.containsKey("expire")) {
            expire = System.currentTimeMillis() + Double.parseDouble(bannerProp.get("expire").toString()) * PropConstant.ONE_DATE_MIL;
        } else {
            expire = System.currentTimeMillis() + expire * 1000;
        }
        bannerProp.put("expire", expire);
        bannerProp.put("type", PropTypeEnum.IMAGE.getType());
        return bannerProp;
    }
}


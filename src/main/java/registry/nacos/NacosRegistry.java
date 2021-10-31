package registry.nacos;

import registry.RegistryService;
import registry.ServiceMetaData;

/**
 * @author yiminlin
 * @date 2021/10/31 10:43 下午
 * @description 基于nacos实现的注册中心
 **/
public class NacosRegistry implements RegistryService {
    @Override
    public boolean register(ServiceMetaData metaData) {
        return false;
    }

    @Override
    public boolean unregister(ServiceMetaData metaData) {
        return false;
    }

    @Override
    public ServiceMetaData discovery(String serviceName, String version) {
        return null;
    }
}

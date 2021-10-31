package registry.consul;

import registry.RegistryService;
import registry.ServiceMetaData;

/**
 * @author yiminlin
 * @date 2021/10/31 10:47 下午
 * @description 基于consul实现的注册中心
 **/
public class ConsulRegistry implements RegistryService {
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

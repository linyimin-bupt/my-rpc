package registry.zookeeper;

import registry.RegistryService;
import registry.ServiceMetaData;

/**
 * @author yiminlin
 * @date 2021/10/31 10:09 下午
 * @description 基于zookeeper实现的注册中心
 **/
public class ZookeeperRegistry implements RegistryService {

    public ZookeeperRegistry(String registryAddress) {

    }

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

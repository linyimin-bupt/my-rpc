package registry;

import registry.consul.ConsulRegistry;
import registry.etcd.EtcdRegistry;
import registry.eureka.EurekaRegistry;
import registry.nacos.NacosRegistry;
import registry.zookeeper.ZookeeperRegistry;

/**
 * @author yiminlin
 * @date 2021/10/31 9:58 下午
 * @description 服务注册中心类型
 **/
public enum RegistryType {
    /**
     * 注册中心
     */
    zookeeper(ZookeeperRegistry.class),
    nacos(NacosRegistry.class),
    eureka(EurekaRegistry.class),
    etcd(EtcdRegistry.class),
    consul(ConsulRegistry.class);

    private final Class<? extends RegistryService> value;

    RegistryType(Class<? extends RegistryService> value) {
        this.value = value;
    }

    public Class<? extends RegistryService> getValue() {
        return this.value;
    }

}

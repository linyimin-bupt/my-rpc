package registry;

import java.lang.reflect.Constructor;
import java.util.Objects;

/**
 * @author yiminlin
 * @date 2021/10/31 10:15 下午
 * @description 创建服务注册中心工厂类
 **/
public class RegistryServiceFactory {
    private static volatile RegistryService registryService;

    /**
     * 获取注册中心实例
     * @param registryType {@link RegistryType} 注册中心类型
     * @param registryAddress 注册中心地址
     * @return {@link RegistryService} 注册中心实例
     */
    public static RegistryService getInstance(RegistryType registryType, String registryAddress) {
        if (Objects.nonNull(registryService)) {
            if (Objects.equals(registryType.getValue(), registryService.getClass())) {
                return registryService;
            }
            throw new RuntimeException("Unsupported use of two different registries at the same time.");
        }
        synchronized (RegistryServiceFactory.class) {
            if (Objects.isNull(registryService)) {
                try {
                    registryService = registryType.getValue().getDeclaredConstructor(String.class).newInstance(registryAddress);
                } catch (Exception ignored) {
                    // do nothing
                }
            }
        }
        return registryService;
    }

    /**
     * 获取基于zookeeper实现的注册中心
     * @param registryAddress zookeeper地址
     * @return {@link RegistryService} 基于zookeeper实现的注册中心实例
     */
    public static RegistryService getInstance(String registryAddress) {
        return getInstance(RegistryType.zookeeper, registryAddress);
    }

}

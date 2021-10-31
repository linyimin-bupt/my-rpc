package registry;

/**
 * @author yiminlin
 * @date 2021/10/31 9:58 下午
 * @description 服务注册接口
 **/
public interface RegistryService {
    /**
     * 注册服务
     * @param metaData {@link ServiceMetaData} 服务元数据
     * @return true: 注册成功，false: 注册失败
     */
    boolean register(ServiceMetaData metaData);

    /**
     * 移除服务
     * @param metaData {@link ServiceMetaData} 服务元数据
     * @return true: 移除成功，false: 移除失败
     */
    boolean unregister(ServiceMetaData metaData);

    /**
     * 服务发现
     * @param serviceName 服务名称
     * @param version 服务版本
     * @return {@link ServiceMetaData} 服务元数据
     */
    ServiceMetaData discovery(String serviceName, String version);

}

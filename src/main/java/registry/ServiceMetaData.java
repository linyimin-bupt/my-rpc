package registry;

/**
 * @author yiminlin
 * @date 2021/10/31 9:51 下午
 * @description 服务元数据
 **/
public class ServiceMetaData {
    /**
     * 服务名称
     */
    private String serviceName;
    /**
     * 服务版本
     */
    private String serviceVersion;

    /**
     * 服务地址
     */
    private String serviceAddress;

    /**
     * 服务端口
     */
    private Integer servicePort;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    public Integer getServicePort() {
        return servicePort;
    }

    public void setServicePort(Integer servicePort) {
        this.servicePort = servicePort;
    }
}

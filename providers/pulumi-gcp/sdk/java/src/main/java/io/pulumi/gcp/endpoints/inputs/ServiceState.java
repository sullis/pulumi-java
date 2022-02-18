// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.endpoints.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.endpoints.inputs.ServiceApiGetArgs;
import io.pulumi.gcp.endpoints.inputs.ServiceEndpointGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceState extends io.pulumi.resources.ResourceArgs {

    public static final ServiceState Empty = new ServiceState();

    /**
     * A list of API objects.
     * 
     */
    @InputImport(name="apis")
    private final @Nullable Input<List<ServiceApiGetArgs>> apis;

    public Input<List<ServiceApiGetArgs>> getApis() {
        return this.apis == null ? Input.empty() : this.apis;
    }

    /**
     * The autogenerated ID for the configuration that is rolled out as part of the creation of this resource. Must be provided
     * to compute engine instances as a tag.
     * 
     */
    @InputImport(name="configId")
    private final @Nullable Input<String> configId;

    public Input<String> getConfigId() {
        return this.configId == null ? Input.empty() : this.configId;
    }

    /**
     * The address at which the service can be found - usually the same as the service name.
     * 
     */
    @InputImport(name="dnsAddress")
    private final @Nullable Input<String> dnsAddress;

    public Input<String> getDnsAddress() {
        return this.dnsAddress == null ? Input.empty() : this.dnsAddress;
    }

    /**
     * A list of Endpoint objects.
     * 
     */
    @InputImport(name="endpoints")
    private final @Nullable Input<List<ServiceEndpointGetArgs>> endpoints;

    public Input<List<ServiceEndpointGetArgs>> getEndpoints() {
        return this.endpoints == null ? Input.empty() : this.endpoints;
    }

    /**
     * The full text of the Service Config YAML file (Example located here). If provided, must also provide
     * protoc_output_base64. open_api config must not be provided.
     * 
     */
    @InputImport(name="grpcConfig")
    private final @Nullable Input<String> grpcConfig;

    public Input<String> getGrpcConfig() {
        return this.grpcConfig == null ? Input.empty() : this.grpcConfig;
    }

    /**
     * The full text of the OpenAPI YAML configuration as described here. Either this, or both of grpc_config and
     * protoc_output_base64 must be specified.
     * 
     */
    @InputImport(name="openapiConfig")
    private final @Nullable Input<String> openapiConfig;

    public Input<String> getOpenapiConfig() {
        return this.openapiConfig == null ? Input.empty() : this.openapiConfig;
    }

    /**
     * The project ID that the service belongs to. If not provided, provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The full contents of the Service Descriptor File generated by protoc. This should be a compiled .pb file,
     * base64-encoded.
     * 
     */
    @InputImport(name="protocOutputBase64")
    private final @Nullable Input<String> protocOutputBase64;

    public Input<String> getProtocOutputBase64() {
        return this.protocOutputBase64 == null ? Input.empty() : this.protocOutputBase64;
    }

    /**
     * The name of the service. Usually of the form $apiname.endpoints.$projectid.cloud.goog.
     * 
     */
    @InputImport(name="serviceName")
    private final @Nullable Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName == null ? Input.empty() : this.serviceName;
    }

    public ServiceState(
        @Nullable Input<List<ServiceApiGetArgs>> apis,
        @Nullable Input<String> configId,
        @Nullable Input<String> dnsAddress,
        @Nullable Input<List<ServiceEndpointGetArgs>> endpoints,
        @Nullable Input<String> grpcConfig,
        @Nullable Input<String> openapiConfig,
        @Nullable Input<String> project,
        @Nullable Input<String> protocOutputBase64,
        @Nullable Input<String> serviceName) {
        this.apis = apis;
        this.configId = configId;
        this.dnsAddress = dnsAddress;
        this.endpoints = endpoints;
        this.grpcConfig = grpcConfig;
        this.openapiConfig = openapiConfig;
        this.project = project;
        this.protocOutputBase64 = protocOutputBase64;
        this.serviceName = serviceName;
    }

    private ServiceState() {
        this.apis = Input.empty();
        this.configId = Input.empty();
        this.dnsAddress = Input.empty();
        this.endpoints = Input.empty();
        this.grpcConfig = Input.empty();
        this.openapiConfig = Input.empty();
        this.project = Input.empty();
        this.protocOutputBase64 = Input.empty();
        this.serviceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ServiceApiGetArgs>> apis;
        private @Nullable Input<String> configId;
        private @Nullable Input<String> dnsAddress;
        private @Nullable Input<List<ServiceEndpointGetArgs>> endpoints;
        private @Nullable Input<String> grpcConfig;
        private @Nullable Input<String> openapiConfig;
        private @Nullable Input<String> project;
        private @Nullable Input<String> protocOutputBase64;
        private @Nullable Input<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apis = defaults.apis;
    	      this.configId = defaults.configId;
    	      this.dnsAddress = defaults.dnsAddress;
    	      this.endpoints = defaults.endpoints;
    	      this.grpcConfig = defaults.grpcConfig;
    	      this.openapiConfig = defaults.openapiConfig;
    	      this.project = defaults.project;
    	      this.protocOutputBase64 = defaults.protocOutputBase64;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setApis(@Nullable Input<List<ServiceApiGetArgs>> apis) {
            this.apis = apis;
            return this;
        }

        public Builder setApis(@Nullable List<ServiceApiGetArgs> apis) {
            this.apis = Input.ofNullable(apis);
            return this;
        }

        public Builder setConfigId(@Nullable Input<String> configId) {
            this.configId = configId;
            return this;
        }

        public Builder setConfigId(@Nullable String configId) {
            this.configId = Input.ofNullable(configId);
            return this;
        }

        public Builder setDnsAddress(@Nullable Input<String> dnsAddress) {
            this.dnsAddress = dnsAddress;
            return this;
        }

        public Builder setDnsAddress(@Nullable String dnsAddress) {
            this.dnsAddress = Input.ofNullable(dnsAddress);
            return this;
        }

        public Builder setEndpoints(@Nullable Input<List<ServiceEndpointGetArgs>> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder setEndpoints(@Nullable List<ServiceEndpointGetArgs> endpoints) {
            this.endpoints = Input.ofNullable(endpoints);
            return this;
        }

        public Builder setGrpcConfig(@Nullable Input<String> grpcConfig) {
            this.grpcConfig = grpcConfig;
            return this;
        }

        public Builder setGrpcConfig(@Nullable String grpcConfig) {
            this.grpcConfig = Input.ofNullable(grpcConfig);
            return this;
        }

        public Builder setOpenapiConfig(@Nullable Input<String> openapiConfig) {
            this.openapiConfig = openapiConfig;
            return this;
        }

        public Builder setOpenapiConfig(@Nullable String openapiConfig) {
            this.openapiConfig = Input.ofNullable(openapiConfig);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setProtocOutputBase64(@Nullable Input<String> protocOutputBase64) {
            this.protocOutputBase64 = protocOutputBase64;
            return this;
        }

        public Builder setProtocOutputBase64(@Nullable String protocOutputBase64) {
            this.protocOutputBase64 = Input.ofNullable(protocOutputBase64);
            return this;
        }

        public Builder setServiceName(@Nullable Input<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public Builder setServiceName(@Nullable String serviceName) {
            this.serviceName = Input.ofNullable(serviceName);
            return this;
        }

        public ServiceState build() {
            return new ServiceState(apis, configId, dnsAddress, endpoints, grpcConfig, openapiConfig, project, protocOutputBase64, serviceName);
        }
    }
}

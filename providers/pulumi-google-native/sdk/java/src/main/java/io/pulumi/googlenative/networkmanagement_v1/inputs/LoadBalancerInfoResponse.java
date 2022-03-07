// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.networkmanagement_v1.inputs.LoadBalancerBackendResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * For display only. Metadata associated with a load balancer.
 * 
 */
public final class LoadBalancerInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoadBalancerInfoResponse Empty = new LoadBalancerInfoResponse();

    /**
     * Type of load balancer's backend configuration.
     * 
     */
    @InputImport(name="backendType", required=true)
      private final String backendType;

    public String getBackendType() {
        return this.backendType;
    }

    /**
     * Backend configuration URI.
     * 
     */
    @InputImport(name="backendUri", required=true)
      private final String backendUri;

    public String getBackendUri() {
        return this.backendUri;
    }

    /**
     * Information for the loadbalancer backends.
     * 
     */
    @InputImport(name="backends", required=true)
      private final List<LoadBalancerBackendResponse> backends;

    public List<LoadBalancerBackendResponse> getBackends() {
        return this.backends;
    }

    /**
     * URI of the health check for the load balancer.
     * 
     */
    @InputImport(name="healthCheckUri", required=true)
      private final String healthCheckUri;

    public String getHealthCheckUri() {
        return this.healthCheckUri;
    }

    /**
     * Type of the load balancer.
     * 
     */
    @InputImport(name="loadBalancerType", required=true)
      private final String loadBalancerType;

    public String getLoadBalancerType() {
        return this.loadBalancerType;
    }

    public LoadBalancerInfoResponse(
        String backendType,
        String backendUri,
        List<LoadBalancerBackendResponse> backends,
        String healthCheckUri,
        String loadBalancerType) {
        this.backendType = Objects.requireNonNull(backendType, "expected parameter 'backendType' to be non-null");
        this.backendUri = Objects.requireNonNull(backendUri, "expected parameter 'backendUri' to be non-null");
        this.backends = Objects.requireNonNull(backends, "expected parameter 'backends' to be non-null");
        this.healthCheckUri = Objects.requireNonNull(healthCheckUri, "expected parameter 'healthCheckUri' to be non-null");
        this.loadBalancerType = Objects.requireNonNull(loadBalancerType, "expected parameter 'loadBalancerType' to be non-null");
    }

    private LoadBalancerInfoResponse() {
        this.backendType = null;
        this.backendUri = null;
        this.backends = List.of();
        this.healthCheckUri = null;
        this.loadBalancerType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backendType;
        private String backendUri;
        private List<LoadBalancerBackendResponse> backends;
        private String healthCheckUri;
        private String loadBalancerType;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendType = defaults.backendType;
    	      this.backendUri = defaults.backendUri;
    	      this.backends = defaults.backends;
    	      this.healthCheckUri = defaults.healthCheckUri;
    	      this.loadBalancerType = defaults.loadBalancerType;
        }

        public Builder setBackendType(String backendType) {
            this.backendType = Objects.requireNonNull(backendType);
            return this;
        }

        public Builder setBackendUri(String backendUri) {
            this.backendUri = Objects.requireNonNull(backendUri);
            return this;
        }

        public Builder setBackends(List<LoadBalancerBackendResponse> backends) {
            this.backends = Objects.requireNonNull(backends);
            return this;
        }

        public Builder setHealthCheckUri(String healthCheckUri) {
            this.healthCheckUri = Objects.requireNonNull(healthCheckUri);
            return this;
        }

        public Builder setLoadBalancerType(String loadBalancerType) {
            this.loadBalancerType = Objects.requireNonNull(loadBalancerType);
            return this;
        }
        public LoadBalancerInfoResponse build() {
            return new LoadBalancerInfoResponse(backendType, backendUri, backends, healthCheckUri, loadBalancerType);
        }
    }
}
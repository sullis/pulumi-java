// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.azurenative.appplatform.inputs.ServiceRegistryInstanceResponse;
import io.pulumi.azurenative.appplatform.inputs.ServiceRegistryResourceRequestsResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Service Registry properties payload
 * 
 */
public final class ServiceRegistryPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceRegistryPropertiesResponse Empty = new ServiceRegistryPropertiesResponse();

    /**
     * Collection of instances belong to Service Registry.
     * 
     */
    @InputImport(name="instances", required=true)
    private final List<ServiceRegistryInstanceResponse> instances;

    public List<ServiceRegistryInstanceResponse> getInstances() {
        return this.instances;
    }

    /**
     * State of the Service Registry.
     * 
     */
    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * The requested resource quantity for required CPU and Memory.
     * 
     */
    @InputImport(name="resourceRequests", required=true)
    private final ServiceRegistryResourceRequestsResponse resourceRequests;

    public ServiceRegistryResourceRequestsResponse getResourceRequests() {
        return this.resourceRequests;
    }

    public ServiceRegistryPropertiesResponse(
        List<ServiceRegistryInstanceResponse> instances,
        String provisioningState,
        ServiceRegistryResourceRequestsResponse resourceRequests) {
        this.instances = Objects.requireNonNull(instances, "expected parameter 'instances' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.resourceRequests = Objects.requireNonNull(resourceRequests, "expected parameter 'resourceRequests' to be non-null");
    }

    private ServiceRegistryPropertiesResponse() {
        this.instances = List.of();
        this.provisioningState = null;
        this.resourceRequests = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceRegistryPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ServiceRegistryInstanceResponse> instances;
        private String provisioningState;
        private ServiceRegistryResourceRequestsResponse resourceRequests;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceRegistryPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceRequests = defaults.resourceRequests;
        }

        public Builder setInstances(List<ServiceRegistryInstanceResponse> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceRequests(ServiceRegistryResourceRequestsResponse resourceRequests) {
            this.resourceRequests = Objects.requireNonNull(resourceRequests);
            return this;
        }

        public ServiceRegistryPropertiesResponse build() {
            return new ServiceRegistryPropertiesResponse(instances, provisioningState, resourceRequests);
        }
    }
}

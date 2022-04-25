// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.azurenative.appplatform.inputs.ServiceRegistryInstanceResponse;
import com.pulumi.azurenative.appplatform.inputs.ServiceRegistryResourceRequestsResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Service Registry properties payload
 * 
 */
public final class ServiceRegistryPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServiceRegistryPropertiesResponse Empty = new ServiceRegistryPropertiesResponse();

    /**
     * Collection of instances belong to Service Registry.
     * 
     */
    @Import(name="instances", required=true)
    private List<ServiceRegistryInstanceResponse> instances;

    /**
     * @return Collection of instances belong to Service Registry.
     * 
     */
    public List<ServiceRegistryInstanceResponse> instances() {
        return this.instances;
    }

    /**
     * State of the Service Registry.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return State of the Service Registry.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The requested resource quantity for required CPU and Memory.
     * 
     */
    @Import(name="resourceRequests", required=true)
    private ServiceRegistryResourceRequestsResponse resourceRequests;

    /**
     * @return The requested resource quantity for required CPU and Memory.
     * 
     */
    public ServiceRegistryResourceRequestsResponse resourceRequests() {
        return this.resourceRequests;
    }

    private ServiceRegistryPropertiesResponse() {}

    private ServiceRegistryPropertiesResponse(ServiceRegistryPropertiesResponse $) {
        this.instances = $.instances;
        this.provisioningState = $.provisioningState;
        this.resourceRequests = $.resourceRequests;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceRegistryPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceRegistryPropertiesResponse $;

        public Builder() {
            $ = new ServiceRegistryPropertiesResponse();
        }

        public Builder(ServiceRegistryPropertiesResponse defaults) {
            $ = new ServiceRegistryPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param instances Collection of instances belong to Service Registry.
         * 
         * @return builder
         * 
         */
        public Builder instances(List<ServiceRegistryInstanceResponse> instances) {
            $.instances = instances;
            return this;
        }

        /**
         * @param instances Collection of instances belong to Service Registry.
         * 
         * @return builder
         * 
         */
        public Builder instances(ServiceRegistryInstanceResponse... instances) {
            return instances(List.of(instances));
        }

        /**
         * @param provisioningState State of the Service Registry.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param resourceRequests The requested resource quantity for required CPU and Memory.
         * 
         * @return builder
         * 
         */
        public Builder resourceRequests(ServiceRegistryResourceRequestsResponse resourceRequests) {
            $.resourceRequests = resourceRequests;
            return this;
        }

        public ServiceRegistryPropertiesResponse build() {
            $.instances = Objects.requireNonNull($.instances, "expected parameter 'instances' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.resourceRequests = Objects.requireNonNull($.resourceRequests, "expected parameter 'resourceRequests' to be non-null");
            return $;
        }
    }

}

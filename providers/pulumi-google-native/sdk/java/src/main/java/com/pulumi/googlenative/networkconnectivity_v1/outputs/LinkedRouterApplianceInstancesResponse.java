// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkconnectivity_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.networkconnectivity_v1.outputs.RouterApplianceInstanceResponse;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class LinkedRouterApplianceInstancesResponse {
    /**
     * @return The list of router appliance instances.
     * 
     */
    private final List<RouterApplianceInstanceResponse> instances;
    /**
     * @return A value that controls whether site-to-site data transfer is enabled for these resources. Data transfer is available only in [supported locations](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/locations).
     * 
     */
    private final Boolean siteToSiteDataTransfer;

    @CustomType.Constructor
    private LinkedRouterApplianceInstancesResponse(
        @CustomType.Parameter("instances") List<RouterApplianceInstanceResponse> instances,
        @CustomType.Parameter("siteToSiteDataTransfer") Boolean siteToSiteDataTransfer) {
        this.instances = instances;
        this.siteToSiteDataTransfer = siteToSiteDataTransfer;
    }

    /**
     * @return The list of router appliance instances.
     * 
     */
    public List<RouterApplianceInstanceResponse> instances() {
        return this.instances;
    }
    /**
     * @return A value that controls whether site-to-site data transfer is enabled for these resources. Data transfer is available only in [supported locations](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/locations).
     * 
     */
    public Boolean siteToSiteDataTransfer() {
        return this.siteToSiteDataTransfer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedRouterApplianceInstancesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RouterApplianceInstanceResponse> instances;
        private Boolean siteToSiteDataTransfer;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedRouterApplianceInstancesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
    	      this.siteToSiteDataTransfer = defaults.siteToSiteDataTransfer;
        }

        public Builder instances(List<RouterApplianceInstanceResponse> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }
        public Builder instances(RouterApplianceInstanceResponse... instances) {
            return instances(List.of(instances));
        }
        public Builder siteToSiteDataTransfer(Boolean siteToSiteDataTransfer) {
            this.siteToSiteDataTransfer = Objects.requireNonNull(siteToSiteDataTransfer);
            return this;
        }        public LinkedRouterApplianceInstancesResponse build() {
            return new LinkedRouterApplianceInstancesResponse(instances, siteToSiteDataTransfer);
        }
    }
}

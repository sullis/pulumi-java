// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.networkconnectivity_v1.inputs.RouterApplianceInstanceArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A collection of router appliance instances. If you have multiple router appliance instances connected to the same site, they should all be attached to the same spoke.
 * 
 */
public final class LinkedRouterApplianceInstancesArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkedRouterApplianceInstancesArgs Empty = new LinkedRouterApplianceInstancesArgs();

    /**
     * The list of router appliance instances.
     * 
     */
    @InputImport(name="instances")
      private final @Nullable Input<List<RouterApplianceInstanceArgs>> instances;

    public Input<List<RouterApplianceInstanceArgs>> getInstances() {
        return this.instances == null ? Input.empty() : this.instances;
    }

    /**
     * A value that controls whether site-to-site data transfer is enabled for these resources. Data transfer is available only in [supported locations](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/locations).
     * 
     */
    @InputImport(name="siteToSiteDataTransfer")
      private final @Nullable Input<Boolean> siteToSiteDataTransfer;

    public Input<Boolean> getSiteToSiteDataTransfer() {
        return this.siteToSiteDataTransfer == null ? Input.empty() : this.siteToSiteDataTransfer;
    }

    public LinkedRouterApplianceInstancesArgs(
        @Nullable Input<List<RouterApplianceInstanceArgs>> instances,
        @Nullable Input<Boolean> siteToSiteDataTransfer) {
        this.instances = instances;
        this.siteToSiteDataTransfer = siteToSiteDataTransfer;
    }

    private LinkedRouterApplianceInstancesArgs() {
        this.instances = Input.empty();
        this.siteToSiteDataTransfer = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedRouterApplianceInstancesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<RouterApplianceInstanceArgs>> instances;
        private @Nullable Input<Boolean> siteToSiteDataTransfer;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedRouterApplianceInstancesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
    	      this.siteToSiteDataTransfer = defaults.siteToSiteDataTransfer;
        }

        public Builder setInstances(@Nullable Input<List<RouterApplianceInstanceArgs>> instances) {
            this.instances = instances;
            return this;
        }

        public Builder setInstances(@Nullable List<RouterApplianceInstanceArgs> instances) {
            this.instances = Input.ofNullable(instances);
            return this;
        }

        public Builder setSiteToSiteDataTransfer(@Nullable Input<Boolean> siteToSiteDataTransfer) {
            this.siteToSiteDataTransfer = siteToSiteDataTransfer;
            return this;
        }

        public Builder setSiteToSiteDataTransfer(@Nullable Boolean siteToSiteDataTransfer) {
            this.siteToSiteDataTransfer = Input.ofNullable(siteToSiteDataTransfer);
            return this;
        }
        public LinkedRouterApplianceInstancesArgs build() {
            return new LinkedRouterApplianceInstancesArgs(instances, siteToSiteDataTransfer);
        }
    }
}
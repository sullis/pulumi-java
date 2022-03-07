// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration of a virtual network to which API Management service is deployed.
 * 
 */
public final class VirtualNetworkConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkConfigurationArgs Empty = new VirtualNetworkConfigurationArgs();

    /**
     * The full resource ID of a subnet in a virtual network to deploy the API Management service in.
     * 
     */
    @InputImport(name="subnetResourceId")
      private final @Nullable Input<String> subnetResourceId;

    public Input<String> getSubnetResourceId() {
        return this.subnetResourceId == null ? Input.empty() : this.subnetResourceId;
    }

    public VirtualNetworkConfigurationArgs(@Nullable Input<String> subnetResourceId) {
        this.subnetResourceId = subnetResourceId;
    }

    private VirtualNetworkConfigurationArgs() {
        this.subnetResourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> subnetResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetResourceId = defaults.subnetResourceId;
        }

        public Builder setSubnetResourceId(@Nullable Input<String> subnetResourceId) {
            this.subnetResourceId = subnetResourceId;
            return this;
        }

        public Builder setSubnetResourceId(@Nullable String subnetResourceId) {
            this.subnetResourceId = Input.ofNullable(subnetResourceId);
            return this;
        }
        public VirtualNetworkConfigurationArgs build() {
            return new VirtualNetworkConfigurationArgs(subnetResourceId);
        }
    }
}
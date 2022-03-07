// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of IPConfigurationBgpPeeringAddress.
 * 
 */
public final class IPConfigurationBgpPeeringAddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final IPConfigurationBgpPeeringAddressArgs Empty = new IPConfigurationBgpPeeringAddressArgs();

    /**
     * The list of custom BGP peering addresses which belong to IP configuration.
     * 
     */
    @InputImport(name="customBgpIpAddresses")
      private final @Nullable Input<List<String>> customBgpIpAddresses;

    public Input<List<String>> getCustomBgpIpAddresses() {
        return this.customBgpIpAddresses == null ? Input.empty() : this.customBgpIpAddresses;
    }

    /**
     * The ID of IP configuration which belongs to gateway.
     * 
     */
    @InputImport(name="ipconfigurationId")
      private final @Nullable Input<String> ipconfigurationId;

    public Input<String> getIpconfigurationId() {
        return this.ipconfigurationId == null ? Input.empty() : this.ipconfigurationId;
    }

    public IPConfigurationBgpPeeringAddressArgs(
        @Nullable Input<List<String>> customBgpIpAddresses,
        @Nullable Input<String> ipconfigurationId) {
        this.customBgpIpAddresses = customBgpIpAddresses;
        this.ipconfigurationId = ipconfigurationId;
    }

    private IPConfigurationBgpPeeringAddressArgs() {
        this.customBgpIpAddresses = Input.empty();
        this.ipconfigurationId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPConfigurationBgpPeeringAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> customBgpIpAddresses;
        private @Nullable Input<String> ipconfigurationId;

        public Builder() {
    	      // Empty
        }

        public Builder(IPConfigurationBgpPeeringAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customBgpIpAddresses = defaults.customBgpIpAddresses;
    	      this.ipconfigurationId = defaults.ipconfigurationId;
        }

        public Builder setCustomBgpIpAddresses(@Nullable Input<List<String>> customBgpIpAddresses) {
            this.customBgpIpAddresses = customBgpIpAddresses;
            return this;
        }

        public Builder setCustomBgpIpAddresses(@Nullable List<String> customBgpIpAddresses) {
            this.customBgpIpAddresses = Input.ofNullable(customBgpIpAddresses);
            return this;
        }

        public Builder setIpconfigurationId(@Nullable Input<String> ipconfigurationId) {
            this.ipconfigurationId = ipconfigurationId;
            return this;
        }

        public Builder setIpconfigurationId(@Nullable String ipconfigurationId) {
            this.ipconfigurationId = Input.ofNullable(ipconfigurationId);
            return this;
        }
        public IPConfigurationBgpPeeringAddressArgs build() {
            return new IPConfigurationBgpPeeringAddressArgs(customBgpIpAddresses, ipconfigurationId);
        }
    }
}
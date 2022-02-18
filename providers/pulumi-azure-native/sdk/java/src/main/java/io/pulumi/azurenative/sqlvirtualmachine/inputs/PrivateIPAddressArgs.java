// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A private IP address bound to the availability group listener.
 * 
 */
public final class PrivateIPAddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateIPAddressArgs Empty = new PrivateIPAddressArgs();

    /**
     * Private IP address bound to the availability group listener.
     * 
     */
    @InputImport(name="ipAddress")
    private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    /**
     * Subnet used to include private IP.
     * 
     */
    @InputImport(name="subnetResourceId")
    private final @Nullable Input<String> subnetResourceId;

    public Input<String> getSubnetResourceId() {
        return this.subnetResourceId == null ? Input.empty() : this.subnetResourceId;
    }

    public PrivateIPAddressArgs(
        @Nullable Input<String> ipAddress,
        @Nullable Input<String> subnetResourceId) {
        this.ipAddress = ipAddress;
        this.subnetResourceId = subnetResourceId;
    }

    private PrivateIPAddressArgs() {
        this.ipAddress = Input.empty();
        this.subnetResourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateIPAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<String> subnetResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateIPAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.subnetResourceId = defaults.subnetResourceId;
        }

        public Builder setIpAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder setSubnetResourceId(@Nullable Input<String> subnetResourceId) {
            this.subnetResourceId = subnetResourceId;
            return this;
        }

        public Builder setSubnetResourceId(@Nullable String subnetResourceId) {
            this.subnetResourceId = Input.ofNullable(subnetResourceId);
            return this;
        }

        public PrivateIPAddressArgs build() {
            return new PrivateIPAddressArgs(ipAddress, subnetResourceId);
        }
    }
}

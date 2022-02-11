// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotFleetPrivateIpAddressSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetPrivateIpAddressSpecificationArgs Empty = new SpotFleetPrivateIpAddressSpecificationArgs();

    @InputImport(name="primary")
    private final @Nullable Input<Boolean> primary;

    public Input<Boolean> getPrimary() {
        return this.primary == null ? Input.empty() : this.primary;
    }

    @InputImport(name="privateIpAddress", required=true)
    private final Input<String> privateIpAddress;

    public Input<String> getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public SpotFleetPrivateIpAddressSpecificationArgs(
        @Nullable Input<Boolean> primary,
        Input<String> privateIpAddress) {
        this.primary = primary;
        this.privateIpAddress = Objects.requireNonNull(privateIpAddress, "expected parameter 'privateIpAddress' to be non-null");
    }

    private SpotFleetPrivateIpAddressSpecificationArgs() {
        this.primary = Input.empty();
        this.privateIpAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetPrivateIpAddressSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> primary;
        private Input<String> privateIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetPrivateIpAddressSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primary = defaults.primary;
    	      this.privateIpAddress = defaults.privateIpAddress;
        }

        public Builder setPrimary(@Nullable Input<Boolean> primary) {
            this.primary = primary;
            return this;
        }

        public Builder setPrimary(@Nullable Boolean primary) {
            this.primary = Input.ofNullable(primary);
            return this;
        }

        public Builder setPrivateIpAddress(Input<String> privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }

        public Builder setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Input.of(Objects.requireNonNull(privateIpAddress));
            return this;
        }

        public SpotFleetPrivateIpAddressSpecificationArgs build() {
            return new SpotFleetPrivateIpAddressSpecificationArgs(primary, privateIpAddress);
        }
    }
}

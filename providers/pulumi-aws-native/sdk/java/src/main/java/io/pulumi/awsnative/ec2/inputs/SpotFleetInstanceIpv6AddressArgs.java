// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SpotFleetInstanceIpv6AddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetInstanceIpv6AddressArgs Empty = new SpotFleetInstanceIpv6AddressArgs();

    @InputImport(name="ipv6Address", required=true)
    private final Input<String> ipv6Address;

    public Input<String> getIpv6Address() {
        return this.ipv6Address;
    }

    public SpotFleetInstanceIpv6AddressArgs(Input<String> ipv6Address) {
        this.ipv6Address = Objects.requireNonNull(ipv6Address, "expected parameter 'ipv6Address' to be non-null");
    }

    private SpotFleetInstanceIpv6AddressArgs() {
        this.ipv6Address = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetInstanceIpv6AddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> ipv6Address;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetInstanceIpv6AddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv6Address = defaults.ipv6Address;
        }

        public Builder setIpv6Address(Input<String> ipv6Address) {
            this.ipv6Address = Objects.requireNonNull(ipv6Address);
            return this;
        }

        public Builder setIpv6Address(String ipv6Address) {
            this.ipv6Address = Input.of(Objects.requireNonNull(ipv6Address));
            return this;
        }

        public SpotFleetInstanceIpv6AddressArgs build() {
            return new SpotFleetInstanceIpv6AddressArgs(ipv6Address);
        }
    }
}

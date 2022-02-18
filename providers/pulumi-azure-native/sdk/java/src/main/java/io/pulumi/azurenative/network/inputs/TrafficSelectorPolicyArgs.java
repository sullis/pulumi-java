// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An traffic selector policy for a virtual network gateway connection.
 * 
 */
public final class TrafficSelectorPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrafficSelectorPolicyArgs Empty = new TrafficSelectorPolicyArgs();

    /**
     * A collection of local address spaces in CIDR format.
     * 
     */
    @InputImport(name="localAddressRanges", required=true)
    private final Input<List<String>> localAddressRanges;

    public Input<List<String>> getLocalAddressRanges() {
        return this.localAddressRanges;
    }

    /**
     * A collection of remote address spaces in CIDR format.
     * 
     */
    @InputImport(name="remoteAddressRanges", required=true)
    private final Input<List<String>> remoteAddressRanges;

    public Input<List<String>> getRemoteAddressRanges() {
        return this.remoteAddressRanges;
    }

    public TrafficSelectorPolicyArgs(
        Input<List<String>> localAddressRanges,
        Input<List<String>> remoteAddressRanges) {
        this.localAddressRanges = Objects.requireNonNull(localAddressRanges, "expected parameter 'localAddressRanges' to be non-null");
        this.remoteAddressRanges = Objects.requireNonNull(remoteAddressRanges, "expected parameter 'remoteAddressRanges' to be non-null");
    }

    private TrafficSelectorPolicyArgs() {
        this.localAddressRanges = Input.empty();
        this.remoteAddressRanges = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficSelectorPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> localAddressRanges;
        private Input<List<String>> remoteAddressRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficSelectorPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localAddressRanges = defaults.localAddressRanges;
    	      this.remoteAddressRanges = defaults.remoteAddressRanges;
        }

        public Builder setLocalAddressRanges(Input<List<String>> localAddressRanges) {
            this.localAddressRanges = Objects.requireNonNull(localAddressRanges);
            return this;
        }

        public Builder setLocalAddressRanges(List<String> localAddressRanges) {
            this.localAddressRanges = Input.of(Objects.requireNonNull(localAddressRanges));
            return this;
        }

        public Builder setRemoteAddressRanges(Input<List<String>> remoteAddressRanges) {
            this.remoteAddressRanges = Objects.requireNonNull(remoteAddressRanges);
            return this;
        }

        public Builder setRemoteAddressRanges(List<String> remoteAddressRanges) {
            this.remoteAddressRanges = Input.of(Objects.requireNonNull(remoteAddressRanges));
            return this;
        }

        public TrafficSelectorPolicyArgs build() {
            return new TrafficSelectorPolicyArgs(localAddressRanges, remoteAddressRanges);
        }
    }
}

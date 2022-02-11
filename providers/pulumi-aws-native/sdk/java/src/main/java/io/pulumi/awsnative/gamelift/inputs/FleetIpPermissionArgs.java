// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.inputs;

import io.pulumi.awsnative.gamelift.enums.FleetIpPermissionProtocol;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class FleetIpPermissionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetIpPermissionArgs Empty = new FleetIpPermissionArgs();

    @InputImport(name="fromPort", required=true)
    private final Input<Integer> fromPort;

    public Input<Integer> getFromPort() {
        return this.fromPort;
    }

    @InputImport(name="ipRange", required=true)
    private final Input<String> ipRange;

    public Input<String> getIpRange() {
        return this.ipRange;
    }

    @InputImport(name="protocol", required=true)
    private final Input<FleetIpPermissionProtocol> protocol;

    public Input<FleetIpPermissionProtocol> getProtocol() {
        return this.protocol;
    }

    @InputImport(name="toPort", required=true)
    private final Input<Integer> toPort;

    public Input<Integer> getToPort() {
        return this.toPort;
    }

    public FleetIpPermissionArgs(
        Input<Integer> fromPort,
        Input<String> ipRange,
        Input<FleetIpPermissionProtocol> protocol,
        Input<Integer> toPort) {
        this.fromPort = Objects.requireNonNull(fromPort, "expected parameter 'fromPort' to be non-null");
        this.ipRange = Objects.requireNonNull(ipRange, "expected parameter 'ipRange' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.toPort = Objects.requireNonNull(toPort, "expected parameter 'toPort' to be non-null");
    }

    private FleetIpPermissionArgs() {
        this.fromPort = Input.empty();
        this.ipRange = Input.empty();
        this.protocol = Input.empty();
        this.toPort = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetIpPermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> fromPort;
        private Input<String> ipRange;
        private Input<FleetIpPermissionProtocol> protocol;
        private Input<Integer> toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetIpPermissionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPort = defaults.fromPort;
    	      this.ipRange = defaults.ipRange;
    	      this.protocol = defaults.protocol;
    	      this.toPort = defaults.toPort;
        }

        public Builder setFromPort(Input<Integer> fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }

        public Builder setFromPort(Integer fromPort) {
            this.fromPort = Input.of(Objects.requireNonNull(fromPort));
            return this;
        }

        public Builder setIpRange(Input<String> ipRange) {
            this.ipRange = Objects.requireNonNull(ipRange);
            return this;
        }

        public Builder setIpRange(String ipRange) {
            this.ipRange = Input.of(Objects.requireNonNull(ipRange));
            return this;
        }

        public Builder setProtocol(Input<FleetIpPermissionProtocol> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setProtocol(FleetIpPermissionProtocol protocol) {
            this.protocol = Input.of(Objects.requireNonNull(protocol));
            return this;
        }

        public Builder setToPort(Input<Integer> toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }

        public Builder setToPort(Integer toPort) {
            this.toPort = Input.of(Objects.requireNonNull(toPort));
            return this;
        }

        public FleetIpPermissionArgs build() {
            return new FleetIpPermissionArgs(fromPort, ipRange, protocol, toPort);
        }
    }
}

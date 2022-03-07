// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.enums.PacketMirroringFilterDirection;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PacketMirroringFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final PacketMirroringFilterArgs Empty = new PacketMirroringFilterArgs();

    /**
     * IP CIDR ranges that apply as filter on the source (ingress) or destination (egress) IP in the IP header. Only IPv4 is supported. If no ranges are specified, all traffic that matches the specified IPProtocols is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
     * 
     */
    @InputImport(name="cidrRanges")
      private final @Nullable Input<List<String>> cidrRanges;

    public Input<List<String>> getCidrRanges() {
        return this.cidrRanges == null ? Input.empty() : this.cidrRanges;
    }

    /**
     * Direction of traffic to mirror, either INGRESS, EGRESS, or BOTH. The default is BOTH.
     * 
     */
    @InputImport(name="direction")
      private final @Nullable Input<PacketMirroringFilterDirection> direction;

    public Input<PacketMirroringFilterDirection> getDirection() {
        return this.direction == null ? Input.empty() : this.direction;
    }

    /**
     * Protocols that apply as filter on mirrored traffic. If no protocols are specified, all traffic that matches the specified CIDR ranges is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
     * 
     */
    @InputImport(name="ipProtocols")
      private final @Nullable Input<List<String>> ipProtocols;

    public Input<List<String>> getIpProtocols() {
        return this.ipProtocols == null ? Input.empty() : this.ipProtocols;
    }

    public PacketMirroringFilterArgs(
        @Nullable Input<List<String>> cidrRanges,
        @Nullable Input<PacketMirroringFilterDirection> direction,
        @Nullable Input<List<String>> ipProtocols) {
        this.cidrRanges = cidrRanges;
        this.direction = direction;
        this.ipProtocols = ipProtocols;
    }

    private PacketMirroringFilterArgs() {
        this.cidrRanges = Input.empty();
        this.direction = Input.empty();
        this.ipProtocols = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> cidrRanges;
        private @Nullable Input<PacketMirroringFilterDirection> direction;
        private @Nullable Input<List<String>> ipProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrRanges = defaults.cidrRanges;
    	      this.direction = defaults.direction;
    	      this.ipProtocols = defaults.ipProtocols;
        }

        public Builder setCidrRanges(@Nullable Input<List<String>> cidrRanges) {
            this.cidrRanges = cidrRanges;
            return this;
        }

        public Builder setCidrRanges(@Nullable List<String> cidrRanges) {
            this.cidrRanges = Input.ofNullable(cidrRanges);
            return this;
        }

        public Builder setDirection(@Nullable Input<PacketMirroringFilterDirection> direction) {
            this.direction = direction;
            return this;
        }

        public Builder setDirection(@Nullable PacketMirroringFilterDirection direction) {
            this.direction = Input.ofNullable(direction);
            return this;
        }

        public Builder setIpProtocols(@Nullable Input<List<String>> ipProtocols) {
            this.ipProtocols = ipProtocols;
            return this;
        }

        public Builder setIpProtocols(@Nullable List<String> ipProtocols) {
            this.ipProtocols = Input.ofNullable(ipProtocols);
            return this;
        }
        public PacketMirroringFilterArgs build() {
            return new PacketMirroringFilterArgs(cidrRanges, direction, ipProtocols);
        }
    }
}
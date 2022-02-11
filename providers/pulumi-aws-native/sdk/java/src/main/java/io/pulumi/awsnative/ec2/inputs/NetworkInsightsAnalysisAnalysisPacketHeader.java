// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.inputs.NetworkInsightsAnalysisPortRange;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInsightsAnalysisAnalysisPacketHeader extends io.pulumi.resources.InvokeArgs {

    public static final NetworkInsightsAnalysisAnalysisPacketHeader Empty = new NetworkInsightsAnalysisAnalysisPacketHeader();

    @InputImport(name="destinationAddresses")
    private final @Nullable List<String> destinationAddresses;

    public List<String> getDestinationAddresses() {
        return this.destinationAddresses == null ? List.of() : this.destinationAddresses;
    }

    @InputImport(name="destinationPortRanges")
    private final @Nullable List<NetworkInsightsAnalysisPortRange> destinationPortRanges;

    public List<NetworkInsightsAnalysisPortRange> getDestinationPortRanges() {
        return this.destinationPortRanges == null ? List.of() : this.destinationPortRanges;
    }

    @InputImport(name="protocol")
    private final @Nullable String protocol;

    public Optional<String> getProtocol() {
        return this.protocol == null ? Optional.empty() : Optional.ofNullable(this.protocol);
    }

    @InputImport(name="sourceAddresses")
    private final @Nullable List<String> sourceAddresses;

    public List<String> getSourceAddresses() {
        return this.sourceAddresses == null ? List.of() : this.sourceAddresses;
    }

    @InputImport(name="sourcePortRanges")
    private final @Nullable List<NetworkInsightsAnalysisPortRange> sourcePortRanges;

    public List<NetworkInsightsAnalysisPortRange> getSourcePortRanges() {
        return this.sourcePortRanges == null ? List.of() : this.sourcePortRanges;
    }

    public NetworkInsightsAnalysisAnalysisPacketHeader(
        @Nullable List<String> destinationAddresses,
        @Nullable List<NetworkInsightsAnalysisPortRange> destinationPortRanges,
        @Nullable String protocol,
        @Nullable List<String> sourceAddresses,
        @Nullable List<NetworkInsightsAnalysisPortRange> sourcePortRanges) {
        this.destinationAddresses = destinationAddresses;
        this.destinationPortRanges = destinationPortRanges;
        this.protocol = protocol;
        this.sourceAddresses = sourceAddresses;
        this.sourcePortRanges = sourcePortRanges;
    }

    private NetworkInsightsAnalysisAnalysisPacketHeader() {
        this.destinationAddresses = List.of();
        this.destinationPortRanges = List.of();
        this.protocol = null;
        this.sourceAddresses = List.of();
        this.sourcePortRanges = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAnalysisAnalysisPacketHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> destinationAddresses;
        private @Nullable List<NetworkInsightsAnalysisPortRange> destinationPortRanges;
        private @Nullable String protocol;
        private @Nullable List<String> sourceAddresses;
        private @Nullable List<NetworkInsightsAnalysisPortRange> sourcePortRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAnalysisAnalysisPacketHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.destinationPortRanges = defaults.destinationPortRanges;
    	      this.protocol = defaults.protocol;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourcePortRanges = defaults.sourcePortRanges;
        }

        public Builder setDestinationAddresses(@Nullable List<String> destinationAddresses) {
            this.destinationAddresses = destinationAddresses;
            return this;
        }

        public Builder setDestinationPortRanges(@Nullable List<NetworkInsightsAnalysisPortRange> destinationPortRanges) {
            this.destinationPortRanges = destinationPortRanges;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setSourceAddresses(@Nullable List<String> sourceAddresses) {
            this.sourceAddresses = sourceAddresses;
            return this;
        }

        public Builder setSourcePortRanges(@Nullable List<NetworkInsightsAnalysisPortRange> sourcePortRanges) {
            this.sourcePortRanges = sourcePortRanges;
            return this;
        }

        public NetworkInsightsAnalysisAnalysisPacketHeader build() {
            return new NetworkInsightsAnalysisAnalysisPacketHeader(destinationAddresses, destinationPortRanges, protocol, sourceAddresses, sourcePortRanges);
        }
    }
}

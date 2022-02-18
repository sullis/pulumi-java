// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkloadNetworkSegmentPortVifResponse {
    /**
     * Name of port or VIF attached to segment.
     * 
     */
    private final @Nullable String portName;

    @OutputCustomType.Constructor({"portName"})
    private WorkloadNetworkSegmentPortVifResponse(@Nullable String portName) {
        this.portName = portName;
    }

    /**
     * Name of port or VIF attached to segment.
     * 
     */
    public Optional<String> getPortName() {
        return Optional.ofNullable(this.portName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadNetworkSegmentPortVifResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String portName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadNetworkSegmentPortVifResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.portName = defaults.portName;
        }

        public Builder setPortName(@Nullable String portName) {
            this.portName = portName;
            return this;
        }

        public WorkloadNetworkSegmentPortVifResponse build() {
            return new WorkloadNetworkSegmentPortVifResponse(portName);
        }
    }
}

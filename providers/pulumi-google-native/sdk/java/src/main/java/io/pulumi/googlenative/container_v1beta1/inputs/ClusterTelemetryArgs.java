// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1beta1.enums.ClusterTelemetryType;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Telemetry integration for the cluster.
 * 
 */
public final class ClusterTelemetryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterTelemetryArgs Empty = new ClusterTelemetryArgs();

    /**
     * Type of the integration.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<ClusterTelemetryType> type;

    public Input<ClusterTelemetryType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ClusterTelemetryArgs(@Nullable Input<ClusterTelemetryType> type) {
        this.type = type;
    }

    private ClusterTelemetryArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTelemetryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ClusterTelemetryType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterTelemetryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable Input<ClusterTelemetryType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable ClusterTelemetryType type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ClusterTelemetryArgs build() {
            return new ClusterTelemetryArgs(type);
        }
    }
}
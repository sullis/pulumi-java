// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_v1.outputs.DurationResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NodeGroupMaintenanceWindowResponse {
    /**
     * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
     * 
     */
    private final DurationResponse maintenanceDuration;
    /**
     * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * 
     */
    private final String startTime;

    @OutputCustomType.Constructor({"maintenanceDuration","startTime"})
    private NodeGroupMaintenanceWindowResponse(
        DurationResponse maintenanceDuration,
        String startTime) {
        this.maintenanceDuration = Objects.requireNonNull(maintenanceDuration);
        this.startTime = Objects.requireNonNull(startTime);
    }

    /**
     * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
     * 
    */
    public DurationResponse getMaintenanceDuration() {
        return this.maintenanceDuration;
    }
    /**
     * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupMaintenanceWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DurationResponse maintenanceDuration;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupMaintenanceWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maintenanceDuration = defaults.maintenanceDuration;
    	      this.startTime = defaults.startTime;
        }

        public Builder setMaintenanceDuration(DurationResponse maintenanceDuration) {
            this.maintenanceDuration = Objects.requireNonNull(maintenanceDuration);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public NodeGroupMaintenanceWindowResponse build() {
            return new NodeGroupMaintenanceWindowResponse(maintenanceDuration, startTime);
        }
    }
}
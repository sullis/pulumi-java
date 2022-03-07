// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class NodeGroupMaintenanceWindowGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupMaintenanceWindowGetArgs Empty = new NodeGroupMaintenanceWindowGetArgs();

    /**
     * instances.start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * 
     */
    @InputImport(name="startTime", required=true)
      private final Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime;
    }

    public NodeGroupMaintenanceWindowGetArgs(Input<String> startTime) {
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private NodeGroupMaintenanceWindowGetArgs() {
        this.startTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupMaintenanceWindowGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupMaintenanceWindowGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.startTime = defaults.startTime;
        }

        public Builder setStartTime(Input<String> startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Input.of(Objects.requireNonNull(startTime));
            return this;
        }
        public NodeGroupMaintenanceWindowGetArgs build() {
            return new NodeGroupMaintenanceWindowGetArgs(startTime);
        }
    }
}
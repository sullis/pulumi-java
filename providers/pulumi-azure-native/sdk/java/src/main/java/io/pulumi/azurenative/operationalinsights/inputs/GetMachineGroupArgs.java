// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMachineGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMachineGroupArgs Empty = new GetMachineGroupArgs();

    /**
     * UTC date and time specifying the end time of an interval. When not specified the service uses DateTime.UtcNow
     * 
     */
    @InputImport(name="endTime")
      private final @Nullable String endTime;

    public Optional<String> getEndTime() {
        return this.endTime == null ? Optional.empty() : Optional.ofNullable(this.endTime);
    }

    /**
     * Machine Group resource name.
     * 
     */
    @InputImport(name="machineGroupName", required=true)
      private final String machineGroupName;

    public String getMachineGroupName() {
        return this.machineGroupName;
    }

    /**
     * Resource group name within the specified subscriptionId.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * UTC date and time specifying the start time of an interval. When not specified the service uses DateTime.UtcNow - 10m
     * 
     */
    @InputImport(name="startTime")
      private final @Nullable String startTime;

    public Optional<String> getStartTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    /**
     * OMS workspace containing the resources of interest.
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetMachineGroupArgs(
        @Nullable String endTime,
        String machineGroupName,
        String resourceGroupName,
        @Nullable String startTime,
        String workspaceName) {
        this.endTime = endTime;
        this.machineGroupName = Objects.requireNonNull(machineGroupName, "expected parameter 'machineGroupName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.startTime = startTime;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetMachineGroupArgs() {
        this.endTime = null;
        this.machineGroupName = null;
        this.resourceGroupName = null;
        this.startTime = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMachineGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endTime;
        private String machineGroupName;
        private String resourceGroupName;
        private @Nullable String startTime;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMachineGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.machineGroupName = defaults.machineGroupName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.startTime = defaults.startTime;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setMachineGroupName(String machineGroupName) {
            this.machineGroupName = Objects.requireNonNull(machineGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public GetMachineGroupArgs build() {
            return new GetMachineGroupArgs(endTime, machineGroupName, resourceGroupName, startTime, workspaceName);
        }
    }
}
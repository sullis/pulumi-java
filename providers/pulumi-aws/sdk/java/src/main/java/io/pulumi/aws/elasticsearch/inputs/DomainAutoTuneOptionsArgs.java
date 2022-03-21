// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.aws.elasticsearch.inputs.DomainAutoTuneOptionsMaintenanceScheduleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainAutoTuneOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainAutoTuneOptionsArgs Empty = new DomainAutoTuneOptionsArgs();

    /**
     * The Auto-Tune desired state for the domain. Valid values: `ENABLED` or `DISABLED`.
     * 
     */
    @Import(name="desiredState", required=true)
      private final Output<String> desiredState;

    public Output<String> getDesiredState() {
        return this.desiredState;
    }

    /**
     * Configuration block for Auto-Tune maintenance windows. Can be specified multiple times for each maintenance window. Detailed below.
     * 
     */
    @Import(name="maintenanceSchedules")
      private final @Nullable Output<List<DomainAutoTuneOptionsMaintenanceScheduleArgs>> maintenanceSchedules;

    public Output<List<DomainAutoTuneOptionsMaintenanceScheduleArgs>> getMaintenanceSchedules() {
        return this.maintenanceSchedules == null ? Output.empty() : this.maintenanceSchedules;
    }

    /**
     * Whether to roll back to default Auto-Tune settings when disabling Auto-Tune. Valid values: `DEFAULT_ROLLBACK` or `NO_ROLLBACK`.
     * 
     */
    @Import(name="rollbackOnDisable")
      private final @Nullable Output<String> rollbackOnDisable;

    public Output<String> getRollbackOnDisable() {
        return this.rollbackOnDisable == null ? Output.empty() : this.rollbackOnDisable;
    }

    public DomainAutoTuneOptionsArgs(
        Output<String> desiredState,
        @Nullable Output<List<DomainAutoTuneOptionsMaintenanceScheduleArgs>> maintenanceSchedules,
        @Nullable Output<String> rollbackOnDisable) {
        this.desiredState = Objects.requireNonNull(desiredState, "expected parameter 'desiredState' to be non-null");
        this.maintenanceSchedules = maintenanceSchedules;
        this.rollbackOnDisable = rollbackOnDisable;
    }

    private DomainAutoTuneOptionsArgs() {
        this.desiredState = Output.empty();
        this.maintenanceSchedules = Output.empty();
        this.rollbackOnDisable = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainAutoTuneOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> desiredState;
        private @Nullable Output<List<DomainAutoTuneOptionsMaintenanceScheduleArgs>> maintenanceSchedules;
        private @Nullable Output<String> rollbackOnDisable;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainAutoTuneOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredState = defaults.desiredState;
    	      this.maintenanceSchedules = defaults.maintenanceSchedules;
    	      this.rollbackOnDisable = defaults.rollbackOnDisable;
        }

        public Builder desiredState(Output<String> desiredState) {
            this.desiredState = Objects.requireNonNull(desiredState);
            return this;
        }
        public Builder desiredState(String desiredState) {
            this.desiredState = Output.of(Objects.requireNonNull(desiredState));
            return this;
        }
        public Builder maintenanceSchedules(@Nullable Output<List<DomainAutoTuneOptionsMaintenanceScheduleArgs>> maintenanceSchedules) {
            this.maintenanceSchedules = maintenanceSchedules;
            return this;
        }
        public Builder maintenanceSchedules(@Nullable List<DomainAutoTuneOptionsMaintenanceScheduleArgs> maintenanceSchedules) {
            this.maintenanceSchedules = Output.ofNullable(maintenanceSchedules);
            return this;
        }
        public Builder maintenanceSchedules(DomainAutoTuneOptionsMaintenanceScheduleArgs... maintenanceSchedules) {
            return maintenanceSchedules(List.of(maintenanceSchedules));
        }
        public Builder rollbackOnDisable(@Nullable Output<String> rollbackOnDisable) {
            this.rollbackOnDisable = rollbackOnDisable;
            return this;
        }
        public Builder rollbackOnDisable(@Nullable String rollbackOnDisable) {
            this.rollbackOnDisable = Output.ofNullable(rollbackOnDisable);
            return this;
        }        public DomainAutoTuneOptionsArgs build() {
            return new DomainAutoTuneOptionsArgs(desiredState, maintenanceSchedules, rollbackOnDisable);
        }
    }
}

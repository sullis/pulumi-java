// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.enums.ReplicationMode;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributedAvailabilityGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributedAvailabilityGroupArgs Empty = new DistributedAvailabilityGroupArgs();

    /**
     * The distributed availability group name.
     * 
     */
    @InputImport(name="distributedAvailabilityGroupName")
    private final @Nullable Input<String> distributedAvailabilityGroupName;

    public Input<String> getDistributedAvailabilityGroupName() {
        return this.distributedAvailabilityGroupName == null ? Input.empty() : this.distributedAvailabilityGroupName;
    }

    /**
     * The name of the managed instance.
     * 
     */
    @InputImport(name="managedInstanceName", required=true)
    private final Input<String> managedInstanceName;

    public Input<String> getManagedInstanceName() {
        return this.managedInstanceName;
    }

    /**
     * The primary availability group name
     * 
     */
    @InputImport(name="primaryAvailabilityGroupName")
    private final @Nullable Input<String> primaryAvailabilityGroupName;

    public Input<String> getPrimaryAvailabilityGroupName() {
        return this.primaryAvailabilityGroupName == null ? Input.empty() : this.primaryAvailabilityGroupName;
    }

    /**
     * The replication mode of a distributed availability group. Parameter will be ignored during link creation.
     * 
     */
    @InputImport(name="replicationMode")
    private final @Nullable Input<Either<String,ReplicationMode>> replicationMode;

    public Input<Either<String,ReplicationMode>> getReplicationMode() {
        return this.replicationMode == null ? Input.empty() : this.replicationMode;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The secondary availability group name
     * 
     */
    @InputImport(name="secondaryAvailabilityGroupName")
    private final @Nullable Input<String> secondaryAvailabilityGroupName;

    public Input<String> getSecondaryAvailabilityGroupName() {
        return this.secondaryAvailabilityGroupName == null ? Input.empty() : this.secondaryAvailabilityGroupName;
    }

    /**
     * The source endpoint
     * 
     */
    @InputImport(name="sourceEndpoint")
    private final @Nullable Input<String> sourceEndpoint;

    public Input<String> getSourceEndpoint() {
        return this.sourceEndpoint == null ? Input.empty() : this.sourceEndpoint;
    }

    /**
     * The name of the target database
     * 
     */
    @InputImport(name="targetDatabase")
    private final @Nullable Input<String> targetDatabase;

    public Input<String> getTargetDatabase() {
        return this.targetDatabase == null ? Input.empty() : this.targetDatabase;
    }

    public DistributedAvailabilityGroupArgs(
        @Nullable Input<String> distributedAvailabilityGroupName,
        Input<String> managedInstanceName,
        @Nullable Input<String> primaryAvailabilityGroupName,
        @Nullable Input<Either<String,ReplicationMode>> replicationMode,
        Input<String> resourceGroupName,
        @Nullable Input<String> secondaryAvailabilityGroupName,
        @Nullable Input<String> sourceEndpoint,
        @Nullable Input<String> targetDatabase) {
        this.distributedAvailabilityGroupName = distributedAvailabilityGroupName;
        this.managedInstanceName = Objects.requireNonNull(managedInstanceName, "expected parameter 'managedInstanceName' to be non-null");
        this.primaryAvailabilityGroupName = primaryAvailabilityGroupName;
        this.replicationMode = replicationMode;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.secondaryAvailabilityGroupName = secondaryAvailabilityGroupName;
        this.sourceEndpoint = sourceEndpoint;
        this.targetDatabase = targetDatabase;
    }

    private DistributedAvailabilityGroupArgs() {
        this.distributedAvailabilityGroupName = Input.empty();
        this.managedInstanceName = Input.empty();
        this.primaryAvailabilityGroupName = Input.empty();
        this.replicationMode = Input.empty();
        this.resourceGroupName = Input.empty();
        this.secondaryAvailabilityGroupName = Input.empty();
        this.sourceEndpoint = Input.empty();
        this.targetDatabase = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributedAvailabilityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> distributedAvailabilityGroupName;
        private Input<String> managedInstanceName;
        private @Nullable Input<String> primaryAvailabilityGroupName;
        private @Nullable Input<Either<String,ReplicationMode>> replicationMode;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> secondaryAvailabilityGroupName;
        private @Nullable Input<String> sourceEndpoint;
        private @Nullable Input<String> targetDatabase;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributedAvailabilityGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributedAvailabilityGroupName = defaults.distributedAvailabilityGroupName;
    	      this.managedInstanceName = defaults.managedInstanceName;
    	      this.primaryAvailabilityGroupName = defaults.primaryAvailabilityGroupName;
    	      this.replicationMode = defaults.replicationMode;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secondaryAvailabilityGroupName = defaults.secondaryAvailabilityGroupName;
    	      this.sourceEndpoint = defaults.sourceEndpoint;
    	      this.targetDatabase = defaults.targetDatabase;
        }

        public Builder setDistributedAvailabilityGroupName(@Nullable Input<String> distributedAvailabilityGroupName) {
            this.distributedAvailabilityGroupName = distributedAvailabilityGroupName;
            return this;
        }

        public Builder setDistributedAvailabilityGroupName(@Nullable String distributedAvailabilityGroupName) {
            this.distributedAvailabilityGroupName = Input.ofNullable(distributedAvailabilityGroupName);
            return this;
        }

        public Builder setManagedInstanceName(Input<String> managedInstanceName) {
            this.managedInstanceName = Objects.requireNonNull(managedInstanceName);
            return this;
        }

        public Builder setManagedInstanceName(String managedInstanceName) {
            this.managedInstanceName = Input.of(Objects.requireNonNull(managedInstanceName));
            return this;
        }

        public Builder setPrimaryAvailabilityGroupName(@Nullable Input<String> primaryAvailabilityGroupName) {
            this.primaryAvailabilityGroupName = primaryAvailabilityGroupName;
            return this;
        }

        public Builder setPrimaryAvailabilityGroupName(@Nullable String primaryAvailabilityGroupName) {
            this.primaryAvailabilityGroupName = Input.ofNullable(primaryAvailabilityGroupName);
            return this;
        }

        public Builder setReplicationMode(@Nullable Input<Either<String,ReplicationMode>> replicationMode) {
            this.replicationMode = replicationMode;
            return this;
        }

        public Builder setReplicationMode(@Nullable Either<String,ReplicationMode> replicationMode) {
            this.replicationMode = Input.ofNullable(replicationMode);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSecondaryAvailabilityGroupName(@Nullable Input<String> secondaryAvailabilityGroupName) {
            this.secondaryAvailabilityGroupName = secondaryAvailabilityGroupName;
            return this;
        }

        public Builder setSecondaryAvailabilityGroupName(@Nullable String secondaryAvailabilityGroupName) {
            this.secondaryAvailabilityGroupName = Input.ofNullable(secondaryAvailabilityGroupName);
            return this;
        }

        public Builder setSourceEndpoint(@Nullable Input<String> sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }

        public Builder setSourceEndpoint(@Nullable String sourceEndpoint) {
            this.sourceEndpoint = Input.ofNullable(sourceEndpoint);
            return this;
        }

        public Builder setTargetDatabase(@Nullable Input<String> targetDatabase) {
            this.targetDatabase = targetDatabase;
            return this;
        }

        public Builder setTargetDatabase(@Nullable String targetDatabase) {
            this.targetDatabase = Input.ofNullable(targetDatabase);
            return this;
        }

        public DistributedAvailabilityGroupArgs build() {
            return new DistributedAvailabilityGroupArgs(distributedAvailabilityGroupName, managedInstanceName, primaryAvailabilityGroupName, replicationMode, resourceGroupName, secondaryAvailabilityGroupName, sourceEndpoint, targetDatabase);
        }
    }
}

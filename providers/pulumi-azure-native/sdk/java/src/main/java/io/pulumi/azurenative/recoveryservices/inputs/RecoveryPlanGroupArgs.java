// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.RecoveryPlanGroupType;
import io.pulumi.azurenative.recoveryservices.inputs.RecoveryPlanActionArgs;
import io.pulumi.azurenative.recoveryservices.inputs.RecoveryPlanProtectedItemArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Recovery plan group details.
 * 
 */
public final class RecoveryPlanGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecoveryPlanGroupArgs Empty = new RecoveryPlanGroupArgs();

    /**
     * The end group actions.
     * 
     */
    @InputImport(name="endGroupActions")
      private final @Nullable Input<List<RecoveryPlanActionArgs>> endGroupActions;

    public Input<List<RecoveryPlanActionArgs>> getEndGroupActions() {
        return this.endGroupActions == null ? Input.empty() : this.endGroupActions;
    }

    /**
     * The group type.
     * 
     */
    @InputImport(name="groupType", required=true)
      private final Input<Either<String,RecoveryPlanGroupType>> groupType;

    public Input<Either<String,RecoveryPlanGroupType>> getGroupType() {
        return this.groupType;
    }

    /**
     * The list of protected items.
     * 
     */
    @InputImport(name="replicationProtectedItems")
      private final @Nullable Input<List<RecoveryPlanProtectedItemArgs>> replicationProtectedItems;

    public Input<List<RecoveryPlanProtectedItemArgs>> getReplicationProtectedItems() {
        return this.replicationProtectedItems == null ? Input.empty() : this.replicationProtectedItems;
    }

    /**
     * The start group actions.
     * 
     */
    @InputImport(name="startGroupActions")
      private final @Nullable Input<List<RecoveryPlanActionArgs>> startGroupActions;

    public Input<List<RecoveryPlanActionArgs>> getStartGroupActions() {
        return this.startGroupActions == null ? Input.empty() : this.startGroupActions;
    }

    public RecoveryPlanGroupArgs(
        @Nullable Input<List<RecoveryPlanActionArgs>> endGroupActions,
        Input<Either<String,RecoveryPlanGroupType>> groupType,
        @Nullable Input<List<RecoveryPlanProtectedItemArgs>> replicationProtectedItems,
        @Nullable Input<List<RecoveryPlanActionArgs>> startGroupActions) {
        this.endGroupActions = endGroupActions;
        this.groupType = Objects.requireNonNull(groupType, "expected parameter 'groupType' to be non-null");
        this.replicationProtectedItems = replicationProtectedItems;
        this.startGroupActions = startGroupActions;
    }

    private RecoveryPlanGroupArgs() {
        this.endGroupActions = Input.empty();
        this.groupType = Input.empty();
        this.replicationProtectedItems = Input.empty();
        this.startGroupActions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecoveryPlanGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<RecoveryPlanActionArgs>> endGroupActions;
        private Input<Either<String,RecoveryPlanGroupType>> groupType;
        private @Nullable Input<List<RecoveryPlanProtectedItemArgs>> replicationProtectedItems;
        private @Nullable Input<List<RecoveryPlanActionArgs>> startGroupActions;

        public Builder() {
    	      // Empty
        }

        public Builder(RecoveryPlanGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endGroupActions = defaults.endGroupActions;
    	      this.groupType = defaults.groupType;
    	      this.replicationProtectedItems = defaults.replicationProtectedItems;
    	      this.startGroupActions = defaults.startGroupActions;
        }

        public Builder setEndGroupActions(@Nullable Input<List<RecoveryPlanActionArgs>> endGroupActions) {
            this.endGroupActions = endGroupActions;
            return this;
        }

        public Builder setEndGroupActions(@Nullable List<RecoveryPlanActionArgs> endGroupActions) {
            this.endGroupActions = Input.ofNullable(endGroupActions);
            return this;
        }

        public Builder setGroupType(Input<Either<String,RecoveryPlanGroupType>> groupType) {
            this.groupType = Objects.requireNonNull(groupType);
            return this;
        }

        public Builder setGroupType(Either<String,RecoveryPlanGroupType> groupType) {
            this.groupType = Input.of(Objects.requireNonNull(groupType));
            return this;
        }

        public Builder setReplicationProtectedItems(@Nullable Input<List<RecoveryPlanProtectedItemArgs>> replicationProtectedItems) {
            this.replicationProtectedItems = replicationProtectedItems;
            return this;
        }

        public Builder setReplicationProtectedItems(@Nullable List<RecoveryPlanProtectedItemArgs> replicationProtectedItems) {
            this.replicationProtectedItems = Input.ofNullable(replicationProtectedItems);
            return this;
        }

        public Builder setStartGroupActions(@Nullable Input<List<RecoveryPlanActionArgs>> startGroupActions) {
            this.startGroupActions = startGroupActions;
            return this;
        }

        public Builder setStartGroupActions(@Nullable List<RecoveryPlanActionArgs> startGroupActions) {
            this.startGroupActions = Input.ofNullable(startGroupActions);
            return this;
        }
        public RecoveryPlanGroupArgs build() {
            return new RecoveryPlanGroupArgs(endGroupActions, groupType, replicationProtectedItems, startGroupActions);
        }
    }
}
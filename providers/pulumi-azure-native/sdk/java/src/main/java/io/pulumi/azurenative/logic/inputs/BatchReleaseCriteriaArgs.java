// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.WorkflowTriggerRecurrenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The batch release criteria.
 * 
 */
public final class BatchReleaseCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final BatchReleaseCriteriaArgs Empty = new BatchReleaseCriteriaArgs();

    /**
     * The batch size in bytes.
     * 
     */
    @InputImport(name="batchSize")
    private final @Nullable Input<Integer> batchSize;

    public Input<Integer> getBatchSize() {
        return this.batchSize == null ? Input.empty() : this.batchSize;
    }

    /**
     * The message count.
     * 
     */
    @InputImport(name="messageCount")
    private final @Nullable Input<Integer> messageCount;

    public Input<Integer> getMessageCount() {
        return this.messageCount == null ? Input.empty() : this.messageCount;
    }

    /**
     * The recurrence.
     * 
     */
    @InputImport(name="recurrence")
    private final @Nullable Input<WorkflowTriggerRecurrenceArgs> recurrence;

    public Input<WorkflowTriggerRecurrenceArgs> getRecurrence() {
        return this.recurrence == null ? Input.empty() : this.recurrence;
    }

    public BatchReleaseCriteriaArgs(
        @Nullable Input<Integer> batchSize,
        @Nullable Input<Integer> messageCount,
        @Nullable Input<WorkflowTriggerRecurrenceArgs> recurrence) {
        this.batchSize = batchSize;
        this.messageCount = messageCount;
        this.recurrence = recurrence;
    }

    private BatchReleaseCriteriaArgs() {
        this.batchSize = Input.empty();
        this.messageCount = Input.empty();
        this.recurrence = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BatchReleaseCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> batchSize;
        private @Nullable Input<Integer> messageCount;
        private @Nullable Input<WorkflowTriggerRecurrenceArgs> recurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(BatchReleaseCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchSize = defaults.batchSize;
    	      this.messageCount = defaults.messageCount;
    	      this.recurrence = defaults.recurrence;
        }

        public Builder setBatchSize(@Nullable Input<Integer> batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        public Builder setBatchSize(@Nullable Integer batchSize) {
            this.batchSize = Input.ofNullable(batchSize);
            return this;
        }

        public Builder setMessageCount(@Nullable Input<Integer> messageCount) {
            this.messageCount = messageCount;
            return this;
        }

        public Builder setMessageCount(@Nullable Integer messageCount) {
            this.messageCount = Input.ofNullable(messageCount);
            return this;
        }

        public Builder setRecurrence(@Nullable Input<WorkflowTriggerRecurrenceArgs> recurrence) {
            this.recurrence = recurrence;
            return this;
        }

        public Builder setRecurrence(@Nullable WorkflowTriggerRecurrenceArgs recurrence) {
            this.recurrence = Input.ofNullable(recurrence);
            return this;
        }

        public BatchReleaseCriteriaArgs build() {
            return new BatchReleaseCriteriaArgs(batchSize, messageCount, recurrence);
        }
    }
}

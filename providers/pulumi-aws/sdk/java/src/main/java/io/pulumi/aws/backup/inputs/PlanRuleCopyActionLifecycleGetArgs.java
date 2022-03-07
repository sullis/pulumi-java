// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PlanRuleCopyActionLifecycleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PlanRuleCopyActionLifecycleGetArgs Empty = new PlanRuleCopyActionLifecycleGetArgs();

    /**
     * Specifies the number of days after creation that a recovery point is moved to cold storage.
     * 
     */
    @InputImport(name="coldStorageAfter")
      private final @Nullable Input<Integer> coldStorageAfter;

    public Input<Integer> getColdStorageAfter() {
        return this.coldStorageAfter == null ? Input.empty() : this.coldStorageAfter;
    }

    /**
     * Specifies the number of days after creation that a recovery point is deleted. Must be 90 days greater than `cold_storage_after`.
     * 
     */
    @InputImport(name="deleteAfter")
      private final @Nullable Input<Integer> deleteAfter;

    public Input<Integer> getDeleteAfter() {
        return this.deleteAfter == null ? Input.empty() : this.deleteAfter;
    }

    public PlanRuleCopyActionLifecycleGetArgs(
        @Nullable Input<Integer> coldStorageAfter,
        @Nullable Input<Integer> deleteAfter) {
        this.coldStorageAfter = coldStorageAfter;
        this.deleteAfter = deleteAfter;
    }

    private PlanRuleCopyActionLifecycleGetArgs() {
        this.coldStorageAfter = Input.empty();
        this.deleteAfter = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlanRuleCopyActionLifecycleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> coldStorageAfter;
        private @Nullable Input<Integer> deleteAfter;

        public Builder() {
    	      // Empty
        }

        public Builder(PlanRuleCopyActionLifecycleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coldStorageAfter = defaults.coldStorageAfter;
    	      this.deleteAfter = defaults.deleteAfter;
        }

        public Builder setColdStorageAfter(@Nullable Input<Integer> coldStorageAfter) {
            this.coldStorageAfter = coldStorageAfter;
            return this;
        }

        public Builder setColdStorageAfter(@Nullable Integer coldStorageAfter) {
            this.coldStorageAfter = Input.ofNullable(coldStorageAfter);
            return this;
        }

        public Builder setDeleteAfter(@Nullable Input<Integer> deleteAfter) {
            this.deleteAfter = deleteAfter;
            return this;
        }

        public Builder setDeleteAfter(@Nullable Integer deleteAfter) {
            this.deleteAfter = Input.ofNullable(deleteAfter);
            return this;
        }
        public PlanRuleCopyActionLifecycleGetArgs build() {
            return new PlanRuleCopyActionLifecycleGetArgs(coldStorageAfter, deleteAfter);
        }
    }
}
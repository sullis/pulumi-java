// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.inputs;

import io.pulumi.awsnative.cloudformation.enums.StackSetRegionConcurrencyType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The user-specified preferences for how AWS CloudFormation performs a stack set operation.
 * 
 */
public final class StackSetOperationPreferencesArgs extends io.pulumi.resources.ResourceArgs {

    public static final StackSetOperationPreferencesArgs Empty = new StackSetOperationPreferencesArgs();

    @Import(name="failureToleranceCount")
      private final @Nullable Output<Integer> failureToleranceCount;

    public Output<Integer> failureToleranceCount() {
        return this.failureToleranceCount == null ? Codegen.empty() : this.failureToleranceCount;
    }

    @Import(name="failureTolerancePercentage")
      private final @Nullable Output<Integer> failureTolerancePercentage;

    public Output<Integer> failureTolerancePercentage() {
        return this.failureTolerancePercentage == null ? Codegen.empty() : this.failureTolerancePercentage;
    }

    @Import(name="maxConcurrentCount")
      private final @Nullable Output<Integer> maxConcurrentCount;

    public Output<Integer> maxConcurrentCount() {
        return this.maxConcurrentCount == null ? Codegen.empty() : this.maxConcurrentCount;
    }

    @Import(name="maxConcurrentPercentage")
      private final @Nullable Output<Integer> maxConcurrentPercentage;

    public Output<Integer> maxConcurrentPercentage() {
        return this.maxConcurrentPercentage == null ? Codegen.empty() : this.maxConcurrentPercentage;
    }

    @Import(name="regionConcurrencyType")
      private final @Nullable Output<StackSetRegionConcurrencyType> regionConcurrencyType;

    public Output<StackSetRegionConcurrencyType> regionConcurrencyType() {
        return this.regionConcurrencyType == null ? Codegen.empty() : this.regionConcurrencyType;
    }

    @Import(name="regionOrder")
      private final @Nullable Output<List<String>> regionOrder;

    public Output<List<String>> regionOrder() {
        return this.regionOrder == null ? Codegen.empty() : this.regionOrder;
    }

    public StackSetOperationPreferencesArgs(
        @Nullable Output<Integer> failureToleranceCount,
        @Nullable Output<Integer> failureTolerancePercentage,
        @Nullable Output<Integer> maxConcurrentCount,
        @Nullable Output<Integer> maxConcurrentPercentage,
        @Nullable Output<StackSetRegionConcurrencyType> regionConcurrencyType,
        @Nullable Output<List<String>> regionOrder) {
        this.failureToleranceCount = failureToleranceCount;
        this.failureTolerancePercentage = failureTolerancePercentage;
        this.maxConcurrentCount = maxConcurrentCount;
        this.maxConcurrentPercentage = maxConcurrentPercentage;
        this.regionConcurrencyType = regionConcurrencyType;
        this.regionOrder = regionOrder;
    }

    private StackSetOperationPreferencesArgs() {
        this.failureToleranceCount = Codegen.empty();
        this.failureTolerancePercentage = Codegen.empty();
        this.maxConcurrentCount = Codegen.empty();
        this.maxConcurrentPercentage = Codegen.empty();
        this.regionConcurrencyType = Codegen.empty();
        this.regionOrder = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackSetOperationPreferencesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> failureToleranceCount;
        private @Nullable Output<Integer> failureTolerancePercentage;
        private @Nullable Output<Integer> maxConcurrentCount;
        private @Nullable Output<Integer> maxConcurrentPercentage;
        private @Nullable Output<StackSetRegionConcurrencyType> regionConcurrencyType;
        private @Nullable Output<List<String>> regionOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(StackSetOperationPreferencesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureToleranceCount = defaults.failureToleranceCount;
    	      this.failureTolerancePercentage = defaults.failureTolerancePercentage;
    	      this.maxConcurrentCount = defaults.maxConcurrentCount;
    	      this.maxConcurrentPercentage = defaults.maxConcurrentPercentage;
    	      this.regionConcurrencyType = defaults.regionConcurrencyType;
    	      this.regionOrder = defaults.regionOrder;
        }

        public Builder failureToleranceCount(@Nullable Output<Integer> failureToleranceCount) {
            this.failureToleranceCount = failureToleranceCount;
            return this;
        }
        public Builder failureToleranceCount(@Nullable Integer failureToleranceCount) {
            this.failureToleranceCount = Codegen.ofNullable(failureToleranceCount);
            return this;
        }
        public Builder failureTolerancePercentage(@Nullable Output<Integer> failureTolerancePercentage) {
            this.failureTolerancePercentage = failureTolerancePercentage;
            return this;
        }
        public Builder failureTolerancePercentage(@Nullable Integer failureTolerancePercentage) {
            this.failureTolerancePercentage = Codegen.ofNullable(failureTolerancePercentage);
            return this;
        }
        public Builder maxConcurrentCount(@Nullable Output<Integer> maxConcurrentCount) {
            this.maxConcurrentCount = maxConcurrentCount;
            return this;
        }
        public Builder maxConcurrentCount(@Nullable Integer maxConcurrentCount) {
            this.maxConcurrentCount = Codegen.ofNullable(maxConcurrentCount);
            return this;
        }
        public Builder maxConcurrentPercentage(@Nullable Output<Integer> maxConcurrentPercentage) {
            this.maxConcurrentPercentage = maxConcurrentPercentage;
            return this;
        }
        public Builder maxConcurrentPercentage(@Nullable Integer maxConcurrentPercentage) {
            this.maxConcurrentPercentage = Codegen.ofNullable(maxConcurrentPercentage);
            return this;
        }
        public Builder regionConcurrencyType(@Nullable Output<StackSetRegionConcurrencyType> regionConcurrencyType) {
            this.regionConcurrencyType = regionConcurrencyType;
            return this;
        }
        public Builder regionConcurrencyType(@Nullable StackSetRegionConcurrencyType regionConcurrencyType) {
            this.regionConcurrencyType = Codegen.ofNullable(regionConcurrencyType);
            return this;
        }
        public Builder regionOrder(@Nullable Output<List<String>> regionOrder) {
            this.regionOrder = regionOrder;
            return this;
        }
        public Builder regionOrder(@Nullable List<String> regionOrder) {
            this.regionOrder = Codegen.ofNullable(regionOrder);
            return this;
        }
        public Builder regionOrder(String... regionOrder) {
            return regionOrder(List.of(regionOrder));
        }        public StackSetOperationPreferencesArgs build() {
            return new StackSetOperationPreferencesArgs(failureToleranceCount, failureTolerancePercentage, maxConcurrentCount, maxConcurrentPercentage, regionConcurrencyType, regionOrder);
        }
    }
}

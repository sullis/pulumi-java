// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudsearch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainScalingParametersGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainScalingParametersGetArgs Empty = new DomainScalingParametersGetArgs();

    /**
     * The instance type that you want to preconfigure for your domain. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_ScalingParameters.html) for valid values.
     * 
     */
    @Import(name="desiredInstanceType")
      private final @Nullable Output<String> desiredInstanceType;

    public Output<String> desiredInstanceType() {
        return this.desiredInstanceType == null ? Codegen.empty() : this.desiredInstanceType;
    }

    /**
     * The number of partitions you want to preconfigure for your domain. Only valid when you select `search.2xlarge` as the instance type.
     * 
     */
    @Import(name="desiredPartitionCount")
      private final @Nullable Output<Integer> desiredPartitionCount;

    public Output<Integer> desiredPartitionCount() {
        return this.desiredPartitionCount == null ? Codegen.empty() : this.desiredPartitionCount;
    }

    /**
     * The number of replicas you want to preconfigure for each index partition.
     * 
     */
    @Import(name="desiredReplicationCount")
      private final @Nullable Output<Integer> desiredReplicationCount;

    public Output<Integer> desiredReplicationCount() {
        return this.desiredReplicationCount == null ? Codegen.empty() : this.desiredReplicationCount;
    }

    public DomainScalingParametersGetArgs(
        @Nullable Output<String> desiredInstanceType,
        @Nullable Output<Integer> desiredPartitionCount,
        @Nullable Output<Integer> desiredReplicationCount) {
        this.desiredInstanceType = desiredInstanceType;
        this.desiredPartitionCount = desiredPartitionCount;
        this.desiredReplicationCount = desiredReplicationCount;
    }

    private DomainScalingParametersGetArgs() {
        this.desiredInstanceType = Codegen.empty();
        this.desiredPartitionCount = Codegen.empty();
        this.desiredReplicationCount = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainScalingParametersGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> desiredInstanceType;
        private @Nullable Output<Integer> desiredPartitionCount;
        private @Nullable Output<Integer> desiredReplicationCount;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainScalingParametersGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredInstanceType = defaults.desiredInstanceType;
    	      this.desiredPartitionCount = defaults.desiredPartitionCount;
    	      this.desiredReplicationCount = defaults.desiredReplicationCount;
        }

        public Builder desiredInstanceType(@Nullable Output<String> desiredInstanceType) {
            this.desiredInstanceType = desiredInstanceType;
            return this;
        }
        public Builder desiredInstanceType(@Nullable String desiredInstanceType) {
            this.desiredInstanceType = Codegen.ofNullable(desiredInstanceType);
            return this;
        }
        public Builder desiredPartitionCount(@Nullable Output<Integer> desiredPartitionCount) {
            this.desiredPartitionCount = desiredPartitionCount;
            return this;
        }
        public Builder desiredPartitionCount(@Nullable Integer desiredPartitionCount) {
            this.desiredPartitionCount = Codegen.ofNullable(desiredPartitionCount);
            return this;
        }
        public Builder desiredReplicationCount(@Nullable Output<Integer> desiredReplicationCount) {
            this.desiredReplicationCount = desiredReplicationCount;
            return this;
        }
        public Builder desiredReplicationCount(@Nullable Integer desiredReplicationCount) {
            this.desiredReplicationCount = Codegen.ofNullable(desiredReplicationCount);
            return this;
        }        public DomainScalingParametersGetArgs build() {
            return new DomainScalingParametersGetArgs(desiredInstanceType, desiredPartitionCount, desiredReplicationCount);
        }
    }
}

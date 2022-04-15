// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.DatastoreTimestampPartitionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatastorePartitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatastorePartitionArgs Empty = new DatastorePartitionArgs();

    @Import(name="partition")
      private final @Nullable Output<DatastorePartitionArgs> partition;

    public Output<DatastorePartitionArgs> partition() {
        return this.partition == null ? Codegen.empty() : this.partition;
    }

    @Import(name="timestampPartition")
      private final @Nullable Output<DatastoreTimestampPartitionArgs> timestampPartition;

    public Output<DatastoreTimestampPartitionArgs> timestampPartition() {
        return this.timestampPartition == null ? Codegen.empty() : this.timestampPartition;
    }

    public DatastorePartitionArgs(
        @Nullable Output<DatastorePartitionArgs> partition,
        @Nullable Output<DatastoreTimestampPartitionArgs> timestampPartition) {
        this.partition = partition;
        this.timestampPartition = timestampPartition;
    }

    private DatastorePartitionArgs() {
        this.partition = Codegen.empty();
        this.timestampPartition = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastorePartitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DatastorePartitionArgs> partition;
        private @Nullable Output<DatastoreTimestampPartitionArgs> timestampPartition;

        public Builder() {
    	      // Empty
        }

        public Builder(DatastorePartitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partition = defaults.partition;
    	      this.timestampPartition = defaults.timestampPartition;
        }

        public Builder partition(@Nullable Output<DatastorePartitionArgs> partition) {
            this.partition = partition;
            return this;
        }
        public Builder partition(@Nullable DatastorePartitionArgs partition) {
            this.partition = Codegen.ofNullable(partition);
            return this;
        }
        public Builder timestampPartition(@Nullable Output<DatastoreTimestampPartitionArgs> timestampPartition) {
            this.timestampPartition = timestampPartition;
            return this;
        }
        public Builder timestampPartition(@Nullable DatastoreTimestampPartitionArgs timestampPartition) {
            this.timestampPartition = Codegen.ofNullable(timestampPartition);
            return this;
        }        public DatastorePartitionArgs build() {
            return new DatastorePartitionArgs(partition, timestampPartition);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.DatastoreTimestampPartition;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatastorePartition extends io.pulumi.resources.InvokeArgs {

    public static final DatastorePartition Empty = new DatastorePartition();

    @InputImport(name="partition")
    private final @Nullable DatastorePartition partition;

    public Optional<DatastorePartition> getPartition() {
        return this.partition == null ? Optional.empty() : Optional.ofNullable(this.partition);
    }

    @InputImport(name="timestampPartition")
    private final @Nullable DatastoreTimestampPartition timestampPartition;

    public Optional<DatastoreTimestampPartition> getTimestampPartition() {
        return this.timestampPartition == null ? Optional.empty() : Optional.ofNullable(this.timestampPartition);
    }

    public DatastorePartition(
        @Nullable DatastorePartition partition,
        @Nullable DatastoreTimestampPartition timestampPartition) {
        this.partition = partition;
        this.timestampPartition = timestampPartition;
    }

    private DatastorePartition() {
        this.partition = null;
        this.timestampPartition = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastorePartition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatastorePartition partition;
        private @Nullable DatastoreTimestampPartition timestampPartition;

        public Builder() {
    	      // Empty
        }

        public Builder(DatastorePartition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partition = defaults.partition;
    	      this.timestampPartition = defaults.timestampPartition;
        }

        public Builder setPartition(@Nullable DatastorePartition partition) {
            this.partition = partition;
            return this;
        }

        public Builder setTimestampPartition(@Nullable DatastoreTimestampPartition timestampPartition) {
            this.timestampPartition = timestampPartition;
            return this;
        }

        public DatastorePartition build() {
            return new DatastorePartition(partition, timestampPartition);
        }
    }
}

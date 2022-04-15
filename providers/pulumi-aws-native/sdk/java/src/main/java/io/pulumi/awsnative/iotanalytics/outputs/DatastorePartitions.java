// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.awsnative.iotanalytics.outputs.DatastorePartition;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DatastorePartitions {
    private final @Nullable List<DatastorePartition> partitions;

    @CustomType.Constructor
    private DatastorePartitions(@CustomType.Parameter("partitions") @Nullable List<DatastorePartition> partitions) {
        this.partitions = partitions;
    }

    public List<DatastorePartition> partitions() {
        return this.partitions == null ? List.of() : this.partitions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastorePartitions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DatastorePartition> partitions;

        public Builder() {
    	      // Empty
        }

        public Builder(DatastorePartitions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partitions = defaults.partitions;
        }

        public Builder partitions(@Nullable List<DatastorePartition> partitions) {
            this.partitions = partitions;
            return this;
        }
        public Builder partitions(DatastorePartition... partitions) {
            return partitions(List.of(partitions));
        }        public DatastorePartitions build() {
            return new DatastorePartitions(partitions);
        }
    }
}

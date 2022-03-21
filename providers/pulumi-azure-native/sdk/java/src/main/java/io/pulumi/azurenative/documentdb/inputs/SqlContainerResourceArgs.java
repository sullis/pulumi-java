// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.ConflictResolutionPolicyArgs;
import io.pulumi.azurenative.documentdb.inputs.ContainerPartitionKeyArgs;
import io.pulumi.azurenative.documentdb.inputs.IndexingPolicyArgs;
import io.pulumi.azurenative.documentdb.inputs.UniqueKeyPolicyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cosmos DB SQL container resource object
 * 
 */
public final class SqlContainerResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlContainerResourceArgs Empty = new SqlContainerResourceArgs();

    /**
     * Analytical TTL.
     * 
     */
    @Import(name="analyticalStorageTtl")
      private final @Nullable Output<Double> analyticalStorageTtl;

    public Output<Double> getAnalyticalStorageTtl() {
        return this.analyticalStorageTtl == null ? Output.empty() : this.analyticalStorageTtl;
    }

    /**
     * The conflict resolution policy for the container.
     * 
     */
    @Import(name="conflictResolutionPolicy")
      private final @Nullable Output<ConflictResolutionPolicyArgs> conflictResolutionPolicy;

    public Output<ConflictResolutionPolicyArgs> getConflictResolutionPolicy() {
        return this.conflictResolutionPolicy == null ? Output.empty() : this.conflictResolutionPolicy;
    }

    /**
     * Default time to live
     * 
     */
    @Import(name="defaultTtl")
      private final @Nullable Output<Integer> defaultTtl;

    public Output<Integer> getDefaultTtl() {
        return this.defaultTtl == null ? Output.empty() : this.defaultTtl;
    }

    /**
     * Name of the Cosmos DB SQL container
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    /**
     * The configuration of the indexing policy. By default, the indexing is automatic for all document paths within the container
     * 
     */
    @Import(name="indexingPolicy")
      private final @Nullable Output<IndexingPolicyArgs> indexingPolicy;

    public Output<IndexingPolicyArgs> getIndexingPolicy() {
        return this.indexingPolicy == null ? Output.empty() : this.indexingPolicy;
    }

    /**
     * The configuration of the partition key to be used for partitioning data into multiple partitions
     * 
     */
    @Import(name="partitionKey")
      private final @Nullable Output<ContainerPartitionKeyArgs> partitionKey;

    public Output<ContainerPartitionKeyArgs> getPartitionKey() {
        return this.partitionKey == null ? Output.empty() : this.partitionKey;
    }

    /**
     * The unique key policy configuration for specifying uniqueness constraints on documents in the collection in the Azure Cosmos DB service.
     * 
     */
    @Import(name="uniqueKeyPolicy")
      private final @Nullable Output<UniqueKeyPolicyArgs> uniqueKeyPolicy;

    public Output<UniqueKeyPolicyArgs> getUniqueKeyPolicy() {
        return this.uniqueKeyPolicy == null ? Output.empty() : this.uniqueKeyPolicy;
    }

    public SqlContainerResourceArgs(
        @Nullable Output<Double> analyticalStorageTtl,
        @Nullable Output<ConflictResolutionPolicyArgs> conflictResolutionPolicy,
        @Nullable Output<Integer> defaultTtl,
        Output<String> id,
        @Nullable Output<IndexingPolicyArgs> indexingPolicy,
        @Nullable Output<ContainerPartitionKeyArgs> partitionKey,
        @Nullable Output<UniqueKeyPolicyArgs> uniqueKeyPolicy) {
        this.analyticalStorageTtl = analyticalStorageTtl;
        this.conflictResolutionPolicy = conflictResolutionPolicy;
        this.defaultTtl = defaultTtl;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.indexingPolicy = indexingPolicy;
        this.partitionKey = partitionKey;
        this.uniqueKeyPolicy = uniqueKeyPolicy;
    }

    private SqlContainerResourceArgs() {
        this.analyticalStorageTtl = Output.empty();
        this.conflictResolutionPolicy = Output.empty();
        this.defaultTtl = Output.empty();
        this.id = Output.empty();
        this.indexingPolicy = Output.empty();
        this.partitionKey = Output.empty();
        this.uniqueKeyPolicy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlContainerResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> analyticalStorageTtl;
        private @Nullable Output<ConflictResolutionPolicyArgs> conflictResolutionPolicy;
        private @Nullable Output<Integer> defaultTtl;
        private Output<String> id;
        private @Nullable Output<IndexingPolicyArgs> indexingPolicy;
        private @Nullable Output<ContainerPartitionKeyArgs> partitionKey;
        private @Nullable Output<UniqueKeyPolicyArgs> uniqueKeyPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlContainerResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyticalStorageTtl = defaults.analyticalStorageTtl;
    	      this.conflictResolutionPolicy = defaults.conflictResolutionPolicy;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.id = defaults.id;
    	      this.indexingPolicy = defaults.indexingPolicy;
    	      this.partitionKey = defaults.partitionKey;
    	      this.uniqueKeyPolicy = defaults.uniqueKeyPolicy;
        }

        public Builder analyticalStorageTtl(@Nullable Output<Double> analyticalStorageTtl) {
            this.analyticalStorageTtl = analyticalStorageTtl;
            return this;
        }
        public Builder analyticalStorageTtl(@Nullable Double analyticalStorageTtl) {
            this.analyticalStorageTtl = Output.ofNullable(analyticalStorageTtl);
            return this;
        }
        public Builder conflictResolutionPolicy(@Nullable Output<ConflictResolutionPolicyArgs> conflictResolutionPolicy) {
            this.conflictResolutionPolicy = conflictResolutionPolicy;
            return this;
        }
        public Builder conflictResolutionPolicy(@Nullable ConflictResolutionPolicyArgs conflictResolutionPolicy) {
            this.conflictResolutionPolicy = Output.ofNullable(conflictResolutionPolicy);
            return this;
        }
        public Builder defaultTtl(@Nullable Output<Integer> defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }
        public Builder defaultTtl(@Nullable Integer defaultTtl) {
            this.defaultTtl = Output.ofNullable(defaultTtl);
            return this;
        }
        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }
        public Builder indexingPolicy(@Nullable Output<IndexingPolicyArgs> indexingPolicy) {
            this.indexingPolicy = indexingPolicy;
            return this;
        }
        public Builder indexingPolicy(@Nullable IndexingPolicyArgs indexingPolicy) {
            this.indexingPolicy = Output.ofNullable(indexingPolicy);
            return this;
        }
        public Builder partitionKey(@Nullable Output<ContainerPartitionKeyArgs> partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }
        public Builder partitionKey(@Nullable ContainerPartitionKeyArgs partitionKey) {
            this.partitionKey = Output.ofNullable(partitionKey);
            return this;
        }
        public Builder uniqueKeyPolicy(@Nullable Output<UniqueKeyPolicyArgs> uniqueKeyPolicy) {
            this.uniqueKeyPolicy = uniqueKeyPolicy;
            return this;
        }
        public Builder uniqueKeyPolicy(@Nullable UniqueKeyPolicyArgs uniqueKeyPolicy) {
            this.uniqueKeyPolicy = Output.ofNullable(uniqueKeyPolicy);
            return this;
        }        public SqlContainerResourceArgs build() {
            return new SqlContainerResourceArgs(analyticalStorageTtl, conflictResolutionPolicy, defaultTtl, id, indexingPolicy, partitionKey, uniqueKeyPolicy);
        }
    }
}

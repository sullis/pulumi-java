// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CatalogTablePartitionIndexArgs extends com.pulumi.resources.ResourceArgs {

    public static final CatalogTablePartitionIndexArgs Empty = new CatalogTablePartitionIndexArgs();

    /**
     * Name of the partition index.
     * 
     */
    @Import(name="indexName", required=true)
    private Output<String> indexName;

    /**
     * @return Name of the partition index.
     * 
     */
    public Output<String> indexName() {
        return this.indexName;
    }

    @Import(name="indexStatus")
    private @Nullable Output<String> indexStatus;

    public Optional<Output<String>> indexStatus() {
        return Optional.ofNullable(this.indexStatus);
    }

    /**
     * Keys for the partition index.
     * 
     */
    @Import(name="keys", required=true)
    private Output<List<String>> keys;

    /**
     * @return Keys for the partition index.
     * 
     */
    public Output<List<String>> keys() {
        return this.keys;
    }

    private CatalogTablePartitionIndexArgs() {}

    private CatalogTablePartitionIndexArgs(CatalogTablePartitionIndexArgs $) {
        this.indexName = $.indexName;
        this.indexStatus = $.indexStatus;
        this.keys = $.keys;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CatalogTablePartitionIndexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CatalogTablePartitionIndexArgs $;

        public Builder() {
            $ = new CatalogTablePartitionIndexArgs();
        }

        public Builder(CatalogTablePartitionIndexArgs defaults) {
            $ = new CatalogTablePartitionIndexArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param indexName Name of the partition index.
         * 
         * @return builder
         * 
         */
        public Builder indexName(Output<String> indexName) {
            $.indexName = indexName;
            return this;
        }

        /**
         * @param indexName Name of the partition index.
         * 
         * @return builder
         * 
         */
        public Builder indexName(String indexName) {
            return indexName(Output.of(indexName));
        }

        public Builder indexStatus(@Nullable Output<String> indexStatus) {
            $.indexStatus = indexStatus;
            return this;
        }

        public Builder indexStatus(String indexStatus) {
            return indexStatus(Output.of(indexStatus));
        }

        /**
         * @param keys Keys for the partition index.
         * 
         * @return builder
         * 
         */
        public Builder keys(Output<List<String>> keys) {
            $.keys = keys;
            return this;
        }

        /**
         * @param keys Keys for the partition index.
         * 
         * @return builder
         * 
         */
        public Builder keys(List<String> keys) {
            return keys(Output.of(keys));
        }

        /**
         * @param keys Keys for the partition index.
         * 
         * @return builder
         * 
         */
        public Builder keys(String... keys) {
            return keys(List.of(keys));
        }

        public CatalogTablePartitionIndexArgs build() {
            $.indexName = Objects.requireNonNull($.indexName, "expected parameter 'indexName' to be non-null");
            $.keys = Objects.requireNonNull($.keys, "expected parameter 'keys' to be non-null");
            return $;
        }
    }

}

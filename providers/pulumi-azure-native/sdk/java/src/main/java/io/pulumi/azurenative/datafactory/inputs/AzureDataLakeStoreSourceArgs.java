// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity Azure Data Lake source.
 * 
 */
public final class AzureDataLakeStoreSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureDataLakeStoreSourceArgs Empty = new AzureDataLakeStoreSourceArgs();

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="disableMetricsCollection")
    private final @Nullable Input<Object> disableMetricsCollection;

    public Input<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Input.empty() : this.disableMetricsCollection;
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
    private final @Nullable Input<Object> maxConcurrentConnections;

    public Input<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Input.empty() : this.maxConcurrentConnections;
    }

    /**
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="recursive")
    private final @Nullable Input<Object> recursive;

    public Input<Object> getRecursive() {
        return this.recursive == null ? Input.empty() : this.recursive;
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="sourceRetryCount")
    private final @Nullable Input<Object> sourceRetryCount;

    public Input<Object> getSourceRetryCount() {
        return this.sourceRetryCount == null ? Input.empty() : this.sourceRetryCount;
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="sourceRetryWait")
    private final @Nullable Input<Object> sourceRetryWait;

    public Input<Object> getSourceRetryWait() {
        return this.sourceRetryWait == null ? Input.empty() : this.sourceRetryWait;
    }

    /**
     * Copy source type.
     * Expected value is 'AzureDataLakeStoreSource'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public AzureDataLakeStoreSourceArgs(
        @Nullable Input<Object> disableMetricsCollection,
        @Nullable Input<Object> maxConcurrentConnections,
        @Nullable Input<Object> recursive,
        @Nullable Input<Object> sourceRetryCount,
        @Nullable Input<Object> sourceRetryWait,
        Input<String> type) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.recursive = recursive;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureDataLakeStoreSourceArgs() {
        this.disableMetricsCollection = Input.empty();
        this.maxConcurrentConnections = Input.empty();
        this.recursive = Input.empty();
        this.sourceRetryCount = Input.empty();
        this.sourceRetryWait = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataLakeStoreSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> disableMetricsCollection;
        private @Nullable Input<Object> maxConcurrentConnections;
        private @Nullable Input<Object> recursive;
        private @Nullable Input<Object> sourceRetryCount;
        private @Nullable Input<Object> sourceRetryWait;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataLakeStoreSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.recursive = defaults.recursive;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder setDisableMetricsCollection(@Nullable Input<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Input.ofNullable(disableMetricsCollection);
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Input<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Input.ofNullable(maxConcurrentConnections);
            return this;
        }

        public Builder setRecursive(@Nullable Input<Object> recursive) {
            this.recursive = recursive;
            return this;
        }

        public Builder setRecursive(@Nullable Object recursive) {
            this.recursive = Input.ofNullable(recursive);
            return this;
        }

        public Builder setSourceRetryCount(@Nullable Input<Object> sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder setSourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = Input.ofNullable(sourceRetryCount);
            return this;
        }

        public Builder setSourceRetryWait(@Nullable Input<Object> sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder setSourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = Input.ofNullable(sourceRetryWait);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public AzureDataLakeStoreSourceArgs build() {
            return new AzureDataLakeStoreSourceArgs(disableMetricsCollection, maxConcurrentConnections, recursive, sourceRetryCount, sourceRetryWait, type);
        }
    }
}

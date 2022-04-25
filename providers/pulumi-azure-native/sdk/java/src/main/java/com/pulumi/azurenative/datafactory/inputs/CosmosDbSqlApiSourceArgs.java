// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Azure CosmosDB (SQL API) Collection source.
 * 
 */
public final class CosmosDbSqlApiSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final CosmosDbSqlApiSourceArgs Empty = new CosmosDbSqlApiSourceArgs();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @Import(name="additionalColumns")
    private @Nullable Output<Object> additionalColumns;

    /**
     * @return Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    public Optional<Output<Object>> additionalColumns() {
        return Optional.ofNullable(this.additionalColumns);
    }

    /**
     * Whether detect primitive values as datetime values. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="detectDatetime")
    private @Nullable Output<Object> detectDatetime;

    /**
     * @return Whether detect primitive values as datetime values. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> detectDatetime() {
        return Optional.ofNullable(this.detectDatetime);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
    private @Nullable Output<Object> disableMetricsCollection;

    /**
     * @return If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
    private @Nullable Output<Object> maxConcurrentConnections;

    /**
     * @return The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * Page size of the result. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="pageSize")
    private @Nullable Output<Object> pageSize;

    /**
     * @return Page size of the result. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    /**
     * Preferred regions. Type: array of strings (or Expression with resultType array of strings).
     * 
     */
    @Import(name="preferredRegions")
    private @Nullable Output<Object> preferredRegions;

    /**
     * @return Preferred regions. Type: array of strings (or Expression with resultType array of strings).
     * 
     */
    public Optional<Output<Object>> preferredRegions() {
        return Optional.ofNullable(this.preferredRegions);
    }

    /**
     * SQL API query. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="query")
    private @Nullable Output<Object> query;

    /**
     * @return SQL API query. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
    private @Nullable Output<Object> sourceRetryCount;

    /**
     * @return Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> sourceRetryCount() {
        return Optional.ofNullable(this.sourceRetryCount);
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
    private @Nullable Output<Object> sourceRetryWait;

    /**
     * @return Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Output<Object>> sourceRetryWait() {
        return Optional.ofNullable(this.sourceRetryWait);
    }

    /**
     * Copy source type.
     * Expected value is &#39;CosmosDbSqlApiSource&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Copy source type.
     * Expected value is &#39;CosmosDbSqlApiSource&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private CosmosDbSqlApiSourceArgs() {}

    private CosmosDbSqlApiSourceArgs(CosmosDbSqlApiSourceArgs $) {
        this.additionalColumns = $.additionalColumns;
        this.detectDatetime = $.detectDatetime;
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.pageSize = $.pageSize;
        this.preferredRegions = $.preferredRegions;
        this.query = $.query;
        this.sourceRetryCount = $.sourceRetryCount;
        this.sourceRetryWait = $.sourceRetryWait;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CosmosDbSqlApiSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CosmosDbSqlApiSourceArgs $;

        public Builder() {
            $ = new CosmosDbSqlApiSourceArgs();
        }

        public Builder(CosmosDbSqlApiSourceArgs defaults) {
            $ = new CosmosDbSqlApiSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalColumns Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
         * 
         * @return builder
         * 
         */
        public Builder additionalColumns(@Nullable Output<Object> additionalColumns) {
            $.additionalColumns = additionalColumns;
            return this;
        }

        /**
         * @param additionalColumns Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
         * 
         * @return builder
         * 
         */
        public Builder additionalColumns(Object additionalColumns) {
            return additionalColumns(Output.of(additionalColumns));
        }

        /**
         * @param detectDatetime Whether detect primitive values as datetime values. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder detectDatetime(@Nullable Output<Object> detectDatetime) {
            $.detectDatetime = detectDatetime;
            return this;
        }

        /**
         * @param detectDatetime Whether detect primitive values as datetime values. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder detectDatetime(Object detectDatetime) {
            return detectDatetime(Output.of(detectDatetime));
        }

        /**
         * @param disableMetricsCollection If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            $.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        /**
         * @param disableMetricsCollection If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder disableMetricsCollection(Object disableMetricsCollection) {
            return disableMetricsCollection(Output.of(disableMetricsCollection));
        }

        /**
         * @param maxConcurrentConnections The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        /**
         * @param maxConcurrentConnections The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(Object maxConcurrentConnections) {
            return maxConcurrentConnections(Output.of(maxConcurrentConnections));
        }

        /**
         * @param pageSize Page size of the result. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder pageSize(@Nullable Output<Object> pageSize) {
            $.pageSize = pageSize;
            return this;
        }

        /**
         * @param pageSize Page size of the result. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder pageSize(Object pageSize) {
            return pageSize(Output.of(pageSize));
        }

        /**
         * @param preferredRegions Preferred regions. Type: array of strings (or Expression with resultType array of strings).
         * 
         * @return builder
         * 
         */
        public Builder preferredRegions(@Nullable Output<Object> preferredRegions) {
            $.preferredRegions = preferredRegions;
            return this;
        }

        /**
         * @param preferredRegions Preferred regions. Type: array of strings (or Expression with resultType array of strings).
         * 
         * @return builder
         * 
         */
        public Builder preferredRegions(Object preferredRegions) {
            return preferredRegions(Output.of(preferredRegions));
        }

        /**
         * @param query SQL API query. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable Output<Object> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query SQL API query. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder query(Object query) {
            return query(Output.of(query));
        }

        /**
         * @param sourceRetryCount Source retry count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryCount(@Nullable Output<Object> sourceRetryCount) {
            $.sourceRetryCount = sourceRetryCount;
            return this;
        }

        /**
         * @param sourceRetryCount Source retry count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryCount(Object sourceRetryCount) {
            return sourceRetryCount(Output.of(sourceRetryCount));
        }

        /**
         * @param sourceRetryWait Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryWait(@Nullable Output<Object> sourceRetryWait) {
            $.sourceRetryWait = sourceRetryWait;
            return this;
        }

        /**
         * @param sourceRetryWait Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryWait(Object sourceRetryWait) {
            return sourceRetryWait(Output.of(sourceRetryWait));
        }

        /**
         * @param type Copy source type.
         * Expected value is &#39;CosmosDbSqlApiSource&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Copy source type.
         * Expected value is &#39;CosmosDbSqlApiSource&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public CosmosDbSqlApiSourceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}

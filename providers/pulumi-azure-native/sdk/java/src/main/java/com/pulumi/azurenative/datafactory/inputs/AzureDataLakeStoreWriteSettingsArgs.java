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
 * Azure data lake store write settings.
 * 
 */
public final class AzureDataLakeStoreWriteSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureDataLakeStoreWriteSettingsArgs Empty = new AzureDataLakeStoreWriteSettingsArgs();

    /**
     * The type of copy behavior for copy sink.
     * 
     */
    @Import(name="copyBehavior")
    private @Nullable Output<Object> copyBehavior;

    /**
     * @return The type of copy behavior for copy sink.
     * 
     */
    public Optional<Output<Object>> copyBehavior() {
        return Optional.ofNullable(this.copyBehavior);
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
     * Specifies the expiry time of the written files. The time is applied to the UTC time zone in the format of &#34;2018-12-01T05:00:00Z&#34;. Default value is NULL. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="expiryDateTime")
    private @Nullable Output<Object> expiryDateTime;

    /**
     * @return Specifies the expiry time of the written files. The time is applied to the UTC time zone in the format of &#34;2018-12-01T05:00:00Z&#34;. Default value is NULL. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> expiryDateTime() {
        return Optional.ofNullable(this.expiryDateTime);
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
     * The write setting type.
     * Expected value is &#39;AzureDataLakeStoreWriteSettings&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The write setting type.
     * Expected value is &#39;AzureDataLakeStoreWriteSettings&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private AzureDataLakeStoreWriteSettingsArgs() {}

    private AzureDataLakeStoreWriteSettingsArgs(AzureDataLakeStoreWriteSettingsArgs $) {
        this.copyBehavior = $.copyBehavior;
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.expiryDateTime = $.expiryDateTime;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureDataLakeStoreWriteSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureDataLakeStoreWriteSettingsArgs $;

        public Builder() {
            $ = new AzureDataLakeStoreWriteSettingsArgs();
        }

        public Builder(AzureDataLakeStoreWriteSettingsArgs defaults) {
            $ = new AzureDataLakeStoreWriteSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param copyBehavior The type of copy behavior for copy sink.
         * 
         * @return builder
         * 
         */
        public Builder copyBehavior(@Nullable Output<Object> copyBehavior) {
            $.copyBehavior = copyBehavior;
            return this;
        }

        /**
         * @param copyBehavior The type of copy behavior for copy sink.
         * 
         * @return builder
         * 
         */
        public Builder copyBehavior(Object copyBehavior) {
            return copyBehavior(Output.of(copyBehavior));
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
         * @param expiryDateTime Specifies the expiry time of the written files. The time is applied to the UTC time zone in the format of &#34;2018-12-01T05:00:00Z&#34;. Default value is NULL. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder expiryDateTime(@Nullable Output<Object> expiryDateTime) {
            $.expiryDateTime = expiryDateTime;
            return this;
        }

        /**
         * @param expiryDateTime Specifies the expiry time of the written files. The time is applied to the UTC time zone in the format of &#34;2018-12-01T05:00:00Z&#34;. Default value is NULL. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder expiryDateTime(Object expiryDateTime) {
            return expiryDateTime(Output.of(expiryDateTime));
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
         * @param type The write setting type.
         * Expected value is &#39;AzureDataLakeStoreWriteSettings&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The write setting type.
         * Expected value is &#39;AzureDataLakeStoreWriteSettings&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AzureDataLakeStoreWriteSettingsArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}

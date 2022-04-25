// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigGetArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AiFeatureStoreEntityTypeState extends com.pulumi.resources.ResourceArgs {

    public static final AiFeatureStoreEntityTypeState Empty = new AiFeatureStoreEntityTypeState();

    /**
     * The timestamp of when the featurestore was created in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to
     * nine fractional digits.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The timestamp of when the featurestore was created in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to
     * nine fractional digits.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Used to perform consistent read-modify-write updates.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return Used to perform consistent read-modify-write updates.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The name of the Featurestore to use, in the format projects/{project}/locations/{location}/featurestores/{featurestore}.
     * 
     */
    @Import(name="featurestore")
    private @Nullable Output<String> featurestore;

    /**
     * @return The name of the Featurestore to use, in the format projects/{project}/locations/{location}/featurestores/{featurestore}.
     * 
     */
    public Optional<Output<String>> featurestore() {
        return Optional.ofNullable(this.featurestore);
    }

    /**
     * A set of key/value label pairs to assign to this EntityType.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return A set of key/value label pairs to assign to this EntityType.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The default monitoring configuration for all Features under this EntityType.
     * If this is populated with [FeaturestoreMonitoringConfig.monitoring_interval] specified, snapshot analysis monitoring is enabled. Otherwise, snapshot analysis monitoring is disabled.
     * Structure is documented below.
     * 
     */
    @Import(name="monitoringConfig")
    private @Nullable Output<AiFeatureStoreEntityTypeMonitoringConfigGetArgs> monitoringConfig;

    /**
     * @return The default monitoring configuration for all Features under this EntityType.
     * If this is populated with [FeaturestoreMonitoringConfig.monitoring_interval] specified, snapshot analysis monitoring is enabled. Otherwise, snapshot analysis monitoring is disabled.
     * Structure is documented below.
     * 
     */
    public Optional<Output<AiFeatureStoreEntityTypeMonitoringConfigGetArgs>> monitoringConfig() {
        return Optional.ofNullable(this.monitoringConfig);
    }

    /**
     * The name of the EntityType. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the EntityType. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The timestamp of when the featurestore was last updated in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up
     * to nine fractional digits.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return The timestamp of when the featurestore was last updated in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up
     * to nine fractional digits.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private AiFeatureStoreEntityTypeState() {}

    private AiFeatureStoreEntityTypeState(AiFeatureStoreEntityTypeState $) {
        this.createTime = $.createTime;
        this.etag = $.etag;
        this.featurestore = $.featurestore;
        this.labels = $.labels;
        this.monitoringConfig = $.monitoringConfig;
        this.name = $.name;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AiFeatureStoreEntityTypeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AiFeatureStoreEntityTypeState $;

        public Builder() {
            $ = new AiFeatureStoreEntityTypeState();
        }

        public Builder(AiFeatureStoreEntityTypeState defaults) {
            $ = new AiFeatureStoreEntityTypeState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime The timestamp of when the featurestore was created in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to
         * nine fractional digits.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The timestamp of when the featurestore was created in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to
         * nine fractional digits.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param etag Used to perform consistent read-modify-write updates.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag Used to perform consistent read-modify-write updates.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param featurestore The name of the Featurestore to use, in the format projects/{project}/locations/{location}/featurestores/{featurestore}.
         * 
         * @return builder
         * 
         */
        public Builder featurestore(@Nullable Output<String> featurestore) {
            $.featurestore = featurestore;
            return this;
        }

        /**
         * @param featurestore The name of the Featurestore to use, in the format projects/{project}/locations/{location}/featurestores/{featurestore}.
         * 
         * @return builder
         * 
         */
        public Builder featurestore(String featurestore) {
            return featurestore(Output.of(featurestore));
        }

        /**
         * @param labels A set of key/value label pairs to assign to this EntityType.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels A set of key/value label pairs to assign to this EntityType.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param monitoringConfig The default monitoring configuration for all Features under this EntityType.
         * If this is populated with [FeaturestoreMonitoringConfig.monitoring_interval] specified, snapshot analysis monitoring is enabled. Otherwise, snapshot analysis monitoring is disabled.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder monitoringConfig(@Nullable Output<AiFeatureStoreEntityTypeMonitoringConfigGetArgs> monitoringConfig) {
            $.monitoringConfig = monitoringConfig;
            return this;
        }

        /**
         * @param monitoringConfig The default monitoring configuration for all Features under this EntityType.
         * If this is populated with [FeaturestoreMonitoringConfig.monitoring_interval] specified, snapshot analysis monitoring is enabled. Otherwise, snapshot analysis monitoring is disabled.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder monitoringConfig(AiFeatureStoreEntityTypeMonitoringConfigGetArgs monitoringConfig) {
            return monitoringConfig(Output.of(monitoringConfig));
        }

        /**
         * @param name The name of the EntityType. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the EntityType. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param updateTime The timestamp of when the featurestore was last updated in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up
         * to nine fractional digits.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime The timestamp of when the featurestore was last updated in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up
         * to nine fractional digits.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public AiFeatureStoreEntityTypeState build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.outputs.TopicRuleAssetPropertyValue;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicRulePutAssetPropertyValueEntry {
    private final @Nullable String assetId;
    private final @Nullable String entryId;
    private final @Nullable String propertyAlias;
    private final @Nullable String propertyId;
    private final List<TopicRuleAssetPropertyValue> propertyValues;

    @CustomType.Constructor
    private TopicRulePutAssetPropertyValueEntry(
        @CustomType.Parameter("assetId") @Nullable String assetId,
        @CustomType.Parameter("entryId") @Nullable String entryId,
        @CustomType.Parameter("propertyAlias") @Nullable String propertyAlias,
        @CustomType.Parameter("propertyId") @Nullable String propertyId,
        @CustomType.Parameter("propertyValues") List<TopicRuleAssetPropertyValue> propertyValues) {
        this.assetId = assetId;
        this.entryId = entryId;
        this.propertyAlias = propertyAlias;
        this.propertyId = propertyId;
        this.propertyValues = propertyValues;
    }

    public Optional<String> assetId() {
        return Optional.ofNullable(this.assetId);
    }
    public Optional<String> entryId() {
        return Optional.ofNullable(this.entryId);
    }
    public Optional<String> propertyAlias() {
        return Optional.ofNullable(this.propertyAlias);
    }
    public Optional<String> propertyId() {
        return Optional.ofNullable(this.propertyId);
    }
    public List<TopicRuleAssetPropertyValue> propertyValues() {
        return this.propertyValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRulePutAssetPropertyValueEntry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String assetId;
        private @Nullable String entryId;
        private @Nullable String propertyAlias;
        private @Nullable String propertyId;
        private List<TopicRuleAssetPropertyValue> propertyValues;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRulePutAssetPropertyValueEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetId = defaults.assetId;
    	      this.entryId = defaults.entryId;
    	      this.propertyAlias = defaults.propertyAlias;
    	      this.propertyId = defaults.propertyId;
    	      this.propertyValues = defaults.propertyValues;
        }

        public Builder assetId(@Nullable String assetId) {
            this.assetId = assetId;
            return this;
        }
        public Builder entryId(@Nullable String entryId) {
            this.entryId = entryId;
            return this;
        }
        public Builder propertyAlias(@Nullable String propertyAlias) {
            this.propertyAlias = propertyAlias;
            return this;
        }
        public Builder propertyId(@Nullable String propertyId) {
            this.propertyId = propertyId;
            return this;
        }
        public Builder propertyValues(List<TopicRuleAssetPropertyValue> propertyValues) {
            this.propertyValues = Objects.requireNonNull(propertyValues);
            return this;
        }
        public Builder propertyValues(TopicRuleAssetPropertyValue... propertyValues) {
            return propertyValues(List.of(propertyValues));
        }        public TopicRulePutAssetPropertyValueEntry build() {
            return new TopicRulePutAssetPropertyValueEntry(assetId, entryId, propertyAlias, propertyId, propertyValues);
        }
    }
}

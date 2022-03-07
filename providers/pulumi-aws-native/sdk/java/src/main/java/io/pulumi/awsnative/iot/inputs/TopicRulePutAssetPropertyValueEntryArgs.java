// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.TopicRuleAssetPropertyValueArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRulePutAssetPropertyValueEntryArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRulePutAssetPropertyValueEntryArgs Empty = new TopicRulePutAssetPropertyValueEntryArgs();

    @InputImport(name="assetId")
      private final @Nullable Input<String> assetId;

    public Input<String> getAssetId() {
        return this.assetId == null ? Input.empty() : this.assetId;
    }

    @InputImport(name="entryId")
      private final @Nullable Input<String> entryId;

    public Input<String> getEntryId() {
        return this.entryId == null ? Input.empty() : this.entryId;
    }

    @InputImport(name="propertyAlias")
      private final @Nullable Input<String> propertyAlias;

    public Input<String> getPropertyAlias() {
        return this.propertyAlias == null ? Input.empty() : this.propertyAlias;
    }

    @InputImport(name="propertyId")
      private final @Nullable Input<String> propertyId;

    public Input<String> getPropertyId() {
        return this.propertyId == null ? Input.empty() : this.propertyId;
    }

    @InputImport(name="propertyValues", required=true)
      private final Input<List<TopicRuleAssetPropertyValueArgs>> propertyValues;

    public Input<List<TopicRuleAssetPropertyValueArgs>> getPropertyValues() {
        return this.propertyValues;
    }

    public TopicRulePutAssetPropertyValueEntryArgs(
        @Nullable Input<String> assetId,
        @Nullable Input<String> entryId,
        @Nullable Input<String> propertyAlias,
        @Nullable Input<String> propertyId,
        Input<List<TopicRuleAssetPropertyValueArgs>> propertyValues) {
        this.assetId = assetId;
        this.entryId = entryId;
        this.propertyAlias = propertyAlias;
        this.propertyId = propertyId;
        this.propertyValues = Objects.requireNonNull(propertyValues, "expected parameter 'propertyValues' to be non-null");
    }

    private TopicRulePutAssetPropertyValueEntryArgs() {
        this.assetId = Input.empty();
        this.entryId = Input.empty();
        this.propertyAlias = Input.empty();
        this.propertyId = Input.empty();
        this.propertyValues = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRulePutAssetPropertyValueEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> assetId;
        private @Nullable Input<String> entryId;
        private @Nullable Input<String> propertyAlias;
        private @Nullable Input<String> propertyId;
        private Input<List<TopicRuleAssetPropertyValueArgs>> propertyValues;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRulePutAssetPropertyValueEntryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetId = defaults.assetId;
    	      this.entryId = defaults.entryId;
    	      this.propertyAlias = defaults.propertyAlias;
    	      this.propertyId = defaults.propertyId;
    	      this.propertyValues = defaults.propertyValues;
        }

        public Builder setAssetId(@Nullable Input<String> assetId) {
            this.assetId = assetId;
            return this;
        }

        public Builder setAssetId(@Nullable String assetId) {
            this.assetId = Input.ofNullable(assetId);
            return this;
        }

        public Builder setEntryId(@Nullable Input<String> entryId) {
            this.entryId = entryId;
            return this;
        }

        public Builder setEntryId(@Nullable String entryId) {
            this.entryId = Input.ofNullable(entryId);
            return this;
        }

        public Builder setPropertyAlias(@Nullable Input<String> propertyAlias) {
            this.propertyAlias = propertyAlias;
            return this;
        }

        public Builder setPropertyAlias(@Nullable String propertyAlias) {
            this.propertyAlias = Input.ofNullable(propertyAlias);
            return this;
        }

        public Builder setPropertyId(@Nullable Input<String> propertyId) {
            this.propertyId = propertyId;
            return this;
        }

        public Builder setPropertyId(@Nullable String propertyId) {
            this.propertyId = Input.ofNullable(propertyId);
            return this;
        }

        public Builder setPropertyValues(Input<List<TopicRuleAssetPropertyValueArgs>> propertyValues) {
            this.propertyValues = Objects.requireNonNull(propertyValues);
            return this;
        }

        public Builder setPropertyValues(List<TopicRuleAssetPropertyValueArgs> propertyValues) {
            this.propertyValues = Input.of(Objects.requireNonNull(propertyValues));
            return this;
        }
        public TopicRulePutAssetPropertyValueEntryArgs build() {
            return new TopicRulePutAssetPropertyValueEntryArgs(assetId, entryId, propertyAlias, propertyId, propertyValues);
        }
    }
}
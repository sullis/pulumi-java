// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.outputs.BotSampleValue;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class BotSlotTypeValue {
    private final BotSampleValue sampleValue;
    private final @Nullable List<BotSampleValue> synonyms;

    @CustomType.Constructor
    private BotSlotTypeValue(
        @CustomType.Parameter("sampleValue") BotSampleValue sampleValue,
        @CustomType.Parameter("synonyms") @Nullable List<BotSampleValue> synonyms) {
        this.sampleValue = sampleValue;
        this.synonyms = synonyms;
    }

    public BotSampleValue sampleValue() {
        return this.sampleValue;
    }
    public List<BotSampleValue> synonyms() {
        return this.synonyms == null ? List.of() : this.synonyms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotSlotTypeValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotSampleValue sampleValue;
        private @Nullable List<BotSampleValue> synonyms;

        public Builder() {
    	      // Empty
        }

        public Builder(BotSlotTypeValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sampleValue = defaults.sampleValue;
    	      this.synonyms = defaults.synonyms;
        }

        public Builder sampleValue(BotSampleValue sampleValue) {
            this.sampleValue = Objects.requireNonNull(sampleValue);
            return this;
        }
        public Builder synonyms(@Nullable List<BotSampleValue> synonyms) {
            this.synonyms = synonyms;
            return this;
        }
        public Builder synonyms(BotSampleValue... synonyms) {
            return synonyms(List.of(synonyms));
        }        public BotSlotTypeValue build() {
            return new BotSlotTypeValue(sampleValue, synonyms);
        }
    }
}

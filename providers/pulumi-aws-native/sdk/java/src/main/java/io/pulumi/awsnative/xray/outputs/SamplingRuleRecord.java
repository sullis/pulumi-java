// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.xray.outputs;

import io.pulumi.awsnative.xray.outputs.SamplingRule;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SamplingRuleRecord {
    /**
     * When the rule was created, in Unix time seconds.
     * 
     */
    private final @Nullable String createdAt;
    /**
     * When the rule was modified, in Unix time seconds.
     * 
     */
    private final @Nullable String modifiedAt;
    private final @Nullable SamplingRule samplingRule;

    @CustomType.Constructor
    private SamplingRuleRecord(
        @CustomType.Parameter("createdAt") @Nullable String createdAt,
        @CustomType.Parameter("modifiedAt") @Nullable String modifiedAt,
        @CustomType.Parameter("samplingRule") @Nullable SamplingRule samplingRule) {
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.samplingRule = samplingRule;
    }

    /**
     * When the rule was created, in Unix time seconds.
     * 
    */
    public Optional<String> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }
    /**
     * When the rule was modified, in Unix time seconds.
     * 
    */
    public Optional<String> modifiedAt() {
        return Optional.ofNullable(this.modifiedAt);
    }
    public Optional<SamplingRule> samplingRule() {
        return Optional.ofNullable(this.samplingRule);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SamplingRuleRecord defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createdAt;
        private @Nullable String modifiedAt;
        private @Nullable SamplingRule samplingRule;

        public Builder() {
    	      // Empty
        }

        public Builder(SamplingRuleRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.modifiedAt = defaults.modifiedAt;
    	      this.samplingRule = defaults.samplingRule;
        }

        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Builder modifiedAt(@Nullable String modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }
        public Builder samplingRule(@Nullable SamplingRule samplingRule) {
            this.samplingRule = samplingRule;
            return this;
        }        public SamplingRuleRecord build() {
            return new SamplingRuleRecord(createdAt, modifiedAt, samplingRule);
        }
    }
}

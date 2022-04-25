// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.xray.inputs;

import com.pulumi.awsnative.xray.inputs.SamplingRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SamplingRuleRecordArgs extends com.pulumi.resources.ResourceArgs {

    public static final SamplingRuleRecordArgs Empty = new SamplingRuleRecordArgs();

    /**
     * When the rule was created, in Unix time seconds.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return When the rule was created, in Unix time seconds.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * When the rule was modified, in Unix time seconds.
     * 
     */
    @Import(name="modifiedAt")
    private @Nullable Output<String> modifiedAt;

    /**
     * @return When the rule was modified, in Unix time seconds.
     * 
     */
    public Optional<Output<String>> modifiedAt() {
        return Optional.ofNullable(this.modifiedAt);
    }

    @Import(name="samplingRule")
    private @Nullable Output<SamplingRuleArgs> samplingRule;

    public Optional<Output<SamplingRuleArgs>> samplingRule() {
        return Optional.ofNullable(this.samplingRule);
    }

    private SamplingRuleRecordArgs() {}

    private SamplingRuleRecordArgs(SamplingRuleRecordArgs $) {
        this.createdAt = $.createdAt;
        this.modifiedAt = $.modifiedAt;
        this.samplingRule = $.samplingRule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SamplingRuleRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SamplingRuleRecordArgs $;

        public Builder() {
            $ = new SamplingRuleRecordArgs();
        }

        public Builder(SamplingRuleRecordArgs defaults) {
            $ = new SamplingRuleRecordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt When the rule was created, in Unix time seconds.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt When the rule was created, in Unix time seconds.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param modifiedAt When the rule was modified, in Unix time seconds.
         * 
         * @return builder
         * 
         */
        public Builder modifiedAt(@Nullable Output<String> modifiedAt) {
            $.modifiedAt = modifiedAt;
            return this;
        }

        /**
         * @param modifiedAt When the rule was modified, in Unix time seconds.
         * 
         * @return builder
         * 
         */
        public Builder modifiedAt(String modifiedAt) {
            return modifiedAt(Output.of(modifiedAt));
        }

        public Builder samplingRule(@Nullable Output<SamplingRuleArgs> samplingRule) {
            $.samplingRule = samplingRule;
            return this;
        }

        public Builder samplingRule(SamplingRuleArgs samplingRule) {
            return samplingRule(Output.of(samplingRule));
        }

        public SamplingRuleRecordArgs build() {
            return $;
        }
    }

}

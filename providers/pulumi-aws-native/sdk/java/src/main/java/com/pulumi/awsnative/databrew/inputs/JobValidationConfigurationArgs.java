// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.awsnative.databrew.enums.JobValidationMode;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration to attach Rulesets to the job
 * 
 */
public final class JobValidationConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobValidationConfigurationArgs Empty = new JobValidationConfigurationArgs();

    /**
     * Arn of the Ruleset
     * 
     */
    @Import(name="rulesetArn", required=true)
    private Output<String> rulesetArn;

    /**
     * @return Arn of the Ruleset
     * 
     */
    public Output<String> rulesetArn() {
        return this.rulesetArn;
    }

    @Import(name="validationMode")
    private @Nullable Output<JobValidationMode> validationMode;

    public Optional<Output<JobValidationMode>> validationMode() {
        return Optional.ofNullable(this.validationMode);
    }

    private JobValidationConfigurationArgs() {}

    private JobValidationConfigurationArgs(JobValidationConfigurationArgs $) {
        this.rulesetArn = $.rulesetArn;
        this.validationMode = $.validationMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobValidationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobValidationConfigurationArgs $;

        public Builder() {
            $ = new JobValidationConfigurationArgs();
        }

        public Builder(JobValidationConfigurationArgs defaults) {
            $ = new JobValidationConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rulesetArn Arn of the Ruleset
         * 
         * @return builder
         * 
         */
        public Builder rulesetArn(Output<String> rulesetArn) {
            $.rulesetArn = rulesetArn;
            return this;
        }

        /**
         * @param rulesetArn Arn of the Ruleset
         * 
         * @return builder
         * 
         */
        public Builder rulesetArn(String rulesetArn) {
            return rulesetArn(Output.of(rulesetArn));
        }

        public Builder validationMode(@Nullable Output<JobValidationMode> validationMode) {
            $.validationMode = validationMode;
            return this;
        }

        public Builder validationMode(JobValidationMode validationMode) {
            return validationMode(Output.of(validationMode));
        }

        public JobValidationConfigurationArgs build() {
            $.rulesetArn = Objects.requireNonNull($.rulesetArn, "expected parameter 'rulesetArn' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.enums.JobValidationMode;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobValidationConfiguration {
    /**
     * Arn of the Ruleset
     * 
     */
    private final String rulesetArn;
    private final @Nullable JobValidationMode validationMode;

    @CustomType.Constructor
    private JobValidationConfiguration(
        @CustomType.Parameter("rulesetArn") String rulesetArn,
        @CustomType.Parameter("validationMode") @Nullable JobValidationMode validationMode) {
        this.rulesetArn = rulesetArn;
        this.validationMode = validationMode;
    }

    /**
     * Arn of the Ruleset
     * 
    */
    public String rulesetArn() {
        return this.rulesetArn;
    }
    public Optional<JobValidationMode> validationMode() {
        return Optional.ofNullable(this.validationMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobValidationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String rulesetArn;
        private @Nullable JobValidationMode validationMode;

        public Builder() {
    	      // Empty
        }

        public Builder(JobValidationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rulesetArn = defaults.rulesetArn;
    	      this.validationMode = defaults.validationMode;
        }

        public Builder rulesetArn(String rulesetArn) {
            this.rulesetArn = Objects.requireNonNull(rulesetArn);
            return this;
        }
        public Builder validationMode(@Nullable JobValidationMode validationMode) {
            this.validationMode = validationMode;
            return this;
        }        public JobValidationConfiguration build() {
            return new JobValidationConfiguration(rulesetArn, validationMode);
        }
    }
}

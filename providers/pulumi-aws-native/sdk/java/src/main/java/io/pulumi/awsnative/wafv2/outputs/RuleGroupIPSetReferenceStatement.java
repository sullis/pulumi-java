// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.RuleGroupIPSetForwardedIPConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupIPSetReferenceStatement {
    private final String arn;
    private final @Nullable RuleGroupIPSetForwardedIPConfiguration iPSetForwardedIPConfig;

    @OutputCustomType.Constructor
    private RuleGroupIPSetReferenceStatement(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("iPSetForwardedIPConfig") @Nullable RuleGroupIPSetForwardedIPConfiguration iPSetForwardedIPConfig) {
        this.arn = arn;
        this.iPSetForwardedIPConfig = iPSetForwardedIPConfig;
    }

    public String getArn() {
        return this.arn;
    }
    public Optional<RuleGroupIPSetForwardedIPConfiguration> getIPSetForwardedIPConfig() {
        return Optional.ofNullable(this.iPSetForwardedIPConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupIPSetReferenceStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable RuleGroupIPSetForwardedIPConfiguration iPSetForwardedIPConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupIPSetReferenceStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.iPSetForwardedIPConfig = defaults.iPSetForwardedIPConfig;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setIPSetForwardedIPConfig(@Nullable RuleGroupIPSetForwardedIPConfiguration iPSetForwardedIPConfig) {
            this.iPSetForwardedIPConfig = iPSetForwardedIPConfig;
            return this;
        }
        public RuleGroupIPSetReferenceStatement build() {
            return new RuleGroupIPSetReferenceStatement(arn, iPSetForwardedIPConfig);
        }
    }
}

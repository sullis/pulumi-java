// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core_v1.outputs.SELinuxOptions;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SELinuxStrategyOptions {
    /**
     * @return rule is the strategy that will dictate the allowable labels that may be set.
     * 
     */
    private final String rule;
    /**
     * @return seLinuxOptions required to run as; required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * 
     */
    private final @Nullable SELinuxOptions seLinuxOptions;

    @CustomType.Constructor
    private SELinuxStrategyOptions(
        @CustomType.Parameter("rule") String rule,
        @CustomType.Parameter("seLinuxOptions") @Nullable SELinuxOptions seLinuxOptions) {
        this.rule = rule;
        this.seLinuxOptions = seLinuxOptions;
    }

    /**
     * @return rule is the strategy that will dictate the allowable labels that may be set.
     * 
     */
    public String rule() {
        return this.rule;
    }
    /**
     * @return seLinuxOptions required to run as; required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * 
     */
    public Optional<SELinuxOptions> seLinuxOptions() {
        return Optional.ofNullable(this.seLinuxOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SELinuxStrategyOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String rule;
        private @Nullable SELinuxOptions seLinuxOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(SELinuxStrategyOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rule = defaults.rule;
    	      this.seLinuxOptions = defaults.seLinuxOptions;
        }

        public Builder rule(String rule) {
            this.rule = Objects.requireNonNull(rule);
            return this;
        }
        public Builder seLinuxOptions(@Nullable SELinuxOptions seLinuxOptions) {
            this.seLinuxOptions = seLinuxOptions;
            return this;
        }        public SELinuxStrategyOptions build() {
            return new SELinuxStrategyOptions(rule, seLinuxOptions);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class RuleGroupImmunityTimeProperty extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupImmunityTimeProperty Empty = new RuleGroupImmunityTimeProperty();

    @InputImport(name="immunityTime", required=true)
      private final Integer immunityTime;

    public Integer getImmunityTime() {
        return this.immunityTime;
    }

    public RuleGroupImmunityTimeProperty(Integer immunityTime) {
        this.immunityTime = Objects.requireNonNull(immunityTime, "expected parameter 'immunityTime' to be non-null");
    }

    private RuleGroupImmunityTimeProperty() {
        this.immunityTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupImmunityTimeProperty defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer immunityTime;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupImmunityTimeProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.immunityTime = defaults.immunityTime;
        }

        public Builder setImmunityTime(Integer immunityTime) {
            this.immunityTime = Objects.requireNonNull(immunityTime);
            return this;
        }
        public RuleGroupImmunityTimeProperty build() {
            return new RuleGroupImmunityTimeProperty(immunityTime);
        }
    }
}
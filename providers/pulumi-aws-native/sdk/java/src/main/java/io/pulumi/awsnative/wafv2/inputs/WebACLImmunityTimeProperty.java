// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class WebACLImmunityTimeProperty extends io.pulumi.resources.InvokeArgs {

    public static final WebACLImmunityTimeProperty Empty = new WebACLImmunityTimeProperty();

    @InputImport(name="immunityTime", required=true)
      private final Integer immunityTime;

    public Integer getImmunityTime() {
        return this.immunityTime;
    }

    public WebACLImmunityTimeProperty(Integer immunityTime) {
        this.immunityTime = Objects.requireNonNull(immunityTime, "expected parameter 'immunityTime' to be non-null");
    }

    private WebACLImmunityTimeProperty() {
        this.immunityTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLImmunityTimeProperty defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer immunityTime;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLImmunityTimeProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.immunityTime = defaults.immunityTime;
        }

        public Builder setImmunityTime(Integer immunityTime) {
            this.immunityTime = Objects.requireNonNull(immunityTime);
            return this;
        }
        public WebACLImmunityTimeProperty build() {
            return new WebACLImmunityTimeProperty(immunityTime);
        }
    }
}
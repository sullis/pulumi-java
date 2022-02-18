// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aadiam.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class RetentionPolicyResponse {
    /**
     * The number of days for the retention in days. A value of 0 will retain the events indefinitely.
     * 
     */
    private final Integer days;
    /**
     * A value indicating whether the retention policy is enabled.
     * 
     */
    private final Boolean enabled;

    @OutputCustomType.Constructor({"days","enabled"})
    private RetentionPolicyResponse(
        Integer days,
        Boolean enabled) {
        this.days = Objects.requireNonNull(days);
        this.enabled = Objects.requireNonNull(enabled);
    }

    /**
     * The number of days for the retention in days. A value of 0 will retain the events indefinitely.
     * 
     */
    public Integer getDays() {
        return this.days;
    }
    /**
     * A value indicating whether the retention policy is enabled.
     * 
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetentionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer days;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(RetentionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.enabled = defaults.enabled;
        }

        public Builder setDays(Integer days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public RetentionPolicyResponse build() {
            return new RetentionPolicyResponse(days, enabled);
        }
    }
}

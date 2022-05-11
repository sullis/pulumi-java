// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetLogProfileRetentionPolicy {
    /**
     * @return The number of days for the retention policy.
     * 
     */
    private final Integer days;
    /**
     * @return A boolean value indicating whether the retention policy is enabled.
     * 
     */
    private final Boolean enabled;

    @CustomType.Constructor
    private GetLogProfileRetentionPolicy(
        @CustomType.Parameter("days") Integer days,
        @CustomType.Parameter("enabled") Boolean enabled) {
        this.days = days;
        this.enabled = enabled;
    }

    /**
     * @return The number of days for the retention policy.
     * 
     */
    public Integer days() {
        return this.days;
    }
    /**
     * @return A boolean value indicating whether the retention policy is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLogProfileRetentionPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer days;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLogProfileRetentionPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.enabled = defaults.enabled;
        }

        public Builder days(Integer days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public GetLogProfileRetentionPolicy build() {
            return new GetLogProfileRetentionPolicy(days, enabled);
        }
    }
}

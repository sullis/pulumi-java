// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameters that define the retention policy for flow log.
 * 
 */
public final class RetentionPolicyParametersResponse extends com.pulumi.resources.InvokeArgs {

    public static final RetentionPolicyParametersResponse Empty = new RetentionPolicyParametersResponse();

    /**
     * Number of days to retain flow log records.
     * 
     */
    @Import(name="days")
      private final @Nullable Integer days;

    public Optional<Integer> days() {
        return this.days == null ? Optional.empty() : Optional.ofNullable(this.days);
    }

    /**
     * Flag to enable/disable retention.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    public RetentionPolicyParametersResponse(
        @Nullable Integer days,
        @Nullable Boolean enabled) {
        this.days = Codegen.integerProp("days").arg(days).def(0).getNullable();
        this.enabled = Codegen.booleanProp("enabled").arg(enabled).def(false).getNullable();
    }

    private RetentionPolicyParametersResponse() {
        this.days = null;
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetentionPolicyParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer days;
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(RetentionPolicyParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.enabled = defaults.enabled;
        }

        public Builder days(@Nullable Integer days) {
            this.days = days;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }        public RetentionPolicyParametersResponse build() {
            return new RetentionPolicyParametersResponse(days, enabled);
        }
    }
}

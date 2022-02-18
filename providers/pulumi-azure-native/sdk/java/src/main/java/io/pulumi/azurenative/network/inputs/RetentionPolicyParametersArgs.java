// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters that define the retention policy for flow log.
 * 
 */
public final class RetentionPolicyParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final RetentionPolicyParametersArgs Empty = new RetentionPolicyParametersArgs();

    /**
     * Number of days to retain flow log records.
     * 
     */
    @InputImport(name="days")
    private final @Nullable Input<Integer> days;

    public Input<Integer> getDays() {
        return this.days == null ? Input.empty() : this.days;
    }

    /**
     * Flag to enable/disable retention.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    public RetentionPolicyParametersArgs(
        @Nullable Input<Integer> days,
        @Nullable Input<Boolean> enabled) {
        this.days = days == null ? Input.ofNullable(0) : days;
        this.enabled = enabled == null ? Input.ofNullable(false) : enabled;
    }

    private RetentionPolicyParametersArgs() {
        this.days = Input.empty();
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetentionPolicyParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> days;
        private @Nullable Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(RetentionPolicyParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.enabled = defaults.enabled;
        }

        public Builder setDays(@Nullable Input<Integer> days) {
            this.days = days;
            return this;
        }

        public Builder setDays(@Nullable Integer days) {
            this.days = Input.ofNullable(days);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public RetentionPolicyParametersArgs build() {
            return new RetentionPolicyParametersArgs(days, enabled);
        }
    }
}

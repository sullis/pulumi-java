// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.azurenative.insights.outputs.RecurrenceResponse;
import com.pulumi.azurenative.insights.outputs.ScaleCapacityResponse;
import com.pulumi.azurenative.insights.outputs.ScaleRuleResponse;
import com.pulumi.azurenative.insights.outputs.TimeWindowResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoscaleProfileResponse {
    /**
     * @return the number of instances that can be used during this profile.
     * 
     */
    private final ScaleCapacityResponse capacity;
    /**
     * @return the specific date-time for the profile. This element is not used if the Recurrence element is used.
     * 
     */
    private final @Nullable TimeWindowResponse fixedDate;
    /**
     * @return the name of the profile.
     * 
     */
    private final String name;
    /**
     * @return the repeating times at which this profile begins. This element is not used if the FixedDate element is used.
     * 
     */
    private final @Nullable RecurrenceResponse recurrence;
    /**
     * @return the collection of rules that provide the triggers and parameters for the scaling action. A maximum of 10 rules can be specified.
     * 
     */
    private final List<ScaleRuleResponse> rules;

    @CustomType.Constructor
    private AutoscaleProfileResponse(
        @CustomType.Parameter("capacity") ScaleCapacityResponse capacity,
        @CustomType.Parameter("fixedDate") @Nullable TimeWindowResponse fixedDate,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("recurrence") @Nullable RecurrenceResponse recurrence,
        @CustomType.Parameter("rules") List<ScaleRuleResponse> rules) {
        this.capacity = capacity;
        this.fixedDate = fixedDate;
        this.name = name;
        this.recurrence = recurrence;
        this.rules = rules;
    }

    /**
     * @return the number of instances that can be used during this profile.
     * 
     */
    public ScaleCapacityResponse capacity() {
        return this.capacity;
    }
    /**
     * @return the specific date-time for the profile. This element is not used if the Recurrence element is used.
     * 
     */
    public Optional<TimeWindowResponse> fixedDate() {
        return Optional.ofNullable(this.fixedDate);
    }
    /**
     * @return the name of the profile.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return the repeating times at which this profile begins. This element is not used if the FixedDate element is used.
     * 
     */
    public Optional<RecurrenceResponse> recurrence() {
        return Optional.ofNullable(this.recurrence);
    }
    /**
     * @return the collection of rules that provide the triggers and parameters for the scaling action. A maximum of 10 rules can be specified.
     * 
     */
    public List<ScaleRuleResponse> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScaleCapacityResponse capacity;
        private @Nullable TimeWindowResponse fixedDate;
        private String name;
        private @Nullable RecurrenceResponse recurrence;
        private List<ScaleRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.fixedDate = defaults.fixedDate;
    	      this.name = defaults.name;
    	      this.recurrence = defaults.recurrence;
    	      this.rules = defaults.rules;
        }

        public Builder capacity(ScaleCapacityResponse capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }
        public Builder fixedDate(@Nullable TimeWindowResponse fixedDate) {
            this.fixedDate = fixedDate;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder recurrence(@Nullable RecurrenceResponse recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public Builder rules(List<ScaleRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(ScaleRuleResponse... rules) {
            return rules(List.of(rules));
        }        public AutoscaleProfileResponse build() {
            return new AutoscaleProfileResponse(capacity, fixedDate, name, recurrence, rules);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HPAScalingPolicy {
    /**
     * PeriodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min).
     * 
     */
    private final Integer periodSeconds;
    /**
     * Type is used to specify the scaling policy.
     * 
     */
    private final String type;
    /**
     * Value contains the amount of change which is permitted by the policy. It must be greater than zero
     * 
     */
    private final Integer value;

    @CustomType.Constructor
    private HPAScalingPolicy(
        @CustomType.Parameter("periodSeconds") Integer periodSeconds,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") Integer value) {
        this.periodSeconds = periodSeconds;
        this.type = type;
        this.value = value;
    }

    /**
     * PeriodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min).
     * 
    */
    public Integer getPeriodSeconds() {
        return this.periodSeconds;
    }
    /**
     * Type is used to specify the scaling policy.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Value contains the amount of change which is permitted by the policy. It must be greater than zero
     * 
    */
    public Integer getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HPAScalingPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer periodSeconds;
        private String type;
        private Integer value;

        public Builder() {
    	      // Empty
        }

        public Builder(HPAScalingPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder periodSeconds(Integer periodSeconds) {
            this.periodSeconds = Objects.requireNonNull(periodSeconds);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(Integer value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public HPAScalingPolicy build() {
            return new HPAScalingPolicy(periodSeconds, type, value);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.JobTemplateExponentialRolloutRateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Allows you to create a staged rollout of a job.
 * 
 */
public final class JobExecutionsRolloutConfigPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobExecutionsRolloutConfigPropertiesArgs Empty = new JobExecutionsRolloutConfigPropertiesArgs();

    /**
     * The rate of increase for a job rollout. This parameter allows you to define an exponential rate for a job rollout.
     * 
     */
    @InputImport(name="exponentialRolloutRate")
    private final @Nullable Input<JobTemplateExponentialRolloutRateArgs> exponentialRolloutRate;

    public Input<JobTemplateExponentialRolloutRateArgs> getExponentialRolloutRate() {
        return this.exponentialRolloutRate == null ? Input.empty() : this.exponentialRolloutRate;
    }

    /**
     * The maximum number of things that will be notified of a pending job, per minute. This parameter allows you to create a staged rollout.
     * 
     */
    @InputImport(name="maximumPerMinute")
    private final @Nullable Input<Integer> maximumPerMinute;

    public Input<Integer> getMaximumPerMinute() {
        return this.maximumPerMinute == null ? Input.empty() : this.maximumPerMinute;
    }

    public JobExecutionsRolloutConfigPropertiesArgs(
        @Nullable Input<JobTemplateExponentialRolloutRateArgs> exponentialRolloutRate,
        @Nullable Input<Integer> maximumPerMinute) {
        this.exponentialRolloutRate = exponentialRolloutRate;
        this.maximumPerMinute = maximumPerMinute;
    }

    private JobExecutionsRolloutConfigPropertiesArgs() {
        this.exponentialRolloutRate = Input.empty();
        this.maximumPerMinute = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobExecutionsRolloutConfigPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<JobTemplateExponentialRolloutRateArgs> exponentialRolloutRate;
        private @Nullable Input<Integer> maximumPerMinute;

        public Builder() {
    	      // Empty
        }

        public Builder(JobExecutionsRolloutConfigPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exponentialRolloutRate = defaults.exponentialRolloutRate;
    	      this.maximumPerMinute = defaults.maximumPerMinute;
        }

        public Builder setExponentialRolloutRate(@Nullable Input<JobTemplateExponentialRolloutRateArgs> exponentialRolloutRate) {
            this.exponentialRolloutRate = exponentialRolloutRate;
            return this;
        }

        public Builder setExponentialRolloutRate(@Nullable JobTemplateExponentialRolloutRateArgs exponentialRolloutRate) {
            this.exponentialRolloutRate = Input.ofNullable(exponentialRolloutRate);
            return this;
        }

        public Builder setMaximumPerMinute(@Nullable Input<Integer> maximumPerMinute) {
            this.maximumPerMinute = maximumPerMinute;
            return this;
        }

        public Builder setMaximumPerMinute(@Nullable Integer maximumPerMinute) {
            this.maximumPerMinute = Input.ofNullable(maximumPerMinute);
            return this;
        }

        public JobExecutionsRolloutConfigPropertiesArgs build() {
            return new JobExecutionsRolloutConfigPropertiesArgs(exponentialRolloutRate, maximumPerMinute);
        }
    }
}

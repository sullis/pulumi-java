// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.JobParameterMapArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class JobStatisticOverrideArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobStatisticOverrideArgs Empty = new JobStatisticOverrideArgs();

    @InputImport(name="parameters", required=true)
    private final Input<JobParameterMapArgs> parameters;

    public Input<JobParameterMapArgs> getParameters() {
        return this.parameters;
    }

    @InputImport(name="statistic", required=true)
    private final Input<String> statistic;

    public Input<String> getStatistic() {
        return this.statistic;
    }

    public JobStatisticOverrideArgs(
        Input<JobParameterMapArgs> parameters,
        Input<String> statistic) {
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.statistic = Objects.requireNonNull(statistic, "expected parameter 'statistic' to be non-null");
    }

    private JobStatisticOverrideArgs() {
        this.parameters = Input.empty();
        this.statistic = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatisticOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<JobParameterMapArgs> parameters;
        private Input<String> statistic;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatisticOverrideArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.statistic = defaults.statistic;
        }

        public Builder setParameters(Input<JobParameterMapArgs> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setParameters(JobParameterMapArgs parameters) {
            this.parameters = Input.of(Objects.requireNonNull(parameters));
            return this;
        }

        public Builder setStatistic(Input<String> statistic) {
            this.statistic = Objects.requireNonNull(statistic);
            return this;
        }

        public Builder setStatistic(String statistic) {
            this.statistic = Input.of(Objects.requireNonNull(statistic));
            return this;
        }

        public JobStatisticOverrideArgs build() {
            return new JobStatisticOverrideArgs(parameters, statistic);
        }
    }
}

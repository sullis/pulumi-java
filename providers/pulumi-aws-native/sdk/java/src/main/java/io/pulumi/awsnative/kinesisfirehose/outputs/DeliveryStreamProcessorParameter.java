// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DeliveryStreamProcessorParameter {
    private final String parameterName;
    private final String parameterValue;

    @OutputCustomType.Constructor
    private DeliveryStreamProcessorParameter(
        @OutputCustomType.Parameter("parameterName") String parameterName,
        @OutputCustomType.Parameter("parameterValue") String parameterValue) {
        this.parameterName = parameterName;
        this.parameterValue = parameterValue;
    }

    public String getParameterName() {
        return this.parameterName;
    }
    public String getParameterValue() {
        return this.parameterValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamProcessorParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String parameterName;
        private String parameterValue;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamProcessorParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterName = defaults.parameterName;
    	      this.parameterValue = defaults.parameterValue;
        }

        public Builder setParameterName(String parameterName) {
            this.parameterName = Objects.requireNonNull(parameterName);
            return this;
        }

        public Builder setParameterValue(String parameterValue) {
            this.parameterValue = Objects.requireNonNull(parameterValue);
            return this;
        }
        public DeliveryStreamProcessorParameter build() {
            return new DeliveryStreamProcessorParameter(parameterName, parameterValue);
        }
    }
}

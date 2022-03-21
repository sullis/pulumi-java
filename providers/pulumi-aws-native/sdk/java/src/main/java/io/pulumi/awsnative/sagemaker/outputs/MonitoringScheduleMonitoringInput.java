// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleEndpointInput;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class MonitoringScheduleMonitoringInput {
    private final MonitoringScheduleEndpointInput endpointInput;

    @CustomType.Constructor
    private MonitoringScheduleMonitoringInput(@CustomType.Parameter("endpointInput") MonitoringScheduleEndpointInput endpointInput) {
        this.endpointInput = endpointInput;
    }

    public MonitoringScheduleEndpointInput getEndpointInput() {
        return this.endpointInput;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleMonitoringInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringScheduleEndpointInput endpointInput;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleMonitoringInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointInput = defaults.endpointInput;
        }

        public Builder endpointInput(MonitoringScheduleEndpointInput endpointInput) {
            this.endpointInput = Objects.requireNonNull(endpointInput);
            return this;
        }        public MonitoringScheduleMonitoringInput build() {
            return new MonitoringScheduleMonitoringInput(endpointInput);
        }
    }
}

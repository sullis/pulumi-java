// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.autoscaling.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetWarmPoolArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWarmPoolArgs Empty = new GetWarmPoolArgs();

    @InputImport(name="autoScalingGroupName", required=true)
    private final String autoScalingGroupName;

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    public GetWarmPoolArgs(String autoScalingGroupName) {
        this.autoScalingGroupName = Objects.requireNonNull(autoScalingGroupName, "expected parameter 'autoScalingGroupName' to be non-null");
    }

    private GetWarmPoolArgs() {
        this.autoScalingGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWarmPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoScalingGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWarmPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScalingGroupName = defaults.autoScalingGroupName;
        }

        public Builder setAutoScalingGroupName(String autoScalingGroupName) {
            this.autoScalingGroupName = Objects.requireNonNull(autoScalingGroupName);
            return this;
        }

        public GetWarmPoolArgs build() {
            return new GetWarmPoolArgs(autoScalingGroupName);
        }
    }
}

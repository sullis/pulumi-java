// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AnomalyDetectorCloudwatchConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnomalyDetectorCloudwatchConfigArgs Empty = new AnomalyDetectorCloudwatchConfigArgs();

    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    public AnomalyDetectorCloudwatchConfigArgs(Output<String> roleArn) {
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private AnomalyDetectorCloudwatchConfigArgs() {
        this.roleArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorCloudwatchConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorCloudwatchConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
        }

        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }        public AnomalyDetectorCloudwatchConfigArgs build() {
            return new AnomalyDetectorCloudwatchConfigArgs(roleArn);
        }
    }
}

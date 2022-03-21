// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration options for an SNS alert action.
 * 
 */
public final class AlertSNSConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertSNSConfigurationArgs Empty = new AlertSNSConfigurationArgs();

    /**
     * ARN of an IAM role that LookoutMetrics should assume to access the SNS topic.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * ARN of an SNS topic to send alert notifications to.
     * 
     */
    @Import(name="snsTopicArn", required=true)
      private final Output<String> snsTopicArn;

    public Output<String> getSnsTopicArn() {
        return this.snsTopicArn;
    }

    public AlertSNSConfigurationArgs(
        Output<String> roleArn,
        Output<String> snsTopicArn) {
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.snsTopicArn = Objects.requireNonNull(snsTopicArn, "expected parameter 'snsTopicArn' to be non-null");
    }

    private AlertSNSConfigurationArgs() {
        this.roleArn = Output.empty();
        this.snsTopicArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertSNSConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> roleArn;
        private Output<String> snsTopicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertSNSConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
    	      this.snsTopicArn = defaults.snsTopicArn;
        }

        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder snsTopicArn(Output<String> snsTopicArn) {
            this.snsTopicArn = Objects.requireNonNull(snsTopicArn);
            return this;
        }
        public Builder snsTopicArn(String snsTopicArn) {
            this.snsTopicArn = Output.of(Objects.requireNonNull(snsTopicArn));
            return this;
        }        public AlertSNSConfigurationArgs build() {
            return new AlertSNSConfigurationArgs(roleArn, snsTopicArn);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * SNS configuration for notification upon scheduled query execution.
 * 
 */
public final class ScheduledQuerySnsConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledQuerySnsConfigurationArgs Empty = new ScheduledQuerySnsConfigurationArgs();

    @Import(name="topicArn", required=true)
      private final Output<String> topicArn;

    public Output<String> topicArn() {
        return this.topicArn;
    }

    public ScheduledQuerySnsConfigurationArgs(Output<String> topicArn) {
        this.topicArn = Objects.requireNonNull(topicArn, "expected parameter 'topicArn' to be non-null");
    }

    private ScheduledQuerySnsConfigurationArgs() {
        this.topicArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledQuerySnsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledQuerySnsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topicArn = defaults.topicArn;
        }

        public Builder topicArn(Output<String> topicArn) {
            this.topicArn = Objects.requireNonNull(topicArn);
            return this;
        }
        public Builder topicArn(String topicArn) {
            this.topicArn = Output.of(Objects.requireNonNull(topicArn));
            return this;
        }        public ScheduledQuerySnsConfigurationArgs build() {
            return new ScheduledQuerySnsConfigurationArgs(topicArn);
        }
    }
}

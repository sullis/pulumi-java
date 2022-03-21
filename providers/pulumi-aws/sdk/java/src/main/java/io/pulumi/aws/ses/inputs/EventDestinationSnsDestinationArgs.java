// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EventDestinationSnsDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventDestinationSnsDestinationArgs Empty = new EventDestinationSnsDestinationArgs();

    /**
     * The ARN of the SNS topic
     * 
     */
    @Import(name="topicArn", required=true)
      private final Output<String> topicArn;

    public Output<String> getTopicArn() {
        return this.topicArn;
    }

    public EventDestinationSnsDestinationArgs(Output<String> topicArn) {
        this.topicArn = Objects.requireNonNull(topicArn, "expected parameter 'topicArn' to be non-null");
    }

    private EventDestinationSnsDestinationArgs() {
        this.topicArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventDestinationSnsDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EventDestinationSnsDestinationArgs defaults) {
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
        }        public EventDestinationSnsDestinationArgs build() {
            return new EventDestinationSnsDestinationArgs(topicArn);
        }
    }
}

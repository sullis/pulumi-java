// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class EventDestinationKinesisDestinationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventDestinationKinesisDestinationGetArgs Empty = new EventDestinationKinesisDestinationGetArgs();

    /**
     * The ARN of the role that has permissions to access the Kinesis Stream
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * The ARN of the Kinesis Stream
     * 
     */
    @Import(name="streamArn", required=true)
      private final Output<String> streamArn;

    public Output<String> streamArn() {
        return this.streamArn;
    }

    public EventDestinationKinesisDestinationGetArgs(
        Output<String> roleArn,
        Output<String> streamArn) {
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.streamArn = Objects.requireNonNull(streamArn, "expected parameter 'streamArn' to be non-null");
    }

    private EventDestinationKinesisDestinationGetArgs() {
        this.roleArn = Codegen.empty();
        this.streamArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventDestinationKinesisDestinationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> roleArn;
        private Output<String> streamArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EventDestinationKinesisDestinationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
    	      this.streamArn = defaults.streamArn;
        }

        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder streamArn(Output<String> streamArn) {
            this.streamArn = Objects.requireNonNull(streamArn);
            return this;
        }
        public Builder streamArn(String streamArn) {
            this.streamArn = Output.of(Objects.requireNonNull(streamArn));
            return this;
        }        public EventDestinationKinesisDestinationGetArgs build() {
            return new EventDestinationKinesisDestinationGetArgs(roleArn, streamArn);
        }
    }
}

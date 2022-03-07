// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class StageAccessLogSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final StageAccessLogSettingsArgs Empty = new StageAccessLogSettingsArgs();

    /**
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or Kinesis Data Firehose delivery stream to receive access logs. If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with `amazon-apigateway-`. Automatically removes trailing `:*` if present.
     * 
     */
    @InputImport(name="destinationArn", required=true)
      private final Input<String> destinationArn;

    public Input<String> getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * The formatting and values recorded in the logs.
     * For more information on configuring the log format rules visit the AWS [documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html)
     * 
     */
    @InputImport(name="format", required=true)
      private final Input<String> format;

    public Input<String> getFormat() {
        return this.format;
    }

    public StageAccessLogSettingsArgs(
        Input<String> destinationArn,
        Input<String> format) {
        this.destinationArn = Objects.requireNonNull(destinationArn, "expected parameter 'destinationArn' to be non-null");
        this.format = Objects.requireNonNull(format, "expected parameter 'format' to be non-null");
    }

    private StageAccessLogSettingsArgs() {
        this.destinationArn = Input.empty();
        this.format = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageAccessLogSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> destinationArn;
        private Input<String> format;

        public Builder() {
    	      // Empty
        }

        public Builder(StageAccessLogSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationArn = defaults.destinationArn;
    	      this.format = defaults.format;
        }

        public Builder setDestinationArn(Input<String> destinationArn) {
            this.destinationArn = Objects.requireNonNull(destinationArn);
            return this;
        }

        public Builder setDestinationArn(String destinationArn) {
            this.destinationArn = Input.of(Objects.requireNonNull(destinationArn));
            return this;
        }

        public Builder setFormat(Input<String> format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }

        public Builder setFormat(String format) {
            this.format = Input.of(Objects.requireNonNull(format));
            return this;
        }
        public StageAccessLogSettingsArgs build() {
            return new StageAccessLogSettingsArgs(destinationArn, format);
        }
    }
}
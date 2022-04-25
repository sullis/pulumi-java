// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class StageAccessLogSettingsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final StageAccessLogSettingsGetArgs Empty = new StageAccessLogSettingsGetArgs();

    /**
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or Kinesis Data Firehose delivery stream to receive access logs. If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with `amazon-apigateway-`. Automatically removes trailing `:*` if present.
     * 
     */
    @Import(name="destinationArn", required=true)
    private Output<String> destinationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the CloudWatch Logs log group or Kinesis Data Firehose delivery stream to receive access logs. If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with `amazon-apigateway-`. Automatically removes trailing `:*` if present.
     * 
     */
    public Output<String> destinationArn() {
        return this.destinationArn;
    }

    /**
     * The formatting and values recorded in the logs.
     * For more information on configuring the log format rules visit the AWS [documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html)
     * 
     */
    @Import(name="format", required=true)
    private Output<String> format;

    /**
     * @return The formatting and values recorded in the logs.
     * For more information on configuring the log format rules visit the AWS [documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html)
     * 
     */
    public Output<String> format() {
        return this.format;
    }

    private StageAccessLogSettingsGetArgs() {}

    private StageAccessLogSettingsGetArgs(StageAccessLogSettingsGetArgs $) {
        this.destinationArn = $.destinationArn;
        this.format = $.format;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StageAccessLogSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StageAccessLogSettingsGetArgs $;

        public Builder() {
            $ = new StageAccessLogSettingsGetArgs();
        }

        public Builder(StageAccessLogSettingsGetArgs defaults) {
            $ = new StageAccessLogSettingsGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationArn The Amazon Resource Name (ARN) of the CloudWatch Logs log group or Kinesis Data Firehose delivery stream to receive access logs. If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with `amazon-apigateway-`. Automatically removes trailing `:*` if present.
         * 
         * @return builder
         * 
         */
        public Builder destinationArn(Output<String> destinationArn) {
            $.destinationArn = destinationArn;
            return this;
        }

        /**
         * @param destinationArn The Amazon Resource Name (ARN) of the CloudWatch Logs log group or Kinesis Data Firehose delivery stream to receive access logs. If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with `amazon-apigateway-`. Automatically removes trailing `:*` if present.
         * 
         * @return builder
         * 
         */
        public Builder destinationArn(String destinationArn) {
            return destinationArn(Output.of(destinationArn));
        }

        /**
         * @param format The formatting and values recorded in the logs.
         * For more information on configuring the log format rules visit the AWS [documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html)
         * 
         * @return builder
         * 
         */
        public Builder format(Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format The formatting and values recorded in the logs.
         * For more information on configuring the log format rules visit the AWS [documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html)
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        public StageAccessLogSettingsGetArgs build() {
            $.destinationArn = Objects.requireNonNull($.destinationArn, "expected parameter 'destinationArn' to be non-null");
            $.format = Objects.requireNonNull($.format, "expected parameter 'format' to be non-null");
            return $;
        }
    }

}

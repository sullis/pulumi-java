// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaArgs;
import com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputArgs;
import com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputArgs;
import com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs();

    /**
     * Describes the data format when records are written to the destination.
     * 
     */
    @Import(name="destinationSchema", required=true)
    private Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaArgs> destinationSchema;

    /**
     * @return Describes the data format when records are written to the destination.
     * 
     */
    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaArgs> destinationSchema() {
        return this.destinationSchema;
    }

    /**
     * Identifies a Kinesis Data Firehose delivery stream as the destination.
     * 
     */
    @Import(name="kinesisFirehoseOutput")
    private @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputArgs> kinesisFirehoseOutput;

    /**
     * @return Identifies a Kinesis Data Firehose delivery stream as the destination.
     * 
     */
    public Optional<Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputArgs>> kinesisFirehoseOutput() {
        return Optional.ofNullable(this.kinesisFirehoseOutput);
    }

    /**
     * Identifies a Kinesis data stream as the destination.
     * 
     */
    @Import(name="kinesisStreamsOutput")
    private @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputArgs> kinesisStreamsOutput;

    /**
     * @return Identifies a Kinesis data stream as the destination.
     * 
     */
    public Optional<Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputArgs>> kinesisStreamsOutput() {
        return Optional.ofNullable(this.kinesisStreamsOutput);
    }

    /**
     * Identifies a Lambda function as the destination.
     * 
     */
    @Import(name="lambdaOutput")
    private @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputArgs> lambdaOutput;

    /**
     * @return Identifies a Lambda function as the destination.
     * 
     */
    public Optional<Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputArgs>> lambdaOutput() {
        return Optional.ofNullable(this.lambdaOutput);
    }

    /**
     * The name of the in-application stream.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the in-application stream.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="outputId")
    private @Nullable Output<String> outputId;

    public Optional<Output<String>> outputId() {
        return Optional.ofNullable(this.outputId);
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs() {}

    private ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs $) {
        this.destinationSchema = $.destinationSchema;
        this.kinesisFirehoseOutput = $.kinesisFirehoseOutput;
        this.kinesisStreamsOutput = $.kinesisStreamsOutput;
        this.lambdaOutput = $.lambdaOutput;
        this.name = $.name;
        this.outputId = $.outputId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs $;

        public Builder() {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs();
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs defaults) {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationSchema Describes the data format when records are written to the destination.
         * 
         * @return builder
         * 
         */
        public Builder destinationSchema(Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaArgs> destinationSchema) {
            $.destinationSchema = destinationSchema;
            return this;
        }

        /**
         * @param destinationSchema Describes the data format when records are written to the destination.
         * 
         * @return builder
         * 
         */
        public Builder destinationSchema(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaArgs destinationSchema) {
            return destinationSchema(Output.of(destinationSchema));
        }

        /**
         * @param kinesisFirehoseOutput Identifies a Kinesis Data Firehose delivery stream as the destination.
         * 
         * @return builder
         * 
         */
        public Builder kinesisFirehoseOutput(@Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputArgs> kinesisFirehoseOutput) {
            $.kinesisFirehoseOutput = kinesisFirehoseOutput;
            return this;
        }

        /**
         * @param kinesisFirehoseOutput Identifies a Kinesis Data Firehose delivery stream as the destination.
         * 
         * @return builder
         * 
         */
        public Builder kinesisFirehoseOutput(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputArgs kinesisFirehoseOutput) {
            return kinesisFirehoseOutput(Output.of(kinesisFirehoseOutput));
        }

        /**
         * @param kinesisStreamsOutput Identifies a Kinesis data stream as the destination.
         * 
         * @return builder
         * 
         */
        public Builder kinesisStreamsOutput(@Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputArgs> kinesisStreamsOutput) {
            $.kinesisStreamsOutput = kinesisStreamsOutput;
            return this;
        }

        /**
         * @param kinesisStreamsOutput Identifies a Kinesis data stream as the destination.
         * 
         * @return builder
         * 
         */
        public Builder kinesisStreamsOutput(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputArgs kinesisStreamsOutput) {
            return kinesisStreamsOutput(Output.of(kinesisStreamsOutput));
        }

        /**
         * @param lambdaOutput Identifies a Lambda function as the destination.
         * 
         * @return builder
         * 
         */
        public Builder lambdaOutput(@Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputArgs> lambdaOutput) {
            $.lambdaOutput = lambdaOutput;
            return this;
        }

        /**
         * @param lambdaOutput Identifies a Lambda function as the destination.
         * 
         * @return builder
         * 
         */
        public Builder lambdaOutput(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputArgs lambdaOutput) {
            return lambdaOutput(Output.of(lambdaOutput));
        }

        /**
         * @param name The name of the in-application stream.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the in-application stream.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder outputId(@Nullable Output<String> outputId) {
            $.outputId = outputId;
            return this;
        }

        public Builder outputId(String outputId) {
            return outputId(Output.of(outputId));
        }

        public ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs build() {
            $.destinationSchema = Objects.requireNonNull($.destinationSchema, "expected parameter 'destinationSchema' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}

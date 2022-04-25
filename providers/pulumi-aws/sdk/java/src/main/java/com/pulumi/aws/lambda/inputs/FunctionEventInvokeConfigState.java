// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.inputs;

import com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionEventInvokeConfigState extends com.pulumi.resources.ResourceArgs {

    public static final FunctionEventInvokeConfigState Empty = new FunctionEventInvokeConfigState();

    /**
     * Configuration block with destination configuration. See below for details.
     * 
     */
    @Import(name="destinationConfig")
    private @Nullable Output<FunctionEventInvokeConfigDestinationConfigGetArgs> destinationConfig;

    /**
     * @return Configuration block with destination configuration. See below for details.
     * 
     */
    public Optional<Output<FunctionEventInvokeConfigDestinationConfigGetArgs>> destinationConfig() {
        return Optional.ofNullable(this.destinationConfig);
    }

    /**
     * Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
     * 
     */
    @Import(name="functionName")
    private @Nullable Output<String> functionName;

    /**
     * @return Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
     * 
     */
    public Optional<Output<String>> functionName() {
        return Optional.ofNullable(this.functionName);
    }

    /**
     * Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
     * 
     */
    @Import(name="maximumEventAgeInSeconds")
    private @Nullable Output<Integer> maximumEventAgeInSeconds;

    /**
     * @return Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
     * 
     */
    public Optional<Output<Integer>> maximumEventAgeInSeconds() {
        return Optional.ofNullable(this.maximumEventAgeInSeconds);
    }

    /**
     * Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
     * 
     */
    @Import(name="maximumRetryAttempts")
    private @Nullable Output<Integer> maximumRetryAttempts;

    /**
     * @return Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
     * 
     */
    public Optional<Output<Integer>> maximumRetryAttempts() {
        return Optional.ofNullable(this.maximumRetryAttempts);
    }

    /**
     * Lambda Function published version, `$LATEST`, or Lambda Alias name.
     * 
     */
    @Import(name="qualifier")
    private @Nullable Output<String> qualifier;

    /**
     * @return Lambda Function published version, `$LATEST`, or Lambda Alias name.
     * 
     */
    public Optional<Output<String>> qualifier() {
        return Optional.ofNullable(this.qualifier);
    }

    private FunctionEventInvokeConfigState() {}

    private FunctionEventInvokeConfigState(FunctionEventInvokeConfigState $) {
        this.destinationConfig = $.destinationConfig;
        this.functionName = $.functionName;
        this.maximumEventAgeInSeconds = $.maximumEventAgeInSeconds;
        this.maximumRetryAttempts = $.maximumRetryAttempts;
        this.qualifier = $.qualifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionEventInvokeConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionEventInvokeConfigState $;

        public Builder() {
            $ = new FunctionEventInvokeConfigState();
        }

        public Builder(FunctionEventInvokeConfigState defaults) {
            $ = new FunctionEventInvokeConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationConfig Configuration block with destination configuration. See below for details.
         * 
         * @return builder
         * 
         */
        public Builder destinationConfig(@Nullable Output<FunctionEventInvokeConfigDestinationConfigGetArgs> destinationConfig) {
            $.destinationConfig = destinationConfig;
            return this;
        }

        /**
         * @param destinationConfig Configuration block with destination configuration. See below for details.
         * 
         * @return builder
         * 
         */
        public Builder destinationConfig(FunctionEventInvokeConfigDestinationConfigGetArgs destinationConfig) {
            return destinationConfig(Output.of(destinationConfig));
        }

        /**
         * @param functionName Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
         * 
         * @return builder
         * 
         */
        public Builder functionName(@Nullable Output<String> functionName) {
            $.functionName = functionName;
            return this;
        }

        /**
         * @param functionName Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
         * 
         * @return builder
         * 
         */
        public Builder functionName(String functionName) {
            return functionName(Output.of(functionName));
        }

        /**
         * @param maximumEventAgeInSeconds Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
         * 
         * @return builder
         * 
         */
        public Builder maximumEventAgeInSeconds(@Nullable Output<Integer> maximumEventAgeInSeconds) {
            $.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
            return this;
        }

        /**
         * @param maximumEventAgeInSeconds Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
         * 
         * @return builder
         * 
         */
        public Builder maximumEventAgeInSeconds(Integer maximumEventAgeInSeconds) {
            return maximumEventAgeInSeconds(Output.of(maximumEventAgeInSeconds));
        }

        /**
         * @param maximumRetryAttempts Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
         * 
         * @return builder
         * 
         */
        public Builder maximumRetryAttempts(@Nullable Output<Integer> maximumRetryAttempts) {
            $.maximumRetryAttempts = maximumRetryAttempts;
            return this;
        }

        /**
         * @param maximumRetryAttempts Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
         * 
         * @return builder
         * 
         */
        public Builder maximumRetryAttempts(Integer maximumRetryAttempts) {
            return maximumRetryAttempts(Output.of(maximumRetryAttempts));
        }

        /**
         * @param qualifier Lambda Function published version, `$LATEST`, or Lambda Alias name.
         * 
         * @return builder
         * 
         */
        public Builder qualifier(@Nullable Output<String> qualifier) {
            $.qualifier = qualifier;
            return this;
        }

        /**
         * @param qualifier Lambda Function published version, `$LATEST`, or Lambda Alias name.
         * 
         * @return builder
         * 
         */
        public Builder qualifier(String qualifier) {
            return qualifier(Output.of(qualifier));
        }

        public FunctionEventInvokeConfigState build() {
            return $;
        }
    }

}

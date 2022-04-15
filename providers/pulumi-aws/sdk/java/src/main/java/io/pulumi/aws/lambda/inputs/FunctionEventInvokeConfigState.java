// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionEventInvokeConfigState extends io.pulumi.resources.ResourceArgs {

    public static final FunctionEventInvokeConfigState Empty = new FunctionEventInvokeConfigState();

    /**
     * Configuration block with destination configuration. See below for details.
     * 
     */
    @Import(name="destinationConfig")
      private final @Nullable Output<FunctionEventInvokeConfigDestinationConfigGetArgs> destinationConfig;

    public Output<FunctionEventInvokeConfigDestinationConfigGetArgs> destinationConfig() {
        return this.destinationConfig == null ? Codegen.empty() : this.destinationConfig;
    }

    /**
     * Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
     * 
     */
    @Import(name="functionName")
      private final @Nullable Output<String> functionName;

    public Output<String> functionName() {
        return this.functionName == null ? Codegen.empty() : this.functionName;
    }

    /**
     * Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
     * 
     */
    @Import(name="maximumEventAgeInSeconds")
      private final @Nullable Output<Integer> maximumEventAgeInSeconds;

    public Output<Integer> maximumEventAgeInSeconds() {
        return this.maximumEventAgeInSeconds == null ? Codegen.empty() : this.maximumEventAgeInSeconds;
    }

    /**
     * Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
     * 
     */
    @Import(name="maximumRetryAttempts")
      private final @Nullable Output<Integer> maximumRetryAttempts;

    public Output<Integer> maximumRetryAttempts() {
        return this.maximumRetryAttempts == null ? Codegen.empty() : this.maximumRetryAttempts;
    }

    /**
     * Lambda Function published version, `$LATEST`, or Lambda Alias name.
     * 
     */
    @Import(name="qualifier")
      private final @Nullable Output<String> qualifier;

    public Output<String> qualifier() {
        return this.qualifier == null ? Codegen.empty() : this.qualifier;
    }

    public FunctionEventInvokeConfigState(
        @Nullable Output<FunctionEventInvokeConfigDestinationConfigGetArgs> destinationConfig,
        @Nullable Output<String> functionName,
        @Nullable Output<Integer> maximumEventAgeInSeconds,
        @Nullable Output<Integer> maximumRetryAttempts,
        @Nullable Output<String> qualifier) {
        this.destinationConfig = destinationConfig;
        this.functionName = functionName;
        this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
        this.maximumRetryAttempts = maximumRetryAttempts;
        this.qualifier = qualifier;
    }

    private FunctionEventInvokeConfigState() {
        this.destinationConfig = Codegen.empty();
        this.functionName = Codegen.empty();
        this.maximumEventAgeInSeconds = Codegen.empty();
        this.maximumRetryAttempts = Codegen.empty();
        this.qualifier = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionEventInvokeConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FunctionEventInvokeConfigDestinationConfigGetArgs> destinationConfig;
        private @Nullable Output<String> functionName;
        private @Nullable Output<Integer> maximumEventAgeInSeconds;
        private @Nullable Output<Integer> maximumRetryAttempts;
        private @Nullable Output<String> qualifier;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionEventInvokeConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationConfig = defaults.destinationConfig;
    	      this.functionName = defaults.functionName;
    	      this.maximumEventAgeInSeconds = defaults.maximumEventAgeInSeconds;
    	      this.maximumRetryAttempts = defaults.maximumRetryAttempts;
    	      this.qualifier = defaults.qualifier;
        }

        public Builder destinationConfig(@Nullable Output<FunctionEventInvokeConfigDestinationConfigGetArgs> destinationConfig) {
            this.destinationConfig = destinationConfig;
            return this;
        }
        public Builder destinationConfig(@Nullable FunctionEventInvokeConfigDestinationConfigGetArgs destinationConfig) {
            this.destinationConfig = Codegen.ofNullable(destinationConfig);
            return this;
        }
        public Builder functionName(@Nullable Output<String> functionName) {
            this.functionName = functionName;
            return this;
        }
        public Builder functionName(@Nullable String functionName) {
            this.functionName = Codegen.ofNullable(functionName);
            return this;
        }
        public Builder maximumEventAgeInSeconds(@Nullable Output<Integer> maximumEventAgeInSeconds) {
            this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
            return this;
        }
        public Builder maximumEventAgeInSeconds(@Nullable Integer maximumEventAgeInSeconds) {
            this.maximumEventAgeInSeconds = Codegen.ofNullable(maximumEventAgeInSeconds);
            return this;
        }
        public Builder maximumRetryAttempts(@Nullable Output<Integer> maximumRetryAttempts) {
            this.maximumRetryAttempts = maximumRetryAttempts;
            return this;
        }
        public Builder maximumRetryAttempts(@Nullable Integer maximumRetryAttempts) {
            this.maximumRetryAttempts = Codegen.ofNullable(maximumRetryAttempts);
            return this;
        }
        public Builder qualifier(@Nullable Output<String> qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public Builder qualifier(@Nullable String qualifier) {
            this.qualifier = Codegen.ofNullable(qualifier);
            return this;
        }        public FunctionEventInvokeConfigState build() {
            return new FunctionEventInvokeConfigState(destinationConfig, functionName, maximumEventAgeInSeconds, maximumRetryAttempts, qualifier);
        }
    }
}

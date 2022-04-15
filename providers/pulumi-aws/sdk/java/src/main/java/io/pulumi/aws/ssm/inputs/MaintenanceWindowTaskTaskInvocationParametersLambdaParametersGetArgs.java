// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MaintenanceWindowTaskTaskInvocationParametersLambdaParametersGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowTaskTaskInvocationParametersLambdaParametersGetArgs Empty = new MaintenanceWindowTaskTaskInvocationParametersLambdaParametersGetArgs();

    /**
     * Pass client-specific information to the Lambda function that you are invoking.
     * 
     */
    @Import(name="clientContext")
      private final @Nullable Output<String> clientContext;

    public Output<String> clientContext() {
        return this.clientContext == null ? Codegen.empty() : this.clientContext;
    }

    /**
     * JSON to provide to your Lambda function as input.
     * 
     */
    @Import(name="payload")
      private final @Nullable Output<String> payload;

    public Output<String> payload() {
        return this.payload == null ? Codegen.empty() : this.payload;
    }

    /**
     * Specify a Lambda function version or alias name.
     * 
     */
    @Import(name="qualifier")
      private final @Nullable Output<String> qualifier;

    public Output<String> qualifier() {
        return this.qualifier == null ? Codegen.empty() : this.qualifier;
    }

    public MaintenanceWindowTaskTaskInvocationParametersLambdaParametersGetArgs(
        @Nullable Output<String> clientContext,
        @Nullable Output<String> payload,
        @Nullable Output<String> qualifier) {
        this.clientContext = clientContext;
        this.payload = payload;
        this.qualifier = qualifier;
    }

    private MaintenanceWindowTaskTaskInvocationParametersLambdaParametersGetArgs() {
        this.clientContext = Codegen.empty();
        this.payload = Codegen.empty();
        this.qualifier = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskTaskInvocationParametersLambdaParametersGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clientContext;
        private @Nullable Output<String> payload;
        private @Nullable Output<String> qualifier;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskTaskInvocationParametersLambdaParametersGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientContext = defaults.clientContext;
    	      this.payload = defaults.payload;
    	      this.qualifier = defaults.qualifier;
        }

        public Builder clientContext(@Nullable Output<String> clientContext) {
            this.clientContext = clientContext;
            return this;
        }
        public Builder clientContext(@Nullable String clientContext) {
            this.clientContext = Codegen.ofNullable(clientContext);
            return this;
        }
        public Builder payload(@Nullable Output<String> payload) {
            this.payload = payload;
            return this;
        }
        public Builder payload(@Nullable String payload) {
            this.payload = Codegen.ofNullable(payload);
            return this;
        }
        public Builder qualifier(@Nullable Output<String> qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public Builder qualifier(@Nullable String qualifier) {
            this.qualifier = Codegen.ofNullable(qualifier);
            return this;
        }        public MaintenanceWindowTaskTaskInvocationParametersLambdaParametersGetArgs build() {
            return new MaintenanceWindowTaskTaskInvocationParametersLambdaParametersGetArgs(clientContext, payload, qualifier);
        }
    }
}

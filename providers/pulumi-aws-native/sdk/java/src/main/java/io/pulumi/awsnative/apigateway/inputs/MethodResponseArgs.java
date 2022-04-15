// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MethodResponseArgs extends io.pulumi.resources.ResourceArgs {

    public static final MethodResponseArgs Empty = new MethodResponseArgs();

    /**
     * The resources used for the response's content type. Specify response models as key-value pairs (string-to-string maps), with a content type as the key and a Model resource name as the value.
     * 
     */
    @Import(name="responseModels")
      private final @Nullable Output<Object> responseModels;

    public Output<Object> responseModels() {
        return this.responseModels == null ? Codegen.empty() : this.responseModels;
    }

    /**
     * Response parameters that API Gateway sends to the client that called a method. Specify response parameters as key-value pairs (string-to-Boolean maps), with a destination as the key and a Boolean as the value.
     * 
     */
    @Import(name="responseParameters")
      private final @Nullable Output<Object> responseParameters;

    public Output<Object> responseParameters() {
        return this.responseParameters == null ? Codegen.empty() : this.responseParameters;
    }

    /**
     * The method response's status code, which you map to an IntegrationResponse.
     * 
     */
    @Import(name="statusCode", required=true)
      private final Output<String> statusCode;

    public Output<String> statusCode() {
        return this.statusCode;
    }

    public MethodResponseArgs(
        @Nullable Output<Object> responseModels,
        @Nullable Output<Object> responseParameters,
        Output<String> statusCode) {
        this.responseModels = responseModels;
        this.responseParameters = responseParameters;
        this.statusCode = Objects.requireNonNull(statusCode, "expected parameter 'statusCode' to be non-null");
    }

    private MethodResponseArgs() {
        this.responseModels = Codegen.empty();
        this.responseParameters = Codegen.empty();
        this.statusCode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MethodResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> responseModels;
        private @Nullable Output<Object> responseParameters;
        private Output<String> statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(MethodResponseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.responseModels = defaults.responseModels;
    	      this.responseParameters = defaults.responseParameters;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder responseModels(@Nullable Output<Object> responseModels) {
            this.responseModels = responseModels;
            return this;
        }
        public Builder responseModels(@Nullable Object responseModels) {
            this.responseModels = Codegen.ofNullable(responseModels);
            return this;
        }
        public Builder responseParameters(@Nullable Output<Object> responseParameters) {
            this.responseParameters = responseParameters;
            return this;
        }
        public Builder responseParameters(@Nullable Object responseParameters) {
            this.responseParameters = Codegen.ofNullable(responseParameters);
            return this;
        }
        public Builder statusCode(Output<String> statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }
        public Builder statusCode(String statusCode) {
            this.statusCode = Output.of(Objects.requireNonNull(statusCode));
            return this;
        }        public MethodResponseArgs build() {
            return new MethodResponseArgs(responseModels, responseParameters, statusCode);
        }
    }
}

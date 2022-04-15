// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.events.inputs;

import io.pulumi.awsnative.events.inputs.ConnectionParameterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionHttpParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionHttpParametersArgs Empty = new ConnectionHttpParametersArgs();

    @Import(name="bodyParameters")
      private final @Nullable Output<List<ConnectionParameterArgs>> bodyParameters;

    public Output<List<ConnectionParameterArgs>> bodyParameters() {
        return this.bodyParameters == null ? Codegen.empty() : this.bodyParameters;
    }

    @Import(name="headerParameters")
      private final @Nullable Output<List<ConnectionParameterArgs>> headerParameters;

    public Output<List<ConnectionParameterArgs>> headerParameters() {
        return this.headerParameters == null ? Codegen.empty() : this.headerParameters;
    }

    @Import(name="queryStringParameters")
      private final @Nullable Output<List<ConnectionParameterArgs>> queryStringParameters;

    public Output<List<ConnectionParameterArgs>> queryStringParameters() {
        return this.queryStringParameters == null ? Codegen.empty() : this.queryStringParameters;
    }

    public ConnectionHttpParametersArgs(
        @Nullable Output<List<ConnectionParameterArgs>> bodyParameters,
        @Nullable Output<List<ConnectionParameterArgs>> headerParameters,
        @Nullable Output<List<ConnectionParameterArgs>> queryStringParameters) {
        this.bodyParameters = bodyParameters;
        this.headerParameters = headerParameters;
        this.queryStringParameters = queryStringParameters;
    }

    private ConnectionHttpParametersArgs() {
        this.bodyParameters = Codegen.empty();
        this.headerParameters = Codegen.empty();
        this.queryStringParameters = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionHttpParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ConnectionParameterArgs>> bodyParameters;
        private @Nullable Output<List<ConnectionParameterArgs>> headerParameters;
        private @Nullable Output<List<ConnectionParameterArgs>> queryStringParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionHttpParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bodyParameters = defaults.bodyParameters;
    	      this.headerParameters = defaults.headerParameters;
    	      this.queryStringParameters = defaults.queryStringParameters;
        }

        public Builder bodyParameters(@Nullable Output<List<ConnectionParameterArgs>> bodyParameters) {
            this.bodyParameters = bodyParameters;
            return this;
        }
        public Builder bodyParameters(@Nullable List<ConnectionParameterArgs> bodyParameters) {
            this.bodyParameters = Codegen.ofNullable(bodyParameters);
            return this;
        }
        public Builder bodyParameters(ConnectionParameterArgs... bodyParameters) {
            return bodyParameters(List.of(bodyParameters));
        }
        public Builder headerParameters(@Nullable Output<List<ConnectionParameterArgs>> headerParameters) {
            this.headerParameters = headerParameters;
            return this;
        }
        public Builder headerParameters(@Nullable List<ConnectionParameterArgs> headerParameters) {
            this.headerParameters = Codegen.ofNullable(headerParameters);
            return this;
        }
        public Builder headerParameters(ConnectionParameterArgs... headerParameters) {
            return headerParameters(List.of(headerParameters));
        }
        public Builder queryStringParameters(@Nullable Output<List<ConnectionParameterArgs>> queryStringParameters) {
            this.queryStringParameters = queryStringParameters;
            return this;
        }
        public Builder queryStringParameters(@Nullable List<ConnectionParameterArgs> queryStringParameters) {
            this.queryStringParameters = Codegen.ofNullable(queryStringParameters);
            return this;
        }
        public Builder queryStringParameters(ConnectionParameterArgs... queryStringParameters) {
            return queryStringParameters(List.of(queryStringParameters));
        }        public ConnectionHttpParametersArgs build() {
            return new ConnectionHttpParametersArgs(bodyParameters, headerParameters, queryStringParameters);
        }
    }
}

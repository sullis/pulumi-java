// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolGrpcGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolHttpGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecListenerConnectionPoolGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerConnectionPoolGetArgs Empty = new VirtualGatewaySpecListenerConnectionPoolGetArgs();

    /**
     * Connection pool information for gRPC listeners.
     * 
     */
    @Import(name="grpc")
      private final @Nullable Output<VirtualGatewaySpecListenerConnectionPoolGrpcGetArgs> grpc;

    public Output<VirtualGatewaySpecListenerConnectionPoolGrpcGetArgs> grpc() {
        return this.grpc == null ? Codegen.empty() : this.grpc;
    }

    /**
     * Connection pool information for HTTP listeners.
     * 
     */
    @Import(name="http")
      private final @Nullable Output<VirtualGatewaySpecListenerConnectionPoolHttpGetArgs> http;

    public Output<VirtualGatewaySpecListenerConnectionPoolHttpGetArgs> http() {
        return this.http == null ? Codegen.empty() : this.http;
    }

    /**
     * Connection pool information for HTTP2 listeners.
     * 
     */
    @Import(name="http2")
      private final @Nullable Output<VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs> http2;

    public Output<VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs> http2() {
        return this.http2 == null ? Codegen.empty() : this.http2;
    }

    public VirtualGatewaySpecListenerConnectionPoolGetArgs(
        @Nullable Output<VirtualGatewaySpecListenerConnectionPoolGrpcGetArgs> grpc,
        @Nullable Output<VirtualGatewaySpecListenerConnectionPoolHttpGetArgs> http,
        @Nullable Output<VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs> http2) {
        this.grpc = grpc;
        this.http = http;
        this.http2 = http2;
    }

    private VirtualGatewaySpecListenerConnectionPoolGetArgs() {
        this.grpc = Codegen.empty();
        this.http = Codegen.empty();
        this.http2 = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerConnectionPoolGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualGatewaySpecListenerConnectionPoolGrpcGetArgs> grpc;
        private @Nullable Output<VirtualGatewaySpecListenerConnectionPoolHttpGetArgs> http;
        private @Nullable Output<VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs> http2;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerConnectionPoolGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpc = defaults.grpc;
    	      this.http = defaults.http;
    	      this.http2 = defaults.http2;
        }

        public Builder grpc(@Nullable Output<VirtualGatewaySpecListenerConnectionPoolGrpcGetArgs> grpc) {
            this.grpc = grpc;
            return this;
        }
        public Builder grpc(@Nullable VirtualGatewaySpecListenerConnectionPoolGrpcGetArgs grpc) {
            this.grpc = Codegen.ofNullable(grpc);
            return this;
        }
        public Builder http(@Nullable Output<VirtualGatewaySpecListenerConnectionPoolHttpGetArgs> http) {
            this.http = http;
            return this;
        }
        public Builder http(@Nullable VirtualGatewaySpecListenerConnectionPoolHttpGetArgs http) {
            this.http = Codegen.ofNullable(http);
            return this;
        }
        public Builder http2(@Nullable Output<VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs> http2) {
            this.http2 = http2;
            return this;
        }
        public Builder http2(@Nullable VirtualGatewaySpecListenerConnectionPoolHttp2GetArgs http2) {
            this.http2 = Codegen.ofNullable(http2);
            return this;
        }        public VirtualGatewaySpecListenerConnectionPoolGetArgs build() {
            return new VirtualGatewaySpecListenerConnectionPoolGetArgs(grpc, http, http2);
        }
    }
}

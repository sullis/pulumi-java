// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.azurenative.videoanalyzer.enums.RtspTransport;
import io.pulumi.azurenative.videoanalyzer.inputs.TlsEndpointArgs;
import io.pulumi.azurenative.videoanalyzer.inputs.UnsecuredEndpointArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * RTSP source allows for media from an RTSP camera or generic RTSP server to be ingested into a pipeline.
 * 
 */
public final class RtspSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final RtspSourceArgs Empty = new RtspSourceArgs();

    /**
     * RTSP endpoint information for Video Analyzer to connect to. This contains the required information for Video Analyzer to connect to RTSP cameras and/or generic RTSP servers.
     * 
     */
    @InputImport(name="endpoint", required=true)
      private final Input<Either<TlsEndpointArgs,UnsecuredEndpointArgs>> endpoint;

    public Input<Either<TlsEndpointArgs,UnsecuredEndpointArgs>> getEndpoint() {
        return this.endpoint;
    }

    /**
     * Node name. Must be unique within the topology.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Network transport utilized by the RTSP and RTP exchange: TCP or HTTP. When using TCP, the RTP packets are interleaved on the TCP RTSP connection. When using HTTP, the RTSP messages are exchanged through long lived HTTP connections, and the RTP packages are interleaved in the HTTP connections alongside the RTSP messages.
     * 
     */
    @InputImport(name="transport")
      private final @Nullable Input<Either<String,RtspTransport>> transport;

    public Input<Either<String,RtspTransport>> getTransport() {
        return this.transport == null ? Input.empty() : this.transport;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.RtspSource'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public RtspSourceArgs(
        Input<Either<TlsEndpointArgs,UnsecuredEndpointArgs>> endpoint,
        Input<String> name,
        @Nullable Input<Either<String,RtspTransport>> transport,
        Input<String> type) {
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.transport = transport;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RtspSourceArgs() {
        this.endpoint = Input.empty();
        this.name = Input.empty();
        this.transport = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RtspSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<TlsEndpointArgs,UnsecuredEndpointArgs>> endpoint;
        private Input<String> name;
        private @Nullable Input<Either<String,RtspTransport>> transport;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RtspSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.name = defaults.name;
    	      this.transport = defaults.transport;
    	      this.type = defaults.type;
        }

        public Builder setEndpoint(Input<Either<TlsEndpointArgs,UnsecuredEndpointArgs>> endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setEndpoint(Either<TlsEndpointArgs,UnsecuredEndpointArgs> endpoint) {
            this.endpoint = Input.of(Objects.requireNonNull(endpoint));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setTransport(@Nullable Input<Either<String,RtspTransport>> transport) {
            this.transport = transport;
            return this;
        }

        public Builder setTransport(@Nullable Either<String,RtspTransport> transport) {
            this.transport = Input.ofNullable(transport);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public RtspSourceArgs build() {
            return new RtspSourceArgs(endpoint, name, transport, type);
        }
    }
}
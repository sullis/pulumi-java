// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.azurenative.videoanalyzer.outputs.SecureIotDeviceRemoteTunnelResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.UsernamePasswordCredentialsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UnsecuredEndpointResponse {
    /**
     * Credentials to be presented to the endpoint.
     * 
     */
    private final UsernamePasswordCredentialsResponse credentials;
    /**
     * Describes the tunnel through which Video Analyzer can connect to the endpoint URL. This is an optional property, typically used when the endpoint is behind a firewall.
     * 
     */
    private final @Nullable SecureIotDeviceRemoteTunnelResponse tunnel;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.UnsecuredEndpoint'.
     * 
     */
    private final String type;
    /**
     * The endpoint URL for Video Analyzer to connect to.
     * 
     */
    private final String url;

    @OutputCustomType.Constructor({"credentials","tunnel","type","url"})
    private UnsecuredEndpointResponse(
        UsernamePasswordCredentialsResponse credentials,
        @Nullable SecureIotDeviceRemoteTunnelResponse tunnel,
        String type,
        String url) {
        this.credentials = Objects.requireNonNull(credentials);
        this.tunnel = tunnel;
        this.type = Objects.requireNonNull(type);
        this.url = Objects.requireNonNull(url);
    }

    /**
     * Credentials to be presented to the endpoint.
     * 
     */
    public UsernamePasswordCredentialsResponse getCredentials() {
        return this.credentials;
    }
    /**
     * Describes the tunnel through which Video Analyzer can connect to the endpoint URL. This is an optional property, typically used when the endpoint is behind a firewall.
     * 
     */
    public Optional<SecureIotDeviceRemoteTunnelResponse> getTunnel() {
        return Optional.ofNullable(this.tunnel);
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.UnsecuredEndpoint'.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The endpoint URL for Video Analyzer to connect to.
     * 
     */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UnsecuredEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UsernamePasswordCredentialsResponse credentials;
        private @Nullable SecureIotDeviceRemoteTunnelResponse tunnel;
        private String type;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(UnsecuredEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.tunnel = defaults.tunnel;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
        }

        public Builder setCredentials(UsernamePasswordCredentialsResponse credentials) {
            this.credentials = Objects.requireNonNull(credentials);
            return this;
        }

        public Builder setTunnel(@Nullable SecureIotDeviceRemoteTunnelResponse tunnel) {
            this.tunnel = tunnel;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public UnsecuredEndpointResponse build() {
            return new UnsecuredEndpointResponse(credentials, tunnel, type, url);
        }
    }
}

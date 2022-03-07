// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * For a non-Azure machine that is not connected directly to the internet, specify a proxy server that the non-Azure machine can use.
 * 
 */
public final class ProxyServerPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ProxyServerPropertiesResponse Empty = new ProxyServerPropertiesResponse();

    /**
     * Proxy server IP
     * 
     */
    @InputImport(name="ip")
      private final @Nullable String ip;

    public Optional<String> getIp() {
        return this.ip == null ? Optional.empty() : Optional.ofNullable(this.ip);
    }

    /**
     * Proxy server port
     * 
     */
    @InputImport(name="port")
      private final @Nullable String port;

    public Optional<String> getPort() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    public ProxyServerPropertiesResponse(
        @Nullable String ip,
        @Nullable String port) {
        this.ip = ip;
        this.port = port;
    }

    private ProxyServerPropertiesResponse() {
        this.ip = null;
        this.port = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProxyServerPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ip;
        private @Nullable String port;

        public Builder() {
    	      // Empty
        }

        public Builder(ProxyServerPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
    	      this.port = defaults.port;
        }

        public Builder setIp(@Nullable String ip) {
            this.ip = ip;
            return this;
        }

        public Builder setPort(@Nullable String port) {
            this.port = port;
            return this;
        }
        public ProxyServerPropertiesResponse build() {
            return new ProxyServerPropertiesResponse(ip, port);
        }
    }
}
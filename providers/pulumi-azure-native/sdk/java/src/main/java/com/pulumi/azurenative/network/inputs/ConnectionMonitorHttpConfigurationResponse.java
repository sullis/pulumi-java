// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.HTTPHeaderResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the HTTP configuration.
 * 
 */
public final class ConnectionMonitorHttpConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConnectionMonitorHttpConfigurationResponse Empty = new ConnectionMonitorHttpConfigurationResponse();

    /**
     * The HTTP method to use.
     * 
     */
    @Import(name="method")
    private @Nullable String method;

    /**
     * @return The HTTP method to use.
     * 
     */
    public Optional<String> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * The path component of the URI. For instance, &#34;/dir1/dir2&#34;.
     * 
     */
    @Import(name="path")
    private @Nullable String path;

    /**
     * @return The path component of the URI. For instance, &#34;/dir1/dir2&#34;.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The port to connect to.
     * 
     */
    @Import(name="port")
    private @Nullable Integer port;

    /**
     * @return The port to connect to.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Value indicating whether HTTPS is preferred over HTTP in cases where the choice is not explicit.
     * 
     */
    @Import(name="preferHTTPS")
    private @Nullable Boolean preferHTTPS;

    /**
     * @return Value indicating whether HTTPS is preferred over HTTP in cases where the choice is not explicit.
     * 
     */
    public Optional<Boolean> preferHTTPS() {
        return Optional.ofNullable(this.preferHTTPS);
    }

    /**
     * The HTTP headers to transmit with the request.
     * 
     */
    @Import(name="requestHeaders")
    private @Nullable List<HTTPHeaderResponse> requestHeaders;

    /**
     * @return The HTTP headers to transmit with the request.
     * 
     */
    public Optional<List<HTTPHeaderResponse>> requestHeaders() {
        return Optional.ofNullable(this.requestHeaders);
    }

    /**
     * HTTP status codes to consider successful. For instance, &#34;2xx,301-304,418&#34;.
     * 
     */
    @Import(name="validStatusCodeRanges")
    private @Nullable List<String> validStatusCodeRanges;

    /**
     * @return HTTP status codes to consider successful. For instance, &#34;2xx,301-304,418&#34;.
     * 
     */
    public Optional<List<String>> validStatusCodeRanges() {
        return Optional.ofNullable(this.validStatusCodeRanges);
    }

    private ConnectionMonitorHttpConfigurationResponse() {}

    private ConnectionMonitorHttpConfigurationResponse(ConnectionMonitorHttpConfigurationResponse $) {
        this.method = $.method;
        this.path = $.path;
        this.port = $.port;
        this.preferHTTPS = $.preferHTTPS;
        this.requestHeaders = $.requestHeaders;
        this.validStatusCodeRanges = $.validStatusCodeRanges;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionMonitorHttpConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionMonitorHttpConfigurationResponse $;

        public Builder() {
            $ = new ConnectionMonitorHttpConfigurationResponse();
        }

        public Builder(ConnectionMonitorHttpConfigurationResponse defaults) {
            $ = new ConnectionMonitorHttpConfigurationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param method The HTTP method to use.
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable String method) {
            $.method = method;
            return this;
        }

        /**
         * @param path The path component of the URI. For instance, &#34;/dir1/dir2&#34;.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable String path) {
            $.path = path;
            return this;
        }

        /**
         * @param port The port to connect to.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Integer port) {
            $.port = port;
            return this;
        }

        /**
         * @param preferHTTPS Value indicating whether HTTPS is preferred over HTTP in cases where the choice is not explicit.
         * 
         * @return builder
         * 
         */
        public Builder preferHTTPS(@Nullable Boolean preferHTTPS) {
            $.preferHTTPS = preferHTTPS;
            return this;
        }

        /**
         * @param requestHeaders The HTTP headers to transmit with the request.
         * 
         * @return builder
         * 
         */
        public Builder requestHeaders(@Nullable List<HTTPHeaderResponse> requestHeaders) {
            $.requestHeaders = requestHeaders;
            return this;
        }

        /**
         * @param requestHeaders The HTTP headers to transmit with the request.
         * 
         * @return builder
         * 
         */
        public Builder requestHeaders(HTTPHeaderResponse... requestHeaders) {
            return requestHeaders(List.of(requestHeaders));
        }

        /**
         * @param validStatusCodeRanges HTTP status codes to consider successful. For instance, &#34;2xx,301-304,418&#34;.
         * 
         * @return builder
         * 
         */
        public Builder validStatusCodeRanges(@Nullable List<String> validStatusCodeRanges) {
            $.validStatusCodeRanges = validStatusCodeRanges;
            return this;
        }

        /**
         * @param validStatusCodeRanges HTTP status codes to consider successful. For instance, &#34;2xx,301-304,418&#34;.
         * 
         * @return builder
         * 
         */
        public Builder validStatusCodeRanges(String... validStatusCodeRanges) {
            return validStatusCodeRanges(List.of(validStatusCodeRanges));
        }

        public ConnectionMonitorHttpConfigurationResponse build() {
            return $;
        }
    }

}

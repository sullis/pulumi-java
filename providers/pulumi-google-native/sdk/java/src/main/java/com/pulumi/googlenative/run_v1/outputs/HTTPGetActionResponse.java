// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.run_v1.outputs.HTTPHeaderResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class HTTPGetActionResponse {
    /**
     * @return (Optional) Host name to connect to, defaults to the pod IP. You probably want to set &#34;Host&#34; in httpHeaders instead.
     * 
     */
    private final String host;
    /**
     * @return (Optional) Custom headers to set in the request. HTTP allows repeated headers.
     * 
     */
    private final List<HTTPHeaderResponse> httpHeaders;
    /**
     * @return (Optional) Path to access on the HTTP server.
     * 
     */
    private final String path;
    /**
     * @return (Optional) Scheme to use for connecting to the host. Defaults to HTTP.
     * 
     */
    private final String scheme;

    @CustomType.Constructor
    private HTTPGetActionResponse(
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("httpHeaders") List<HTTPHeaderResponse> httpHeaders,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("scheme") String scheme) {
        this.host = host;
        this.httpHeaders = httpHeaders;
        this.path = path;
        this.scheme = scheme;
    }

    /**
     * @return (Optional) Host name to connect to, defaults to the pod IP. You probably want to set &#34;Host&#34; in httpHeaders instead.
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return (Optional) Custom headers to set in the request. HTTP allows repeated headers.
     * 
     */
    public List<HTTPHeaderResponse> httpHeaders() {
        return this.httpHeaders;
    }
    /**
     * @return (Optional) Path to access on the HTTP server.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return (Optional) Scheme to use for connecting to the host. Defaults to HTTP.
     * 
     */
    public String scheme() {
        return this.scheme;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HTTPGetActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private List<HTTPHeaderResponse> httpHeaders;
        private String path;
        private String scheme;

        public Builder() {
    	      // Empty
        }

        public Builder(HTTPGetActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.httpHeaders = defaults.httpHeaders;
    	      this.path = defaults.path;
    	      this.scheme = defaults.scheme;
        }

        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder httpHeaders(List<HTTPHeaderResponse> httpHeaders) {
            this.httpHeaders = Objects.requireNonNull(httpHeaders);
            return this;
        }
        public Builder httpHeaders(HTTPHeaderResponse... httpHeaders) {
            return httpHeaders(List.of(httpHeaders));
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder scheme(String scheme) {
            this.scheme = Objects.requireNonNull(scheme);
            return this;
        }        public HTTPGetActionResponse build() {
            return new HTTPGetActionResponse(host, httpHeaders, path, scheme);
        }
    }
}

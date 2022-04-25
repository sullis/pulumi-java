// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_beta.outputs.UrlMapTestHeaderResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class UrlMapTestResponse {
    /**
     * @return Description of this test case.
     * 
     */
    private final String description;
    /**
     * @return The expected output URL evaluated by the load balancer containing the scheme, host, path and query parameters. For rules that forward requests to backends, the test passes only when expectedOutputUrl matches the request forwarded by the load balancer to backends. For rules with urlRewrite, the test verifies that the forwarded request matches hostRewrite and pathPrefixRewrite in the urlRewrite action. When service is specified, expectedOutputUrl`s scheme is ignored. For rules with urlRedirect, the test passes only if expectedOutputUrl matches the URL in the load balancer&#39;s redirect response. If urlRedirect specifies https_redirect, the test passes only if the scheme in expectedOutputUrl is also set to HTTPS. If urlRedirect specifies strip_query, the test passes only if expectedOutputUrl does not contain any query parameters. expectedOutputUrl is optional when service is specified.
     * 
     */
    private final String expectedOutputUrl;
    /**
     * @return For rules with urlRedirect, the test passes only if expectedRedirectResponseCode matches the HTTP status code in load balancer&#39;s redirect response. expectedRedirectResponseCode cannot be set when service is set.
     * 
     */
    private final Integer expectedRedirectResponseCode;
    /**
     * @return HTTP headers for this request. If headers contains a host header, then host must also match the header value.
     * 
     */
    private final List<UrlMapTestHeaderResponse> headers;
    /**
     * @return Host portion of the URL. If headers contains a host header, then host must also match the header value.
     * 
     */
    private final String host;
    /**
     * @return Path portion of the URL.
     * 
     */
    private final String path;
    /**
     * @return Expected BackendService or BackendBucket resource the given URL should be mapped to. The service field cannot be set if expectedRedirectResponseCode is set.
     * 
     */
    private final String service;

    @CustomType.Constructor
    private UrlMapTestResponse(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("expectedOutputUrl") String expectedOutputUrl,
        @CustomType.Parameter("expectedRedirectResponseCode") Integer expectedRedirectResponseCode,
        @CustomType.Parameter("headers") List<UrlMapTestHeaderResponse> headers,
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("service") String service) {
        this.description = description;
        this.expectedOutputUrl = expectedOutputUrl;
        this.expectedRedirectResponseCode = expectedRedirectResponseCode;
        this.headers = headers;
        this.host = host;
        this.path = path;
        this.service = service;
    }

    /**
     * @return Description of this test case.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The expected output URL evaluated by the load balancer containing the scheme, host, path and query parameters. For rules that forward requests to backends, the test passes only when expectedOutputUrl matches the request forwarded by the load balancer to backends. For rules with urlRewrite, the test verifies that the forwarded request matches hostRewrite and pathPrefixRewrite in the urlRewrite action. When service is specified, expectedOutputUrl`s scheme is ignored. For rules with urlRedirect, the test passes only if expectedOutputUrl matches the URL in the load balancer&#39;s redirect response. If urlRedirect specifies https_redirect, the test passes only if the scheme in expectedOutputUrl is also set to HTTPS. If urlRedirect specifies strip_query, the test passes only if expectedOutputUrl does not contain any query parameters. expectedOutputUrl is optional when service is specified.
     * 
     */
    public String expectedOutputUrl() {
        return this.expectedOutputUrl;
    }
    /**
     * @return For rules with urlRedirect, the test passes only if expectedRedirectResponseCode matches the HTTP status code in load balancer&#39;s redirect response. expectedRedirectResponseCode cannot be set when service is set.
     * 
     */
    public Integer expectedRedirectResponseCode() {
        return this.expectedRedirectResponseCode;
    }
    /**
     * @return HTTP headers for this request. If headers contains a host header, then host must also match the header value.
     * 
     */
    public List<UrlMapTestHeaderResponse> headers() {
        return this.headers;
    }
    /**
     * @return Host portion of the URL. If headers contains a host header, then host must also match the header value.
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return Path portion of the URL.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return Expected BackendService or BackendBucket resource the given URL should be mapped to. The service field cannot be set if expectedRedirectResponseCode is set.
     * 
     */
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlMapTestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String expectedOutputUrl;
        private Integer expectedRedirectResponseCode;
        private List<UrlMapTestHeaderResponse> headers;
        private String host;
        private String path;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlMapTestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expectedOutputUrl = defaults.expectedOutputUrl;
    	      this.expectedRedirectResponseCode = defaults.expectedRedirectResponseCode;
    	      this.headers = defaults.headers;
    	      this.host = defaults.host;
    	      this.path = defaults.path;
    	      this.service = defaults.service;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder expectedOutputUrl(String expectedOutputUrl) {
            this.expectedOutputUrl = Objects.requireNonNull(expectedOutputUrl);
            return this;
        }
        public Builder expectedRedirectResponseCode(Integer expectedRedirectResponseCode) {
            this.expectedRedirectResponseCode = Objects.requireNonNull(expectedRedirectResponseCode);
            return this;
        }
        public Builder headers(List<UrlMapTestHeaderResponse> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }
        public Builder headers(UrlMapTestHeaderResponse... headers) {
            return headers(List.of(headers));
        }
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }        public UrlMapTestResponse build() {
            return new UrlMapTestResponse(description, expectedOutputUrl, expectedRedirectResponseCode, headers, host, path, service);
        }
    }
}

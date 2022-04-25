// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.inputs.UrlMapTestHeaderResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Message for the expected URL mappings.
 * 
 */
public final class UrlMapTestResponse extends com.pulumi.resources.InvokeArgs {

    public static final UrlMapTestResponse Empty = new UrlMapTestResponse();

    /**
     * Description of this test case.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    /**
     * @return Description of this test case.
     * 
     */
    public String description() {
        return this.description;
    }

    /**
     * The expected output URL evaluated by the load balancer containing the scheme, host, path and query parameters. For rules that forward requests to backends, the test passes only when expectedOutputUrl matches the request forwarded by the load balancer to backends. For rules with urlRewrite, the test verifies that the forwarded request matches hostRewrite and pathPrefixRewrite in the urlRewrite action. When service is specified, expectedOutputUrl`s scheme is ignored. For rules with urlRedirect, the test passes only if expectedOutputUrl matches the URL in the load balancer&#39;s redirect response. If urlRedirect specifies https_redirect, the test passes only if the scheme in expectedOutputUrl is also set to HTTPS. If urlRedirect specifies strip_query, the test passes only if expectedOutputUrl does not contain any query parameters. expectedOutputUrl is optional when service is specified.
     * 
     */
    @Import(name="expectedOutputUrl", required=true)
    private String expectedOutputUrl;

    /**
     * @return The expected output URL evaluated by the load balancer containing the scheme, host, path and query parameters. For rules that forward requests to backends, the test passes only when expectedOutputUrl matches the request forwarded by the load balancer to backends. For rules with urlRewrite, the test verifies that the forwarded request matches hostRewrite and pathPrefixRewrite in the urlRewrite action. When service is specified, expectedOutputUrl`s scheme is ignored. For rules with urlRedirect, the test passes only if expectedOutputUrl matches the URL in the load balancer&#39;s redirect response. If urlRedirect specifies https_redirect, the test passes only if the scheme in expectedOutputUrl is also set to HTTPS. If urlRedirect specifies strip_query, the test passes only if expectedOutputUrl does not contain any query parameters. expectedOutputUrl is optional when service is specified.
     * 
     */
    public String expectedOutputUrl() {
        return this.expectedOutputUrl;
    }

    /**
     * For rules with urlRedirect, the test passes only if expectedRedirectResponseCode matches the HTTP status code in load balancer&#39;s redirect response. expectedRedirectResponseCode cannot be set when service is set.
     * 
     */
    @Import(name="expectedRedirectResponseCode", required=true)
    private Integer expectedRedirectResponseCode;

    /**
     * @return For rules with urlRedirect, the test passes only if expectedRedirectResponseCode matches the HTTP status code in load balancer&#39;s redirect response. expectedRedirectResponseCode cannot be set when service is set.
     * 
     */
    public Integer expectedRedirectResponseCode() {
        return this.expectedRedirectResponseCode;
    }

    /**
     * HTTP headers for this request. If headers contains a host header, then host must also match the header value.
     * 
     */
    @Import(name="headers", required=true)
    private List<UrlMapTestHeaderResponse> headers;

    /**
     * @return HTTP headers for this request. If headers contains a host header, then host must also match the header value.
     * 
     */
    public List<UrlMapTestHeaderResponse> headers() {
        return this.headers;
    }

    /**
     * Host portion of the URL. If headers contains a host header, then host must also match the header value.
     * 
     */
    @Import(name="host", required=true)
    private String host;

    /**
     * @return Host portion of the URL. If headers contains a host header, then host must also match the header value.
     * 
     */
    public String host() {
        return this.host;
    }

    /**
     * Path portion of the URL.
     * 
     */
    @Import(name="path", required=true)
    private String path;

    /**
     * @return Path portion of the URL.
     * 
     */
    public String path() {
        return this.path;
    }

    /**
     * Expected BackendService or BackendBucket resource the given URL should be mapped to. The service field cannot be set if expectedRedirectResponseCode is set.
     * 
     */
    @Import(name="service", required=true)
    private String service;

    /**
     * @return Expected BackendService or BackendBucket resource the given URL should be mapped to. The service field cannot be set if expectedRedirectResponseCode is set.
     * 
     */
    public String service() {
        return this.service;
    }

    private UrlMapTestResponse() {}

    private UrlMapTestResponse(UrlMapTestResponse $) {
        this.description = $.description;
        this.expectedOutputUrl = $.expectedOutputUrl;
        this.expectedRedirectResponseCode = $.expectedRedirectResponseCode;
        this.headers = $.headers;
        this.host = $.host;
        this.path = $.path;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UrlMapTestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UrlMapTestResponse $;

        public Builder() {
            $ = new UrlMapTestResponse();
        }

        public Builder(UrlMapTestResponse defaults) {
            $ = new UrlMapTestResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of this test case.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            $.description = description;
            return this;
        }

        /**
         * @param expectedOutputUrl The expected output URL evaluated by the load balancer containing the scheme, host, path and query parameters. For rules that forward requests to backends, the test passes only when expectedOutputUrl matches the request forwarded by the load balancer to backends. For rules with urlRewrite, the test verifies that the forwarded request matches hostRewrite and pathPrefixRewrite in the urlRewrite action. When service is specified, expectedOutputUrl`s scheme is ignored. For rules with urlRedirect, the test passes only if expectedOutputUrl matches the URL in the load balancer&#39;s redirect response. If urlRedirect specifies https_redirect, the test passes only if the scheme in expectedOutputUrl is also set to HTTPS. If urlRedirect specifies strip_query, the test passes only if expectedOutputUrl does not contain any query parameters. expectedOutputUrl is optional when service is specified.
         * 
         * @return builder
         * 
         */
        public Builder expectedOutputUrl(String expectedOutputUrl) {
            $.expectedOutputUrl = expectedOutputUrl;
            return this;
        }

        /**
         * @param expectedRedirectResponseCode For rules with urlRedirect, the test passes only if expectedRedirectResponseCode matches the HTTP status code in load balancer&#39;s redirect response. expectedRedirectResponseCode cannot be set when service is set.
         * 
         * @return builder
         * 
         */
        public Builder expectedRedirectResponseCode(Integer expectedRedirectResponseCode) {
            $.expectedRedirectResponseCode = expectedRedirectResponseCode;
            return this;
        }

        /**
         * @param headers HTTP headers for this request. If headers contains a host header, then host must also match the header value.
         * 
         * @return builder
         * 
         */
        public Builder headers(List<UrlMapTestHeaderResponse> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers HTTP headers for this request. If headers contains a host header, then host must also match the header value.
         * 
         * @return builder
         * 
         */
        public Builder headers(UrlMapTestHeaderResponse... headers) {
            return headers(List.of(headers));
        }

        /**
         * @param host Host portion of the URL. If headers contains a host header, then host must also match the header value.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            $.host = host;
            return this;
        }

        /**
         * @param path Path portion of the URL.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            $.path = path;
            return this;
        }

        /**
         * @param service Expected BackendService or BackendBucket resource the given URL should be mapped to. The service field cannot be set if expectedRedirectResponseCode is set.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            $.service = service;
            return this;
        }

        public UrlMapTestResponse build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.expectedOutputUrl = Objects.requireNonNull($.expectedOutputUrl, "expected parameter 'expectedOutputUrl' to be non-null");
            $.expectedRedirectResponseCode = Objects.requireNonNull($.expectedRedirectResponseCode, "expected parameter 'expectedRedirectResponseCode' to be non-null");
            $.headers = Objects.requireNonNull($.headers, "expected parameter 'headers' to be non-null");
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            return $;
        }
    }

}

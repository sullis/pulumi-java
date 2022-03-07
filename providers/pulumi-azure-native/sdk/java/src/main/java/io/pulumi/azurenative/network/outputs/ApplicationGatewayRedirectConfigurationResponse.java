// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationGatewayRedirectConfigurationResponse {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Include path in the redirected url.
     * 
     */
    private final @Nullable Boolean includePath;
    /**
     * Include query string in the redirected url.
     * 
     */
    private final @Nullable Boolean includeQueryString;
    /**
     * Name of the redirect configuration that is unique within an Application Gateway.
     * 
     */
    private final @Nullable String name;
    /**
     * Path rules specifying redirect configuration.
     * 
     */
    private final @Nullable List<SubResourceResponse> pathRules;
    /**
     * HTTP redirection type.
     * 
     */
    private final @Nullable String redirectType;
    /**
     * Request routing specifying redirect configuration.
     * 
     */
    private final @Nullable List<SubResourceResponse> requestRoutingRules;
    /**
     * Reference to a listener to redirect the request to.
     * 
     */
    private final @Nullable SubResourceResponse targetListener;
    /**
     * Url to redirect the request to.
     * 
     */
    private final @Nullable String targetUrl;
    /**
     * Type of the resource.
     * 
     */
    private final String type;
    /**
     * Url path maps specifying default redirect configuration.
     * 
     */
    private final @Nullable List<SubResourceResponse> urlPathMaps;

    @OutputCustomType.Constructor({"etag","id","includePath","includeQueryString","name","pathRules","redirectType","requestRoutingRules","targetListener","targetUrl","type","urlPathMaps"})
    private ApplicationGatewayRedirectConfigurationResponse(
        String etag,
        @Nullable String id,
        @Nullable Boolean includePath,
        @Nullable Boolean includeQueryString,
        @Nullable String name,
        @Nullable List<SubResourceResponse> pathRules,
        @Nullable String redirectType,
        @Nullable List<SubResourceResponse> requestRoutingRules,
        @Nullable SubResourceResponse targetListener,
        @Nullable String targetUrl,
        String type,
        @Nullable List<SubResourceResponse> urlPathMaps) {
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.includePath = includePath;
        this.includeQueryString = includeQueryString;
        this.name = name;
        this.pathRules = pathRules;
        this.redirectType = redirectType;
        this.requestRoutingRules = requestRoutingRules;
        this.targetListener = targetListener;
        this.targetUrl = targetUrl;
        this.type = Objects.requireNonNull(type);
        this.urlPathMaps = urlPathMaps;
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Include path in the redirected url.
     * 
    */
    public Optional<Boolean> getIncludePath() {
        return Optional.ofNullable(this.includePath);
    }
    /**
     * Include query string in the redirected url.
     * 
    */
    public Optional<Boolean> getIncludeQueryString() {
        return Optional.ofNullable(this.includeQueryString);
    }
    /**
     * Name of the redirect configuration that is unique within an Application Gateway.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Path rules specifying redirect configuration.
     * 
    */
    public List<SubResourceResponse> getPathRules() {
        return this.pathRules == null ? List.of() : this.pathRules;
    }
    /**
     * HTTP redirection type.
     * 
    */
    public Optional<String> getRedirectType() {
        return Optional.ofNullable(this.redirectType);
    }
    /**
     * Request routing specifying redirect configuration.
     * 
    */
    public List<SubResourceResponse> getRequestRoutingRules() {
        return this.requestRoutingRules == null ? List.of() : this.requestRoutingRules;
    }
    /**
     * Reference to a listener to redirect the request to.
     * 
    */
    public Optional<SubResourceResponse> getTargetListener() {
        return Optional.ofNullable(this.targetListener);
    }
    /**
     * Url to redirect the request to.
     * 
    */
    public Optional<String> getTargetUrl() {
        return Optional.ofNullable(this.targetUrl);
    }
    /**
     * Type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Url path maps specifying default redirect configuration.
     * 
    */
    public List<SubResourceResponse> getUrlPathMaps() {
        return this.urlPathMaps == null ? List.of() : this.urlPathMaps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayRedirectConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable Boolean includePath;
        private @Nullable Boolean includeQueryString;
        private @Nullable String name;
        private @Nullable List<SubResourceResponse> pathRules;
        private @Nullable String redirectType;
        private @Nullable List<SubResourceResponse> requestRoutingRules;
        private @Nullable SubResourceResponse targetListener;
        private @Nullable String targetUrl;
        private String type;
        private @Nullable List<SubResourceResponse> urlPathMaps;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayRedirectConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.includePath = defaults.includePath;
    	      this.includeQueryString = defaults.includeQueryString;
    	      this.name = defaults.name;
    	      this.pathRules = defaults.pathRules;
    	      this.redirectType = defaults.redirectType;
    	      this.requestRoutingRules = defaults.requestRoutingRules;
    	      this.targetListener = defaults.targetListener;
    	      this.targetUrl = defaults.targetUrl;
    	      this.type = defaults.type;
    	      this.urlPathMaps = defaults.urlPathMaps;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIncludePath(@Nullable Boolean includePath) {
            this.includePath = includePath;
            return this;
        }

        public Builder setIncludeQueryString(@Nullable Boolean includeQueryString) {
            this.includeQueryString = includeQueryString;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPathRules(@Nullable List<SubResourceResponse> pathRules) {
            this.pathRules = pathRules;
            return this;
        }

        public Builder setRedirectType(@Nullable String redirectType) {
            this.redirectType = redirectType;
            return this;
        }

        public Builder setRequestRoutingRules(@Nullable List<SubResourceResponse> requestRoutingRules) {
            this.requestRoutingRules = requestRoutingRules;
            return this;
        }

        public Builder setTargetListener(@Nullable SubResourceResponse targetListener) {
            this.targetListener = targetListener;
            return this;
        }

        public Builder setTargetUrl(@Nullable String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUrlPathMaps(@Nullable List<SubResourceResponse> urlPathMaps) {
            this.urlPathMaps = urlPathMaps;
            return this;
        }
        public ApplicationGatewayRedirectConfigurationResponse build() {
            return new ApplicationGatewayRedirectConfigurationResponse(etag, id, includePath, includeQueryString, name, pathRules, redirectType, requestRoutingRules, targetListener, targetUrl, type, urlPathMaps);
        }
    }
}
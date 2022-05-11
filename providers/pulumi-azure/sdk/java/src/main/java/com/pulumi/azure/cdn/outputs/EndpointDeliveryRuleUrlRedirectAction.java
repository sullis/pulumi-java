// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointDeliveryRuleUrlRedirectAction {
    /**
     * @return Specifies the fragment part of the URL. This value must not start with a `#`.
     * 
     */
    private final @Nullable String fragment;
    /**
     * @return Specifies the hostname part of the URL.
     * 
     */
    private final @Nullable String hostname;
    /**
     * @return Specifies the path part of the URL. This value must begin with a `/`.
     * 
     */
    private final @Nullable String path;
    /**
     * @return Specifies the protocol part of the URL. Valid values are `Http` and `Https`.
     * 
     */
    private final @Nullable String protocol;
    /**
     * @return Specifies the query string part of the URL. This value must not start with a `?` or `&amp;` and must be in `&lt;key&gt;=&lt;value&gt;` format separated by `&amp;`.
     * 
     */
    private final @Nullable String queryString;
    /**
     * @return Type of the redirect. Valid values are `Found`, `Moved`, `PermanentRedirect` and `TemporaryRedirect`.
     * 
     */
    private final String redirectType;

    @CustomType.Constructor
    private EndpointDeliveryRuleUrlRedirectAction(
        @CustomType.Parameter("fragment") @Nullable String fragment,
        @CustomType.Parameter("hostname") @Nullable String hostname,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("protocol") @Nullable String protocol,
        @CustomType.Parameter("queryString") @Nullable String queryString,
        @CustomType.Parameter("redirectType") String redirectType) {
        this.fragment = fragment;
        this.hostname = hostname;
        this.path = path;
        this.protocol = protocol;
        this.queryString = queryString;
        this.redirectType = redirectType;
    }

    /**
     * @return Specifies the fragment part of the URL. This value must not start with a `#`.
     * 
     */
    public Optional<String> fragment() {
        return Optional.ofNullable(this.fragment);
    }
    /**
     * @return Specifies the hostname part of the URL.
     * 
     */
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * @return Specifies the path part of the URL. This value must begin with a `/`.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return Specifies the protocol part of the URL. Valid values are `Http` and `Https`.
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * @return Specifies the query string part of the URL. This value must not start with a `?` or `&amp;` and must be in `&lt;key&gt;=&lt;value&gt;` format separated by `&amp;`.
     * 
     */
    public Optional<String> queryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * @return Type of the redirect. Valid values are `Found`, `Moved`, `PermanentRedirect` and `TemporaryRedirect`.
     * 
     */
    public String redirectType() {
        return this.redirectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointDeliveryRuleUrlRedirectAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fragment;
        private @Nullable String hostname;
        private @Nullable String path;
        private @Nullable String protocol;
        private @Nullable String queryString;
        private String redirectType;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointDeliveryRuleUrlRedirectAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fragment = defaults.fragment;
    	      this.hostname = defaults.hostname;
    	      this.path = defaults.path;
    	      this.protocol = defaults.protocol;
    	      this.queryString = defaults.queryString;
    	      this.redirectType = defaults.redirectType;
        }

        public Builder fragment(@Nullable String fragment) {
            this.fragment = fragment;
            return this;
        }
        public Builder hostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder queryString(@Nullable String queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder redirectType(String redirectType) {
            this.redirectType = Objects.requireNonNull(redirectType);
            return this;
        }        public EndpointDeliveryRuleUrlRedirectAction build() {
            return new EndpointDeliveryRuleUrlRedirectAction(fragment, hostname, path, protocol, queryString, redirectType);
        }
    }
}

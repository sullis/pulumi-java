// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UrlRedirectActionParametersResponse {
    /**
     * @return Fragment to add to the redirect URL. Fragment is the part of the URL that comes after #. Do not include the #.
     * 
     */
    private final @Nullable String customFragment;
    /**
     * @return Host to redirect. Leave empty to use the incoming host as the destination host.
     * 
     */
    private final @Nullable String customHostname;
    /**
     * @return The full path to redirect. Path cannot be empty and must start with /. Leave empty to use the incoming path as destination path.
     * 
     */
    private final @Nullable String customPath;
    /**
     * @return The set of query strings to be placed in the redirect URL. Setting this value would replace any existing query string; leave empty to preserve the incoming query string. Query string must be in &lt;key&gt;=&lt;value&gt; format. ? and &amp; will be added automatically so do not include them.
     * 
     */
    private final @Nullable String customQueryString;
    /**
     * @return Protocol to use for the redirect. The default value is MatchRequest
     * 
     */
    private final @Nullable String destinationProtocol;
    private final String odataType;
    /**
     * @return The redirect type the rule will use when redirecting traffic.
     * 
     */
    private final String redirectType;

    @CustomType.Constructor
    private UrlRedirectActionParametersResponse(
        @CustomType.Parameter("customFragment") @Nullable String customFragment,
        @CustomType.Parameter("customHostname") @Nullable String customHostname,
        @CustomType.Parameter("customPath") @Nullable String customPath,
        @CustomType.Parameter("customQueryString") @Nullable String customQueryString,
        @CustomType.Parameter("destinationProtocol") @Nullable String destinationProtocol,
        @CustomType.Parameter("odataType") String odataType,
        @CustomType.Parameter("redirectType") String redirectType) {
        this.customFragment = customFragment;
        this.customHostname = customHostname;
        this.customPath = customPath;
        this.customQueryString = customQueryString;
        this.destinationProtocol = destinationProtocol;
        this.odataType = odataType;
        this.redirectType = redirectType;
    }

    /**
     * @return Fragment to add to the redirect URL. Fragment is the part of the URL that comes after #. Do not include the #.
     * 
     */
    public Optional<String> customFragment() {
        return Optional.ofNullable(this.customFragment);
    }
    /**
     * @return Host to redirect. Leave empty to use the incoming host as the destination host.
     * 
     */
    public Optional<String> customHostname() {
        return Optional.ofNullable(this.customHostname);
    }
    /**
     * @return The full path to redirect. Path cannot be empty and must start with /. Leave empty to use the incoming path as destination path.
     * 
     */
    public Optional<String> customPath() {
        return Optional.ofNullable(this.customPath);
    }
    /**
     * @return The set of query strings to be placed in the redirect URL. Setting this value would replace any existing query string; leave empty to preserve the incoming query string. Query string must be in &lt;key&gt;=&lt;value&gt; format. ? and &amp; will be added automatically so do not include them.
     * 
     */
    public Optional<String> customQueryString() {
        return Optional.ofNullable(this.customQueryString);
    }
    /**
     * @return Protocol to use for the redirect. The default value is MatchRequest
     * 
     */
    public Optional<String> destinationProtocol() {
        return Optional.ofNullable(this.destinationProtocol);
    }
    public String odataType() {
        return this.odataType;
    }
    /**
     * @return The redirect type the rule will use when redirecting traffic.
     * 
     */
    public String redirectType() {
        return this.redirectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlRedirectActionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customFragment;
        private @Nullable String customHostname;
        private @Nullable String customPath;
        private @Nullable String customQueryString;
        private @Nullable String destinationProtocol;
        private String odataType;
        private String redirectType;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlRedirectActionParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customFragment = defaults.customFragment;
    	      this.customHostname = defaults.customHostname;
    	      this.customPath = defaults.customPath;
    	      this.customQueryString = defaults.customQueryString;
    	      this.destinationProtocol = defaults.destinationProtocol;
    	      this.odataType = defaults.odataType;
    	      this.redirectType = defaults.redirectType;
        }

        public Builder customFragment(@Nullable String customFragment) {
            this.customFragment = customFragment;
            return this;
        }
        public Builder customHostname(@Nullable String customHostname) {
            this.customHostname = customHostname;
            return this;
        }
        public Builder customPath(@Nullable String customPath) {
            this.customPath = customPath;
            return this;
        }
        public Builder customQueryString(@Nullable String customQueryString) {
            this.customQueryString = customQueryString;
            return this;
        }
        public Builder destinationProtocol(@Nullable String destinationProtocol) {
            this.destinationProtocol = destinationProtocol;
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder redirectType(String redirectType) {
            this.redirectType = Objects.requireNonNull(redirectType);
            return this;
        }        public UrlRedirectActionParametersResponse build() {
            return new UrlRedirectActionParametersResponse(customFragment, customHostname, customPath, customQueryString, destinationProtocol, odataType, redirectType);
        }
    }
}

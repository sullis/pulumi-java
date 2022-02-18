// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.azurenative.botservice.outputs.FacebookPageResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FacebookChannelPropertiesResponse {
    /**
     * Facebook application id
     * 
     */
    private final String appId;
    /**
     * Facebook application secret. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    private final @Nullable String appSecret;
    /**
     * Callback Url
     * 
     */
    private final String callbackUrl;
    /**
     * Whether this channel is enabled for the bot
     * 
     */
    private final Boolean isEnabled;
    /**
     * The list of Facebook pages
     * 
     */
    private final @Nullable List<FacebookPageResponse> pages;
    /**
     * Verify token. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    private final String verifyToken;

    @OutputCustomType.Constructor({"appId","appSecret","callbackUrl","isEnabled","pages","verifyToken"})
    private FacebookChannelPropertiesResponse(
        String appId,
        @Nullable String appSecret,
        String callbackUrl,
        Boolean isEnabled,
        @Nullable List<FacebookPageResponse> pages,
        String verifyToken) {
        this.appId = Objects.requireNonNull(appId);
        this.appSecret = appSecret;
        this.callbackUrl = Objects.requireNonNull(callbackUrl);
        this.isEnabled = Objects.requireNonNull(isEnabled);
        this.pages = pages;
        this.verifyToken = Objects.requireNonNull(verifyToken);
    }

    /**
     * Facebook application id
     * 
     */
    public String getAppId() {
        return this.appId;
    }
    /**
     * Facebook application secret. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    public Optional<String> getAppSecret() {
        return Optional.ofNullable(this.appSecret);
    }
    /**
     * Callback Url
     * 
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }
    /**
     * Whether this channel is enabled for the bot
     * 
     */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * The list of Facebook pages
     * 
     */
    public List<FacebookPageResponse> getPages() {
        return this.pages == null ? List.of() : this.pages;
    }
    /**
     * Verify token. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    public String getVerifyToken() {
        return this.verifyToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FacebookChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appId;
        private @Nullable String appSecret;
        private String callbackUrl;
        private Boolean isEnabled;
        private @Nullable List<FacebookPageResponse> pages;
        private String verifyToken;

        public Builder() {
    	      // Empty
        }

        public Builder(FacebookChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.appSecret = defaults.appSecret;
    	      this.callbackUrl = defaults.callbackUrl;
    	      this.isEnabled = defaults.isEnabled;
    	      this.pages = defaults.pages;
    	      this.verifyToken = defaults.verifyToken;
        }

        public Builder setAppId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }

        public Builder setAppSecret(@Nullable String appSecret) {
            this.appSecret = appSecret;
            return this;
        }

        public Builder setCallbackUrl(String callbackUrl) {
            this.callbackUrl = Objects.requireNonNull(callbackUrl);
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setPages(@Nullable List<FacebookPageResponse> pages) {
            this.pages = pages;
            return this;
        }

        public Builder setVerifyToken(String verifyToken) {
            this.verifyToken = Objects.requireNonNull(verifyToken);
            return this;
        }

        public FacebookChannelPropertiesResponse build() {
            return new FacebookChannelPropertiesResponse(appId, appSecret, callbackUrl, isEnabled, pages, verifyToken);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WebChatSiteResponse {
    /**
     * Whether this site is enabled for DirectLine channel
     * 
     */
    private final Boolean isEnabled;
    /**
     * Whether this site is enabled for preview versions of Webchat
     * 
     */
    private final Boolean isWebchatPreviewEnabled;
    /**
     * Primary key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    private final String key;
    /**
     * Secondary key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    private final String key2;
    /**
     * Site Id
     * 
     */
    private final String siteId;
    /**
     * Site name
     * 
     */
    private final String siteName;

    @OutputCustomType.Constructor({"isEnabled","isWebchatPreviewEnabled","key","key2","siteId","siteName"})
    private WebChatSiteResponse(
        Boolean isEnabled,
        Boolean isWebchatPreviewEnabled,
        String key,
        String key2,
        String siteId,
        String siteName) {
        this.isEnabled = Objects.requireNonNull(isEnabled);
        this.isWebchatPreviewEnabled = Objects.requireNonNull(isWebchatPreviewEnabled);
        this.key = Objects.requireNonNull(key);
        this.key2 = Objects.requireNonNull(key2);
        this.siteId = Objects.requireNonNull(siteId);
        this.siteName = Objects.requireNonNull(siteName);
    }

    /**
     * Whether this site is enabled for DirectLine channel
     * 
     */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Whether this site is enabled for preview versions of Webchat
     * 
     */
    public Boolean getIsWebchatPreviewEnabled() {
        return this.isWebchatPreviewEnabled;
    }
    /**
     * Primary key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * Secondary key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    public String getKey2() {
        return this.key2;
    }
    /**
     * Site Id
     * 
     */
    public String getSiteId() {
        return this.siteId;
    }
    /**
     * Site name
     * 
     */
    public String getSiteName() {
        return this.siteName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebChatSiteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isEnabled;
        private Boolean isWebchatPreviewEnabled;
        private String key;
        private String key2;
        private String siteId;
        private String siteName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebChatSiteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
    	      this.isWebchatPreviewEnabled = defaults.isWebchatPreviewEnabled;
    	      this.key = defaults.key;
    	      this.key2 = defaults.key2;
    	      this.siteId = defaults.siteId;
    	      this.siteName = defaults.siteName;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setIsWebchatPreviewEnabled(Boolean isWebchatPreviewEnabled) {
            this.isWebchatPreviewEnabled = Objects.requireNonNull(isWebchatPreviewEnabled);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey2(String key2) {
            this.key2 = Objects.requireNonNull(key2);
            return this;
        }

        public Builder setSiteId(String siteId) {
            this.siteId = Objects.requireNonNull(siteId);
            return this;
        }

        public Builder setSiteName(String siteName) {
            this.siteName = Objects.requireNonNull(siteName);
            return this;
        }

        public WebChatSiteResponse build() {
            return new WebChatSiteResponse(isEnabled, isWebchatPreviewEnabled, key, key2, siteId, siteName);
        }
    }
}

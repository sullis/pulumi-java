// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.inputs.WebChatSiteResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the Web Chat channel.
 * 
 */
public final class WebChatChannelPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final WebChatChannelPropertiesResponse Empty = new WebChatChannelPropertiesResponse();

    /**
     * The list of Web Chat sites
     * 
     */
    @InputImport(name="sites")
      private final @Nullable List<WebChatSiteResponse> sites;

    public List<WebChatSiteResponse> getSites() {
        return this.sites == null ? List.of() : this.sites;
    }

    /**
     * Web chat control embed code
     * 
     */
    @InputImport(name="webChatEmbedCode", required=true)
      private final String webChatEmbedCode;

    public String getWebChatEmbedCode() {
        return this.webChatEmbedCode;
    }

    public WebChatChannelPropertiesResponse(
        @Nullable List<WebChatSiteResponse> sites,
        String webChatEmbedCode) {
        this.sites = sites;
        this.webChatEmbedCode = Objects.requireNonNull(webChatEmbedCode, "expected parameter 'webChatEmbedCode' to be non-null");
    }

    private WebChatChannelPropertiesResponse() {
        this.sites = List.of();
        this.webChatEmbedCode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebChatChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<WebChatSiteResponse> sites;
        private String webChatEmbedCode;

        public Builder() {
    	      // Empty
        }

        public Builder(WebChatChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sites = defaults.sites;
    	      this.webChatEmbedCode = defaults.webChatEmbedCode;
        }

        public Builder setSites(@Nullable List<WebChatSiteResponse> sites) {
            this.sites = sites;
            return this;
        }

        public Builder setWebChatEmbedCode(String webChatEmbedCode) {
            this.webChatEmbedCode = Objects.requireNonNull(webChatEmbedCode);
            return this;
        }
        public WebChatChannelPropertiesResponse build() {
            return new WebChatChannelPropertiesResponse(sites, webChatEmbedCode);
        }
    }
}
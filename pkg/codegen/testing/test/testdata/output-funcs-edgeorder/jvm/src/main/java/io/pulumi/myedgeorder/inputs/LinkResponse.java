// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.myedgeorder.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Returns link related to the product
 * 
 */
public final class LinkResponse extends io.pulumi.resources.InvokeArgs {

    public static final LinkResponse Empty = new LinkResponse();

    /**
     * Type of link
     * 
     */
    @InputImport(name="linkType", required=true)
      private final String linkType;

    public String getLinkType() {
        return this.linkType;
    }

    /**
     * Url of the link
     * 
     */
    @InputImport(name="linkUrl", required=true)
      private final String linkUrl;

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public LinkResponse(
        String linkType,
        String linkUrl) {
        this.linkType = Objects.requireNonNull(linkType, "expected parameter 'linkType' to be non-null");
        this.linkUrl = Objects.requireNonNull(linkUrl, "expected parameter 'linkUrl' to be non-null");
    }

    private LinkResponse() {
        this.linkType = null;
        this.linkUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String linkType;
        private String linkUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkType = defaults.linkType;
    	      this.linkUrl = defaults.linkUrl;
        }

        public Builder setLinkType(String linkType) {
            this.linkType = Objects.requireNonNull(linkType);
            return this;
        }

        public Builder setLinkUrl(String linkUrl) {
            this.linkUrl = Objects.requireNonNull(linkUrl);
            return this;
        }
        public LinkResponse build() {
            return new LinkResponse(linkType, linkUrl);
        }
    }
}
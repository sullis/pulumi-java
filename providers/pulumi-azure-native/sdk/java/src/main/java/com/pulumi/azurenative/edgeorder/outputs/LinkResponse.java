// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LinkResponse {
    /**
     * @return Type of link
     * 
     */
    private final String linkType;
    /**
     * @return Url of the link
     * 
     */
    private final String linkUrl;

    @CustomType.Constructor
    private LinkResponse(
        @CustomType.Parameter("linkType") String linkType,
        @CustomType.Parameter("linkUrl") String linkUrl) {
        this.linkType = linkType;
        this.linkUrl = linkUrl;
    }

    /**
     * @return Type of link
     * 
     */
    public String linkType() {
        return this.linkType;
    }
    /**
     * @return Url of the link
     * 
     */
    public String linkUrl() {
        return this.linkUrl;
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

        public Builder linkType(String linkType) {
            this.linkType = Objects.requireNonNull(linkType);
            return this;
        }
        public Builder linkUrl(String linkUrl) {
            this.linkUrl = Objects.requireNonNull(linkUrl);
            return this;
        }        public LinkResponse build() {
            return new LinkResponse(linkType, linkUrl);
        }
    }
}

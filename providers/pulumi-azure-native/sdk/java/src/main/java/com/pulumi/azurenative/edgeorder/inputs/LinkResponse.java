// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Returns link related to the product
 * 
 */
public final class LinkResponse extends com.pulumi.resources.InvokeArgs {

    public static final LinkResponse Empty = new LinkResponse();

    /**
     * Type of link
     * 
     */
    @Import(name="linkType", required=true)
    private String linkType;

    /**
     * @return Type of link
     * 
     */
    public String linkType() {
        return this.linkType;
    }

    /**
     * Url of the link
     * 
     */
    @Import(name="linkUrl", required=true)
    private String linkUrl;

    /**
     * @return Url of the link
     * 
     */
    public String linkUrl() {
        return this.linkUrl;
    }

    private LinkResponse() {}

    private LinkResponse(LinkResponse $) {
        this.linkType = $.linkType;
        this.linkUrl = $.linkUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkResponse $;

        public Builder() {
            $ = new LinkResponse();
        }

        public Builder(LinkResponse defaults) {
            $ = new LinkResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param linkType Type of link
         * 
         * @return builder
         * 
         */
        public Builder linkType(String linkType) {
            $.linkType = linkType;
            return this;
        }

        /**
         * @param linkUrl Url of the link
         * 
         * @return builder
         * 
         */
        public Builder linkUrl(String linkUrl) {
            $.linkUrl = linkUrl;
            return this;
        }

        public LinkResponse build() {
            $.linkType = Objects.requireNonNull($.linkType, "expected parameter 'linkType' to be non-null");
            $.linkUrl = Objects.requireNonNull($.linkUrl, "expected parameter 'linkUrl' to be non-null");
            return $;
        }
    }

}

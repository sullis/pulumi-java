// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetLaunchTemplateMetadataOption extends com.pulumi.resources.InvokeArgs {

    public static final GetLaunchTemplateMetadataOption Empty = new GetLaunchTemplateMetadataOption();

    /**
     * The state of the metadata service: `enabled`, `disabled`.
     * 
     */
    @Import(name="httpEndpoint", required=true)
    private String httpEndpoint;

    /**
     * @return The state of the metadata service: `enabled`, `disabled`.
     * 
     */
    public String httpEndpoint() {
        return this.httpEndpoint;
    }

    /**
     * The state of IPv6 endpoint for the instance metadata service: `enabled`, `disabled`.
     * 
     */
    @Import(name="httpProtocolIpv6", required=true)
    private String httpProtocolIpv6;

    /**
     * @return The state of IPv6 endpoint for the instance metadata service: `enabled`, `disabled`.
     * 
     */
    public String httpProtocolIpv6() {
        return this.httpProtocolIpv6;
    }

    /**
     * The desired HTTP PUT response hop limit for instance metadata requests.
     * 
     */
    @Import(name="httpPutResponseHopLimit", required=true)
    private Integer httpPutResponseHopLimit;

    /**
     * @return The desired HTTP PUT response hop limit for instance metadata requests.
     * 
     */
    public Integer httpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    /**
     * If session tokens are required: `optional`, `required`.
     * 
     */
    @Import(name="httpTokens", required=true)
    private String httpTokens;

    /**
     * @return If session tokens are required: `optional`, `required`.
     * 
     */
    public String httpTokens() {
        return this.httpTokens;
    }

    /**
     * If access to instance tags is allowed from the metadata service: `enabled`, `disabled`.
     * 
     */
    @Import(name="instanceMetadataTags", required=true)
    private String instanceMetadataTags;

    /**
     * @return If access to instance tags is allowed from the metadata service: `enabled`, `disabled`.
     * 
     */
    public String instanceMetadataTags() {
        return this.instanceMetadataTags;
    }

    private GetLaunchTemplateMetadataOption() {}

    private GetLaunchTemplateMetadataOption(GetLaunchTemplateMetadataOption $) {
        this.httpEndpoint = $.httpEndpoint;
        this.httpProtocolIpv6 = $.httpProtocolIpv6;
        this.httpPutResponseHopLimit = $.httpPutResponseHopLimit;
        this.httpTokens = $.httpTokens;
        this.instanceMetadataTags = $.instanceMetadataTags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLaunchTemplateMetadataOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLaunchTemplateMetadataOption $;

        public Builder() {
            $ = new GetLaunchTemplateMetadataOption();
        }

        public Builder(GetLaunchTemplateMetadataOption defaults) {
            $ = new GetLaunchTemplateMetadataOption(Objects.requireNonNull(defaults));
        }

        /**
         * @param httpEndpoint The state of the metadata service: `enabled`, `disabled`.
         * 
         * @return builder
         * 
         */
        public Builder httpEndpoint(String httpEndpoint) {
            $.httpEndpoint = httpEndpoint;
            return this;
        }

        /**
         * @param httpProtocolIpv6 The state of IPv6 endpoint for the instance metadata service: `enabled`, `disabled`.
         * 
         * @return builder
         * 
         */
        public Builder httpProtocolIpv6(String httpProtocolIpv6) {
            $.httpProtocolIpv6 = httpProtocolIpv6;
            return this;
        }

        /**
         * @param httpPutResponseHopLimit The desired HTTP PUT response hop limit for instance metadata requests.
         * 
         * @return builder
         * 
         */
        public Builder httpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
            $.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }

        /**
         * @param httpTokens If session tokens are required: `optional`, `required`.
         * 
         * @return builder
         * 
         */
        public Builder httpTokens(String httpTokens) {
            $.httpTokens = httpTokens;
            return this;
        }

        /**
         * @param instanceMetadataTags If access to instance tags is allowed from the metadata service: `enabled`, `disabled`.
         * 
         * @return builder
         * 
         */
        public Builder instanceMetadataTags(String instanceMetadataTags) {
            $.instanceMetadataTags = instanceMetadataTags;
            return this;
        }

        public GetLaunchTemplateMetadataOption build() {
            $.httpEndpoint = Objects.requireNonNull($.httpEndpoint, "expected parameter 'httpEndpoint' to be non-null");
            $.httpProtocolIpv6 = Objects.requireNonNull($.httpProtocolIpv6, "expected parameter 'httpProtocolIpv6' to be non-null");
            $.httpPutResponseHopLimit = Objects.requireNonNull($.httpPutResponseHopLimit, "expected parameter 'httpPutResponseHopLimit' to be non-null");
            $.httpTokens = Objects.requireNonNull($.httpTokens, "expected parameter 'httpTokens' to be non-null");
            $.instanceMetadataTags = Objects.requireNonNull($.instanceMetadataTags, "expected parameter 'instanceMetadataTags' to be non-null");
            return $;
        }
    }

}

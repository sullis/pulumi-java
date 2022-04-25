// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudchannel_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudchannel_v1.outputs.GoogleCloudChannelV1CloudIdentityInfoResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetChannelPartnerLinkResult {
    /**
     * @return Cloud Identity info of the channel partner (IR).
     * 
     */
    private final GoogleCloudChannelV1CloudIdentityInfoResponse channelPartnerCloudIdentityInfo;
    /**
     * @return Timestamp of when the channel partner link is created.
     * 
     */
    private final String createTime;
    /**
     * @return URI of the web page where partner accepts the link invitation.
     * 
     */
    private final String inviteLinkUri;
    /**
     * @return State of the channel partner link.
     * 
     */
    private final String linkState;
    /**
     * @return Resource name for the channel partner link, in the format accounts/{account_id}/channelPartnerLinks/{id}.
     * 
     */
    private final String name;
    /**
     * @return Public identifier that a customer must use to generate a transfer token to move to this distributor-reseller combination.
     * 
     */
    private final String publicId;
    /**
     * @return Cloud Identity ID of the linked reseller.
     * 
     */
    private final String resellerCloudIdentityId;
    /**
     * @return Timestamp of when the channel partner link is updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetChannelPartnerLinkResult(
        @CustomType.Parameter("channelPartnerCloudIdentityInfo") GoogleCloudChannelV1CloudIdentityInfoResponse channelPartnerCloudIdentityInfo,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("inviteLinkUri") String inviteLinkUri,
        @CustomType.Parameter("linkState") String linkState,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("publicId") String publicId,
        @CustomType.Parameter("resellerCloudIdentityId") String resellerCloudIdentityId,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.channelPartnerCloudIdentityInfo = channelPartnerCloudIdentityInfo;
        this.createTime = createTime;
        this.inviteLinkUri = inviteLinkUri;
        this.linkState = linkState;
        this.name = name;
        this.publicId = publicId;
        this.resellerCloudIdentityId = resellerCloudIdentityId;
        this.updateTime = updateTime;
    }

    /**
     * @return Cloud Identity info of the channel partner (IR).
     * 
     */
    public GoogleCloudChannelV1CloudIdentityInfoResponse channelPartnerCloudIdentityInfo() {
        return this.channelPartnerCloudIdentityInfo;
    }
    /**
     * @return Timestamp of when the channel partner link is created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return URI of the web page where partner accepts the link invitation.
     * 
     */
    public String inviteLinkUri() {
        return this.inviteLinkUri;
    }
    /**
     * @return State of the channel partner link.
     * 
     */
    public String linkState() {
        return this.linkState;
    }
    /**
     * @return Resource name for the channel partner link, in the format accounts/{account_id}/channelPartnerLinks/{id}.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Public identifier that a customer must use to generate a transfer token to move to this distributor-reseller combination.
     * 
     */
    public String publicId() {
        return this.publicId;
    }
    /**
     * @return Cloud Identity ID of the linked reseller.
     * 
     */
    public String resellerCloudIdentityId() {
        return this.resellerCloudIdentityId;
    }
    /**
     * @return Timestamp of when the channel partner link is updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChannelPartnerLinkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudChannelV1CloudIdentityInfoResponse channelPartnerCloudIdentityInfo;
        private String createTime;
        private String inviteLinkUri;
        private String linkState;
        private String name;
        private String publicId;
        private String resellerCloudIdentityId;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetChannelPartnerLinkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelPartnerCloudIdentityInfo = defaults.channelPartnerCloudIdentityInfo;
    	      this.createTime = defaults.createTime;
    	      this.inviteLinkUri = defaults.inviteLinkUri;
    	      this.linkState = defaults.linkState;
    	      this.name = defaults.name;
    	      this.publicId = defaults.publicId;
    	      this.resellerCloudIdentityId = defaults.resellerCloudIdentityId;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder channelPartnerCloudIdentityInfo(GoogleCloudChannelV1CloudIdentityInfoResponse channelPartnerCloudIdentityInfo) {
            this.channelPartnerCloudIdentityInfo = Objects.requireNonNull(channelPartnerCloudIdentityInfo);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder inviteLinkUri(String inviteLinkUri) {
            this.inviteLinkUri = Objects.requireNonNull(inviteLinkUri);
            return this;
        }
        public Builder linkState(String linkState) {
            this.linkState = Objects.requireNonNull(linkState);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder publicId(String publicId) {
            this.publicId = Objects.requireNonNull(publicId);
            return this;
        }
        public Builder resellerCloudIdentityId(String resellerCloudIdentityId) {
            this.resellerCloudIdentityId = Objects.requireNonNull(resellerCloudIdentityId);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetChannelPartnerLinkResult build() {
            return new GetChannelPartnerLinkResult(channelPartnerCloudIdentityInfo, createTime, inviteLinkUri, linkState, name, publicId, resellerCloudIdentityId, updateTime);
        }
    }
}

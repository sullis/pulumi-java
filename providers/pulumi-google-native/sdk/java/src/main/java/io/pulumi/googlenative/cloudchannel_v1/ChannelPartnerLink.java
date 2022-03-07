// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudchannel_v1.ChannelPartnerLinkArgs;
import io.pulumi.googlenative.cloudchannel_v1.outputs.GoogleCloudChannelV1CloudIdentityInfoResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Initiates a channel partner link between a distributor and a reseller, or between resellers in an n-tier reseller channel. Invited partners need to follow the invite_link_uri provided in the response to accept. After accepting the invitation, a link is set up between the two parties. You must be a distributor to call this method. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * ALREADY_EXISTS: The ChannelPartnerLink sent in the request already exists. * NOT_FOUND: No Cloud Identity customer exists for provided domain. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The new ChannelPartnerLink resource.
 * Auto-naming is currently not supported for this resource.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:cloudchannel/v1:ChannelPartnerLink")
public class ChannelPartnerLink extends io.pulumi.resources.CustomResource {
    /**
     * Cloud Identity info of the channel partner (IR).
     * 
     */
    @OutputExport(name="channelPartnerCloudIdentityInfo", type=GoogleCloudChannelV1CloudIdentityInfoResponse.class, parameters={})
    private Output<GoogleCloudChannelV1CloudIdentityInfoResponse> channelPartnerCloudIdentityInfo;

    /**
     * @return Cloud Identity info of the channel partner (IR).
     * 
     */
    public Output<GoogleCloudChannelV1CloudIdentityInfoResponse> getChannelPartnerCloudIdentityInfo() {
        return this.channelPartnerCloudIdentityInfo;
    }
    /**
     * Timestamp of when the channel partner link is created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Timestamp of when the channel partner link is created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * URI of the web page where partner accepts the link invitation.
     * 
     */
    @OutputExport(name="inviteLinkUri", type=String.class, parameters={})
    private Output<String> inviteLinkUri;

    /**
     * @return URI of the web page where partner accepts the link invitation.
     * 
     */
    public Output<String> getInviteLinkUri() {
        return this.inviteLinkUri;
    }
    /**
     * State of the channel partner link.
     * 
     */
    @OutputExport(name="linkState", type=String.class, parameters={})
    private Output<String> linkState;

    /**
     * @return State of the channel partner link.
     * 
     */
    public Output<String> getLinkState() {
        return this.linkState;
    }
    /**
     * Resource name for the channel partner link, in the format accounts/{account_id}/channelPartnerLinks/{id}.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name for the channel partner link, in the format accounts/{account_id}/channelPartnerLinks/{id}.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Public identifier that a customer must use to generate a transfer token to move to this distributor-reseller combination.
     * 
     */
    @OutputExport(name="publicId", type=String.class, parameters={})
    private Output<String> publicId;

    /**
     * @return Public identifier that a customer must use to generate a transfer token to move to this distributor-reseller combination.
     * 
     */
    public Output<String> getPublicId() {
        return this.publicId;
    }
    /**
     * Cloud Identity ID of the linked reseller.
     * 
     */
    @OutputExport(name="resellerCloudIdentityId", type=String.class, parameters={})
    private Output<String> resellerCloudIdentityId;

    /**
     * @return Cloud Identity ID of the linked reseller.
     * 
     */
    public Output<String> getResellerCloudIdentityId() {
        return this.resellerCloudIdentityId;
    }
    /**
     * Timestamp of when the channel partner link is updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Timestamp of when the channel partner link is updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(ChannelPartnerLinkArgs.Builder a);
    }
    private static io.pulumi.googlenative.cloudchannel_v1.ChannelPartnerLinkArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.cloudchannel_v1.ChannelPartnerLinkArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ChannelPartnerLink(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ChannelPartnerLink(String name) {
        this(name, ChannelPartnerLinkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ChannelPartnerLink(String name, ChannelPartnerLinkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ChannelPartnerLink(String name, ChannelPartnerLinkArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudchannel/v1:ChannelPartnerLink", name, args == null ? ChannelPartnerLinkArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ChannelPartnerLink(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudchannel/v1:ChannelPartnerLink", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ChannelPartnerLink get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ChannelPartnerLink(name, id, options);
    }
}
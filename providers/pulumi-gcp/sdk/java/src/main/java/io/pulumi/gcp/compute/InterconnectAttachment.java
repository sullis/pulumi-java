// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.InterconnectAttachmentArgs;
import io.pulumi.gcp.compute.inputs.InterconnectAttachmentState;
import io.pulumi.gcp.compute.outputs.InterconnectAttachmentPrivateInterconnectInfo;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents an InterconnectAttachment (VLAN attachment) resource. For more
 * information, see Creating VLAN Attachments.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * InterconnectAttachment can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/interconnectAttachment:InterconnectAttachment default projects/{{project}}/regions/{{region}}/interconnectAttachments/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/interconnectAttachment:InterconnectAttachment default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/interconnectAttachment:InterconnectAttachment default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/interconnectAttachment:InterconnectAttachment default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/interconnectAttachment:InterconnectAttachment")
public class InterconnectAttachment extends io.pulumi.resources.CustomResource {
    /**
     * Whether the VLAN attachment is enabled or disabled.  When using
     * PARTNER type this will Pre-Activate the interconnect attachment
     * 
     */
    @OutputExport(name="adminEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> adminEnabled;

    /**
     * @return Whether the VLAN attachment is enabled or disabled.  When using
     * PARTNER type this will Pre-Activate the interconnect attachment
     * 
     */
    public Output</* @Nullable */ Boolean> getAdminEnabled() {
        return this.adminEnabled;
    }
    /**
     * Provisioned bandwidth capacity for the interconnect attachment.
     * For attachments of type DEDICATED, the user can set the bandwidth.
     * For attachments of type PARTNER, the Google Partner that is operating the interconnect must set the bandwidth.
     * Output only for PARTNER type, mutable for PARTNER_PROVIDER and DEDICATED,
     * Defaults to BPS_10G
     * Possible values are `BPS_50M`, `BPS_100M`, `BPS_200M`, `BPS_300M`, `BPS_400M`, `BPS_500M`, `BPS_1G`, `BPS_2G`, `BPS_5G`, `BPS_10G`, `BPS_20G`, and `BPS_50G`.
     * 
     */
    @OutputExport(name="bandwidth", type=String.class, parameters={})
    private Output<String> bandwidth;

    /**
     * @return Provisioned bandwidth capacity for the interconnect attachment.
     * For attachments of type DEDICATED, the user can set the bandwidth.
     * For attachments of type PARTNER, the Google Partner that is operating the interconnect must set the bandwidth.
     * Output only for PARTNER type, mutable for PARTNER_PROVIDER and DEDICATED,
     * Defaults to BPS_10G
     * Possible values are `BPS_50M`, `BPS_100M`, `BPS_200M`, `BPS_300M`, `BPS_400M`, `BPS_500M`, `BPS_1G`, `BPS_2G`, `BPS_5G`, `BPS_10G`, `BPS_20G`, and `BPS_50G`.
     * 
     */
    public Output<String> getBandwidth() {
        return this.bandwidth;
    }
    /**
     * Up to 16 candidate prefixes that can be used to restrict the allocation
     * of cloudRouterIpAddress and customerRouterIpAddress for this attachment.
     * All prefixes must be within link-local address space (169.254.0.0/16)
     * and must be /29 or shorter (/28, /27, etc). Google will attempt to select
     * an unused /29 from the supplied candidate prefix(es). The request will
     * fail if all possible /29s are in use on Google's edge. If not supplied,
     * Google will randomly select an unused /29 from all of link-local space.
     * 
     */
    @OutputExport(name="candidateSubnets", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> candidateSubnets;

    /**
     * @return Up to 16 candidate prefixes that can be used to restrict the allocation
     * of cloudRouterIpAddress and customerRouterIpAddress for this attachment.
     * All prefixes must be within link-local address space (169.254.0.0/16)
     * and must be /29 or shorter (/28, /27, etc). Google will attempt to select
     * an unused /29 from the supplied candidate prefix(es). The request will
     * fail if all possible /29s are in use on Google's edge. If not supplied,
     * Google will randomly select an unused /29 from all of link-local space.
     * 
     */
    public Output</* @Nullable */ List<String>> getCandidateSubnets() {
        return this.candidateSubnets;
    }
    /**
     * IPv4 address + prefix length to be configured on Cloud Router Interface for this interconnect attachment.
     * 
     */
    @OutputExport(name="cloudRouterIpAddress", type=String.class, parameters={})
    private Output<String> cloudRouterIpAddress;

    /**
     * @return IPv4 address + prefix length to be configured on Cloud Router Interface for this interconnect attachment.
     * 
     */
    public Output<String> getCloudRouterIpAddress() {
        return this.cloudRouterIpAddress;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * IPv4 address + prefix length to be configured on the customer router subinterface for this interconnect attachment.
     * 
     */
    @OutputExport(name="customerRouterIpAddress", type=String.class, parameters={})
    private Output<String> customerRouterIpAddress;

    /**
     * @return IPv4 address + prefix length to be configured on the customer router subinterface for this interconnect attachment.
     * 
     */
    public Output<String> getCustomerRouterIpAddress() {
        return this.customerRouterIpAddress;
    }
    /**
     * An optional description of this resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Desired availability domain for the attachment. Only available for type
     * PARTNER, at creation time. For improved reliability, customers should
     * configure a pair of attachments with one per availability domain. The
     * selected availability domain will be provided to the Partner via the
     * pairing key so that the provisioned circuit will lie in the specified
     * domain. If not specified, the value will default to AVAILABILITY_DOMAIN_ANY.
     * 
     */
    @OutputExport(name="edgeAvailabilityDomain", type=String.class, parameters={})
    private Output<String> edgeAvailabilityDomain;

    /**
     * @return Desired availability domain for the attachment. Only available for type
     * PARTNER, at creation time. For improved reliability, customers should
     * configure a pair of attachments with one per availability domain. The
     * selected availability domain will be provided to the Partner via the
     * pairing key so that the provisioned circuit will lie in the specified
     * domain. If not specified, the value will default to AVAILABILITY_DOMAIN_ANY.
     * 
     */
    public Output<String> getEdgeAvailabilityDomain() {
        return this.edgeAvailabilityDomain;
    }
    /**
     * Indicates the user-supplied encryption option of this interconnect
     * attachment:
     * NONE is the default value, which means that the attachment carries
     * unencrypted traffic. VMs can send traffic to, or receive traffic
     * from, this type of attachment.
     * IPSEC indicates that the attachment carries only traffic encrypted by
     * an IPsec device such as an HA VPN gateway. VMs cannot directly send
     * traffic to, or receive traffic from, such an attachment. To use
     * IPsec-encrypted Cloud Interconnect create the attachment using this
     * option.
     * Not currently available publicly.
     * Default value is `NONE`.
     * Possible values are `NONE` and `IPSEC`.
     * 
     */
    @OutputExport(name="encryption", type=String.class, parameters={})
    private Output</* @Nullable */ String> encryption;

    /**
     * @return Indicates the user-supplied encryption option of this interconnect
     * attachment:
     * NONE is the default value, which means that the attachment carries
     * unencrypted traffic. VMs can send traffic to, or receive traffic
     * from, this type of attachment.
     * IPSEC indicates that the attachment carries only traffic encrypted by
     * an IPsec device such as an HA VPN gateway. VMs cannot directly send
     * traffic to, or receive traffic from, such an attachment. To use
     * IPsec-encrypted Cloud Interconnect create the attachment using this
     * option.
     * Not currently available publicly.
     * Default value is `NONE`.
     * Possible values are `NONE` and `IPSEC`.
     * 
     */
    public Output</* @Nullable */ String> getEncryption() {
        return this.encryption;
    }
    /**
     * Google reference ID, to be used when raising support tickets with Google or otherwise to debug backend connectivity
     * issues.
     * 
     */
    @OutputExport(name="googleReferenceId", type=String.class, parameters={})
    private Output<String> googleReferenceId;

    /**
     * @return Google reference ID, to be used when raising support tickets with Google or otherwise to debug backend connectivity
     * issues.
     * 
     */
    public Output<String> getGoogleReferenceId() {
        return this.googleReferenceId;
    }
    /**
     * URL of the underlying Interconnect object that this attachment's
     * traffic will traverse through. Required if type is DEDICATED, must not
     * be set if type is PARTNER.
     * 
     */
    @OutputExport(name="interconnect", type=String.class, parameters={})
    private Output</* @Nullable */ String> interconnect;

    /**
     * @return URL of the underlying Interconnect object that this attachment's
     * traffic will traverse through. Required if type is DEDICATED, must not
     * be set if type is PARTNER.
     * 
     */
    public Output</* @Nullable */ String> getInterconnect() {
        return this.interconnect;
    }
    /**
     * URL of addresses that have been reserved for the interconnect
     * attachment, Used only for interconnect attachment that has the
     * encryption option as IPSEC.
     * The addresses must be RFC 1918 IP address ranges. When creating HA
     * VPN gateway over the interconnect attachment, if the attachment is
     * configured to use an RFC 1918 IP address, then the VPN gateway's IP
     * address will be allocated from the IP address range specified
     * here.
     * For example, if the HA VPN gateway's interface 0 is paired to this
     * interconnect attachment, then an RFC 1918 IP address for the VPN
     * gateway interface 0 will be allocated from the IP address specified
     * for this interconnect attachment.
     * If this field is not specified for interconnect attachment that has
     * encryption option as IPSEC, later on when creating HA VPN gateway on
     * this interconnect attachment, the HA VPN gateway's IP address will be
     * allocated from regional external IP address pool.
     * 
     */
    @OutputExport(name="ipsecInternalAddresses", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> ipsecInternalAddresses;

    /**
     * @return URL of addresses that have been reserved for the interconnect
     * attachment, Used only for interconnect attachment that has the
     * encryption option as IPSEC.
     * The addresses must be RFC 1918 IP address ranges. When creating HA
     * VPN gateway over the interconnect attachment, if the attachment is
     * configured to use an RFC 1918 IP address, then the VPN gateway's IP
     * address will be allocated from the IP address range specified
     * here.
     * For example, if the HA VPN gateway's interface 0 is paired to this
     * interconnect attachment, then an RFC 1918 IP address for the VPN
     * gateway interface 0 will be allocated from the IP address specified
     * for this interconnect attachment.
     * If this field is not specified for interconnect attachment that has
     * encryption option as IPSEC, later on when creating HA VPN gateway on
     * this interconnect attachment, the HA VPN gateway's IP address will be
     * allocated from regional external IP address pool.
     * 
     */
    public Output</* @Nullable */ List<String>> getIpsecInternalAddresses() {
        return this.ipsecInternalAddresses;
    }
    /**
     * Maximum Transmission Unit (MTU), in bytes, of packets passing through
     * this interconnect attachment. Currently, only 1440 and 1500 are allowed. If not specified, the value will default to 1440.
     * 
     */
    @OutputExport(name="mtu", type=String.class, parameters={})
    private Output<String> mtu;

    /**
     * @return Maximum Transmission Unit (MTU), in bytes, of packets passing through
     * this interconnect attachment. Currently, only 1440 and 1500 are allowed. If not specified, the value will default to 1440.
     * 
     */
    public Output<String> getMtu() {
        return this.mtu;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The
     * name must be 1-63 characters long, and comply with RFC1035. Specifically, the
     * name must be 1-63 characters long and match the regular expression
     * `a-z?` which means the first character must be a
     * lowercase letter, and all following characters must be a dash, lowercase
     * letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The
     * name must be 1-63 characters long, and comply with RFC1035. Specifically, the
     * name must be 1-63 characters long and match the regular expression
     * `a-z?` which means the first character must be a
     * lowercase letter, and all following characters must be a dash, lowercase
     * letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * [Output only for type PARTNER. Not present for DEDICATED]. The opaque identifier of an PARTNER attachment used to
     * initiate provisioning with a selected partner. Of the form "XXXXX/region/domain"
     * 
     */
    @OutputExport(name="pairingKey", type=String.class, parameters={})
    private Output<String> pairingKey;

    /**
     * @return [Output only for type PARTNER. Not present for DEDICATED]. The opaque identifier of an PARTNER attachment used to
     * initiate provisioning with a selected partner. Of the form "XXXXX/region/domain"
     * 
     */
    public Output<String> getPairingKey() {
        return this.pairingKey;
    }
    /**
     * [Output only for type PARTNER. Not present for DEDICATED]. Optional BGP ASN for the router that should be supplied by a
     * layer 3 Partner if they configured BGP on behalf of the customer.
     * 
     */
    @OutputExport(name="partnerAsn", type=String.class, parameters={})
    private Output<String> partnerAsn;

    /**
     * @return [Output only for type PARTNER. Not present for DEDICATED]. Optional BGP ASN for the router that should be supplied by a
     * layer 3 Partner if they configured BGP on behalf of the customer.
     * 
     */
    public Output<String> getPartnerAsn() {
        return this.partnerAsn;
    }
    /**
     * Information specific to an InterconnectAttachment. This property is populated if the interconnect that this is attached
     * to is of type DEDICATED.
     * 
     */
    @OutputExport(name="privateInterconnectInfos", type=List.class, parameters={InterconnectAttachmentPrivateInterconnectInfo.class})
    private Output<List<InterconnectAttachmentPrivateInterconnectInfo>> privateInterconnectInfos;

    /**
     * @return Information specific to an InterconnectAttachment. This property is populated if the interconnect that this is attached
     * to is of type DEDICATED.
     * 
     */
    public Output<List<InterconnectAttachmentPrivateInterconnectInfo>> getPrivateInterconnectInfos() {
        return this.privateInterconnectInfos;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Region where the regional interconnect attachment resides.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return Region where the regional interconnect attachment resides.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * URL of the cloud router to be used for dynamic routing. This router must be in
     * the same region as this InterconnectAttachment. The InterconnectAttachment will
     * automatically connect the Interconnect to the network & region within which the
     * Cloud Router is configured.
     * 
     */
    @OutputExport(name="router", type=String.class, parameters={})
    private Output<String> router;

    /**
     * @return URL of the cloud router to be used for dynamic routing. This router must be in
     * the same region as this InterconnectAttachment. The InterconnectAttachment will
     * automatically connect the Interconnect to the network & region within which the
     * Cloud Router is configured.
     * 
     */
    public Output<String> getRouter() {
        return this.router;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * [Output Only] The current state of this attachment's functionality.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return [Output Only] The current state of this attachment's functionality.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The type of InterconnectAttachment you wish to create. Defaults to
     * DEDICATED.
     * Possible values are `DEDICATED`, `PARTNER`, and `PARTNER_PROVIDER`.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of InterconnectAttachment you wish to create. Defaults to
     * DEDICATED.
     * Possible values are `DEDICATED`, `PARTNER`, and `PARTNER_PROVIDER`.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The IEEE 802.1Q VLAN tag for this attachment, in the range 2-4094. When
     * using PARTNER type this will be managed upstream.
     * 
     */
    @OutputExport(name="vlanTag8021q", type=Integer.class, parameters={})
    private Output<Integer> vlanTag8021q;

    /**
     * @return The IEEE 802.1Q VLAN tag for this attachment, in the range 2-4094. When
     * using PARTNER type this will be managed upstream.
     * 
     */
    public Output<Integer> getVlanTag8021q() {
        return this.vlanTag8021q;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InterconnectAttachment(String name, InterconnectAttachmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/interconnectAttachment:InterconnectAttachment", name, args == null ? InterconnectAttachmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private InterconnectAttachment(String name, Input<String> id, @Nullable InterconnectAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/interconnectAttachment:InterconnectAttachment", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static InterconnectAttachment get(String name, Input<String> id, @Nullable InterconnectAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InterconnectAttachment(name, id, state, options);
    }
}

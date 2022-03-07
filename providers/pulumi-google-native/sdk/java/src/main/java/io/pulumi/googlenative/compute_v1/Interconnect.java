// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.InterconnectArgs;
import io.pulumi.googlenative.compute_v1.outputs.InterconnectCircuitInfoResponse;
import io.pulumi.googlenative.compute_v1.outputs.InterconnectOutageNotificationResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a Interconnect in the specified project using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/v1:Interconnect")
public class Interconnect extends io.pulumi.resources.CustomResource {
    /**
     * Administrative status of the interconnect. When this is set to true, the Interconnect is functional and can carry traffic. When set to false, no packets can be carried over the interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
     * 
     */
    @OutputExport(name="adminEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> adminEnabled;

    /**
     * @return Administrative status of the interconnect. When this is set to true, the Interconnect is functional and can carry traffic. When set to false, no packets can be carried over the interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
     * 
     */
    public Output<Boolean> getAdminEnabled() {
        return this.adminEnabled;
    }
    /**
     * A list of CircuitInfo objects, that describe the individual circuits in this LAG.
     * 
     */
    @OutputExport(name="circuitInfos", type=List.class, parameters={InterconnectCircuitInfoResponse.class})
    private Output<List<InterconnectCircuitInfoResponse>> circuitInfos;

    /**
     * @return A list of CircuitInfo objects, that describe the individual circuits in this LAG.
     * 
     */
    public Output<List<InterconnectCircuitInfoResponse>> getCircuitInfos() {
        return this.circuitInfos;
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
     * Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect.
     * 
     */
    @OutputExport(name="customerName", type=String.class, parameters={})
    private Output<String> customerName;

    /**
     * @return Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect.
     * 
     */
    public Output<String> getCustomerName() {
        return this.customerName;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * A list of outages expected for this Interconnect.
     * 
     */
    @OutputExport(name="expectedOutages", type=List.class, parameters={InterconnectOutageNotificationResponse.class})
    private Output<List<InterconnectOutageNotificationResponse>> expectedOutages;

    /**
     * @return A list of outages expected for this Interconnect.
     * 
     */
    public Output<List<InterconnectOutageNotificationResponse>> getExpectedOutages() {
        return this.expectedOutages;
    }
    /**
     * IP address configured on the Google side of the Interconnect link. This can be used only for ping tests.
     * 
     */
    @OutputExport(name="googleIpAddress", type=String.class, parameters={})
    private Output<String> googleIpAddress;

    /**
     * @return IP address configured on the Google side of the Interconnect link. This can be used only for ping tests.
     * 
     */
    public Output<String> getGoogleIpAddress() {
        return this.googleIpAddress;
    }
    /**
     * Google reference ID to be used when raising support tickets with Google or otherwise to debug backend connectivity issues.
     * 
     */
    @OutputExport(name="googleReferenceId", type=String.class, parameters={})
    private Output<String> googleReferenceId;

    /**
     * @return Google reference ID to be used when raising support tickets with Google or otherwise to debug backend connectivity issues.
     * 
     */
    public Output<String> getGoogleReferenceId() {
        return this.googleReferenceId;
    }
    /**
     * A list of the URLs of all InterconnectAttachments configured to use this Interconnect.
     * 
     */
    @OutputExport(name="interconnectAttachments", type=List.class, parameters={String.class})
    private Output<List<String>> interconnectAttachments;

    /**
     * @return A list of the URLs of all InterconnectAttachments configured to use this Interconnect.
     * 
     */
    public Output<List<String>> getInterconnectAttachments() {
        return this.interconnectAttachments;
    }
    /**
     * Type of interconnect, which can take one of the following values: - PARTNER: A partner-managed interconnection shared between customers though a partner. - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
     * 
     */
    @OutputExport(name="interconnectType", type=String.class, parameters={})
    private Output<String> interconnectType;

    /**
     * @return Type of interconnect, which can take one of the following values: - PARTNER: A partner-managed interconnection shared between customers though a partner. - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
     * 
     */
    public Output<String> getInterconnectType() {
        return this.interconnectType;
    }
    /**
     * Type of the resource. Always compute#interconnect for interconnects.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#interconnect for interconnects.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Type of link requested, which can take one of the following values: - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
     * 
     */
    @OutputExport(name="linkType", type=String.class, parameters={})
    private Output<String> linkType;

    /**
     * @return Type of link requested, which can take one of the following values: - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
     * 
     */
    public Output<String> getLinkType() {
        return this.linkType;
    }
    /**
     * URL of the InterconnectLocation object that represents where this connection is to be provisioned.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return URL of the InterconnectLocation object that represents where this connection is to be provisioned.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
     * 
     */
    @OutputExport(name="nocContactEmail", type=String.class, parameters={})
    private Output<String> nocContactEmail;

    /**
     * @return Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
     * 
     */
    public Output<String> getNocContactEmail() {
        return this.nocContactEmail;
    }
    /**
     * The current status of this Interconnect's functionality, which can take one of the following values: - OS_ACTIVE: A valid Interconnect, which is turned up and is ready to use. Attachments may be provisioned on this Interconnect. - OS_UNPROVISIONED: An Interconnect that has not completed turnup. No attachments may be provisioned on this Interconnect. - OS_UNDER_MAINTENANCE: An Interconnect that is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
     * 
     */
    @OutputExport(name="operationalStatus", type=String.class, parameters={})
    private Output<String> operationalStatus;

    /**
     * @return The current status of this Interconnect's functionality, which can take one of the following values: - OS_ACTIVE: A valid Interconnect, which is turned up and is ready to use. Attachments may be provisioned on this Interconnect. - OS_UNPROVISIONED: An Interconnect that has not completed turnup. No attachments may be provisioned on this Interconnect. - OS_UNDER_MAINTENANCE: An Interconnect that is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
     * 
     */
    public Output<String> getOperationalStatus() {
        return this.operationalStatus;
    }
    /**
     * IP address configured on the customer side of the Interconnect link. The customer should configure this IP address during turnup when prompted by Google NOC. This can be used only for ping tests.
     * 
     */
    @OutputExport(name="peerIpAddress", type=String.class, parameters={})
    private Output<String> peerIpAddress;

    /**
     * @return IP address configured on the customer side of the Interconnect link. The customer should configure this IP address during turnup when prompted by Google NOC. This can be used only for ping tests.
     * 
     */
    public Output<String> getPeerIpAddress() {
        return this.peerIpAddress;
    }
    /**
     * Number of links actually provisioned in this interconnect.
     * 
     */
    @OutputExport(name="provisionedLinkCount", type=Integer.class, parameters={})
    private Output<Integer> provisionedLinkCount;

    /**
     * @return Number of links actually provisioned in this interconnect.
     * 
     */
    public Output<Integer> getProvisionedLinkCount() {
        return this.provisionedLinkCount;
    }
    /**
     * Target number of physical links in the link bundle, as requested by the customer.
     * 
     */
    @OutputExport(name="requestedLinkCount", type=Integer.class, parameters={})
    private Output<Integer> requestedLinkCount;

    /**
     * @return Target number of physical links in the link bundle, as requested by the customer.
     * 
     */
    public Output<Integer> getRequestedLinkCount() {
        return this.requestedLinkCount;
    }
    /**
     * Set to true if the resource satisfies the zone separation organization policy constraints and false otherwise. Defaults to false if the field is not present.
     * 
     */
    @OutputExport(name="satisfiesPzs", type=Boolean.class, parameters={})
    private Output<Boolean> satisfiesPzs;

    /**
     * @return Set to true if the resource satisfies the zone separation organization policy constraints and false otherwise. Defaults to false if the field is not present.
     * 
     */
    public Output<Boolean> getSatisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * The current state of Interconnect functionality, which can take one of the following values: - ACTIVE: The Interconnect is valid, turned up and ready to use. Attachments may be provisioned on this Interconnect. - UNPROVISIONED: The Interconnect has not completed turnup. No attachments may be provisioned on this Interconnect. - UNDER_MAINTENANCE: The Interconnect is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of Interconnect functionality, which can take one of the following values: - ACTIVE: The Interconnect is valid, turned up and ready to use. Attachments may be provisioned on this Interconnect. - UNPROVISIONED: The Interconnect has not completed turnup. No attachments may be provisioned on this Interconnect. - UNDER_MAINTENANCE: The Interconnect is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable InterconnectArgs.Builder a);
    }
    private static io.pulumi.googlenative.compute_v1.InterconnectArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.compute_v1.InterconnectArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Interconnect(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Interconnect(String name) {
        this(name, InterconnectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Interconnect(String name, @Nullable InterconnectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Interconnect(String name, @Nullable InterconnectArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:Interconnect", name, args == null ? InterconnectArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Interconnect(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:Interconnect", name, null, makeResourceOptions(options, id));
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
    public static Interconnect get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Interconnect(name, id, options);
    }
}
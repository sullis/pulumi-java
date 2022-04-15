// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.directconnect.HostedConnectionArgs;
import io.pulumi.aws.directconnect.inputs.HostedConnectionState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a hosted connection on the specified interconnect or a link aggregation group (LAG) of interconnects. Intended for use by AWS Direct Connect Partners only.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:directconnect/hostedConnection:HostedConnection")
public class HostedConnection extends io.pulumi.resources.CustomResource {
    /**
     * The Direct Connect endpoint on which the physical connection terminates.
     * 
     */
    @Export(name="awsDevice", type=String.class, parameters={})
    private Output<String> awsDevice;

    /**
     * @return The Direct Connect endpoint on which the physical connection terminates.
     * 
     */
    public Output<String> awsDevice() {
        return this.awsDevice;
    }
    /**
     * The bandwidth of the connection. Valid values for dedicated connections: 1Gbps, 10Gbps. Valid values for hosted connections: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps and 10Gbps. Case sensitive.
     * 
     */
    @Export(name="bandwidth", type=String.class, parameters={})
    private Output<String> bandwidth;

    /**
     * @return The bandwidth of the connection. Valid values for dedicated connections: 1Gbps, 10Gbps. Valid values for hosted connections: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps and 10Gbps. Case sensitive.
     * 
     */
    public Output<String> bandwidth() {
        return this.bandwidth;
    }
    /**
     * The ID of the interconnect or LAG.
     * 
     */
    @Export(name="connectionId", type=String.class, parameters={})
    private Output<String> connectionId;

    /**
     * @return The ID of the interconnect or LAG.
     * 
     */
    public Output<String> connectionId() {
        return this.connectionId;
    }
    /**
     * Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * 
     */
    @Export(name="hasLogicalRedundancy", type=String.class, parameters={})
    private Output<String> hasLogicalRedundancy;

    /**
     * @return Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * 
     */
    public Output<String> hasLogicalRedundancy() {
        return this.hasLogicalRedundancy;
    }
    /**
     * Boolean value representing if jumbo frames have been enabled for this connection.
     * 
     */
    @Export(name="jumboFrameCapable", type=Boolean.class, parameters={})
    private Output<Boolean> jumboFrameCapable;

    /**
     * @return Boolean value representing if jumbo frames have been enabled for this connection.
     * 
     */
    public Output<Boolean> jumboFrameCapable() {
        return this.jumboFrameCapable;
    }
    /**
     * The ID of the LAG.
     * 
     */
    @Export(name="lagId", type=String.class, parameters={})
    private Output<String> lagId;

    /**
     * @return The ID of the LAG.
     * 
     */
    public Output<String> lagId() {
        return this.lagId;
    }
    /**
     * The time of the most recent call to [DescribeLoa](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLoa.html) for this connection.
     * 
     */
    @Export(name="loaIssueTime", type=String.class, parameters={})
    private Output<String> loaIssueTime;

    /**
     * @return The time of the most recent call to [DescribeLoa](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLoa.html) for this connection.
     * 
     */
    public Output<String> loaIssueTime() {
        return this.loaIssueTime;
    }
    /**
     * The location of the connection.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the connection.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the connection.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the connection.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the AWS account of the customer for the connection.
     * 
     */
    @Export(name="ownerAccountId", type=String.class, parameters={})
    private Output<String> ownerAccountId;

    /**
     * @return The ID of the AWS account of the customer for the connection.
     * 
     */
    public Output<String> ownerAccountId() {
        return this.ownerAccountId;
    }
    /**
     * The name of the AWS Direct Connect service provider associated with the connection.
     * 
     */
    @Export(name="partnerName", type=String.class, parameters={})
    private Output<String> partnerName;

    /**
     * @return The name of the AWS Direct Connect service provider associated with the connection.
     * 
     */
    public Output<String> partnerName() {
        return this.partnerName;
    }
    /**
     * The name of the service provider associated with the connection.
     * 
     */
    @Export(name="providerName", type=String.class, parameters={})
    private Output<String> providerName;

    /**
     * @return The name of the service provider associated with the connection.
     * 
     */
    public Output<String> providerName() {
        return this.providerName;
    }
    /**
     * The AWS Region where the connection is located.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The AWS Region where the connection is located.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The state of the connection. Possible values include: ordering, requested, pending, available, down, deleting, deleted, rejected, unknown. See [AllocateHostedConnection](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_AllocateHostedConnection.html) for a description of each connection state.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the connection. Possible values include: ordering, requested, pending, available, down, deleting, deleted, rejected, unknown. See [AllocateHostedConnection](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_AllocateHostedConnection.html) for a description of each connection state.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The dedicated VLAN provisioned to the hosted connection.
     * 
     */
    @Export(name="vlan", type=Integer.class, parameters={})
    private Output<Integer> vlan;

    /**
     * @return The dedicated VLAN provisioned to the hosted connection.
     * 
     */
    public Output<Integer> vlan() {
        return this.vlan;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HostedConnection(String name) {
        this(name, HostedConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HostedConnection(String name, HostedConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HostedConnection(String name, HostedConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/hostedConnection:HostedConnection", name, args == null ? HostedConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HostedConnection(String name, Output<String> id, @Nullable HostedConnectionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/hostedConnection:HostedConnection", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static HostedConnection get(String name, Output<String> id, @Nullable HostedConnectionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HostedConnection(name, id, state, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.vpcaccess;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.vpcaccess.ConnectorArgs;
import io.pulumi.gcp.vpcaccess.inputs.ConnectorState;
import io.pulumi.gcp.vpcaccess.outputs.ConnectorSubnet;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Serverless VPC Access connector resource.
 * 
 * To get more information about Connector, see:
 * 
 * * [API documentation](https://cloud.google.com/vpc/docs/reference/vpcaccess/rest/v1/projects.locations.connectors)
 * * How-to Guides
 *     * [Configuring Serverless VPC Access](https://cloud.google.com/vpc/docs/configure-serverless-vpc-access)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Connector can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:vpcaccess/connector:Connector default projects/{{project}}/locations/{{region}}/connectors/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:vpcaccess/connector:Connector default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:vpcaccess/connector:Connector default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:vpcaccess/connector:Connector default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:vpcaccess/connector:Connector")
public class Connector extends io.pulumi.resources.CustomResource {
    /**
     * The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
     * 
     */
    @OutputExport(name="ipCidrRange", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipCidrRange;

    /**
     * @return The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
     * 
     */
    public Output</* @Nullable */ String> getIpCidrRange() {
        return this.ipCidrRange;
    }
    /**
     * Machine type of VM Instance underlying connector. Default is e2-micro
     * 
     */
    @OutputExport(name="machineType", type=String.class, parameters={})
    private Output</* @Nullable */ String> machineType;

    /**
     * @return Machine type of VM Instance underlying connector. Default is e2-micro
     * 
     */
    public Output</* @Nullable */ String> getMachineType() {
        return this.machineType;
    }
    /**
     * Maximum value of instances in autoscaling group underlying the connector.
     * 
     */
    @OutputExport(name="maxInstances", type=Integer.class, parameters={})
    private Output<Integer> maxInstances;

    /**
     * @return Maximum value of instances in autoscaling group underlying the connector.
     * 
     */
    public Output<Integer> getMaxInstances() {
        return this.maxInstances;
    }
    /**
     * Maximum throughput of the connector in Mbps, must be greater than `min_throughput`. Default is 300.
     * 
     */
    @OutputExport(name="maxThroughput", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxThroughput;

    /**
     * @return Maximum throughput of the connector in Mbps, must be greater than `min_throughput`. Default is 300.
     * 
     */
    public Output</* @Nullable */ Integer> getMaxThroughput() {
        return this.maxThroughput;
    }
    /**
     * Minimum value of instances in autoscaling group underlying the connector.
     * 
     */
    @OutputExport(name="minInstances", type=Integer.class, parameters={})
    private Output<Integer> minInstances;

    /**
     * @return Minimum value of instances in autoscaling group underlying the connector.
     * 
     */
    public Output<Integer> getMinInstances() {
        return this.minInstances;
    }
    /**
     * Minimum throughput of the connector in Mbps. Default and min is 200.
     * 
     */
    @OutputExport(name="minThroughput", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minThroughput;

    /**
     * @return Minimum throughput of the connector in Mbps. Default and min is 200.
     * 
     */
    public Output</* @Nullable */ Integer> getMinThroughput() {
        return this.minThroughput;
    }
    /**
     * Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is
     * https://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetName} the correct input for this field would be {subnetName}"
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is
     * https://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetName} the correct input for this field would be {subnetName}"
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Name or self_link of the VPC network. Required if `ip_cidr_range` is set.
     * 
     */
    @OutputExport(name="network", type=String.class, parameters={})
    private Output</* @Nullable */ String> network;

    /**
     * @return Name or self_link of the VPC network. Required if `ip_cidr_range` is set.
     * 
     */
    public Output</* @Nullable */ String> getNetwork() {
        return this.network;
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
     * Region where the VPC Access connector resides. If it is not provided, the provider region is used.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return Region where the VPC Access connector resides. If it is not provided, the provider region is used.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The fully qualified name of this VPC connector
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The fully qualified name of this VPC connector
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * State of the VPC access connector.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the VPC access connector.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The subnet in which to house the connector
     * Structure is documented below.
     * 
     */
    @OutputExport(name="subnet", type=ConnectorSubnet.class, parameters={})
    private Output</* @Nullable */ ConnectorSubnet> subnet;

    /**
     * @return The subnet in which to house the connector
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ ConnectorSubnet> getSubnet() {
        return this.subnet;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ConnectorArgs.Builder a);
    }
    private static io.pulumi.gcp.vpcaccess.ConnectorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.vpcaccess.ConnectorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Connector(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Connector(String name) {
        this(name, ConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connector(String name, @Nullable ConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connector(String name, @Nullable ConnectorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vpcaccess/connector:Connector", name, args == null ? ConnectorArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Connector(String name, Input<String> id, @Nullable ConnectorState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vpcaccess/connector:Connector", name, state, makeResourceOptions(options, id));
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
    public static Connector get(String name, Input<String> id, @Nullable ConnectorState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Connector(name, id, state, options);
    }
}
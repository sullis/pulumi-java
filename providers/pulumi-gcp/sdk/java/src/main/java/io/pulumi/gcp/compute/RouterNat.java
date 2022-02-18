// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.RouterNatArgs;
import io.pulumi.gcp.compute.inputs.RouterNatState;
import io.pulumi.gcp.compute.outputs.RouterNatLogConfig;
import io.pulumi.gcp.compute.outputs.RouterNatSubnetwork;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A NAT service created in a router.
 * 
 * To get more information about RouterNat, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/routers)
 * * How-to Guides
 *     * [Google Cloud Router](https://cloud.google.com/router/docs/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * RouterNat can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/routerNat:RouterNat default projects/{{project}}/regions/{{region}}/routers/{{router}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/routerNat:RouterNat default {{project}}/{{region}}/{{router}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/routerNat:RouterNat default {{region}}/{{router}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/routerNat:RouterNat default {{router}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/routerNat:RouterNat")
public class RouterNat extends io.pulumi.resources.CustomResource {
    /**
     * A list of URLs of the IP resources to be drained. These IPs must be
     * valid static external IPs that have been assigned to the NAT.
     * 
     */
    @OutputExport(name="drainNatIps", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> drainNatIps;

    /**
     * @return A list of URLs of the IP resources to be drained. These IPs must be
     * valid static external IPs that have been assigned to the NAT.
     * 
     */
    public Output</* @Nullable */ List<String>> getDrainNatIps() {
        return this.drainNatIps;
    }
    /**
     * Specifies if endpoint independent mapping is enabled. This is enabled by default. For more information
     * see the [official documentation](https://cloud.google.com/nat/docs/overview#specs-rfcs).
     * 
     */
    @OutputExport(name="enableEndpointIndependentMapping", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableEndpointIndependentMapping;

    /**
     * @return Specifies if endpoint independent mapping is enabled. This is enabled by default. For more information
     * see the [official documentation](https://cloud.google.com/nat/docs/overview#specs-rfcs).
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableEndpointIndependentMapping() {
        return this.enableEndpointIndependentMapping;
    }
    /**
     * Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.
     * 
     */
    @OutputExport(name="icmpIdleTimeoutSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> icmpIdleTimeoutSec;

    /**
     * @return Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.
     * 
     */
    public Output</* @Nullable */ Integer> getIcmpIdleTimeoutSec() {
        return this.icmpIdleTimeoutSec;
    }
    /**
     * Configuration for logging on NAT
     * Structure is documented below.
     * 
     */
    @OutputExport(name="logConfig", type=RouterNatLogConfig.class, parameters={})
    private Output</* @Nullable */ RouterNatLogConfig> logConfig;

    /**
     * @return Configuration for logging on NAT
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ RouterNatLogConfig> getLogConfig() {
        return this.logConfig;
    }
    /**
     * Minimum number of ports allocated to a VM from this NAT.
     * 
     */
    @OutputExport(name="minPortsPerVm", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minPortsPerVm;

    /**
     * @return Minimum number of ports allocated to a VM from this NAT.
     * 
     */
    public Output</* @Nullable */ Integer> getMinPortsPerVm() {
        return this.minPortsPerVm;
    }
    /**
     * Self-link of subnetwork to NAT
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Self-link of subnetwork to NAT
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * How external IPs should be allocated for this NAT. Valid values are
     * `AUTO_ONLY` for only allowing NAT IPs allocated by Google Cloud
     * Platform, or `MANUAL_ONLY` for only user-allocated NAT IP addresses.
     * Possible values are `MANUAL_ONLY` and `AUTO_ONLY`.
     * 
     */
    @OutputExport(name="natIpAllocateOption", type=String.class, parameters={})
    private Output<String> natIpAllocateOption;

    /**
     * @return How external IPs should be allocated for this NAT. Valid values are
     * `AUTO_ONLY` for only allowing NAT IPs allocated by Google Cloud
     * Platform, or `MANUAL_ONLY` for only user-allocated NAT IP addresses.
     * Possible values are `MANUAL_ONLY` and `AUTO_ONLY`.
     * 
     */
    public Output<String> getNatIpAllocateOption() {
        return this.natIpAllocateOption;
    }
    /**
     * Self-links of NAT IPs. Only valid if natIpAllocateOption
     * is set to MANUAL_ONLY.
     * 
     */
    @OutputExport(name="natIps", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> natIps;

    /**
     * @return Self-links of NAT IPs. Only valid if natIpAllocateOption
     * is set to MANUAL_ONLY.
     * 
     */
    public Output</* @Nullable */ List<String>> getNatIps() {
        return this.natIps;
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
     * Region where the router and NAT reside.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return Region where the router and NAT reside.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The name of the Cloud Router in which this NAT will be configured.
     * 
     */
    @OutputExport(name="router", type=String.class, parameters={})
    private Output<String> router;

    /**
     * @return The name of the Cloud Router in which this NAT will be configured.
     * 
     */
    public Output<String> getRouter() {
        return this.router;
    }
    /**
     * How NAT should be configured per Subnetwork.
     * If `ALL_SUBNETWORKS_ALL_IP_RANGES`, all of the
     * IP ranges in every Subnetwork are allowed to Nat.
     * If `ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES`, all of the primary IP
     * ranges in every Subnetwork are allowed to Nat.
     * `LIST_OF_SUBNETWORKS`: A list of Subnetworks are allowed to Nat
     * (specified in the field subnetwork below). Note that if this field
     * contains ALL_SUBNETWORKS_ALL_IP_RANGES or
     * ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any
     * other RouterNat section in any Router for this network in this region.
     * Possible values are `ALL_SUBNETWORKS_ALL_IP_RANGES`, `ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES`, and `LIST_OF_SUBNETWORKS`.
     * 
     */
    @OutputExport(name="sourceSubnetworkIpRangesToNat", type=String.class, parameters={})
    private Output<String> sourceSubnetworkIpRangesToNat;

    /**
     * @return How NAT should be configured per Subnetwork.
     * If `ALL_SUBNETWORKS_ALL_IP_RANGES`, all of the
     * IP ranges in every Subnetwork are allowed to Nat.
     * If `ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES`, all of the primary IP
     * ranges in every Subnetwork are allowed to Nat.
     * `LIST_OF_SUBNETWORKS`: A list of Subnetworks are allowed to Nat
     * (specified in the field subnetwork below). Note that if this field
     * contains ALL_SUBNETWORKS_ALL_IP_RANGES or
     * ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any
     * other RouterNat section in any Router for this network in this region.
     * Possible values are `ALL_SUBNETWORKS_ALL_IP_RANGES`, `ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES`, and `LIST_OF_SUBNETWORKS`.
     * 
     */
    public Output<String> getSourceSubnetworkIpRangesToNat() {
        return this.sourceSubnetworkIpRangesToNat;
    }
    /**
     * One or more subnetwork NAT configurations. Only used if
     * `source_subnetwork_ip_ranges_to_nat` is set to `LIST_OF_SUBNETWORKS`
     * Structure is documented below.
     * 
     */
    @OutputExport(name="subnetworks", type=List.class, parameters={RouterNatSubnetwork.class})
    private Output</* @Nullable */ List<RouterNatSubnetwork>> subnetworks;

    /**
     * @return One or more subnetwork NAT configurations. Only used if
     * `source_subnetwork_ip_ranges_to_nat` is set to `LIST_OF_SUBNETWORKS`
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<RouterNatSubnetwork>> getSubnetworks() {
        return this.subnetworks;
    }
    /**
     * Timeout (in seconds) for TCP established connections.
     * Defaults to 1200s if not set.
     * 
     */
    @OutputExport(name="tcpEstablishedIdleTimeoutSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> tcpEstablishedIdleTimeoutSec;

    /**
     * @return Timeout (in seconds) for TCP established connections.
     * Defaults to 1200s if not set.
     * 
     */
    public Output</* @Nullable */ Integer> getTcpEstablishedIdleTimeoutSec() {
        return this.tcpEstablishedIdleTimeoutSec;
    }
    /**
     * Timeout (in seconds) for TCP transitory connections.
     * Defaults to 30s if not set.
     * 
     */
    @OutputExport(name="tcpTransitoryIdleTimeoutSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> tcpTransitoryIdleTimeoutSec;

    /**
     * @return Timeout (in seconds) for TCP transitory connections.
     * Defaults to 30s if not set.
     * 
     */
    public Output</* @Nullable */ Integer> getTcpTransitoryIdleTimeoutSec() {
        return this.tcpTransitoryIdleTimeoutSec;
    }
    /**
     * Timeout (in seconds) for UDP connections. Defaults to 30s if not set.
     * 
     */
    @OutputExport(name="udpIdleTimeoutSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> udpIdleTimeoutSec;

    /**
     * @return Timeout (in seconds) for UDP connections. Defaults to 30s if not set.
     * 
     */
    public Output</* @Nullable */ Integer> getUdpIdleTimeoutSec() {
        return this.udpIdleTimeoutSec;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouterNat(String name, RouterNatArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/routerNat:RouterNat", name, args == null ? RouterNatArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RouterNat(String name, Input<String> id, @Nullable RouterNatState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/routerNat:RouterNat", name, state, makeResourceOptions(options, id));
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
    public static RouterNat get(String name, Input<String> id, @Nullable RouterNatState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RouterNat(name, id, state, options);
    }
}

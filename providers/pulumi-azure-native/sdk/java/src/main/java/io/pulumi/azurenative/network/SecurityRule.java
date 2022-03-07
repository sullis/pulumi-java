// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.SecurityRuleArgs;
import io.pulumi.azurenative.network.outputs.ApplicationSecurityGroupResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Network security rule.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:SecurityRule rule1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/networkSecurityGroups/testnsg/securityRules/rule1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:SecurityRule")
public class SecurityRule extends io.pulumi.resources.CustomResource {
    /**
     * The network traffic is allowed or denied.
     * 
     */
    @OutputExport(name="access", type=String.class, parameters={})
    private Output<String> access;

    /**
     * @return The network traffic is allowed or denied.
     * 
     */
    public Output<String> getAccess() {
        return this.access;
    }
    /**
     * A description for this rule. Restricted to 140 chars.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for this rule. Restricted to 140 chars.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The destination address prefix. CIDR or destination IP range. Asterisk '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used.
     * 
     */
    @OutputExport(name="destinationAddressPrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> destinationAddressPrefix;

    /**
     * @return The destination address prefix. CIDR or destination IP range. Asterisk '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used.
     * 
     */
    public Output</* @Nullable */ String> getDestinationAddressPrefix() {
        return this.destinationAddressPrefix;
    }
    /**
     * The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    @OutputExport(name="destinationAddressPrefixes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> destinationAddressPrefixes;

    /**
     * @return The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    public Output</* @Nullable */ List<String>> getDestinationAddressPrefixes() {
        return this.destinationAddressPrefixes;
    }
    /**
     * The application security group specified as destination.
     * 
     */
    @OutputExport(name="destinationApplicationSecurityGroups", type=List.class, parameters={ApplicationSecurityGroupResponse.class})
    private Output</* @Nullable */ List<ApplicationSecurityGroupResponse>> destinationApplicationSecurityGroups;

    /**
     * @return The application security group specified as destination.
     * 
     */
    public Output</* @Nullable */ List<ApplicationSecurityGroupResponse>> getDestinationApplicationSecurityGroups() {
        return this.destinationApplicationSecurityGroups;
    }
    /**
     * The destination port or range. Integer or range between 0 and 65535. Asterisk '*' can also be used to match all ports.
     * 
     */
    @OutputExport(name="destinationPortRange", type=String.class, parameters={})
    private Output</* @Nullable */ String> destinationPortRange;

    /**
     * @return The destination port or range. Integer or range between 0 and 65535. Asterisk '*' can also be used to match all ports.
     * 
     */
    public Output</* @Nullable */ String> getDestinationPortRange() {
        return this.destinationPortRange;
    }
    /**
     * The destination port ranges.
     * 
     */
    @OutputExport(name="destinationPortRanges", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> destinationPortRanges;

    /**
     * @return The destination port ranges.
     * 
     */
    public Output</* @Nullable */ List<String>> getDestinationPortRanges() {
        return this.destinationPortRanges;
    }
    /**
     * The direction of the rule. The direction specifies if rule will be evaluated on incoming or outgoing traffic.
     * 
     */
    @OutputExport(name="direction", type=String.class, parameters={})
    private Output<String> direction;

    /**
     * @return The direction of the rule. The direction specifies if rule will be evaluated on incoming or outgoing traffic.
     * 
     */
    public Output<String> getDirection() {
        return this.direction;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * The priority of the rule. The value can be between 100 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     */
    @OutputExport(name="priority", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return The priority of the rule. The value can be between 100 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     */
    public Output</* @Nullable */ Integer> getPriority() {
        return this.priority;
    }
    /**
     * Network protocol this rule applies to.
     * 
     */
    @OutputExport(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return Network protocol this rule applies to.
     * 
     */
    public Output<String> getProtocol() {
        return this.protocol;
    }
    /**
     * The provisioning state of the security rule resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the security rule resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The CIDR or source IP range. Asterisk '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used. If this is an ingress rule, specifies where network traffic originates from.
     * 
     */
    @OutputExport(name="sourceAddressPrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceAddressPrefix;

    /**
     * @return The CIDR or source IP range. Asterisk '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used. If this is an ingress rule, specifies where network traffic originates from.
     * 
     */
    public Output</* @Nullable */ String> getSourceAddressPrefix() {
        return this.sourceAddressPrefix;
    }
    /**
     * The CIDR or source IP ranges.
     * 
     */
    @OutputExport(name="sourceAddressPrefixes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> sourceAddressPrefixes;

    /**
     * @return The CIDR or source IP ranges.
     * 
     */
    public Output</* @Nullable */ List<String>> getSourceAddressPrefixes() {
        return this.sourceAddressPrefixes;
    }
    /**
     * The application security group specified as source.
     * 
     */
    @OutputExport(name="sourceApplicationSecurityGroups", type=List.class, parameters={ApplicationSecurityGroupResponse.class})
    private Output</* @Nullable */ List<ApplicationSecurityGroupResponse>> sourceApplicationSecurityGroups;

    /**
     * @return The application security group specified as source.
     * 
     */
    public Output</* @Nullable */ List<ApplicationSecurityGroupResponse>> getSourceApplicationSecurityGroups() {
        return this.sourceApplicationSecurityGroups;
    }
    /**
     * The source port or range. Integer or range between 0 and 65535. Asterisk '*' can also be used to match all ports.
     * 
     */
    @OutputExport(name="sourcePortRange", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourcePortRange;

    /**
     * @return The source port or range. Integer or range between 0 and 65535. Asterisk '*' can also be used to match all ports.
     * 
     */
    public Output</* @Nullable */ String> getSourcePortRange() {
        return this.sourcePortRange;
    }
    /**
     * The source port ranges.
     * 
     */
    @OutputExport(name="sourcePortRanges", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> sourcePortRanges;

    /**
     * @return The source port ranges.
     * 
     */
    public Output</* @Nullable */ List<String>> getSourcePortRanges() {
        return this.sourcePortRanges;
    }
    /**
     * The type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output</* @Nullable */ String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(SecurityRuleArgs.Builder a);
    }
    private static io.pulumi.azurenative.network.SecurityRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.network.SecurityRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SecurityRule(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecurityRule(String name) {
        this(name, SecurityRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityRule(String name, SecurityRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityRule(String name, SecurityRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:SecurityRule", name, args == null ? SecurityRuleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SecurityRule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:SecurityRule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20150501preview:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20150615:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20160330:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20160601:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20160901:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20161201:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170301:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170601:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170801:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170901:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20171001:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20171101:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180101:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180201:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180401:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180601:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180701:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180801:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181001:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181101:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181201:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190201:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190401:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190601:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190701:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190801:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190901:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:SecurityRule").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:SecurityRule").build())
            ))
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
    public static SecurityRule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SecurityRule(name, id, options);
    }
}
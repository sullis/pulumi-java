// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blockchain;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.blockchain.BlockchainMemberArgs;
import io.pulumi.azurenative.blockchain.outputs.BlockchainMemberNodesSkuResponse;
import io.pulumi.azurenative.blockchain.outputs.FirewallRuleResponse;
import io.pulumi.azurenative.blockchain.outputs.SkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Payload of the blockchain member which is exposed in the request/response of the resource provider.
 * API Version: 2018-06-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:blockchain:BlockchainMember contosemember1 /subscriptions/51766542-3ed7-4a72-a187-0c8ab644ddab/resourceGroups/mygroup/providers/Microsoft.Blockchain/blockchainMembers/contosemember1 
 * ```
 * 
 */
@ResourceType(type="azure-native:blockchain:BlockchainMember")
public class BlockchainMember extends io.pulumi.resources.CustomResource {
    /**
     * Gets or sets the consortium for the blockchain member.
     * 
     */
    @OutputExport(name="consortium", type=String.class, parameters={})
    private Output</* @Nullable */ String> consortium;

    /**
     * @return Gets or sets the consortium for the blockchain member.
     * 
     */
    public Output</* @Nullable */ String> getConsortium() {
        return this.consortium;
    }
    /**
     * Gets the managed consortium management account address.
     * 
     */
    @OutputExport(name="consortiumManagementAccountAddress", type=String.class, parameters={})
    private Output<String> consortiumManagementAccountAddress;

    /**
     * @return Gets the managed consortium management account address.
     * 
     */
    public Output<String> getConsortiumManagementAccountAddress() {
        return this.consortiumManagementAccountAddress;
    }
    /**
     * Sets the managed consortium management account password.
     * 
     */
    @OutputExport(name="consortiumManagementAccountPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> consortiumManagementAccountPassword;

    /**
     * @return Sets the managed consortium management account password.
     * 
     */
    public Output</* @Nullable */ String> getConsortiumManagementAccountPassword() {
        return this.consortiumManagementAccountPassword;
    }
    /**
     * Gets the display name of the member in the consortium.
     * 
     */
    @OutputExport(name="consortiumMemberDisplayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> consortiumMemberDisplayName;

    /**
     * @return Gets the display name of the member in the consortium.
     * 
     */
    public Output</* @Nullable */ String> getConsortiumMemberDisplayName() {
        return this.consortiumMemberDisplayName;
    }
    /**
     * Gets the role of the member in the consortium.
     * 
     */
    @OutputExport(name="consortiumRole", type=String.class, parameters={})
    private Output</* @Nullable */ String> consortiumRole;

    /**
     * @return Gets the role of the member in the consortium.
     * 
     */
    public Output</* @Nullable */ String> getConsortiumRole() {
        return this.consortiumRole;
    }
    /**
     * Gets the dns endpoint of the blockchain member.
     * 
     */
    @OutputExport(name="dns", type=String.class, parameters={})
    private Output<String> dns;

    /**
     * @return Gets the dns endpoint of the blockchain member.
     * 
     */
    public Output<String> getDns() {
        return this.dns;
    }
    /**
     * Gets or sets firewall rules
     * 
     */
    @OutputExport(name="firewallRules", type=List.class, parameters={FirewallRuleResponse.class})
    private Output</* @Nullable */ List<FirewallRuleResponse>> firewallRules;

    /**
     * @return Gets or sets firewall rules
     * 
     */
    public Output</* @Nullable */ List<FirewallRuleResponse>> getFirewallRules() {
        return this.firewallRules;
    }
    /**
     * The GEO location of the blockchain service.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The GEO location of the blockchain service.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Sets the basic auth password of the blockchain member.
     * 
     */
    @OutputExport(name="password", type=String.class, parameters={})
    private Output</* @Nullable */ String> password;

    /**
     * @return Sets the basic auth password of the blockchain member.
     * 
     */
    public Output</* @Nullable */ String> getPassword() {
        return this.password;
    }
    /**
     * Gets or sets the blockchain protocol.
     * 
     */
    @OutputExport(name="protocol", type=String.class, parameters={})
    private Output</* @Nullable */ String> protocol;

    /**
     * @return Gets or sets the blockchain protocol.
     * 
     */
    public Output</* @Nullable */ String> getProtocol() {
        return this.protocol;
    }
    /**
     * Gets or sets the blockchain member provision state.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Gets or sets the blockchain member provision state.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Gets the public key of the blockchain member (default transaction node).
     * 
     */
    @OutputExport(name="publicKey", type=String.class, parameters={})
    private Output<String> publicKey;

    /**
     * @return Gets the public key of the blockchain member (default transaction node).
     * 
     */
    public Output<String> getPublicKey() {
        return this.publicKey;
    }
    /**
     * Gets the Ethereum root contract address of the blockchain.
     * 
     */
    @OutputExport(name="rootContractAddress", type=String.class, parameters={})
    private Output<String> rootContractAddress;

    /**
     * @return Gets the Ethereum root contract address of the blockchain.
     * 
     */
    public Output<String> getRootContractAddress() {
        return this.rootContractAddress;
    }
    /**
     * Gets or sets the blockchain member Sku.
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return Gets or sets the blockchain member Sku.
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Tags of the service which is a list of key value pairs that describes the resource.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags of the service which is a list of key value pairs that describes the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the service - e.g. "Microsoft.Blockchain"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the service - e.g. "Microsoft.Blockchain"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Gets the auth user name of the blockchain member.
     * 
     */
    @OutputExport(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    /**
     * @return Gets the auth user name of the blockchain member.
     * 
     */
    public Output<String> getUserName() {
        return this.userName;
    }
    /**
     * Gets or sets the blockchain validator nodes Sku.
     * 
     */
    @OutputExport(name="validatorNodesSku", type=BlockchainMemberNodesSkuResponse.class, parameters={})
    private Output</* @Nullable */ BlockchainMemberNodesSkuResponse> validatorNodesSku;

    /**
     * @return Gets or sets the blockchain validator nodes Sku.
     * 
     */
    public Output</* @Nullable */ BlockchainMemberNodesSkuResponse> getValidatorNodesSku() {
        return this.validatorNodesSku;
    }

    public interface BuilderApplicator {
        public void apply(BlockchainMemberArgs.Builder a);
    }
    private static io.pulumi.azurenative.blockchain.BlockchainMemberArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.blockchain.BlockchainMemberArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public BlockchainMember(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BlockchainMember(String name) {
        this(name, BlockchainMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BlockchainMember(String name, BlockchainMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BlockchainMember(String name, BlockchainMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:blockchain:BlockchainMember", name, args == null ? BlockchainMemberArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BlockchainMember(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:blockchain:BlockchainMember", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:blockchain/v20180601preview:BlockchainMember").build())
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
    public static BlockchainMember get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BlockchainMember(name, id, options);
    }
}
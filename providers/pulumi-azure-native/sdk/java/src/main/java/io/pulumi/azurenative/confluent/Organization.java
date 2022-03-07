// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.confluent;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.confluent.OrganizationArgs;
import io.pulumi.azurenative.confluent.outputs.OrganizationResourcePropertiesResponseOfferDetail;
import io.pulumi.azurenative.confluent.outputs.OrganizationResourcePropertiesResponseUserDetail;
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
 * Organization resource.
 * API Version: 2020-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:confluent:Organization myOrganization /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.Confluent/organizations/myOrganization 
 * ```
 * 
 */
@ResourceType(type="azure-native:confluent:Organization")
public class Organization extends io.pulumi.resources.CustomResource {
    /**
     * The creation time of the resource.
     * 
     */
    @OutputExport(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return The creation time of the resource.
     * 
     */
    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    /**
     * Location of Organization resource
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Location of Organization resource
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
     * Confluent offer detail
     * 
     */
    @OutputExport(name="offerDetail", type=OrganizationResourcePropertiesResponseOfferDetail.class, parameters={})
    private Output</* @Nullable */ OrganizationResourcePropertiesResponseOfferDetail> offerDetail;

    /**
     * @return Confluent offer detail
     * 
     */
    public Output</* @Nullable */ OrganizationResourcePropertiesResponseOfferDetail> getOfferDetail() {
        return this.offerDetail;
    }
    /**
     * Id of the Confluent organization.
     * 
     */
    @OutputExport(name="organizationId", type=String.class, parameters={})
    private Output<String> organizationId;

    /**
     * @return Id of the Confluent organization.
     * 
     */
    public Output<String> getOrganizationId() {
        return this.organizationId;
    }
    /**
     * Provision states for confluent RP
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provision states for confluent RP
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * SSO url for the Confluent organization.
     * 
     */
    @OutputExport(name="ssoUrl", type=String.class, parameters={})
    private Output<String> ssoUrl;

    /**
     * @return SSO url for the Confluent organization.
     * 
     */
    public Output<String> getSsoUrl() {
        return this.ssoUrl;
    }
    /**
     * Organization resource tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Organization resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Subscriber detail
     * 
     */
    @OutputExport(name="userDetail", type=OrganizationResourcePropertiesResponseUserDetail.class, parameters={})
    private Output</* @Nullable */ OrganizationResourcePropertiesResponseUserDetail> userDetail;

    /**
     * @return Subscriber detail
     * 
     */
    public Output</* @Nullable */ OrganizationResourcePropertiesResponseUserDetail> getUserDetail() {
        return this.userDetail;
    }

    public interface BuilderApplicator {
        public void apply(OrganizationArgs.Builder a);
    }
    private static io.pulumi.azurenative.confluent.OrganizationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.confluent.OrganizationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Organization(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Organization(String name) {
        this(name, OrganizationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Organization(String name, OrganizationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Organization(String name, OrganizationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:confluent:Organization", name, args == null ? OrganizationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Organization(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:confluent:Organization", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:confluent/v20200301:Organization").build()),
                Input.of(Alias.builder().setType("azure-native:confluent/v20200301preview:Organization").build()),
                Input.of(Alias.builder().setType("azure-native:confluent/v20210301preview:Organization").build()),
                Input.of(Alias.builder().setType("azure-native:confluent/v20210901preview:Organization").build())
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
    public static Organization get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Organization(name, id, options);
    }
}
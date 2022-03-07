// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cdn.CustomDomainArgs;
import io.pulumi.azurenative.cdn.outputs.CdnManagedHttpsParametersResponse;
import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.azurenative.cdn.outputs.UserManagedHttpsParametersResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Friendly domain name mapping to the endpoint hostname that the customer provides for branding purposes, e.g. www.contoso.com.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:cdn:CustomDomain www-someDomain-net /subscriptions/subid/resourcegroups/RG/providers/Microsoft.Cdn/profiles/profile1/endpoints/endpoint1/customdomains/www-someDomain-net 
 * ```
 * 
 */
@ResourceType(type="azure-native:cdn:CustomDomain")
public class CustomDomain extends io.pulumi.resources.CustomResource {
    /**
     * Certificate parameters for securing custom HTTPS
     * 
     */
    @OutputExport(name="customHttpsParameters", type=Either.class, parameters={CdnManagedHttpsParametersResponse.class, UserManagedHttpsParametersResponse.class})
    private Output</* @Nullable */ Either<CdnManagedHttpsParametersResponse,UserManagedHttpsParametersResponse>> customHttpsParameters;

    /**
     * @return Certificate parameters for securing custom HTTPS
     * 
     */
    public Output</* @Nullable */ Either<CdnManagedHttpsParametersResponse,UserManagedHttpsParametersResponse>> getCustomHttpsParameters() {
        return this.customHttpsParameters;
    }
    /**
     * Provisioning status of Custom Https of the custom domain.
     * 
     */
    @OutputExport(name="customHttpsProvisioningState", type=String.class, parameters={})
    private Output<String> customHttpsProvisioningState;

    /**
     * @return Provisioning status of Custom Https of the custom domain.
     * 
     */
    public Output<String> getCustomHttpsProvisioningState() {
        return this.customHttpsProvisioningState;
    }
    /**
     * Provisioning substate shows the progress of custom HTTPS enabling/disabling process step by step.
     * 
     */
    @OutputExport(name="customHttpsProvisioningSubstate", type=String.class, parameters={})
    private Output<String> customHttpsProvisioningSubstate;

    /**
     * @return Provisioning substate shows the progress of custom HTTPS enabling/disabling process step by step.
     * 
     */
    public Output<String> getCustomHttpsProvisioningSubstate() {
        return this.customHttpsProvisioningSubstate;
    }
    /**
     * The host name of the custom domain. Must be a domain name.
     * 
     */
    @OutputExport(name="hostName", type=String.class, parameters={})
    private Output<String> hostName;

    /**
     * @return The host name of the custom domain. Must be a domain name.
     * 
     */
    public Output<String> getHostName() {
        return this.hostName;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Provisioning status of the custom domain.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning status of the custom domain.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource status of the custom domain.
     * 
     */
    @OutputExport(name="resourceState", type=String.class, parameters={})
    private Output<String> resourceState;

    /**
     * @return Resource status of the custom domain.
     * 
     */
    public Output<String> getResourceState() {
        return this.resourceState;
    }
    /**
     * Read only system data
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Read only system data
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Special validation or data may be required when delivering CDN to some regions due to local compliance reasons. E.g. ICP license number of a custom domain is required to deliver content in China.
     * 
     */
    @OutputExport(name="validationData", type=String.class, parameters={})
    private Output</* @Nullable */ String> validationData;

    /**
     * @return Special validation or data may be required when delivering CDN to some regions due to local compliance reasons. E.g. ICP license number of a custom domain is required to deliver content in China.
     * 
     */
    public Output</* @Nullable */ String> getValidationData() {
        return this.validationData;
    }

    public interface BuilderApplicator {
        public void apply(CustomDomainArgs.Builder a);
    }
    private static io.pulumi.azurenative.cdn.CustomDomainArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.cdn.CustomDomainArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public CustomDomain(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomDomain(String name) {
        this(name, CustomDomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomDomain(String name, CustomDomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomDomain(String name, CustomDomainArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:CustomDomain", name, args == null ? CustomDomainArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CustomDomain(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:CustomDomain", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:cdn/v20150601:CustomDomain").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20160402:CustomDomain").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20161002:CustomDomain").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20170402:CustomDomain").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20171012:CustomDomain").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20190415:CustomDomain").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20190615:CustomDomain").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20190615preview:CustomDomain").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20191231:CustomDomain").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20200331:CustomDomain").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20200415:CustomDomain").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20200901:CustomDomain").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20210601:CustomDomain").build())
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
    public static CustomDomain get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CustomDomain(name, id, options);
    }
}
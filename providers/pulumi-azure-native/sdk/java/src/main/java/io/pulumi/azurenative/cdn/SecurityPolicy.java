// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cdn.SecurityPolicyArgs;
import io.pulumi.azurenative.cdn.outputs.SecurityPolicyWebApplicationFirewallParametersResponse;
import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * SecurityPolicy association for AzureFrontDoor profile
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:cdn:SecurityPolicy securityPolicy1 /subscriptions/subid/resourcegroups/RG/providers/Microsoft.Cdn/profiles/profile1/securityPolicies/securityPolicy1 
 * ```
 * 
 */
@ResourceType(type="azure-native:cdn:SecurityPolicy")
public class SecurityPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="deploymentStatus", type=String.class, parameters={})
    private Output<String> deploymentStatus;

    public Output<String> getDeploymentStatus() {
        return this.deploymentStatus;
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
     * object which contains security policy parameters
     * 
     */
    @OutputExport(name="parameters", type=SecurityPolicyWebApplicationFirewallParametersResponse.class, parameters={})
    private Output</* @Nullable */ SecurityPolicyWebApplicationFirewallParametersResponse> parameters;

    /**
     * @return object which contains security policy parameters
     * 
     */
    public Output</* @Nullable */ SecurityPolicyWebApplicationFirewallParametersResponse> getParameters() {
        return this.parameters;
    }
    /**
     * Provisioning status
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning status
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
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

    public interface BuilderApplicator {
        public void apply(SecurityPolicyArgs.Builder a);
    }
    private static io.pulumi.azurenative.cdn.SecurityPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.cdn.SecurityPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SecurityPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecurityPolicy(String name) {
        this(name, SecurityPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityPolicy(String name, SecurityPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityPolicy(String name, SecurityPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:SecurityPolicy", name, args == null ? SecurityPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SecurityPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:SecurityPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:cdn/v20200901:SecurityPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20210601:SecurityPolicy").build())
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
    public static SecurityPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SecurityPolicy(name, id, options);
    }
}
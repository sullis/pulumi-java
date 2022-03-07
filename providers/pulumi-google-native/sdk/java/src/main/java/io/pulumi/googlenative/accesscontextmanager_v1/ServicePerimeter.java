// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.accesscontextmanager_v1.ServicePerimeterArgs;
import io.pulumi.googlenative.accesscontextmanager_v1.outputs.ServicePerimeterConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a service perimeter. The long-running operation from this RPC has a successful status after the service perimeter propagates to long-lasting storage. If a service perimeter contains errors, an error response is returned for the first error encountered.
 * 
 */
@ResourceType(type="google-native:accesscontextmanager/v1:ServicePerimeter")
public class ServicePerimeter extends io.pulumi.resources.CustomResource {
    /**
     * Description of the `ServicePerimeter` and its use. Does not affect behavior.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the `ServicePerimeter` and its use. Does not affect behavior.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Resource name for the ServicePerimeter. The `short_name` component must begin with a letter and only include alphanumeric and '_'. Format: `accessPolicies/{access_policy}/servicePerimeters/{service_perimeter}`
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name for the ServicePerimeter. The `short_name` component must begin with a letter and only include alphanumeric and '_'. Format: `accessPolicies/{access_policy}/servicePerimeters/{service_perimeter}`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Perimeter type indicator. A single project is allowed to be a member of single regular perimeter, but multiple service perimeter bridges. A project cannot be a included in a perimeter bridge without being included in regular perimeter. For perimeter bridges, the restricted service list as well as access level lists must be empty.
     * 
     */
    @OutputExport(name="perimeterType", type=String.class, parameters={})
    private Output<String> perimeterType;

    /**
     * @return Perimeter type indicator. A single project is allowed to be a member of single regular perimeter, but multiple service perimeter bridges. A project cannot be a included in a perimeter bridge without being included in regular perimeter. For perimeter bridges, the restricted service list as well as access level lists must be empty.
     * 
     */
    public Output<String> getPerimeterType() {
        return this.perimeterType;
    }
    /**
     * Proposed (or dry run) ServicePerimeter configuration. This configuration allows to specify and test ServicePerimeter configuration without enforcing actual access restrictions. Only allowed to be set when the "use_explicit_dry_run_spec" flag is set.
     * 
     */
    @OutputExport(name="spec", type=ServicePerimeterConfigResponse.class, parameters={})
    private Output<ServicePerimeterConfigResponse> spec;

    /**
     * @return Proposed (or dry run) ServicePerimeter configuration. This configuration allows to specify and test ServicePerimeter configuration without enforcing actual access restrictions. Only allowed to be set when the "use_explicit_dry_run_spec" flag is set.
     * 
     */
    public Output<ServicePerimeterConfigResponse> getSpec() {
        return this.spec;
    }
    /**
     * Current ServicePerimeter configuration. Specifies sets of resources, restricted services and access levels that determine perimeter content and boundaries.
     * 
     */
    @OutputExport(name="status", type=ServicePerimeterConfigResponse.class, parameters={})
    private Output<ServicePerimeterConfigResponse> status;

    /**
     * @return Current ServicePerimeter configuration. Specifies sets of resources, restricted services and access levels that determine perimeter content and boundaries.
     * 
     */
    public Output<ServicePerimeterConfigResponse> getStatus() {
        return this.status;
    }
    /**
     * Human readable title. Must be unique within the Policy.
     * 
     */
    @OutputExport(name="title", type=String.class, parameters={})
    private Output<String> title;

    /**
     * @return Human readable title. Must be unique within the Policy.
     * 
     */
    public Output<String> getTitle() {
        return this.title;
    }
    /**
     * Use explicit dry run spec flag. Ordinarily, a dry-run spec implicitly exists for all Service Perimeters, and that spec is identical to the status for those Service Perimeters. When this flag is set, it inhibits the generation of the implicit spec, thereby allowing the user to explicitly provide a configuration ("spec") to use in a dry-run version of the Service Perimeter. This allows the user to test changes to the enforced config ("status") without actually enforcing them. This testing is done through analyzing the differences between currently enforced and suggested restrictions. use_explicit_dry_run_spec must bet set to True if any of the fields in the spec are set to non-default values.
     * 
     */
    @OutputExport(name="useExplicitDryRunSpec", type=Boolean.class, parameters={})
    private Output<Boolean> useExplicitDryRunSpec;

    /**
     * @return Use explicit dry run spec flag. Ordinarily, a dry-run spec implicitly exists for all Service Perimeters, and that spec is identical to the status for those Service Perimeters. When this flag is set, it inhibits the generation of the implicit spec, thereby allowing the user to explicitly provide a configuration ("spec") to use in a dry-run version of the Service Perimeter. This allows the user to test changes to the enforced config ("status") without actually enforcing them. This testing is done through analyzing the differences between currently enforced and suggested restrictions. use_explicit_dry_run_spec must bet set to True if any of the fields in the spec are set to non-default values.
     * 
     */
    public Output<Boolean> getUseExplicitDryRunSpec() {
        return this.useExplicitDryRunSpec;
    }

    public interface BuilderApplicator {
        public void apply(ServicePerimeterArgs.Builder a);
    }
    private static io.pulumi.googlenative.accesscontextmanager_v1.ServicePerimeterArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.accesscontextmanager_v1.ServicePerimeterArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ServicePerimeter(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServicePerimeter(String name) {
        this(name, ServicePerimeterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServicePerimeter(String name, ServicePerimeterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServicePerimeter(String name, ServicePerimeterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:accesscontextmanager/v1:ServicePerimeter", name, args == null ? ServicePerimeterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ServicePerimeter(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:accesscontextmanager/v1:ServicePerimeter", name, null, makeResourceOptions(options, id));
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
    public static ServicePerimeter get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServicePerimeter(name, id, options);
    }
}
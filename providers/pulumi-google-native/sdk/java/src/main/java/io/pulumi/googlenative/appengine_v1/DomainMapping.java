// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.appengine_v1.DomainMappingArgs;
import io.pulumi.googlenative.appengine_v1.outputs.ResourceRecordResponse;
import io.pulumi.googlenative.appengine_v1.outputs.SslSettingsResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Maps a domain to an application. A user must be authorized to administer a domain in order to map it to an application. For a list of available authorized domains, see AuthorizedDomains.ListAuthorizedDomains.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:appengine/v1:DomainMapping")
public class DomainMapping extends io.pulumi.resources.CustomResource {
    /**
     * Full path to the DomainMapping resource in the API. Example: apps/myapp/domainMapping/example.com.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Full path to the DomainMapping resource in the API. Example: apps/myapp/domainMapping/example.com.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The resource records required to configure this domain mapping. These records must be added to the domain's DNS configuration in order to serve the application via this domain mapping.
     * 
     */
    @OutputExport(name="resourceRecords", type=List.class, parameters={ResourceRecordResponse.class})
    private Output<List<ResourceRecordResponse>> resourceRecords;

    /**
     * @return The resource records required to configure this domain mapping. These records must be added to the domain's DNS configuration in order to serve the application via this domain mapping.
     * 
     */
    public Output<List<ResourceRecordResponse>> getResourceRecords() {
        return this.resourceRecords;
    }
    /**
     * SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
     * 
     */
    @OutputExport(name="sslSettings", type=SslSettingsResponse.class, parameters={})
    private Output<SslSettingsResponse> sslSettings;

    /**
     * @return SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
     * 
     */
    public Output<SslSettingsResponse> getSslSettings() {
        return this.sslSettings;
    }

    public interface BuilderApplicator {
        public void apply(DomainMappingArgs.Builder a);
    }
    private static io.pulumi.googlenative.appengine_v1.DomainMappingArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.appengine_v1.DomainMappingArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DomainMapping(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DomainMapping(String name) {
        this(name, DomainMappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainMapping(String name, DomainMappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainMapping(String name, DomainMappingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:appengine/v1:DomainMapping", name, args == null ? DomainMappingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DomainMapping(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:appengine/v1:DomainMapping", name, null, makeResourceOptions(options, id));
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
    public static DomainMapping get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DomainMapping(name, id, options);
    }
}
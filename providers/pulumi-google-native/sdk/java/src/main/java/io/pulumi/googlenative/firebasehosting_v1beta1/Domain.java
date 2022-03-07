// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasehosting_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.firebasehosting_v1beta1.DomainArgs;
import io.pulumi.googlenative.firebasehosting_v1beta1.outputs.DomainProvisioningResponse;
import io.pulumi.googlenative.firebasehosting_v1beta1.outputs.DomainRedirectResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a domain mapping on the specified site.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:firebasehosting/v1beta1:Domain")
public class Domain extends io.pulumi.resources.CustomResource {
    /**
     * The domain name of the association.
     * 
     */
    @OutputExport(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return The domain name of the association.
     * 
     */
    public Output<String> getDomainName() {
        return this.domainName;
    }
    /**
     * If set, the domain should redirect with the provided parameters.
     * 
     */
    @OutputExport(name="domainRedirect", type=DomainRedirectResponse.class, parameters={})
    private Output<DomainRedirectResponse> domainRedirect;

    /**
     * @return If set, the domain should redirect with the provided parameters.
     * 
     */
    public Output<DomainRedirectResponse> getDomainRedirect() {
        return this.domainRedirect;
    }
    /**
     * Information about the provisioning of certificates and the health of the DNS resolution for the domain.
     * 
     */
    @OutputExport(name="provisioning", type=DomainProvisioningResponse.class, parameters={})
    private Output<DomainProvisioningResponse> provisioning;

    /**
     * @return Information about the provisioning of certificates and the health of the DNS resolution for the domain.
     * 
     */
    public Output<DomainProvisioningResponse> getProvisioning() {
        return this.provisioning;
    }
    /**
     * The site name of the association.
     * 
     */
    @OutputExport(name="site", type=String.class, parameters={})
    private Output<String> site;

    /**
     * @return The site name of the association.
     * 
     */
    public Output<String> getSite() {
        return this.site;
    }
    /**
     * Additional status of the domain association.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Additional status of the domain association.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * The time at which the domain was last updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time at which the domain was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(DomainArgs.Builder a);
    }
    private static io.pulumi.googlenative.firebasehosting_v1beta1.DomainArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.firebasehosting_v1beta1.DomainArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Domain(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Domain(String name) {
        this(name, DomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Domain(String name, DomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Domain(String name, DomainArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firebasehosting/v1beta1:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Domain(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firebasehosting/v1beta1:Domain", name, null, makeResourceOptions(options, id));
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
    public static Domain get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Domain(name, id, options);
    }
}
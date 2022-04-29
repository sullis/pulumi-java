// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.eks;

import com.pulumi.aws.Provider;
import com.pulumi.aws.iam.Role;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.eks.ClusterCreationRoleProviderArgs;
import com.pulumi.eks.Utilities;
import com.pulumi.resources.ComponentResource;
import com.pulumi.resources.ComponentResourceOptions;
import com.pulumi.resources.CustomResourceOptions;
import javax.annotation.Nullable;

/**
 * ClusterCreationRoleProvider is a component that wraps creating a role provider that can be passed to the `Cluster`&#39;s `creationRoleProvider`. This can be used to provide a specific role to use for the creation of the EKS cluster different from the role being used to run the Pulumi deployment.
 * 
 */
@ResourceType(type="eks:index:ClusterCreationRoleProvider")
public class ClusterCreationRoleProvider extends ComponentResource {
    @Export(name="provider", type=Provider.class, parameters={})
    private Output<Provider> provider;

    public Output<Provider> provider() {
        return this.provider;
    }
    @Export(name="role", type=Role.class, parameters={})
    private Output<Role> role;

    public Output<Role> role() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterCreationRoleProvider(String name) {
        this(name, ClusterCreationRoleProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterCreationRoleProvider(String name, @Nullable ClusterCreationRoleProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterCreationRoleProvider(String name, @Nullable ClusterCreationRoleProviderArgs args, @Nullable ComponentResourceOptions options) {
        super("eks:index:ClusterCreationRoleProvider", name, args == null ? ClusterCreationRoleProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()), true);
    }

    private static ComponentResourceOptions makeResourceOptions(@Nullable ComponentResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = ComponentResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return ComponentResourceOptions.merge(defaultOptions, options, id);
    }

}

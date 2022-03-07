// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.eks.IdentityProviderConfigArgs;
import io.pulumi.aws.eks.inputs.IdentityProviderConfigState;
import io.pulumi.aws.eks.outputs.IdentityProviderConfigOidc;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an EKS Identity Provider Configuration.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * EKS Identity Provider Configurations can be imported using the `cluster_name` and `identity_provider_config_name` separated by a colon (`:`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:eks/identityProviderConfig:IdentityProviderConfig my_identity_provider_config my_cluster:my_identity_provider_config
 * ```
 * 
 */
@ResourceType(type="aws:eks/identityProviderConfig:IdentityProviderConfig")
public class IdentityProviderConfig extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the EKS Identity Provider Configuration.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the EKS Identity Provider Configuration.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Name of the EKS Cluster.
     * 
     */
    @OutputExport(name="clusterName", type=String.class, parameters={})
    private Output<String> clusterName;

    /**
     * @return Name of the EKS Cluster.
     * 
     */
    public Output<String> getClusterName() {
        return this.clusterName;
    }
    /**
     * Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster. Detailed below.
     * 
     */
    @OutputExport(name="oidc", type=IdentityProviderConfigOidc.class, parameters={})
    private Output<IdentityProviderConfigOidc> oidc;

    /**
     * @return Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster. Detailed below.
     * 
     */
    public Output<IdentityProviderConfigOidc> getOidc() {
        return this.oidc;
    }
    /**
     * Status of the EKS Identity Provider Configuration.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the EKS Identity Provider Configuration.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(IdentityProviderConfigArgs.Builder a);
    }
    private static io.pulumi.aws.eks.IdentityProviderConfigArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.eks.IdentityProviderConfigArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public IdentityProviderConfig(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IdentityProviderConfig(String name) {
        this(name, IdentityProviderConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IdentityProviderConfig(String name, IdentityProviderConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IdentityProviderConfig(String name, IdentityProviderConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:eks/identityProviderConfig:IdentityProviderConfig", name, args == null ? IdentityProviderConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IdentityProviderConfig(String name, Input<String> id, @Nullable IdentityProviderConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:eks/identityProviderConfig:IdentityProviderConfig", name, state, makeResourceOptions(options, id));
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
    public static IdentityProviderConfig get(String name, Input<String> id, @Nullable IdentityProviderConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IdentityProviderConfig(name, id, state, options);
    }
}
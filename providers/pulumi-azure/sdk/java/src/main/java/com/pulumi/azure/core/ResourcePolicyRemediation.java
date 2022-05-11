// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.core.ResourcePolicyRemediationArgs;
import com.pulumi.azure.core.inputs.ResourcePolicyRemediationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="azure:core/resourcePolicyRemediation:ResourcePolicyRemediation")
public class ResourcePolicyRemediation extends com.pulumi.resources.CustomResource {
    @Export(name="locationFilters", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> locationFilters;

    public Output<Optional<List<String>>> locationFilters() {
        return Codegen.optional(this.locationFilters);
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="policyAssignmentId", type=String.class, parameters={})
    private Output<String> policyAssignmentId;

    public Output<String> policyAssignmentId() {
        return this.policyAssignmentId;
    }
    @Export(name="policyDefinitionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> policyDefinitionId;

    public Output<Optional<String>> policyDefinitionId() {
        return Codegen.optional(this.policyDefinitionId);
    }
    @Export(name="resourceDiscoveryMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceDiscoveryMode;

    public Output<Optional<String>> resourceDiscoveryMode() {
        return Codegen.optional(this.resourceDiscoveryMode);
    }
    @Export(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourcePolicyRemediation(String name) {
        this(name, ResourcePolicyRemediationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourcePolicyRemediation(String name, ResourcePolicyRemediationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourcePolicyRemediation(String name, ResourcePolicyRemediationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:core/resourcePolicyRemediation:ResourcePolicyRemediation", name, args == null ? ResourcePolicyRemediationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourcePolicyRemediation(String name, Output<String> id, @Nullable ResourcePolicyRemediationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:core/resourcePolicyRemediation:ResourcePolicyRemediation", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static ResourcePolicyRemediation get(String name, Output<String> id, @Nullable ResourcePolicyRemediationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourcePolicyRemediation(name, id, state, options);
    }
}

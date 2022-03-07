// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1;

import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.ClusterRoleArgs;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.outputs.AggregationRule;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.outputs.PolicyRule;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding.
 * 
 */
@ResourceType(type="kubernetes:rbac.authorization.k8s.io/v1:ClusterRole")
public class ClusterRole extends io.pulumi.resources.CustomResource {
    /**
     * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
     * 
     */
    @OutputExport(name="aggregationRule", type=AggregationRule.class, parameters={})
    private Output</* @Nullable */ AggregationRule> aggregationRule;

    /**
     * @return AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
     * 
     */
    public Output</* @Nullable */ AggregationRule> getAggregationRule() {
        return this.aggregationRule;
    }
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Standard object's metadata.
     * 
     */
    @OutputExport(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return Standard object's metadata.
     * 
     */
    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    /**
     * Rules holds all the PolicyRules for this ClusterRole
     * 
     */
    @OutputExport(name="rules", type=List.class, parameters={PolicyRule.class})
    private Output</* @Nullable */ List<PolicyRule>> rules;

    /**
     * @return Rules holds all the PolicyRules for this ClusterRole
     * 
     */
    public Output</* @Nullable */ List<PolicyRule>> getRules() {
        return this.rules;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ClusterRoleArgs.Builder a);
    }
    private static io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.ClusterRoleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.ClusterRoleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ClusterRole(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterRole(String name) {
        this(name, ClusterRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterRole(String name, @Nullable ClusterRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterRole(String name, @Nullable ClusterRoleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:rbac.authorization.k8s.io/v1:ClusterRole", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private ClusterRole(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:rbac.authorization.k8s.io/v1:ClusterRole", name, null, makeResourceOptions(options, id));
    }

    private static ClusterRoleArgs makeArgs(@Nullable ClusterRoleArgs args) {
        var builder = args == null ? ClusterRoleArgs.builder() : ClusterRoleArgs.builder(args);
        return builder
            .setApiVersion("rbac.authorization.k8s.io/v1")
            .setKind("ClusterRole")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:rbac.authorization.k8s.io/v1alpha1:ClusterRole").build()),
                Input.of(Alias.builder().setType("kubernetes:rbac.authorization.k8s.io/v1beta1:ClusterRole").build())
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
    public static ClusterRole get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ClusterRole(name, id, options);
    }
}
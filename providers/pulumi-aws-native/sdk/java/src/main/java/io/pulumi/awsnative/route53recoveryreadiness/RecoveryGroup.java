// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.route53recoveryreadiness.RecoveryGroupArgs;
import io.pulumi.awsnative.route53recoveryreadiness.outputs.RecoveryGroupTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * AWS Route53 Recovery Readiness Recovery Group Schema and API specifications.
 * 
 */
@ResourceType(type="aws-native:route53recoveryreadiness:RecoveryGroup")
public class RecoveryGroup extends io.pulumi.resources.CustomResource {
    /**
     * A list of the cell Amazon Resource Names (ARNs) in the recovery group.
     * 
     */
    @Export(name="cells", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> cells;

    /**
     * @return A list of the cell Amazon Resource Names (ARNs) in the recovery group.
     * 
     */
    public Output</* @Nullable */ List<String>> cells() {
        return this.cells;
    }
    /**
     * A collection of tags associated with a resource.
     * 
     */
    @Export(name="recoveryGroupArn", type=String.class, parameters={})
    private Output<String> recoveryGroupArn;

    /**
     * @return A collection of tags associated with a resource.
     * 
     */
    public Output<String> recoveryGroupArn() {
        return this.recoveryGroupArn;
    }
    /**
     * The name of the recovery group to create.
     * 
     */
    @Export(name="recoveryGroupName", type=String.class, parameters={})
    private Output<String> recoveryGroupName;

    /**
     * @return The name of the recovery group to create.
     * 
     */
    public Output<String> recoveryGroupName() {
        return this.recoveryGroupName;
    }
    /**
     * A collection of tags associated with a resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={RecoveryGroupTag.class})
    private Output</* @Nullable */ List<RecoveryGroupTag>> tags;

    /**
     * @return A collection of tags associated with a resource.
     * 
     */
    public Output</* @Nullable */ List<RecoveryGroupTag>> tags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RecoveryGroup(String name) {
        this(name, RecoveryGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RecoveryGroup(String name, @Nullable RecoveryGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RecoveryGroup(String name, @Nullable RecoveryGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53recoveryreadiness:RecoveryGroup", name, args == null ? RecoveryGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RecoveryGroup(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53recoveryreadiness:RecoveryGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static RecoveryGroup get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RecoveryGroup(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resiliencehub;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.resiliencehub.ResiliencyPolicyArgs;
import io.pulumi.awsnative.resiliencehub.enums.ResiliencyPolicyDataLocationConstraint;
import io.pulumi.awsnative.resiliencehub.enums.ResiliencyPolicyTier;
import io.pulumi.awsnative.resiliencehub.outputs.ResiliencyPolicyPolicyMap;
import io.pulumi.awsnative.resiliencehub.outputs.ResiliencyPolicyTagMap;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type Definition for Resiliency Policy.
 * 
 */
@ResourceType(type="aws-native:resiliencehub:ResiliencyPolicy")
public class ResiliencyPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Data Location Constraint of the Policy.
     * 
     */
    @OutputExport(name="dataLocationConstraint", type=ResiliencyPolicyDataLocationConstraint.class, parameters={})
    private Output</* @Nullable */ ResiliencyPolicyDataLocationConstraint> dataLocationConstraint;

    /**
     * @return Data Location Constraint of the Policy.
     * 
     */
    public Output</* @Nullable */ ResiliencyPolicyDataLocationConstraint> getDataLocationConstraint() {
        return this.dataLocationConstraint;
    }
    @OutputExport(name="policy", type=ResiliencyPolicyPolicyMap.class, parameters={})
    private Output<ResiliencyPolicyPolicyMap> policy;

    public Output<ResiliencyPolicyPolicyMap> getPolicy() {
        return this.policy;
    }
    /**
     * Amazon Resource Name (ARN) of the Resiliency Policy.
     * 
     */
    @OutputExport(name="policyArn", type=String.class, parameters={})
    private Output<String> policyArn;

    /**
     * @return Amazon Resource Name (ARN) of the Resiliency Policy.
     * 
     */
    public Output<String> getPolicyArn() {
        return this.policyArn;
    }
    /**
     * Description of Resiliency Policy.
     * 
     */
    @OutputExport(name="policyDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> policyDescription;

    /**
     * @return Description of Resiliency Policy.
     * 
     */
    public Output</* @Nullable */ String> getPolicyDescription() {
        return this.policyDescription;
    }
    /**
     * Name of Resiliency Policy.
     * 
     */
    @OutputExport(name="policyName", type=String.class, parameters={})
    private Output<String> policyName;

    /**
     * @return Name of Resiliency Policy.
     * 
     */
    public Output<String> getPolicyName() {
        return this.policyName;
    }
    @OutputExport(name="tags", type=ResiliencyPolicyTagMap.class, parameters={})
    private Output</* @Nullable */ ResiliencyPolicyTagMap> tags;

    public Output</* @Nullable */ ResiliencyPolicyTagMap> getTags() {
        return this.tags;
    }
    /**
     * Resiliency Policy Tier.
     * 
     */
    @OutputExport(name="tier", type=ResiliencyPolicyTier.class, parameters={})
    private Output<ResiliencyPolicyTier> tier;

    /**
     * @return Resiliency Policy Tier.
     * 
     */
    public Output<ResiliencyPolicyTier> getTier() {
        return this.tier;
    }

    public interface BuilderApplicator {
        public void apply(ResiliencyPolicyArgs.Builder a);
    }
    private static io.pulumi.awsnative.resiliencehub.ResiliencyPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.resiliencehub.ResiliencyPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ResiliencyPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResiliencyPolicy(String name) {
        this(name, ResiliencyPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResiliencyPolicy(String name, ResiliencyPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResiliencyPolicy(String name, ResiliencyPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:resiliencehub:ResiliencyPolicy", name, args == null ? ResiliencyPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResiliencyPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:resiliencehub:ResiliencyPolicy", name, null, makeResourceOptions(options, id));
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
    public static ResiliencyPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResiliencyPolicy(name, id, options);
    }
}
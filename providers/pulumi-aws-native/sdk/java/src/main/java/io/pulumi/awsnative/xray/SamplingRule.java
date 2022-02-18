// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.xray;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.xray.SamplingRuleArgs;
import io.pulumi.awsnative.xray.outputs.SamplingRuleRecord;
import io.pulumi.awsnative.xray.outputs.SamplingRuleUpdate;
import io.pulumi.awsnative.xray.outputs.TagsItemProperties;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This schema provides construct and validation rules for AWS-XRay SamplingRule resource parameters.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:xray:SamplingRule")
public class SamplingRule extends io.pulumi.resources.CustomResource {
    @OutputExport(name="ruleARN", type=String.class, parameters={})
    private Output<String> ruleARN;

    public Output<String> getRuleARN() {
        return this.ruleARN;
    }
    @OutputExport(name="ruleName", type=String.class, parameters={})
    private Output</* @Nullable */ String> ruleName;

    public Output</* @Nullable */ String> getRuleName() {
        return this.ruleName;
    }
    @OutputExport(name="samplingRule", type=io.pulumi.awsnative.xray.outputs.SamplingRule.class, parameters={})
    private Output</* @Nullable */ io.pulumi.awsnative.xray.outputs.SamplingRule> samplingRule;

    public Output</* @Nullable */ io.pulumi.awsnative.xray.outputs.SamplingRule> getSamplingRule() {
        return this.samplingRule;
    }
    @OutputExport(name="samplingRuleRecord", type=SamplingRuleRecord.class, parameters={})
    private Output</* @Nullable */ SamplingRuleRecord> samplingRuleRecord;

    public Output</* @Nullable */ SamplingRuleRecord> getSamplingRuleRecord() {
        return this.samplingRuleRecord;
    }
    @OutputExport(name="samplingRuleUpdate", type=SamplingRuleUpdate.class, parameters={})
    private Output</* @Nullable */ SamplingRuleUpdate> samplingRuleUpdate;

    public Output</* @Nullable */ SamplingRuleUpdate> getSamplingRuleUpdate() {
        return this.samplingRuleUpdate;
    }
    @OutputExport(name="tags", type=List.class, parameters={TagsItemProperties.class})
    private Output</* @Nullable */ List<TagsItemProperties>> tags;

    public Output</* @Nullable */ List<TagsItemProperties>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SamplingRule(String name, @Nullable SamplingRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:xray:SamplingRule", name, args == null ? SamplingRuleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SamplingRule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:xray:SamplingRule", name, null, makeResourceOptions(options, id));
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
    public static SamplingRule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SamplingRule(name, id, options);
    }
}

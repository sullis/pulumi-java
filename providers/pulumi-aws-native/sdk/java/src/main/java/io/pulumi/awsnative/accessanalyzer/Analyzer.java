// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.accessanalyzer;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.accessanalyzer.AnalyzerArgs;
import io.pulumi.awsnative.accessanalyzer.outputs.AnalyzerArchiveRule;
import io.pulumi.awsnative.accessanalyzer.outputs.AnalyzerTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::AccessAnalyzer::Analyzer type specifies an analyzer of the user's account
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:accessanalyzer:Analyzer")
public class Analyzer extends io.pulumi.resources.CustomResource {
    /**
     * Analyzer name
     * 
     */
    @OutputExport(name="analyzerName", type=String.class, parameters={})
    private Output</* @Nullable */ String> analyzerName;

    /**
     * @return Analyzer name
     * 
     */
    public Output</* @Nullable */ String> getAnalyzerName() {
        return this.analyzerName;
    }
    @OutputExport(name="archiveRules", type=List.class, parameters={AnalyzerArchiveRule.class})
    private Output</* @Nullable */ List<AnalyzerArchiveRule>> archiveRules;

    public Output</* @Nullable */ List<AnalyzerArchiveRule>> getArchiveRules() {
        return this.archiveRules;
    }
    /**
     * Amazon Resource Name (ARN) of the analyzer
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the analyzer
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={AnalyzerTag.class})
    private Output</* @Nullable */ List<AnalyzerTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<AnalyzerTag>> getTags() {
        return this.tags;
    }
    /**
     * The type of the analyzer, must be ACCOUNT or ORGANIZATION
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the analyzer, must be ACCOUNT or ORGANIZATION
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Analyzer(String name, AnalyzerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:accessanalyzer:Analyzer", name, args == null ? AnalyzerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Analyzer(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:accessanalyzer:Analyzer", name, null, makeResourceOptions(options, id));
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
    public static Analyzer get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Analyzer(name, id, options);
    }
}

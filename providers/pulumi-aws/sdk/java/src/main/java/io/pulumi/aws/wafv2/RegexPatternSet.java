// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.wafv2.RegexPatternSetArgs;
import io.pulumi.aws.wafv2.inputs.RegexPatternSetState;
import io.pulumi.aws.wafv2.outputs.RegexPatternSetRegularExpression;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an AWS WAFv2 Regex Pattern Set Resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * WAFv2 Regex Pattern Sets can be imported using `ID/name/scope` e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:wafv2/regexPatternSet:RegexPatternSet example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc/example/REGIONAL
 * ```
 * 
 */
@ResourceType(type="aws:wafv2/regexPatternSet:RegexPatternSet")
public class RegexPatternSet extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) that identifies the cluster.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) that identifies the cluster.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A friendly description of the regular expression pattern set.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A friendly description of the regular expression pattern set.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    @Export(name="lockToken", type=String.class, parameters={})
    private Output<String> lockToken;

    public Output<String> lockToken() {
        return this.lockToken;
    }
    /**
     * A friendly name of the regular expression pattern set.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A friendly name of the regular expression pattern set.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * One or more blocks of regular expression patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`. See Regular Expression below for details.
     * 
     */
    @Export(name="regularExpressions", type=List.class, parameters={RegexPatternSetRegularExpression.class})
    private Output</* @Nullable */ List<RegexPatternSetRegularExpression>> regularExpressions;

    /**
     * @return One or more blocks of regular expression patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`. See Regular Expression below for details.
     * 
     */
    public Output</* @Nullable */ List<RegexPatternSetRegularExpression>> regularExpressions() {
        return this.regularExpressions;
    }
    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output<String> scope;

    /**
     * @return Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }
    /**
     * An array of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return An array of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegexPatternSet(String name) {
        this(name, RegexPatternSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegexPatternSet(String name, RegexPatternSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegexPatternSet(String name, RegexPatternSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafv2/regexPatternSet:RegexPatternSet", name, args == null ? RegexPatternSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegexPatternSet(String name, Output<String> id, @Nullable RegexPatternSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafv2/regexPatternSet:RegexPatternSet", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RegexPatternSet get(String name, Output<String> id, @Nullable RegexPatternSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegexPatternSet(name, id, state, options);
    }
}

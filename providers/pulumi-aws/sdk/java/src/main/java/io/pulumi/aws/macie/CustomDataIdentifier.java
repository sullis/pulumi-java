// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.macie.CustomDataIdentifierArgs;
import io.pulumi.aws.macie.inputs.CustomDataIdentifierState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage an [AWS Macie Custom Data Identifier](https://docs.aws.amazon.com/macie/latest/APIReference/custom-data-identifiers-id.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_macie2_custom_data_identifier` can be imported using the id, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:macie/customDataIdentifier:CustomDataIdentifier example abcd1
 * ```
 * 
 */
@ResourceType(type="aws:macie/customDataIdentifier:CustomDataIdentifier")
public class CustomDataIdentifier extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the custom data identifier.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The date and time, in UTC and extended RFC 3339 format, when the Amazon Macie account was created.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The date and time, in UTC and extended RFC 3339 format, when the Amazon Macie account was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * A custom description of the custom data identifier. The description can contain as many as 512 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A custom description of the custom data identifier. The description can contain as many as 512 characters.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * An array that lists specific character sequences (ignore words) to exclude from the results. If the text matched by the regular expression is the same as any string in this array, Amazon Macie ignores it. The array can contain as many as 10 ignore words. Each ignore word can contain 4 - 90 characters. Ignore words are case sensitive.
     * 
     */
    @Export(name="ignoreWords", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> ignoreWords;

    /**
     * @return An array that lists specific character sequences (ignore words) to exclude from the results. If the text matched by the regular expression is the same as any string in this array, Amazon Macie ignores it. The array can contain as many as 10 ignore words. Each ignore word can contain 4 - 90 characters. Ignore words are case sensitive.
     * 
     */
    public Output</* @Nullable */ List<String>> ignoreWords() {
        return this.ignoreWords;
    }
    /**
     * An array that lists specific character sequences (keywords), one of which must be within proximity (`maximum_match_distance`) of the regular expression to match. The array can contain as many as 50 keywords. Each keyword can contain 3 - 90 characters. Keywords aren't case sensitive.
     * 
     */
    @Export(name="keywords", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> keywords;

    /**
     * @return An array that lists specific character sequences (keywords), one of which must be within proximity (`maximum_match_distance`) of the regular expression to match. The array can contain as many as 50 keywords. Each keyword can contain 3 - 90 characters. Keywords aren't case sensitive.
     * 
     */
    public Output</* @Nullable */ List<String>> keywords() {
        return this.keywords;
    }
    /**
     * The maximum number of characters that can exist between text that matches the regex pattern and the character sequences specified by the keywords array. Macie includes or excludes a result based on the proximity of a keyword to text that matches the regex pattern. The distance can be 1 - 300 characters. The default value is 50.
     * 
     */
    @Export(name="maximumMatchDistance", type=Integer.class, parameters={})
    private Output<Integer> maximumMatchDistance;

    /**
     * @return The maximum number of characters that can exist between text that matches the regex pattern and the character sequences specified by the keywords array. Macie includes or excludes a result based on the proximity of a keyword to text that matches the regex pattern. The distance can be 1 - 300 characters. The default value is 50.
     * 
     */
    public Output<Integer> maximumMatchDistance() {
        return this.maximumMatchDistance;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Output<String> namePrefix() {
        return this.namePrefix;
    }
    /**
     * The regular expression (regex) that defines the pattern to match. The expression can contain as many as 512 characters.
     * 
     */
    @Export(name="regex", type=String.class, parameters={})
    private Output</* @Nullable */ String> regex;

    /**
     * @return The regular expression (regex) that defines the pattern to match. The expression can contain as many as 512 characters.
     * 
     */
    public Output</* @Nullable */ String> regex() {
        return this.regex;
    }
    /**
     * A map of key-value pairs that specifies the tags to associate with the custom data identifier.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of key-value pairs that specifies the tags to associate with the custom data identifier.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomDataIdentifier(String name) {
        this(name, CustomDataIdentifierArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomDataIdentifier(String name, @Nullable CustomDataIdentifierArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomDataIdentifier(String name, @Nullable CustomDataIdentifierArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:macie/customDataIdentifier:CustomDataIdentifier", name, args == null ? CustomDataIdentifierArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomDataIdentifier(String name, Output<String> id, @Nullable CustomDataIdentifierState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:macie/customDataIdentifier:CustomDataIdentifier", name, state, makeResourceOptions(options, id));
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
    public static CustomDataIdentifier get(String name, Output<String> id, @Nullable CustomDataIdentifierState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CustomDataIdentifier(name, id, state, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codecommit;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.codecommit.RepositoryArgs;
import io.pulumi.aws.codecommit.inputs.RepositoryState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a CodeCommit Repository Resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Codecommit repository can be imported using repository name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:codecommit/repository:Repository imported ExistingRepo
 * ```
 * 
 */
@ResourceType(type="aws:codecommit/repository:Repository")
public class Repository extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the repository
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the repository
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The URL to use for cloning the repository over HTTPS.
     * 
     */
    @OutputExport(name="cloneUrlHttp", type=String.class, parameters={})
    private Output<String> cloneUrlHttp;

    /**
     * @return The URL to use for cloning the repository over HTTPS.
     * 
     */
    public Output<String> getCloneUrlHttp() {
        return this.cloneUrlHttp;
    }
    /**
     * The URL to use for cloning the repository over SSH.
     * 
     */
    @OutputExport(name="cloneUrlSsh", type=String.class, parameters={})
    private Output<String> cloneUrlSsh;

    /**
     * @return The URL to use for cloning the repository over SSH.
     * 
     */
    public Output<String> getCloneUrlSsh() {
        return this.cloneUrlSsh;
    }
    /**
     * The default branch of the repository. The branch specified here needs to exist.
     * 
     */
    @OutputExport(name="defaultBranch", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultBranch;

    /**
     * @return The default branch of the repository. The branch specified here needs to exist.
     * 
     */
    public Output</* @Nullable */ String> getDefaultBranch() {
        return this.defaultBranch;
    }
    /**
     * The description of the repository. This needs to be less than 1000 characters
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the repository. This needs to be less than 1000 characters
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The ID of the repository
     * 
     */
    @OutputExport(name="repositoryId", type=String.class, parameters={})
    private Output<String> repositoryId;

    /**
     * @return The ID of the repository
     * 
     */
    public Output<String> getRepositoryId() {
        return this.repositoryId;
    }
    /**
     * The name for the repository. This needs to be less than 100 characters.
     * 
     */
    @OutputExport(name="repositoryName", type=String.class, parameters={})
    private Output<String> repositoryName;

    /**
     * @return The name for the repository. This needs to be less than 100 characters.
     * 
     */
    public Output<String> getRepositoryName() {
        return this.repositoryName;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(RepositoryArgs.Builder a);
    }
    private static io.pulumi.aws.codecommit.RepositoryArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.codecommit.RepositoryArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Repository(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Repository(String name) {
        this(name, RepositoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Repository(String name, RepositoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Repository(String name, RepositoryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:codecommit/repository:Repository", name, args == null ? RepositoryArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Repository(String name, Input<String> id, @Nullable RepositoryState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:codecommit/repository:Repository", name, state, makeResourceOptions(options, id));
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
    public static Repository get(String name, Input<String> id, @Nullable RepositoryState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Repository(name, id, state, options);
    }
}
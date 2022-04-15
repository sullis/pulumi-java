// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.codebuild.SourceCredentialArgs;
import io.pulumi.aws.codebuild.inputs.SourceCredentialState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a CodeBuild Source Credentials Resource.
 * 
 * > **NOTE:**
 * [Codebuild only allows a single credential per given server type in a given region](https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_codebuild.GitHubSourceCredentials.html). Therefore, when you define `aws.codebuild.SourceCredential`, `aws.codebuild.Project` resource defined in the same module will use it.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CodeBuild Source Credential can be imported using the CodeBuild Source Credential arn, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:codebuild/sourceCredential:SourceCredential example arn:aws:codebuild:us-west-2:123456789:token:github
 * ```
 * 
 */
@ResourceType(type="aws:codebuild/sourceCredential:SourceCredential")
public class SourceCredential extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of Source Credential.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of Source Credential.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH connection is not supported by the API.
     * 
     */
    @Export(name="authType", type=String.class, parameters={})
    private Output<String> authType;

    /**
     * @return The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH connection is not supported by the API.
     * 
     */
    public Output<String> authType() {
        return this.authType;
    }
    /**
     * The source provider used for this project.
     * 
     */
    @Export(name="serverType", type=String.class, parameters={})
    private Output<String> serverType;

    /**
     * @return The source provider used for this project.
     * 
     */
    public Output<String> serverType() {
        return this.serverType;
    }
    /**
     * For `GitHub` or `GitHub Enterprise`, this is the personal access token. For `Bitbucket`, this is the app password.
     * 
     */
    @Export(name="token", type=String.class, parameters={})
    private Output<String> token;

    /**
     * @return For `GitHub` or `GitHub Enterprise`, this is the personal access token. For `Bitbucket`, this is the app password.
     * 
     */
    public Output<String> token() {
        return this.token;
    }
    /**
     * The Bitbucket username when the authType is `BASIC_AUTH`. This parameter is not valid for other types of source providers or connections.
     * 
     */
    @Export(name="userName", type=String.class, parameters={})
    private Output</* @Nullable */ String> userName;

    /**
     * @return The Bitbucket username when the authType is `BASIC_AUTH`. This parameter is not valid for other types of source providers or connections.
     * 
     */
    public Output</* @Nullable */ String> userName() {
        return this.userName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SourceCredential(String name) {
        this(name, SourceCredentialArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SourceCredential(String name, SourceCredentialArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SourceCredential(String name, SourceCredentialArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:codebuild/sourceCredential:SourceCredential", name, args == null ? SourceCredentialArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SourceCredential(String name, Output<String> id, @Nullable SourceCredentialState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:codebuild/sourceCredential:SourceCredential", name, state, makeResourceOptions(options, id));
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
    public static SourceCredential get(String name, Output<String> id, @Nullable SourceCredentialState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SourceCredential(name, id, state, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.sagemaker.EndpointArgs;
import io.pulumi.aws.sagemaker.inputs.EndpointState;
import io.pulumi.aws.sagemaker.outputs.EndpointDeploymentConfig;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a SageMaker Endpoint resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Endpoints can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sagemaker/endpoint:Endpoint test_endpoint my-endpoint
 * ```
 * 
 */
@ResourceType(type="aws:sagemaker/endpoint:Endpoint")
public class Endpoint extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this endpoint.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this endpoint.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The deployment configuration for an endpoint, which contains the desired deployment strategy and rollback configurations. See Deployment Config.
     * 
     */
    @Export(name="deploymentConfig", type=EndpointDeploymentConfig.class, parameters={})
    private Output</* @Nullable */ EndpointDeploymentConfig> deploymentConfig;

    /**
     * @return The deployment configuration for an endpoint, which contains the desired deployment strategy and rollback configurations. See Deployment Config.
     * 
     */
    public Output</* @Nullable */ EndpointDeploymentConfig> deploymentConfig() {
        return this.deploymentConfig;
    }
    /**
     * The name of the endpoint configuration to use.
     * 
     */
    @Export(name="endpointConfigName", type=String.class, parameters={})
    private Output<String> endpointConfigName;

    /**
     * @return The name of the endpoint configuration to use.
     * 
     */
    public Output<String> endpointConfigName() {
        return this.endpointConfigName;
    }
    /**
     * The name of the endpoint.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the endpoint.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public Endpoint(String name) {
        this(name, EndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Endpoint(String name, EndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Endpoint(String name, EndpointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/endpoint:Endpoint", name, args == null ? EndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Endpoint(String name, Output<String> id, @Nullable EndpointState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/endpoint:Endpoint", name, state, makeResourceOptions(options, id));
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
    public static Endpoint get(String name, Output<String> id, @Nullable EndpointState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Endpoint(name, id, state, options);
    }
}

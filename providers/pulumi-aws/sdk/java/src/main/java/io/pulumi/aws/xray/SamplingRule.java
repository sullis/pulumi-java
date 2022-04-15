// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.xray;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.xray.SamplingRuleArgs;
import io.pulumi.aws.xray.inputs.SamplingRuleState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates and manages an AWS XRay Sampling Rule.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * XRay Sampling Rules can be imported using the name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:xray/samplingRule:SamplingRule example example
 * ```
 * 
 */
@ResourceType(type="aws:xray/samplingRule:SamplingRule")
public class SamplingRule extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the sampling rule.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the sampling rule.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Matches attributes derived from the request.
     * 
     */
    @Export(name="attributes", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> attributes;

    /**
     * @return Matches attributes derived from the request.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> attributes() {
        return this.attributes;
    }
    /**
     * The percentage of matching requests to instrument, after the reservoir is exhausted.
     * 
     */
    @Export(name="fixedRate", type=Double.class, parameters={})
    private Output<Double> fixedRate;

    /**
     * @return The percentage of matching requests to instrument, after the reservoir is exhausted.
     * 
     */
    public Output<Double> fixedRate() {
        return this.fixedRate;
    }
    /**
     * Matches the hostname from a request URL.
     * 
     */
    @Export(name="host", type=String.class, parameters={})
    private Output<String> host;

    /**
     * @return Matches the hostname from a request URL.
     * 
     */
    public Output<String> host() {
        return this.host;
    }
    /**
     * Matches the HTTP method of a request.
     * 
     */
    @Export(name="httpMethod", type=String.class, parameters={})
    private Output<String> httpMethod;

    /**
     * @return Matches the HTTP method of a request.
     * 
     */
    public Output<String> httpMethod() {
        return this.httpMethod;
    }
    /**
     * The priority of the sampling rule.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    /**
     * @return The priority of the sampling rule.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }
    /**
     * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
     * 
     */
    @Export(name="reservoirSize", type=Integer.class, parameters={})
    private Output<Integer> reservoirSize;

    /**
     * @return A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
     * 
     */
    public Output<Integer> reservoirSize() {
        return this.reservoirSize;
    }
    /**
     * Matches the ARN of the AWS resource on which the service runs.
     * 
     */
    @Export(name="resourceArn", type=String.class, parameters={})
    private Output<String> resourceArn;

    /**
     * @return Matches the ARN of the AWS resource on which the service runs.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }
    /**
     * The name of the sampling rule.
     * 
     */
    @Export(name="ruleName", type=String.class, parameters={})
    private Output</* @Nullable */ String> ruleName;

    /**
     * @return The name of the sampling rule.
     * 
     */
    public Output</* @Nullable */ String> ruleName() {
        return this.ruleName;
    }
    /**
     * Matches the `name` that the service uses to identify itself in segments.
     * 
     */
    @Export(name="serviceName", type=String.class, parameters={})
    private Output<String> serviceName;

    /**
     * @return Matches the `name` that the service uses to identify itself in segments.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }
    /**
     * Matches the `origin` that the service uses to identify its type in segments.
     * 
     */
    @Export(name="serviceType", type=String.class, parameters={})
    private Output<String> serviceType;

    /**
     * @return Matches the `origin` that the service uses to identify its type in segments.
     * 
     */
    public Output<String> serviceType() {
        return this.serviceType;
    }
    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Matches the path from a request URL.
     * 
     */
    @Export(name="urlPath", type=String.class, parameters={})
    private Output<String> urlPath;

    /**
     * @return Matches the path from a request URL.
     * 
     */
    public Output<String> urlPath() {
        return this.urlPath;
    }
    /**
     * The version of the sampling rule format (`1` )
     * 
     */
    @Export(name="version", type=Integer.class, parameters={})
    private Output<Integer> version;

    /**
     * @return The version of the sampling rule format (`1` )
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SamplingRule(String name) {
        this(name, SamplingRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SamplingRule(String name, SamplingRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SamplingRule(String name, SamplingRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:xray/samplingRule:SamplingRule", name, args == null ? SamplingRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SamplingRule(String name, Output<String> id, @Nullable SamplingRuleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:xray/samplingRule:SamplingRule", name, state, makeResourceOptions(options, id));
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
    public static SamplingRule get(String name, Output<String> id, @Nullable SamplingRuleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SamplingRule(name, id, state, options);
    }
}

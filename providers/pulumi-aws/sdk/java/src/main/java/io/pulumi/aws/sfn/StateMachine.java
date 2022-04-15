// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sfn;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.sfn.StateMachineArgs;
import io.pulumi.aws.sfn.inputs.StateMachineState;
import io.pulumi.aws.sfn.outputs.StateMachineLoggingConfiguration;
import io.pulumi.aws.sfn.outputs.StateMachineTracingConfiguration;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Step Function State Machine resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * State Machines can be imported using the `arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sfn/stateMachine:StateMachine foo arn:aws:states:eu-west-1:123456789098:stateMachine:bar
 * ```
 * 
 */
@ResourceType(type="aws:sfn/stateMachine:StateMachine")
public class StateMachine extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the state machine.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the state machine.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The date the state machine was created.
     * 
     */
    @Export(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return The date the state machine was created.
     * 
     */
    public Output<String> creationDate() {
        return this.creationDate;
    }
    /**
     * The [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html) definition of the state machine.
     * 
     */
    @Export(name="definition", type=String.class, parameters={})
    private Output<String> definition;

    /**
     * @return The [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html) definition of the state machine.
     * 
     */
    public Output<String> definition() {
        return this.definition;
    }
    /**
     * Defines what execution history events are logged and where they are logged. The `logging_configuration` parameter is only valid when `type` is set to `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html) and [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS Step Functions User Guide.
     * 
     */
    @Export(name="loggingConfiguration", type=StateMachineLoggingConfiguration.class, parameters={})
    private Output<StateMachineLoggingConfiguration> loggingConfiguration;

    /**
     * @return Defines what execution history events are logged and where they are logged. The `logging_configuration` parameter is only valid when `type` is set to `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html) and [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS Step Functions User Guide.
     * 
     */
    public Output<StateMachineLoggingConfiguration> loggingConfiguration() {
        return this.loggingConfiguration;
    }
    /**
     * The name of the state machine. To enable logging with CloudWatch Logs, the name should only contain `0`-`9`, `A`-`Z`, `a`-`z`, `-` and `_`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the state machine. To enable logging with CloudWatch Logs, the name should only contain `0`-`9`, `A`-`Z`, `a`-`z`, `-` and `_`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * The current status of the state machine. Either `ACTIVE` or `DELETING`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The current status of the state machine. Either `ACTIVE` or `DELETING`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Selects whether AWS X-Ray tracing is enabled.
     * 
     */
    @Export(name="tracingConfiguration", type=StateMachineTracingConfiguration.class, parameters={})
    private Output<StateMachineTracingConfiguration> tracingConfiguration;

    /**
     * @return Selects whether AWS X-Ray tracing is enabled.
     * 
     */
    public Output<StateMachineTracingConfiguration> tracingConfiguration() {
        return this.tracingConfiguration;
    }
    /**
     * Determines whether a Standard or Express state machine is created. The default is `STANDARD`. You cannot update the type of a state machine once it has been created. Valid values: `STANDARD`, `EXPRESS`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return Determines whether a Standard or Express state machine is created. The default is `STANDARD`. You cannot update the type of a state machine once it has been created. Valid values: `STANDARD`, `EXPRESS`.
     * 
     */
    public Output</* @Nullable */ String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StateMachine(String name) {
        this(name, StateMachineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StateMachine(String name, StateMachineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StateMachine(String name, StateMachineArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sfn/stateMachine:StateMachine", name, args == null ? StateMachineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StateMachine(String name, Output<String> id, @Nullable StateMachineState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sfn/stateMachine:StateMachine", name, state, makeResourceOptions(options, id));
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
    public static StateMachine get(String name, Output<String> id, @Nullable StateMachineState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StateMachine(name, id, state, options);
    }
}

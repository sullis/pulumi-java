// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudwatch.LogSubscriptionFilterArgs;
import io.pulumi.aws.cloudwatch.inputs.LogSubscriptionFilterState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a CloudWatch Logs subscription filter resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CloudWatch Logs subscription filter can be imported using the log group name and subscription filter name separated by `|`.
 * 
 * ```sh
 *  $ pulumi import aws:cloudwatch/logSubscriptionFilter:LogSubscriptionFilter test_lambdafunction_logfilter /aws/lambda/example_lambda_name|test_lambdafunction_logfilter
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/logSubscriptionFilter:LogSubscriptionFilter")
public class LogSubscriptionFilter extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the destination to deliver matching log events to. Kinesis stream or Lambda function ARN.
     * 
     */
    @Export(name="destinationArn", type=String.class, parameters={})
    private Output<String> destinationArn;

    /**
     * @return The ARN of the destination to deliver matching log events to. Kinesis stream or Lambda function ARN.
     * 
     */
    public Output<String> destinationArn() {
        return this.destinationArn;
    }
    /**
     * The method used to distribute log data to the destination. By default log data is grouped by log stream, but the grouping can be set to random for a more even distribution. This property is only applicable when the destination is an Amazon Kinesis stream. Valid values are "Random" and "ByLogStream".
     * 
     */
    @Export(name="distribution", type=String.class, parameters={})
    private Output</* @Nullable */ String> distribution;

    /**
     * @return The method used to distribute log data to the destination. By default log data is grouped by log stream, but the grouping can be set to random for a more even distribution. This property is only applicable when the destination is an Amazon Kinesis stream. Valid values are "Random" and "ByLogStream".
     * 
     */
    public Output</* @Nullable */ String> distribution() {
        return this.distribution;
    }
    /**
     * A valid CloudWatch Logs filter pattern for subscribing to a filtered stream of log events.
     * 
     */
    @Export(name="filterPattern", type=String.class, parameters={})
    private Output<String> filterPattern;

    /**
     * @return A valid CloudWatch Logs filter pattern for subscribing to a filtered stream of log events.
     * 
     */
    public Output<String> filterPattern() {
        return this.filterPattern;
    }
    /**
     * The name of the log group to associate the subscription filter with
     * 
     */
    @Export(name="logGroup", type=String.class, parameters={})
    private Output<String> logGroup;

    /**
     * @return The name of the log group to associate the subscription filter with
     * 
     */
    public Output<String> logGroup() {
        return this.logGroup;
    }
    /**
     * A name for the subscription filter
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A name for the subscription filter
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to deliver ingested log events to the destination. If you use Lambda as a destination, you should skip this argument and use `aws.lambda.Permission` resource for granting access from CloudWatch logs to the destination Lambda function.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to deliver ingested log events to the destination. If you use Lambda as a destination, you should skip this argument and use `aws.lambda.Permission` resource for granting access from CloudWatch logs to the destination Lambda function.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogSubscriptionFilter(String name) {
        this(name, LogSubscriptionFilterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogSubscriptionFilter(String name, LogSubscriptionFilterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogSubscriptionFilter(String name, LogSubscriptionFilterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/logSubscriptionFilter:LogSubscriptionFilter", name, args == null ? LogSubscriptionFilterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LogSubscriptionFilter(String name, Output<String> id, @Nullable LogSubscriptionFilterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/logSubscriptionFilter:LogSubscriptionFilter", name, state, makeResourceOptions(options, id));
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
    public static LogSubscriptionFilter get(String name, Output<String> id, @Nullable LogSubscriptionFilterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LogSubscriptionFilter(name, id, state, options);
    }
}

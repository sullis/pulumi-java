// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.kinesisanalyticsv2.ApplicationArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationState;
import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfiguration;
import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationCloudwatchLoggingOptions;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages a Kinesis Analytics v2 Application.
 * This resource can be used to manage both Kinesis Data Analytics for SQL applications and Kinesis Data Analytics for Apache Flink applications.
 * 
 * > **Note:** Kinesis Data Analytics for SQL applications created using this resource cannot currently be viewed in the AWS Console. To manage Kinesis Data Analytics for SQL applications that can also be viewed in the AWS Console, use the `aws.kinesis.AnalyticsApplication`resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_kinesisanalyticsv2_application` can be imported by using the application ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:kinesisanalyticsv2/application:Application example arn:aws:kinesisanalytics:us-west-2:123456789012:application/example-sql-application
 * ```
 * 
 */
@ResourceType(type="aws:kinesisanalyticsv2/application:Application")
public class Application extends io.pulumi.resources.CustomResource {
    /**
     * The application's configuration
     * 
     */
    @OutputExport(name="applicationConfiguration", type=ApplicationApplicationConfiguration.class, parameters={})
    private Output<ApplicationApplicationConfiguration> applicationConfiguration;

    /**
     * @return The application's configuration
     * 
     */
    public Output<ApplicationApplicationConfiguration> getApplicationConfiguration() {
        return this.applicationConfiguration;
    }
    /**
     * The ARN of the application.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the application.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A CloudWatch log stream to monitor application configuration errors.
     * 
     */
    @OutputExport(name="cloudwatchLoggingOptions", type=ApplicationCloudwatchLoggingOptions.class, parameters={})
    private Output</* @Nullable */ ApplicationCloudwatchLoggingOptions> cloudwatchLoggingOptions;

    /**
     * @return A CloudWatch log stream to monitor application configuration errors.
     * 
     */
    public Output</* @Nullable */ ApplicationCloudwatchLoggingOptions> getCloudwatchLoggingOptions() {
        return this.cloudwatchLoggingOptions;
    }
    /**
     * The current timestamp when the application was created.
     * 
     */
    @OutputExport(name="createTimestamp", type=String.class, parameters={})
    private Output<String> createTimestamp;

    /**
     * @return The current timestamp when the application was created.
     * 
     */
    public Output<String> getCreateTimestamp() {
        return this.createTimestamp;
    }
    /**
     * A summary description of the application.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A summary description of the application.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Whether to force stop an unresponsive Flink-based application.
     * 
     */
    @OutputExport(name="forceStop", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceStop;

    /**
     * @return Whether to force stop an unresponsive Flink-based application.
     * 
     */
    public Output</* @Nullable */ Boolean> getForceStop() {
        return this.forceStop;
    }
    /**
     * The current timestamp when the application was last updated.
     * 
     */
    @OutputExport(name="lastUpdateTimestamp", type=String.class, parameters={})
    private Output<String> lastUpdateTimestamp;

    /**
     * @return The current timestamp when the application was last updated.
     * 
     */
    public Output<String> getLastUpdateTimestamp() {
        return this.lastUpdateTimestamp;
    }
    /**
     * The name of the application.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the application.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The runtime environment for the application. Valid values: `SQL-1_0`, `FLINK-1_6`, `FLINK-1_8`, `FLINK-1_11`.
     * 
     */
    @OutputExport(name="runtimeEnvironment", type=String.class, parameters={})
    private Output<String> runtimeEnvironment;

    /**
     * @return The runtime environment for the application. Valid values: `SQL-1_0`, `FLINK-1_6`, `FLINK-1_8`, `FLINK-1_11`.
     * 
     */
    public Output<String> getRuntimeEnvironment() {
        return this.runtimeEnvironment;
    }
    /**
     * The ARN of the IAM role used by the application to access Kinesis data streams, Kinesis Data Firehose delivery streams, Amazon S3 objects, and other external resources.
     * 
     */
    @OutputExport(name="serviceExecutionRole", type=String.class, parameters={})
    private Output<String> serviceExecutionRole;

    /**
     * @return The ARN of the IAM role used by the application to access Kinesis data streams, Kinesis Data Firehose delivery streams, Amazon S3 objects, and other external resources.
     * 
     */
    public Output<String> getServiceExecutionRole() {
        return this.serviceExecutionRole;
    }
    /**
     * Whether to start or stop the application.
     * 
     */
    @OutputExport(name="startApplication", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> startApplication;

    /**
     * @return Whether to start or stop the application.
     * 
     */
    public Output</* @Nullable */ Boolean> getStartApplication() {
        return this.startApplication;
    }
    /**
     * The status of the application.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the application.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * A map of tags to assign to the application. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the application. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The current application version. Kinesis Data Analytics updates the `version_id` each time the application is updated.
     * 
     */
    @OutputExport(name="versionId", type=Integer.class, parameters={})
    private Output<Integer> versionId;

    /**
     * @return The current application version. Kinesis Data Analytics updates the `version_id` each time the application is updated.
     * 
     */
    public Output<Integer> getVersionId() {
        return this.versionId;
    }

    public interface BuilderApplicator {
        public void apply(ApplicationArgs.Builder a);
    }
    private static io.pulumi.aws.kinesisanalyticsv2.ApplicationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.kinesisanalyticsv2.ApplicationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Application(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Application(String name) {
        this(name, ApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Application(String name, ApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Application(String name, ApplicationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:kinesisanalyticsv2/application:Application", name, args == null ? ApplicationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Application(String name, Input<String> id, @Nullable ApplicationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:kinesisanalyticsv2/application:Application", name, state, makeResourceOptions(options, id));
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
    public static Application get(String name, Input<String> id, @Nullable ApplicationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Application(name, id, state, options);
    }
}
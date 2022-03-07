// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.logging_v2;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.logging_v2.BillingAccountSinkArgs;
import io.pulumi.googlenative.logging_v2.outputs.BigQueryOptionsResponse;
import io.pulumi.googlenative.logging_v2.outputs.LogExclusionResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a sink that exports specified log entries to a destination. The export of newly-ingested log entries begins immediately, unless the sink's writer_identity is not permitted to write to the destination. A sink can export log entries only from the resource owning the sink.
 * 
 */
@ResourceType(type="google-native:logging/v2:BillingAccountSink")
public class BillingAccountSink extends io.pulumi.resources.CustomResource {
    /**
     * Optional. Options that affect sinks exporting data to BigQuery.
     * 
     */
    @OutputExport(name="bigqueryOptions", type=BigQueryOptionsResponse.class, parameters={})
    private Output<BigQueryOptionsResponse> bigqueryOptions;

    /**
     * @return Optional. Options that affect sinks exporting data to BigQuery.
     * 
     */
    public Output<BigQueryOptionsResponse> getBigqueryOptions() {
        return this.bigqueryOptions;
    }
    /**
     * The creation timestamp of the sink.This field may not be present for older sinks.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation timestamp of the sink.This field may not be present for older sinks.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Optional. A description of this sink.The maximum length of the description is 8000 characters.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. A description of this sink.The maximum length of the description is 8000 characters.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The export destination: "storage.googleapis.com/[GCS_BUCKET]" "bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]" "pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]" The sink's writer_identity, set when the sink is created, must have permission to write to the destination or else the log entries are not exported. For more information, see Exporting Logs with Sinks (https://cloud.google.com/logging/docs/api/tasks/exporting-logs).
     * 
     */
    @OutputExport(name="destination", type=String.class, parameters={})
    private Output<String> destination;

    /**
     * @return The export destination: "storage.googleapis.com/[GCS_BUCKET]" "bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]" "pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]" The sink's writer_identity, set when the sink is created, must have permission to write to the destination or else the log entries are not exported. For more information, see Exporting Logs with Sinks (https://cloud.google.com/logging/docs/api/tasks/exporting-logs).
     * 
     */
    public Output<String> getDestination() {
        return this.destination;
    }
    /**
     * Optional. If set to true, then this sink is disabled and it does not export any log entries.
     * 
     */
    @OutputExport(name="disabled", type=Boolean.class, parameters={})
    private Output<Boolean> disabled;

    /**
     * @return Optional. If set to true, then this sink is disabled and it does not export any log entries.
     * 
     */
    public Output<Boolean> getDisabled() {
        return this.disabled;
    }
    /**
     * Optional. Log entries that match any of these exclusion filters will not be exported.If a log entry is matched by both filter and one of exclusion_filters it will not be exported.
     * 
     */
    @OutputExport(name="exclusions", type=List.class, parameters={LogExclusionResponse.class})
    private Output<List<LogExclusionResponse>> exclusions;

    /**
     * @return Optional. Log entries that match any of these exclusion filters will not be exported.If a log entry is matched by both filter and one of exclusion_filters it will not be exported.
     * 
     */
    public Output<List<LogExclusionResponse>> getExclusions() {
        return this.exclusions;
    }
    /**
     * Optional. An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced-queries). The only exported log entries are those that are in the resource owning the sink and that match the filter.For example:logName="projects/[PROJECT_ID]/logs/[LOG_ID]" AND severity>=ERROR
     * 
     */
    @OutputExport(name="filter", type=String.class, parameters={})
    private Output<String> filter;

    /**
     * @return Optional. An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced-queries). The only exported log entries are those that are in the resource owning the sink and that match the filter.For example:logName="projects/[PROJECT_ID]/logs/[LOG_ID]" AND severity>=ERROR
     * 
     */
    public Output<String> getFilter() {
        return this.filter;
    }
    /**
     * Optional. This field applies only to sinks owned by organizations and folders. If the field is false, the default, only the logs owned by the sink's parent resource are available for export. If the field is true, then log entries from all the projects, folders, and billing accounts contained in the sink's parent resource are also available for export. Whether a particular log entry from the children is exported depends on the sink's filter expression.For example, if this field is true, then the filter resource.type=gce_instance would export all Compute Engine VM instance log entries from all projects in the sink's parent.To only export entries from certain child projects, filter on the project part of the log name:logName:("projects/test-project1/" OR "projects/test-project2/") AND resource.type=gce_instance
     * 
     */
    @OutputExport(name="includeChildren", type=Boolean.class, parameters={})
    private Output<Boolean> includeChildren;

    /**
     * @return Optional. This field applies only to sinks owned by organizations and folders. If the field is false, the default, only the logs owned by the sink's parent resource are available for export. If the field is true, then log entries from all the projects, folders, and billing accounts contained in the sink's parent resource are also available for export. Whether a particular log entry from the children is exported depends on the sink's filter expression.For example, if this field is true, then the filter resource.type=gce_instance would export all Compute Engine VM instance log entries from all projects in the sink's parent.To only export entries from certain child projects, filter on the project part of the log name:logName:("projects/test-project1/" OR "projects/test-project2/") AND resource.type=gce_instance
     * 
     */
    public Output<Boolean> getIncludeChildren() {
        return this.includeChildren;
    }
    /**
     * The client-assigned sink identifier, unique within the project.For example: "my-syslog-errors-to-pubsub". Sink identifiers are limited to 100 characters and can include only the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The client-assigned sink identifier, unique within the project.For example: "my-syslog-errors-to-pubsub". Sink identifiers are limited to 100 characters and can include only the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The last update timestamp of the sink.This field may not be present for older sinks.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last update timestamp of the sink.This field may not be present for older sinks.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }
    /**
     * An IAM identity—a service account or group—under which Cloud Logging writes the exported log entries to the sink's destination. This field is set by sinks.create and sinks.update based on the value of unique_writer_identity in those methods.Until you grant this identity write-access to the destination, log entry exports from this sink will fail. For more information, see Granting Access for a Resource (https://cloud.google.com/iam/docs/granting-roles-to-service-accounts#granting_access_to_a_service_account_for_a_resource). Consult the destination service's documentation to determine the appropriate IAM roles to assign to the identity.Sinks that have a destination that is a log bucket in the same project as the sink do not have a writer_identity and no additional permissions are required.
     * 
     */
    @OutputExport(name="writerIdentity", type=String.class, parameters={})
    private Output<String> writerIdentity;

    /**
     * @return An IAM identity—a service account or group—under which Cloud Logging writes the exported log entries to the sink's destination. This field is set by sinks.create and sinks.update based on the value of unique_writer_identity in those methods.Until you grant this identity write-access to the destination, log entry exports from this sink will fail. For more information, see Granting Access for a Resource (https://cloud.google.com/iam/docs/granting-roles-to-service-accounts#granting_access_to_a_service_account_for_a_resource). Consult the destination service's documentation to determine the appropriate IAM roles to assign to the identity.Sinks that have a destination that is a log bucket in the same project as the sink do not have a writer_identity and no additional permissions are required.
     * 
     */
    public Output<String> getWriterIdentity() {
        return this.writerIdentity;
    }

    public interface BuilderApplicator {
        public void apply(BillingAccountSinkArgs.Builder a);
    }
    private static io.pulumi.googlenative.logging_v2.BillingAccountSinkArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.logging_v2.BillingAccountSinkArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public BillingAccountSink(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BillingAccountSink(String name) {
        this(name, BillingAccountSinkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BillingAccountSink(String name, BillingAccountSinkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BillingAccountSink(String name, BillingAccountSinkArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:logging/v2:BillingAccountSink", name, args == null ? BillingAccountSinkArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BillingAccountSink(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:logging/v2:BillingAccountSink", name, null, makeResourceOptions(options, id));
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
    public static BillingAccountSink get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BillingAccountSink(name, id, options);
    }
}
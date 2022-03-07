// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.storagetransfer_v1.TransferJobArgs;
import io.pulumi.googlenative.storagetransfer_v1.outputs.LoggingConfigResponse;
import io.pulumi.googlenative.storagetransfer_v1.outputs.NotificationConfigResponse;
import io.pulumi.googlenative.storagetransfer_v1.outputs.ScheduleResponse;
import io.pulumi.googlenative.storagetransfer_v1.outputs.TransferSpecResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a transfer job that runs periodically.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:storagetransfer/v1:TransferJob")
public class TransferJob extends io.pulumi.resources.CustomResource {
    /**
     * The time that the transfer job was created.
     * 
     */
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The time that the transfer job was created.
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * The time that the transfer job was deleted.
     * 
     */
    @OutputExport(name="deletionTime", type=String.class, parameters={})
    private Output<String> deletionTime;

    /**
     * @return The time that the transfer job was deleted.
     * 
     */
    public Output<String> getDeletionTime() {
        return this.deletionTime;
    }
    /**
     * A description provided by the user for the job. Its max length is 1024 bytes when Unicode-encoded.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A description provided by the user for the job. Its max length is 1024 bytes when Unicode-encoded.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The time that the transfer job was last modified.
     * 
     */
    @OutputExport(name="lastModificationTime", type=String.class, parameters={})
    private Output<String> lastModificationTime;

    /**
     * @return The time that the transfer job was last modified.
     * 
     */
    public Output<String> getLastModificationTime() {
        return this.lastModificationTime;
    }
    /**
     * The name of the most recently started TransferOperation of this JobConfig. Present if a TransferOperation has been created for this JobConfig.
     * 
     */
    @OutputExport(name="latestOperationName", type=String.class, parameters={})
    private Output<String> latestOperationName;

    /**
     * @return The name of the most recently started TransferOperation of this JobConfig. Present if a TransferOperation has been created for this JobConfig.
     * 
     */
    public Output<String> getLatestOperationName() {
        return this.latestOperationName;
    }
    /**
     * Logging configuration.
     * 
     */
    @OutputExport(name="loggingConfig", type=LoggingConfigResponse.class, parameters={})
    private Output<LoggingConfigResponse> loggingConfig;

    /**
     * @return Logging configuration.
     * 
     */
    public Output<LoggingConfigResponse> getLoggingConfig() {
        return this.loggingConfig;
    }
    /**
     * A unique name (within the transfer project) assigned when the job is created. If this field is empty in a CreateTransferJobRequest, Storage Transfer Service assigns a unique name. Otherwise, the specified name is used as the unique name for this job. If the specified name is in use by a job, the creation request fails with an ALREADY_EXISTS error. This name must start with `"transferJobs/"` prefix and end with a letter or a number, and should be no more than 128 characters. For transfers involving PosixFilesystem, this name must start with `transferJobs/OPI` specifically. For all other transfer types, this name must not start with `transferJobs/OPI`. Non-PosixFilesystem example: `"transferJobs/^(?!OPI)[A-Za-z0-9-._~]*[A-Za-z0-9]$"` PosixFilesystem example: `"transferJobs/OPI^[A-Za-z0-9-._~]*[A-Za-z0-9]$"` Applications must not rely on the enforcement of naming requirements involving OPI. Invalid job names fail with an INVALID_ARGUMENT error.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique name (within the transfer project) assigned when the job is created. If this field is empty in a CreateTransferJobRequest, Storage Transfer Service assigns a unique name. Otherwise, the specified name is used as the unique name for this job. If the specified name is in use by a job, the creation request fails with an ALREADY_EXISTS error. This name must start with `"transferJobs/"` prefix and end with a letter or a number, and should be no more than 128 characters. For transfers involving PosixFilesystem, this name must start with `transferJobs/OPI` specifically. For all other transfer types, this name must not start with `transferJobs/OPI`. Non-PosixFilesystem example: `"transferJobs/^(?!OPI)[A-Za-z0-9-._~]*[A-Za-z0-9]$"` PosixFilesystem example: `"transferJobs/OPI^[A-Za-z0-9-._~]*[A-Za-z0-9]$"` Applications must not rely on the enforcement of naming requirements involving OPI. Invalid job names fail with an INVALID_ARGUMENT error.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Notification configuration. This is not supported for transfers involving PosixFilesystem.
     * 
     */
    @OutputExport(name="notificationConfig", type=NotificationConfigResponse.class, parameters={})
    private Output<NotificationConfigResponse> notificationConfig;

    /**
     * @return Notification configuration. This is not supported for transfers involving PosixFilesystem.
     * 
     */
    public Output<NotificationConfigResponse> getNotificationConfig() {
        return this.notificationConfig;
    }
    /**
     * The ID of the Google Cloud project that owns the job.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the Google Cloud project that owns the job.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Specifies schedule for the transfer job. This is an optional field. When the field is not set, the job never executes a transfer, unless you invoke RunTransferJob or update the job to have a non-empty schedule.
     * 
     */
    @OutputExport(name="schedule", type=ScheduleResponse.class, parameters={})
    private Output<ScheduleResponse> schedule;

    /**
     * @return Specifies schedule for the transfer job. This is an optional field. When the field is not set, the job never executes a transfer, unless you invoke RunTransferJob or update the job to have a non-empty schedule.
     * 
     */
    public Output<ScheduleResponse> getSchedule() {
        return this.schedule;
    }
    /**
     * Status of the job. This value MUST be specified for `CreateTransferJobRequests`. **Note:** The effect of the new job status takes place during a subsequent job run. For example, if you change the job status from ENABLED to DISABLED, and an operation spawned by the transfer is running, the status change would not affect the current operation.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the job. This value MUST be specified for `CreateTransferJobRequests`. **Note:** The effect of the new job status takes place during a subsequent job run. For example, if you change the job status from ENABLED to DISABLED, and an operation spawned by the transfer is running, the status change would not affect the current operation.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Transfer specification.
     * 
     */
    @OutputExport(name="transferSpec", type=TransferSpecResponse.class, parameters={})
    private Output<TransferSpecResponse> transferSpec;

    /**
     * @return Transfer specification.
     * 
     */
    public Output<TransferSpecResponse> getTransferSpec() {
        return this.transferSpec;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable TransferJobArgs.Builder a);
    }
    private static io.pulumi.googlenative.storagetransfer_v1.TransferJobArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.storagetransfer_v1.TransferJobArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public TransferJob(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransferJob(String name) {
        this(name, TransferJobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransferJob(String name, @Nullable TransferJobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransferJob(String name, @Nullable TransferJobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storagetransfer/v1:TransferJob", name, args == null ? TransferJobArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TransferJob(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storagetransfer/v1:TransferJob", name, null, makeResourceOptions(options, id));
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
    public static TransferJob get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TransferJob(name, id, options);
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.inputs;

import com.pulumi.awsnative.datasync.enums.TaskOptionsAtime;
import com.pulumi.awsnative.datasync.enums.TaskOptionsGid;
import com.pulumi.awsnative.datasync.enums.TaskOptionsLogLevel;
import com.pulumi.awsnative.datasync.enums.TaskOptionsMtime;
import com.pulumi.awsnative.datasync.enums.TaskOptionsOverwriteMode;
import com.pulumi.awsnative.datasync.enums.TaskOptionsPosixPermissions;
import com.pulumi.awsnative.datasync.enums.TaskOptionsPreserveDeletedFiles;
import com.pulumi.awsnative.datasync.enums.TaskOptionsPreserveDevices;
import com.pulumi.awsnative.datasync.enums.TaskOptionsSecurityDescriptorCopyFlags;
import com.pulumi.awsnative.datasync.enums.TaskOptionsTaskQueueing;
import com.pulumi.awsnative.datasync.enums.TaskOptionsTransferMode;
import com.pulumi.awsnative.datasync.enums.TaskOptionsUid;
import com.pulumi.awsnative.datasync.enums.TaskOptionsVerifyMode;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents the options that are available to control the behavior of a StartTaskExecution operation.
 * 
 */
public final class TaskOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskOptionsArgs Empty = new TaskOptionsArgs();

    /**
     * A file metadata value that shows the last time a file was accessed (that is, when the file was read or written to).
     * 
     */
    @Import(name="atime")
    private @Nullable Output<TaskOptionsAtime> atime;

    /**
     * @return A file metadata value that shows the last time a file was accessed (that is, when the file was read or written to).
     * 
     */
    public Optional<Output<TaskOptionsAtime>> atime() {
        return Optional.ofNullable(this.atime);
    }

    /**
     * A value that limits the bandwidth used by AWS DataSync.
     * 
     */
    @Import(name="bytesPerSecond")
    private @Nullable Output<Integer> bytesPerSecond;

    /**
     * @return A value that limits the bandwidth used by AWS DataSync.
     * 
     */
    public Optional<Output<Integer>> bytesPerSecond() {
        return Optional.ofNullable(this.bytesPerSecond);
    }

    /**
     * The group ID (GID) of the file&#39;s owners.
     * 
     */
    @Import(name="gid")
    private @Nullable Output<TaskOptionsGid> gid;

    /**
     * @return The group ID (GID) of the file&#39;s owners.
     * 
     */
    public Optional<Output<TaskOptionsGid>> gid() {
        return Optional.ofNullable(this.gid);
    }

    /**
     * A value that determines the types of logs that DataSync publishes to a log stream in the Amazon CloudWatch log group that you provide.
     * 
     */
    @Import(name="logLevel")
    private @Nullable Output<TaskOptionsLogLevel> logLevel;

    /**
     * @return A value that determines the types of logs that DataSync publishes to a log stream in the Amazon CloudWatch log group that you provide.
     * 
     */
    public Optional<Output<TaskOptionsLogLevel>> logLevel() {
        return Optional.ofNullable(this.logLevel);
    }

    /**
     * A value that indicates the last time that a file was modified (that is, a file was written to) before the PREPARING phase.
     * 
     */
    @Import(name="mtime")
    private @Nullable Output<TaskOptionsMtime> mtime;

    /**
     * @return A value that indicates the last time that a file was modified (that is, a file was written to) before the PREPARING phase.
     * 
     */
    public Optional<Output<TaskOptionsMtime>> mtime() {
        return Optional.ofNullable(this.mtime);
    }

    /**
     * A value that determines whether files at the destination should be overwritten or preserved when copying files.
     * 
     */
    @Import(name="overwriteMode")
    private @Nullable Output<TaskOptionsOverwriteMode> overwriteMode;

    /**
     * @return A value that determines whether files at the destination should be overwritten or preserved when copying files.
     * 
     */
    public Optional<Output<TaskOptionsOverwriteMode>> overwriteMode() {
        return Optional.ofNullable(this.overwriteMode);
    }

    /**
     * A value that determines which users or groups can access a file for a specific purpose such as reading, writing, or execution of the file.
     * 
     */
    @Import(name="posixPermissions")
    private @Nullable Output<TaskOptionsPosixPermissions> posixPermissions;

    /**
     * @return A value that determines which users or groups can access a file for a specific purpose such as reading, writing, or execution of the file.
     * 
     */
    public Optional<Output<TaskOptionsPosixPermissions>> posixPermissions() {
        return Optional.ofNullable(this.posixPermissions);
    }

    /**
     * A value that specifies whether files in the destination that don&#39;t exist in the source file system should be preserved.
     * 
     */
    @Import(name="preserveDeletedFiles")
    private @Nullable Output<TaskOptionsPreserveDeletedFiles> preserveDeletedFiles;

    /**
     * @return A value that specifies whether files in the destination that don&#39;t exist in the source file system should be preserved.
     * 
     */
    public Optional<Output<TaskOptionsPreserveDeletedFiles>> preserveDeletedFiles() {
        return Optional.ofNullable(this.preserveDeletedFiles);
    }

    /**
     * A value that determines whether AWS DataSync should preserve the metadata of block and character devices in the source file system, and recreate the files with that device name and metadata on the destination.
     * 
     */
    @Import(name="preserveDevices")
    private @Nullable Output<TaskOptionsPreserveDevices> preserveDevices;

    /**
     * @return A value that determines whether AWS DataSync should preserve the metadata of block and character devices in the source file system, and recreate the files with that device name and metadata on the destination.
     * 
     */
    public Optional<Output<TaskOptionsPreserveDevices>> preserveDevices() {
        return Optional.ofNullable(this.preserveDevices);
    }

    /**
     * A value that determines which components of the SMB security descriptor are copied during transfer.
     * 
     */
    @Import(name="securityDescriptorCopyFlags")
    private @Nullable Output<TaskOptionsSecurityDescriptorCopyFlags> securityDescriptorCopyFlags;

    /**
     * @return A value that determines which components of the SMB security descriptor are copied during transfer.
     * 
     */
    public Optional<Output<TaskOptionsSecurityDescriptorCopyFlags>> securityDescriptorCopyFlags() {
        return Optional.ofNullable(this.securityDescriptorCopyFlags);
    }

    /**
     * A value that determines whether tasks should be queued before executing the tasks.
     * 
     */
    @Import(name="taskQueueing")
    private @Nullable Output<TaskOptionsTaskQueueing> taskQueueing;

    /**
     * @return A value that determines whether tasks should be queued before executing the tasks.
     * 
     */
    public Optional<Output<TaskOptionsTaskQueueing>> taskQueueing() {
        return Optional.ofNullable(this.taskQueueing);
    }

    /**
     * A value that determines whether DataSync transfers only the data and metadata that differ between the source and the destination location, or whether DataSync transfers all the content from the source, without comparing to the destination location.
     * 
     */
    @Import(name="transferMode")
    private @Nullable Output<TaskOptionsTransferMode> transferMode;

    /**
     * @return A value that determines whether DataSync transfers only the data and metadata that differ between the source and the destination location, or whether DataSync transfers all the content from the source, without comparing to the destination location.
     * 
     */
    public Optional<Output<TaskOptionsTransferMode>> transferMode() {
        return Optional.ofNullable(this.transferMode);
    }

    /**
     * The user ID (UID) of the file&#39;s owner.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<TaskOptionsUid> uid;

    /**
     * @return The user ID (UID) of the file&#39;s owner.
     * 
     */
    public Optional<Output<TaskOptionsUid>> uid() {
        return Optional.ofNullable(this.uid);
    }

    /**
     * A value that determines whether a data integrity verification should be performed at the end of a task execution after all data and metadata have been transferred.
     * 
     */
    @Import(name="verifyMode")
    private @Nullable Output<TaskOptionsVerifyMode> verifyMode;

    /**
     * @return A value that determines whether a data integrity verification should be performed at the end of a task execution after all data and metadata have been transferred.
     * 
     */
    public Optional<Output<TaskOptionsVerifyMode>> verifyMode() {
        return Optional.ofNullable(this.verifyMode);
    }

    private TaskOptionsArgs() {}

    private TaskOptionsArgs(TaskOptionsArgs $) {
        this.atime = $.atime;
        this.bytesPerSecond = $.bytesPerSecond;
        this.gid = $.gid;
        this.logLevel = $.logLevel;
        this.mtime = $.mtime;
        this.overwriteMode = $.overwriteMode;
        this.posixPermissions = $.posixPermissions;
        this.preserveDeletedFiles = $.preserveDeletedFiles;
        this.preserveDevices = $.preserveDevices;
        this.securityDescriptorCopyFlags = $.securityDescriptorCopyFlags;
        this.taskQueueing = $.taskQueueing;
        this.transferMode = $.transferMode;
        this.uid = $.uid;
        this.verifyMode = $.verifyMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskOptionsArgs $;

        public Builder() {
            $ = new TaskOptionsArgs();
        }

        public Builder(TaskOptionsArgs defaults) {
            $ = new TaskOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param atime A file metadata value that shows the last time a file was accessed (that is, when the file was read or written to).
         * 
         * @return builder
         * 
         */
        public Builder atime(@Nullable Output<TaskOptionsAtime> atime) {
            $.atime = atime;
            return this;
        }

        /**
         * @param atime A file metadata value that shows the last time a file was accessed (that is, when the file was read or written to).
         * 
         * @return builder
         * 
         */
        public Builder atime(TaskOptionsAtime atime) {
            return atime(Output.of(atime));
        }

        /**
         * @param bytesPerSecond A value that limits the bandwidth used by AWS DataSync.
         * 
         * @return builder
         * 
         */
        public Builder bytesPerSecond(@Nullable Output<Integer> bytesPerSecond) {
            $.bytesPerSecond = bytesPerSecond;
            return this;
        }

        /**
         * @param bytesPerSecond A value that limits the bandwidth used by AWS DataSync.
         * 
         * @return builder
         * 
         */
        public Builder bytesPerSecond(Integer bytesPerSecond) {
            return bytesPerSecond(Output.of(bytesPerSecond));
        }

        /**
         * @param gid The group ID (GID) of the file&#39;s owners.
         * 
         * @return builder
         * 
         */
        public Builder gid(@Nullable Output<TaskOptionsGid> gid) {
            $.gid = gid;
            return this;
        }

        /**
         * @param gid The group ID (GID) of the file&#39;s owners.
         * 
         * @return builder
         * 
         */
        public Builder gid(TaskOptionsGid gid) {
            return gid(Output.of(gid));
        }

        /**
         * @param logLevel A value that determines the types of logs that DataSync publishes to a log stream in the Amazon CloudWatch log group that you provide.
         * 
         * @return builder
         * 
         */
        public Builder logLevel(@Nullable Output<TaskOptionsLogLevel> logLevel) {
            $.logLevel = logLevel;
            return this;
        }

        /**
         * @param logLevel A value that determines the types of logs that DataSync publishes to a log stream in the Amazon CloudWatch log group that you provide.
         * 
         * @return builder
         * 
         */
        public Builder logLevel(TaskOptionsLogLevel logLevel) {
            return logLevel(Output.of(logLevel));
        }

        /**
         * @param mtime A value that indicates the last time that a file was modified (that is, a file was written to) before the PREPARING phase.
         * 
         * @return builder
         * 
         */
        public Builder mtime(@Nullable Output<TaskOptionsMtime> mtime) {
            $.mtime = mtime;
            return this;
        }

        /**
         * @param mtime A value that indicates the last time that a file was modified (that is, a file was written to) before the PREPARING phase.
         * 
         * @return builder
         * 
         */
        public Builder mtime(TaskOptionsMtime mtime) {
            return mtime(Output.of(mtime));
        }

        /**
         * @param overwriteMode A value that determines whether files at the destination should be overwritten or preserved when copying files.
         * 
         * @return builder
         * 
         */
        public Builder overwriteMode(@Nullable Output<TaskOptionsOverwriteMode> overwriteMode) {
            $.overwriteMode = overwriteMode;
            return this;
        }

        /**
         * @param overwriteMode A value that determines whether files at the destination should be overwritten or preserved when copying files.
         * 
         * @return builder
         * 
         */
        public Builder overwriteMode(TaskOptionsOverwriteMode overwriteMode) {
            return overwriteMode(Output.of(overwriteMode));
        }

        /**
         * @param posixPermissions A value that determines which users or groups can access a file for a specific purpose such as reading, writing, or execution of the file.
         * 
         * @return builder
         * 
         */
        public Builder posixPermissions(@Nullable Output<TaskOptionsPosixPermissions> posixPermissions) {
            $.posixPermissions = posixPermissions;
            return this;
        }

        /**
         * @param posixPermissions A value that determines which users or groups can access a file for a specific purpose such as reading, writing, or execution of the file.
         * 
         * @return builder
         * 
         */
        public Builder posixPermissions(TaskOptionsPosixPermissions posixPermissions) {
            return posixPermissions(Output.of(posixPermissions));
        }

        /**
         * @param preserveDeletedFiles A value that specifies whether files in the destination that don&#39;t exist in the source file system should be preserved.
         * 
         * @return builder
         * 
         */
        public Builder preserveDeletedFiles(@Nullable Output<TaskOptionsPreserveDeletedFiles> preserveDeletedFiles) {
            $.preserveDeletedFiles = preserveDeletedFiles;
            return this;
        }

        /**
         * @param preserveDeletedFiles A value that specifies whether files in the destination that don&#39;t exist in the source file system should be preserved.
         * 
         * @return builder
         * 
         */
        public Builder preserveDeletedFiles(TaskOptionsPreserveDeletedFiles preserveDeletedFiles) {
            return preserveDeletedFiles(Output.of(preserveDeletedFiles));
        }

        /**
         * @param preserveDevices A value that determines whether AWS DataSync should preserve the metadata of block and character devices in the source file system, and recreate the files with that device name and metadata on the destination.
         * 
         * @return builder
         * 
         */
        public Builder preserveDevices(@Nullable Output<TaskOptionsPreserveDevices> preserveDevices) {
            $.preserveDevices = preserveDevices;
            return this;
        }

        /**
         * @param preserveDevices A value that determines whether AWS DataSync should preserve the metadata of block and character devices in the source file system, and recreate the files with that device name and metadata on the destination.
         * 
         * @return builder
         * 
         */
        public Builder preserveDevices(TaskOptionsPreserveDevices preserveDevices) {
            return preserveDevices(Output.of(preserveDevices));
        }

        /**
         * @param securityDescriptorCopyFlags A value that determines which components of the SMB security descriptor are copied during transfer.
         * 
         * @return builder
         * 
         */
        public Builder securityDescriptorCopyFlags(@Nullable Output<TaskOptionsSecurityDescriptorCopyFlags> securityDescriptorCopyFlags) {
            $.securityDescriptorCopyFlags = securityDescriptorCopyFlags;
            return this;
        }

        /**
         * @param securityDescriptorCopyFlags A value that determines which components of the SMB security descriptor are copied during transfer.
         * 
         * @return builder
         * 
         */
        public Builder securityDescriptorCopyFlags(TaskOptionsSecurityDescriptorCopyFlags securityDescriptorCopyFlags) {
            return securityDescriptorCopyFlags(Output.of(securityDescriptorCopyFlags));
        }

        /**
         * @param taskQueueing A value that determines whether tasks should be queued before executing the tasks.
         * 
         * @return builder
         * 
         */
        public Builder taskQueueing(@Nullable Output<TaskOptionsTaskQueueing> taskQueueing) {
            $.taskQueueing = taskQueueing;
            return this;
        }

        /**
         * @param taskQueueing A value that determines whether tasks should be queued before executing the tasks.
         * 
         * @return builder
         * 
         */
        public Builder taskQueueing(TaskOptionsTaskQueueing taskQueueing) {
            return taskQueueing(Output.of(taskQueueing));
        }

        /**
         * @param transferMode A value that determines whether DataSync transfers only the data and metadata that differ between the source and the destination location, or whether DataSync transfers all the content from the source, without comparing to the destination location.
         * 
         * @return builder
         * 
         */
        public Builder transferMode(@Nullable Output<TaskOptionsTransferMode> transferMode) {
            $.transferMode = transferMode;
            return this;
        }

        /**
         * @param transferMode A value that determines whether DataSync transfers only the data and metadata that differ between the source and the destination location, or whether DataSync transfers all the content from the source, without comparing to the destination location.
         * 
         * @return builder
         * 
         */
        public Builder transferMode(TaskOptionsTransferMode transferMode) {
            return transferMode(Output.of(transferMode));
        }

        /**
         * @param uid The user ID (UID) of the file&#39;s owner.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<TaskOptionsUid> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid The user ID (UID) of the file&#39;s owner.
         * 
         * @return builder
         * 
         */
        public Builder uid(TaskOptionsUid uid) {
            return uid(Output.of(uid));
        }

        /**
         * @param verifyMode A value that determines whether a data integrity verification should be performed at the end of a task execution after all data and metadata have been transferred.
         * 
         * @return builder
         * 
         */
        public Builder verifyMode(@Nullable Output<TaskOptionsVerifyMode> verifyMode) {
            $.verifyMode = verifyMode;
            return this;
        }

        /**
         * @param verifyMode A value that determines whether a data integrity verification should be performed at the end of a task execution after all data and metadata have been transferred.
         * 
         * @return builder
         * 
         */
        public Builder verifyMode(TaskOptionsVerifyMode verifyMode) {
            return verifyMode(Output.of(verifyMode));
        }

        public TaskOptionsArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.azure.appservice.inputs.LinuxFunctionAppBackupScheduleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinuxFunctionAppBackupArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinuxFunctionAppBackupArgs Empty = new LinuxFunctionAppBackupArgs();

    /**
     * Should this backup job be enabled?
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Should this backup job be enabled?
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The name which should be used for this Backup.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name which should be used for this Backup.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * A `schedule` block as defined below.
     * 
     */
    @Import(name="schedule", required=true)
    private Output<LinuxFunctionAppBackupScheduleArgs> schedule;

    /**
     * @return A `schedule` block as defined below.
     * 
     */
    public Output<LinuxFunctionAppBackupScheduleArgs> schedule() {
        return this.schedule;
    }

    /**
     * The SAS URL to the container.
     * 
     */
    @Import(name="storageAccountUrl", required=true)
    private Output<String> storageAccountUrl;

    /**
     * @return The SAS URL to the container.
     * 
     */
    public Output<String> storageAccountUrl() {
        return this.storageAccountUrl;
    }

    private LinuxFunctionAppBackupArgs() {}

    private LinuxFunctionAppBackupArgs(LinuxFunctionAppBackupArgs $) {
        this.enabled = $.enabled;
        this.name = $.name;
        this.schedule = $.schedule;
        this.storageAccountUrl = $.storageAccountUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxFunctionAppBackupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxFunctionAppBackupArgs $;

        public Builder() {
            $ = new LinuxFunctionAppBackupArgs();
        }

        public Builder(LinuxFunctionAppBackupArgs defaults) {
            $ = new LinuxFunctionAppBackupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Should this backup job be enabled?
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Should this backup job be enabled?
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name The name which should be used for this Backup.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Backup.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schedule A `schedule` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder schedule(Output<LinuxFunctionAppBackupScheduleArgs> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule A `schedule` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder schedule(LinuxFunctionAppBackupScheduleArgs schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param storageAccountUrl The SAS URL to the container.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountUrl(Output<String> storageAccountUrl) {
            $.storageAccountUrl = storageAccountUrl;
            return this;
        }

        /**
         * @param storageAccountUrl The SAS URL to the container.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountUrl(String storageAccountUrl) {
            return storageAccountUrl(Output.of(storageAccountUrl));
        }

        public LinuxFunctionAppBackupArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.schedule = Objects.requireNonNull($.schedule, "expected parameter 'schedule' to be non-null");
            $.storageAccountUrl = Objects.requireNonNull($.storageAccountUrl, "expected parameter 'storageAccountUrl' to be non-null");
            return $;
        }
    }

}

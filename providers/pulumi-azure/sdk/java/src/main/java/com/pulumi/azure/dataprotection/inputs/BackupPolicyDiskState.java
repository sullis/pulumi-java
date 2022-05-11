// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dataprotection.inputs;

import com.pulumi.azure.dataprotection.inputs.BackupPolicyDiskRetentionRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupPolicyDiskState extends com.pulumi.resources.ResourceArgs {

    public static final BackupPolicyDiskState Empty = new BackupPolicyDiskState();

    /**
     * Specifies a list of repeating time interval. It should follow `ISO 8601` repeating time interval . Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    @Import(name="backupRepeatingTimeIntervals")
    private @Nullable Output<List<String>> backupRepeatingTimeIntervals;

    /**
     * @return Specifies a list of repeating time interval. It should follow `ISO 8601` repeating time interval . Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    public Optional<Output<List<String>>> backupRepeatingTimeIntervals() {
        return Optional.ofNullable(this.backupRepeatingTimeIntervals);
    }

    /**
     * The duration of default retention rule. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    @Import(name="defaultRetentionDuration")
    private @Nullable Output<String> defaultRetentionDuration;

    /**
     * @return The duration of default retention rule. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    public Optional<Output<String>> defaultRetentionDuration() {
        return Optional.ofNullable(this.defaultRetentionDuration);
    }

    /**
     * The name which should be used for this Backup Policy Disk. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Backup Policy Disk. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * One or more `retention_rule` blocks as defined below. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    @Import(name="retentionRules")
    private @Nullable Output<List<BackupPolicyDiskRetentionRuleArgs>> retentionRules;

    /**
     * @return One or more `retention_rule` blocks as defined below. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    public Optional<Output<List<BackupPolicyDiskRetentionRuleArgs>>> retentionRules() {
        return Optional.ofNullable(this.retentionRules);
    }

    /**
     * The ID of the Backup Vault within which the Backup Policy Disk should exist. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    @Import(name="vaultId")
    private @Nullable Output<String> vaultId;

    /**
     * @return The ID of the Backup Vault within which the Backup Policy Disk should exist. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    public Optional<Output<String>> vaultId() {
        return Optional.ofNullable(this.vaultId);
    }

    private BackupPolicyDiskState() {}

    private BackupPolicyDiskState(BackupPolicyDiskState $) {
        this.backupRepeatingTimeIntervals = $.backupRepeatingTimeIntervals;
        this.defaultRetentionDuration = $.defaultRetentionDuration;
        this.name = $.name;
        this.retentionRules = $.retentionRules;
        this.vaultId = $.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupPolicyDiskState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupPolicyDiskState $;

        public Builder() {
            $ = new BackupPolicyDiskState();
        }

        public Builder(BackupPolicyDiskState defaults) {
            $ = new BackupPolicyDiskState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupRepeatingTimeIntervals Specifies a list of repeating time interval. It should follow `ISO 8601` repeating time interval . Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder backupRepeatingTimeIntervals(@Nullable Output<List<String>> backupRepeatingTimeIntervals) {
            $.backupRepeatingTimeIntervals = backupRepeatingTimeIntervals;
            return this;
        }

        /**
         * @param backupRepeatingTimeIntervals Specifies a list of repeating time interval. It should follow `ISO 8601` repeating time interval . Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder backupRepeatingTimeIntervals(List<String> backupRepeatingTimeIntervals) {
            return backupRepeatingTimeIntervals(Output.of(backupRepeatingTimeIntervals));
        }

        /**
         * @param backupRepeatingTimeIntervals Specifies a list of repeating time interval. It should follow `ISO 8601` repeating time interval . Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder backupRepeatingTimeIntervals(String... backupRepeatingTimeIntervals) {
            return backupRepeatingTimeIntervals(List.of(backupRepeatingTimeIntervals));
        }

        /**
         * @param defaultRetentionDuration The duration of default retention rule. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder defaultRetentionDuration(@Nullable Output<String> defaultRetentionDuration) {
            $.defaultRetentionDuration = defaultRetentionDuration;
            return this;
        }

        /**
         * @param defaultRetentionDuration The duration of default retention rule. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder defaultRetentionDuration(String defaultRetentionDuration) {
            return defaultRetentionDuration(Output.of(defaultRetentionDuration));
        }

        /**
         * @param name The name which should be used for this Backup Policy Disk. Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Backup Policy Disk. Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param retentionRules One or more `retention_rule` blocks as defined below. Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder retentionRules(@Nullable Output<List<BackupPolicyDiskRetentionRuleArgs>> retentionRules) {
            $.retentionRules = retentionRules;
            return this;
        }

        /**
         * @param retentionRules One or more `retention_rule` blocks as defined below. Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder retentionRules(List<BackupPolicyDiskRetentionRuleArgs> retentionRules) {
            return retentionRules(Output.of(retentionRules));
        }

        /**
         * @param retentionRules One or more `retention_rule` blocks as defined below. Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder retentionRules(BackupPolicyDiskRetentionRuleArgs... retentionRules) {
            return retentionRules(List.of(retentionRules));
        }

        /**
         * @param vaultId The ID of the Backup Vault within which the Backup Policy Disk should exist. Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder vaultId(@Nullable Output<String> vaultId) {
            $.vaultId = vaultId;
            return this;
        }

        /**
         * @param vaultId The ID of the Backup Vault within which the Backup Policy Disk should exist. Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder vaultId(String vaultId) {
            return vaultId(Output.of(vaultId));
        }

        public BackupPolicyDiskState build() {
            return $;
        }
    }

}

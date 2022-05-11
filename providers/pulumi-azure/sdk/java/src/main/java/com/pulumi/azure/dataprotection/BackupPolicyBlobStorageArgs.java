// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dataprotection;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupPolicyBlobStorageArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupPolicyBlobStorageArgs Empty = new BackupPolicyBlobStorageArgs();

    /**
     * The name which should be used for this Backup Policy Blob Storage. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Backup Policy Blob Storage. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Duration of deletion after given timespan. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     */
    @Import(name="retentionDuration", required=true)
    private Output<String> retentionDuration;

    /**
     * @return Duration of deletion after given timespan. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     */
    public Output<String> retentionDuration() {
        return this.retentionDuration;
    }

    /**
     * The ID of the Backup Vault within which the Backup Policy Blob Storage should exist. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     */
    @Import(name="vaultId", required=true)
    private Output<String> vaultId;

    /**
     * @return The ID of the Backup Vault within which the Backup Policy Blob Storage should exist. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     */
    public Output<String> vaultId() {
        return this.vaultId;
    }

    private BackupPolicyBlobStorageArgs() {}

    private BackupPolicyBlobStorageArgs(BackupPolicyBlobStorageArgs $) {
        this.name = $.name;
        this.retentionDuration = $.retentionDuration;
        this.vaultId = $.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupPolicyBlobStorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupPolicyBlobStorageArgs $;

        public Builder() {
            $ = new BackupPolicyBlobStorageArgs();
        }

        public Builder(BackupPolicyBlobStorageArgs defaults) {
            $ = new BackupPolicyBlobStorageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name which should be used for this Backup Policy Blob Storage. Changing this forces a new Backup Policy Blob Storage to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Backup Policy Blob Storage. Changing this forces a new Backup Policy Blob Storage to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param retentionDuration Duration of deletion after given timespan. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Blob Storage to be created.
         * 
         * @return builder
         * 
         */
        public Builder retentionDuration(Output<String> retentionDuration) {
            $.retentionDuration = retentionDuration;
            return this;
        }

        /**
         * @param retentionDuration Duration of deletion after given timespan. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Blob Storage to be created.
         * 
         * @return builder
         * 
         */
        public Builder retentionDuration(String retentionDuration) {
            return retentionDuration(Output.of(retentionDuration));
        }

        /**
         * @param vaultId The ID of the Backup Vault within which the Backup Policy Blob Storage should exist. Changing this forces a new Backup Policy Blob Storage to be created.
         * 
         * @return builder
         * 
         */
        public Builder vaultId(Output<String> vaultId) {
            $.vaultId = vaultId;
            return this;
        }

        /**
         * @param vaultId The ID of the Backup Vault within which the Backup Policy Blob Storage should exist. Changing this forces a new Backup Policy Blob Storage to be created.
         * 
         * @return builder
         * 
         */
        public Builder vaultId(String vaultId) {
            return vaultId(Output.of(vaultId));
        }

        public BackupPolicyBlobStorageArgs build() {
            $.retentionDuration = Objects.requireNonNull($.retentionDuration, "expected parameter 'retentionDuration' to be non-null");
            $.vaultId = Objects.requireNonNull($.vaultId, "expected parameter 'vaultId' to be non-null");
            return $;
        }
    }

}

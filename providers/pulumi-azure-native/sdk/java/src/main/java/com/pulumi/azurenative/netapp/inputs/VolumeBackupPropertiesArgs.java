// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Volume Backup Properties
 * 
 */
public final class VolumeBackupPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeBackupPropertiesArgs Empty = new VolumeBackupPropertiesArgs();

    /**
     * Backup Enabled
     * 
     */
    @Import(name="backupEnabled")
    private @Nullable Output<Boolean> backupEnabled;

    /**
     * @return Backup Enabled
     * 
     */
    public Optional<Output<Boolean>> backupEnabled() {
        return Optional.ofNullable(this.backupEnabled);
    }

    /**
     * Backup Policy Resource ID
     * 
     */
    @Import(name="backupPolicyId")
    private @Nullable Output<String> backupPolicyId;

    /**
     * @return Backup Policy Resource ID
     * 
     */
    public Optional<Output<String>> backupPolicyId() {
        return Optional.ofNullable(this.backupPolicyId);
    }

    /**
     * Policy Enforced
     * 
     */
    @Import(name="policyEnforced")
    private @Nullable Output<Boolean> policyEnforced;

    /**
     * @return Policy Enforced
     * 
     */
    public Optional<Output<Boolean>> policyEnforced() {
        return Optional.ofNullable(this.policyEnforced);
    }

    /**
     * Vault Resource ID
     * 
     */
    @Import(name="vaultId")
    private @Nullable Output<String> vaultId;

    /**
     * @return Vault Resource ID
     * 
     */
    public Optional<Output<String>> vaultId() {
        return Optional.ofNullable(this.vaultId);
    }

    private VolumeBackupPropertiesArgs() {}

    private VolumeBackupPropertiesArgs(VolumeBackupPropertiesArgs $) {
        this.backupEnabled = $.backupEnabled;
        this.backupPolicyId = $.backupPolicyId;
        this.policyEnforced = $.policyEnforced;
        this.vaultId = $.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeBackupPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeBackupPropertiesArgs $;

        public Builder() {
            $ = new VolumeBackupPropertiesArgs();
        }

        public Builder(VolumeBackupPropertiesArgs defaults) {
            $ = new VolumeBackupPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupEnabled Backup Enabled
         * 
         * @return builder
         * 
         */
        public Builder backupEnabled(@Nullable Output<Boolean> backupEnabled) {
            $.backupEnabled = backupEnabled;
            return this;
        }

        /**
         * @param backupEnabled Backup Enabled
         * 
         * @return builder
         * 
         */
        public Builder backupEnabled(Boolean backupEnabled) {
            return backupEnabled(Output.of(backupEnabled));
        }

        /**
         * @param backupPolicyId Backup Policy Resource ID
         * 
         * @return builder
         * 
         */
        public Builder backupPolicyId(@Nullable Output<String> backupPolicyId) {
            $.backupPolicyId = backupPolicyId;
            return this;
        }

        /**
         * @param backupPolicyId Backup Policy Resource ID
         * 
         * @return builder
         * 
         */
        public Builder backupPolicyId(String backupPolicyId) {
            return backupPolicyId(Output.of(backupPolicyId));
        }

        /**
         * @param policyEnforced Policy Enforced
         * 
         * @return builder
         * 
         */
        public Builder policyEnforced(@Nullable Output<Boolean> policyEnforced) {
            $.policyEnforced = policyEnforced;
            return this;
        }

        /**
         * @param policyEnforced Policy Enforced
         * 
         * @return builder
         * 
         */
        public Builder policyEnforced(Boolean policyEnforced) {
            return policyEnforced(Output.of(policyEnforced));
        }

        /**
         * @param vaultId Vault Resource ID
         * 
         * @return builder
         * 
         */
        public Builder vaultId(@Nullable Output<String> vaultId) {
            $.vaultId = vaultId;
            return this;
        }

        /**
         * @param vaultId Vault Resource ID
         * 
         * @return builder
         * 
         */
        public Builder vaultId(String vaultId) {
            return vaultId(Output.of(vaultId));
        }

        public VolumeBackupPropertiesArgs build() {
            return $;
        }
    }

}

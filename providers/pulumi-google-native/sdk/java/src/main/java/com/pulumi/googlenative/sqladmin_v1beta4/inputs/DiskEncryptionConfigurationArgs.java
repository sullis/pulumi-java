// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Disk encryption configuration for an instance.
 * 
 */
public final class DiskEncryptionConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiskEncryptionConfigurationArgs Empty = new DiskEncryptionConfigurationArgs();

    /**
     * This is always `sql#diskEncryptionConfiguration`.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return This is always `sql#diskEncryptionConfiguration`.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Resource name of KMS key for disk encryption
     * 
     */
    @Import(name="kmsKeyName")
    private @Nullable Output<String> kmsKeyName;

    /**
     * @return Resource name of KMS key for disk encryption
     * 
     */
    public Optional<Output<String>> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }

    private DiskEncryptionConfigurationArgs() {}

    private DiskEncryptionConfigurationArgs(DiskEncryptionConfigurationArgs $) {
        this.kind = $.kind;
        this.kmsKeyName = $.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskEncryptionConfigurationArgs $;

        public Builder() {
            $ = new DiskEncryptionConfigurationArgs();
        }

        public Builder(DiskEncryptionConfigurationArgs defaults) {
            $ = new DiskEncryptionConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kind This is always `sql#diskEncryptionConfiguration`.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind This is always `sql#diskEncryptionConfiguration`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param kmsKeyName Resource name of KMS key for disk encryption
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        /**
         * @param kmsKeyName Resource name of KMS key for disk encryption
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        public DiskEncryptionConfigurationArgs build() {
            return $;
        }
    }

}

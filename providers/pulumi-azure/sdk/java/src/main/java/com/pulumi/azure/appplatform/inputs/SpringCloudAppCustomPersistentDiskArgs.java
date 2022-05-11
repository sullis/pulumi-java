// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpringCloudAppCustomPersistentDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpringCloudAppCustomPersistentDiskArgs Empty = new SpringCloudAppCustomPersistentDiskArgs();

    /**
     * These are the mount options for a persistent disk.
     * 
     */
    @Import(name="mountOptions")
    private @Nullable Output<List<String>> mountOptions;

    /**
     * @return These are the mount options for a persistent disk.
     * 
     */
    public Optional<Output<List<String>>> mountOptions() {
        return Optional.ofNullable(this.mountOptions);
    }

    /**
     * The mount path of the persistent disk.
     * 
     */
    @Import(name="mountPath", required=true)
    private Output<String> mountPath;

    /**
     * @return The mount path of the persistent disk.
     * 
     */
    public Output<String> mountPath() {
        return this.mountPath;
    }

    /**
     * Indicates whether the persistent disk is a readOnly one.
     * 
     */
    @Import(name="readOnlyEnabled")
    private @Nullable Output<Boolean> readOnlyEnabled;

    /**
     * @return Indicates whether the persistent disk is a readOnly one.
     * 
     */
    public Optional<Output<Boolean>> readOnlyEnabled() {
        return Optional.ofNullable(this.readOnlyEnabled);
    }

    /**
     * The share name of the Azure File share.
     * 
     */
    @Import(name="shareName", required=true)
    private Output<String> shareName;

    /**
     * @return The share name of the Azure File share.
     * 
     */
    public Output<String> shareName() {
        return this.shareName;
    }

    /**
     * The name of the Spring Cloud Storage.
     * 
     */
    @Import(name="storageName", required=true)
    private Output<String> storageName;

    /**
     * @return The name of the Spring Cloud Storage.
     * 
     */
    public Output<String> storageName() {
        return this.storageName;
    }

    private SpringCloudAppCustomPersistentDiskArgs() {}

    private SpringCloudAppCustomPersistentDiskArgs(SpringCloudAppCustomPersistentDiskArgs $) {
        this.mountOptions = $.mountOptions;
        this.mountPath = $.mountPath;
        this.readOnlyEnabled = $.readOnlyEnabled;
        this.shareName = $.shareName;
        this.storageName = $.storageName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpringCloudAppCustomPersistentDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpringCloudAppCustomPersistentDiskArgs $;

        public Builder() {
            $ = new SpringCloudAppCustomPersistentDiskArgs();
        }

        public Builder(SpringCloudAppCustomPersistentDiskArgs defaults) {
            $ = new SpringCloudAppCustomPersistentDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mountOptions These are the mount options for a persistent disk.
         * 
         * @return builder
         * 
         */
        public Builder mountOptions(@Nullable Output<List<String>> mountOptions) {
            $.mountOptions = mountOptions;
            return this;
        }

        /**
         * @param mountOptions These are the mount options for a persistent disk.
         * 
         * @return builder
         * 
         */
        public Builder mountOptions(List<String> mountOptions) {
            return mountOptions(Output.of(mountOptions));
        }

        /**
         * @param mountOptions These are the mount options for a persistent disk.
         * 
         * @return builder
         * 
         */
        public Builder mountOptions(String... mountOptions) {
            return mountOptions(List.of(mountOptions));
        }

        /**
         * @param mountPath The mount path of the persistent disk.
         * 
         * @return builder
         * 
         */
        public Builder mountPath(Output<String> mountPath) {
            $.mountPath = mountPath;
            return this;
        }

        /**
         * @param mountPath The mount path of the persistent disk.
         * 
         * @return builder
         * 
         */
        public Builder mountPath(String mountPath) {
            return mountPath(Output.of(mountPath));
        }

        /**
         * @param readOnlyEnabled Indicates whether the persistent disk is a readOnly one.
         * 
         * @return builder
         * 
         */
        public Builder readOnlyEnabled(@Nullable Output<Boolean> readOnlyEnabled) {
            $.readOnlyEnabled = readOnlyEnabled;
            return this;
        }

        /**
         * @param readOnlyEnabled Indicates whether the persistent disk is a readOnly one.
         * 
         * @return builder
         * 
         */
        public Builder readOnlyEnabled(Boolean readOnlyEnabled) {
            return readOnlyEnabled(Output.of(readOnlyEnabled));
        }

        /**
         * @param shareName The share name of the Azure File share.
         * 
         * @return builder
         * 
         */
        public Builder shareName(Output<String> shareName) {
            $.shareName = shareName;
            return this;
        }

        /**
         * @param shareName The share name of the Azure File share.
         * 
         * @return builder
         * 
         */
        public Builder shareName(String shareName) {
            return shareName(Output.of(shareName));
        }

        /**
         * @param storageName The name of the Spring Cloud Storage.
         * 
         * @return builder
         * 
         */
        public Builder storageName(Output<String> storageName) {
            $.storageName = storageName;
            return this;
        }

        /**
         * @param storageName The name of the Spring Cloud Storage.
         * 
         * @return builder
         * 
         */
        public Builder storageName(String storageName) {
            return storageName(Output.of(storageName));
        }

        public SpringCloudAppCustomPersistentDiskArgs build() {
            $.mountPath = Objects.requireNonNull($.mountPath, "expected parameter 'mountPath' to be non-null");
            $.shareName = Objects.requireNonNull($.shareName, "expected parameter 'shareName' to be non-null");
            $.storageName = Objects.requireNonNull($.storageName, "expected parameter 'storageName' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.inputs;

import com.pulumi.azurenative.storagecache.inputs.CacheActiveDirectorySettingsArgs;
import com.pulumi.azurenative.storagecache.inputs.CacheUsernameDownloadSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cache Directory Services settings.
 * 
 */
public final class CacheDirectorySettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CacheDirectorySettingsArgs Empty = new CacheDirectorySettingsArgs();

    /**
     * Specifies settings for joining the HPC Cache to an Active Directory domain.
     * 
     */
    @Import(name="activeDirectory")
    private @Nullable Output<CacheActiveDirectorySettingsArgs> activeDirectory;

    /**
     * @return Specifies settings for joining the HPC Cache to an Active Directory domain.
     * 
     */
    public Optional<Output<CacheActiveDirectorySettingsArgs>> activeDirectory() {
        return Optional.ofNullable(this.activeDirectory);
    }

    /**
     * Specifies settings for Extended Groups. Extended Groups allows users to be members of more than 16 groups.
     * 
     */
    @Import(name="usernameDownload")
    private @Nullable Output<CacheUsernameDownloadSettingsArgs> usernameDownload;

    /**
     * @return Specifies settings for Extended Groups. Extended Groups allows users to be members of more than 16 groups.
     * 
     */
    public Optional<Output<CacheUsernameDownloadSettingsArgs>> usernameDownload() {
        return Optional.ofNullable(this.usernameDownload);
    }

    private CacheDirectorySettingsArgs() {}

    private CacheDirectorySettingsArgs(CacheDirectorySettingsArgs $) {
        this.activeDirectory = $.activeDirectory;
        this.usernameDownload = $.usernameDownload;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CacheDirectorySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CacheDirectorySettingsArgs $;

        public Builder() {
            $ = new CacheDirectorySettingsArgs();
        }

        public Builder(CacheDirectorySettingsArgs defaults) {
            $ = new CacheDirectorySettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activeDirectory Specifies settings for joining the HPC Cache to an Active Directory domain.
         * 
         * @return builder
         * 
         */
        public Builder activeDirectory(@Nullable Output<CacheActiveDirectorySettingsArgs> activeDirectory) {
            $.activeDirectory = activeDirectory;
            return this;
        }

        /**
         * @param activeDirectory Specifies settings for joining the HPC Cache to an Active Directory domain.
         * 
         * @return builder
         * 
         */
        public Builder activeDirectory(CacheActiveDirectorySettingsArgs activeDirectory) {
            return activeDirectory(Output.of(activeDirectory));
        }

        /**
         * @param usernameDownload Specifies settings for Extended Groups. Extended Groups allows users to be members of more than 16 groups.
         * 
         * @return builder
         * 
         */
        public Builder usernameDownload(@Nullable Output<CacheUsernameDownloadSettingsArgs> usernameDownload) {
            $.usernameDownload = usernameDownload;
            return this;
        }

        /**
         * @param usernameDownload Specifies settings for Extended Groups. Extended Groups allows users to be members of more than 16 groups.
         * 
         * @return builder
         * 
         */
        public Builder usernameDownload(CacheUsernameDownloadSettingsArgs usernameDownload) {
            return usernameDownload(Output.of(usernameDownload));
        }

        public CacheDirectorySettingsArgs build() {
            return $;
        }
    }

}

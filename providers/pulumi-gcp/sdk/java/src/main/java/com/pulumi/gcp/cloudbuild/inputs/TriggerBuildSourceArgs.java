// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudbuild.inputs.TriggerBuildSourceRepoSourceArgs;
import com.pulumi.gcp.cloudbuild.inputs.TriggerBuildSourceStorageSourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerBuildSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerBuildSourceArgs Empty = new TriggerBuildSourceArgs();

    /**
     * Location of the source in a Google Cloud Source Repository.
     * Structure is documented below.
     * 
     */
    @Import(name="repoSource")
    private @Nullable Output<TriggerBuildSourceRepoSourceArgs> repoSource;

    /**
     * @return Location of the source in a Google Cloud Source Repository.
     * Structure is documented below.
     * 
     */
    public Optional<Output<TriggerBuildSourceRepoSourceArgs>> repoSource() {
        return Optional.ofNullable(this.repoSource);
    }

    /**
     * Location of the source in an archive file in Google Cloud Storage.
     * Structure is documented below.
     * 
     */
    @Import(name="storageSource")
    private @Nullable Output<TriggerBuildSourceStorageSourceArgs> storageSource;

    /**
     * @return Location of the source in an archive file in Google Cloud Storage.
     * Structure is documented below.
     * 
     */
    public Optional<Output<TriggerBuildSourceStorageSourceArgs>> storageSource() {
        return Optional.ofNullable(this.storageSource);
    }

    private TriggerBuildSourceArgs() {}

    private TriggerBuildSourceArgs(TriggerBuildSourceArgs $) {
        this.repoSource = $.repoSource;
        this.storageSource = $.storageSource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerBuildSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerBuildSourceArgs $;

        public Builder() {
            $ = new TriggerBuildSourceArgs();
        }

        public Builder(TriggerBuildSourceArgs defaults) {
            $ = new TriggerBuildSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param repoSource Location of the source in a Google Cloud Source Repository.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder repoSource(@Nullable Output<TriggerBuildSourceRepoSourceArgs> repoSource) {
            $.repoSource = repoSource;
            return this;
        }

        /**
         * @param repoSource Location of the source in a Google Cloud Source Repository.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder repoSource(TriggerBuildSourceRepoSourceArgs repoSource) {
            return repoSource(Output.of(repoSource));
        }

        /**
         * @param storageSource Location of the source in an archive file in Google Cloud Storage.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder storageSource(@Nullable Output<TriggerBuildSourceStorageSourceArgs> storageSource) {
            $.storageSource = storageSource;
            return this;
        }

        /**
         * @param storageSource Location of the source in an archive file in Google Cloud Storage.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder storageSource(TriggerBuildSourceStorageSourceArgs storageSource) {
            return storageSource(Output.of(storageSource));
        }

        public TriggerBuildSourceArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.cloudbuild.inputs.TriggerBuildSourceRepoSourceArgs;
import io.pulumi.gcp.cloudbuild.inputs.TriggerBuildSourceStorageSourceArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerBuildSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerBuildSourceArgs Empty = new TriggerBuildSourceArgs();

    /**
     * Location of the source in a Google Cloud Source Repository.
     * Structure is documented below.
     * 
     */
    @InputImport(name="repoSource")
    private final @Nullable Input<TriggerBuildSourceRepoSourceArgs> repoSource;

    public Input<TriggerBuildSourceRepoSourceArgs> getRepoSource() {
        return this.repoSource == null ? Input.empty() : this.repoSource;
    }

    /**
     * Location of the source in an archive file in Google Cloud Storage.
     * Structure is documented below.
     * 
     */
    @InputImport(name="storageSource")
    private final @Nullable Input<TriggerBuildSourceStorageSourceArgs> storageSource;

    public Input<TriggerBuildSourceStorageSourceArgs> getStorageSource() {
        return this.storageSource == null ? Input.empty() : this.storageSource;
    }

    public TriggerBuildSourceArgs(
        @Nullable Input<TriggerBuildSourceRepoSourceArgs> repoSource,
        @Nullable Input<TriggerBuildSourceStorageSourceArgs> storageSource) {
        this.repoSource = repoSource;
        this.storageSource = storageSource;
    }

    private TriggerBuildSourceArgs() {
        this.repoSource = Input.empty();
        this.storageSource = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TriggerBuildSourceRepoSourceArgs> repoSource;
        private @Nullable Input<TriggerBuildSourceStorageSourceArgs> storageSource;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repoSource = defaults.repoSource;
    	      this.storageSource = defaults.storageSource;
        }

        public Builder setRepoSource(@Nullable Input<TriggerBuildSourceRepoSourceArgs> repoSource) {
            this.repoSource = repoSource;
            return this;
        }

        public Builder setRepoSource(@Nullable TriggerBuildSourceRepoSourceArgs repoSource) {
            this.repoSource = Input.ofNullable(repoSource);
            return this;
        }

        public Builder setStorageSource(@Nullable Input<TriggerBuildSourceStorageSourceArgs> storageSource) {
            this.storageSource = storageSource;
            return this;
        }

        public Builder setStorageSource(@Nullable TriggerBuildSourceStorageSourceArgs storageSource) {
            this.storageSource = Input.ofNullable(storageSource);
            return this;
        }

        public TriggerBuildSourceArgs build() {
            return new TriggerBuildSourceArgs(repoSource, storageSource);
        }
    }
}

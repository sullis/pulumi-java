// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.SourceContextArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Source describes the location of the source used for the build.
 * 
 */
public final class SourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SourceArgs Empty = new SourceArgs();

    /**
     * If provided, some of the source code used for the build may be found in these locations, in the case where the source repository had multiple remotes or submodules. This list will not include the context specified in the context field.
     * 
     */
    @InputImport(name="additionalContexts")
      private final @Nullable Input<List<SourceContextArgs>> additionalContexts;

    public Input<List<SourceContextArgs>> getAdditionalContexts() {
        return this.additionalContexts == null ? Input.empty() : this.additionalContexts;
    }

    /**
     * If provided, the input binary artifacts for the build came from this location.
     * 
     */
    @InputImport(name="artifactStorageSourceUri")
      private final @Nullable Input<String> artifactStorageSourceUri;

    public Input<String> getArtifactStorageSourceUri() {
        return this.artifactStorageSourceUri == null ? Input.empty() : this.artifactStorageSourceUri;
    }

    /**
     * If provided, the source code used for the build came from this location.
     * 
     */
    @InputImport(name="context")
      private final @Nullable Input<SourceContextArgs> context;

    public Input<SourceContextArgs> getContext() {
        return this.context == null ? Input.empty() : this.context;
    }

    /**
     * Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. The keys to this map are file paths used as build source and the values contain the hash values for those files. If the build source came in a single package such as a gzipped tarfile (.tar.gz), the FileHash will be for the single path to that file.
     * 
     */
    @InputImport(name="fileHashes")
      private final @Nullable Input<Map<String,String>> fileHashes;

    public Input<Map<String,String>> getFileHashes() {
        return this.fileHashes == null ? Input.empty() : this.fileHashes;
    }

    public SourceArgs(
        @Nullable Input<List<SourceContextArgs>> additionalContexts,
        @Nullable Input<String> artifactStorageSourceUri,
        @Nullable Input<SourceContextArgs> context,
        @Nullable Input<Map<String,String>> fileHashes) {
        this.additionalContexts = additionalContexts;
        this.artifactStorageSourceUri = artifactStorageSourceUri;
        this.context = context;
        this.fileHashes = fileHashes;
    }

    private SourceArgs() {
        this.additionalContexts = Input.empty();
        this.artifactStorageSourceUri = Input.empty();
        this.context = Input.empty();
        this.fileHashes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<SourceContextArgs>> additionalContexts;
        private @Nullable Input<String> artifactStorageSourceUri;
        private @Nullable Input<SourceContextArgs> context;
        private @Nullable Input<Map<String,String>> fileHashes;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalContexts = defaults.additionalContexts;
    	      this.artifactStorageSourceUri = defaults.artifactStorageSourceUri;
    	      this.context = defaults.context;
    	      this.fileHashes = defaults.fileHashes;
        }

        public Builder setAdditionalContexts(@Nullable Input<List<SourceContextArgs>> additionalContexts) {
            this.additionalContexts = additionalContexts;
            return this;
        }

        public Builder setAdditionalContexts(@Nullable List<SourceContextArgs> additionalContexts) {
            this.additionalContexts = Input.ofNullable(additionalContexts);
            return this;
        }

        public Builder setArtifactStorageSourceUri(@Nullable Input<String> artifactStorageSourceUri) {
            this.artifactStorageSourceUri = artifactStorageSourceUri;
            return this;
        }

        public Builder setArtifactStorageSourceUri(@Nullable String artifactStorageSourceUri) {
            this.artifactStorageSourceUri = Input.ofNullable(artifactStorageSourceUri);
            return this;
        }

        public Builder setContext(@Nullable Input<SourceContextArgs> context) {
            this.context = context;
            return this;
        }

        public Builder setContext(@Nullable SourceContextArgs context) {
            this.context = Input.ofNullable(context);
            return this;
        }

        public Builder setFileHashes(@Nullable Input<Map<String,String>> fileHashes) {
            this.fileHashes = fileHashes;
            return this;
        }

        public Builder setFileHashes(@Nullable Map<String,String> fileHashes) {
            this.fileHashes = Input.ofNullable(fileHashes);
            return this;
        }
        public SourceArgs build() {
            return new SourceArgs(additionalContexts, artifactStorageSourceUri, context, fileHashes);
        }
    }
}
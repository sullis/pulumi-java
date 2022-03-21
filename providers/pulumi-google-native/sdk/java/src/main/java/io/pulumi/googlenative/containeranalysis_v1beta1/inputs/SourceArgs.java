// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="additionalContexts")
      private final @Nullable Output<List<SourceContextArgs>> additionalContexts;

    public Output<List<SourceContextArgs>> getAdditionalContexts() {
        return this.additionalContexts == null ? Output.empty() : this.additionalContexts;
    }

    /**
     * If provided, the input binary artifacts for the build came from this location.
     * 
     */
    @Import(name="artifactStorageSourceUri")
      private final @Nullable Output<String> artifactStorageSourceUri;

    public Output<String> getArtifactStorageSourceUri() {
        return this.artifactStorageSourceUri == null ? Output.empty() : this.artifactStorageSourceUri;
    }

    /**
     * If provided, the source code used for the build came from this location.
     * 
     */
    @Import(name="context")
      private final @Nullable Output<SourceContextArgs> context;

    public Output<SourceContextArgs> getContext() {
        return this.context == null ? Output.empty() : this.context;
    }

    /**
     * Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. The keys to this map are file paths used as build source and the values contain the hash values for those files. If the build source came in a single package such as a gzipped tarfile (.tar.gz), the FileHash will be for the single path to that file.
     * 
     */
    @Import(name="fileHashes")
      private final @Nullable Output<Map<String,String>> fileHashes;

    public Output<Map<String,String>> getFileHashes() {
        return this.fileHashes == null ? Output.empty() : this.fileHashes;
    }

    public SourceArgs(
        @Nullable Output<List<SourceContextArgs>> additionalContexts,
        @Nullable Output<String> artifactStorageSourceUri,
        @Nullable Output<SourceContextArgs> context,
        @Nullable Output<Map<String,String>> fileHashes) {
        this.additionalContexts = additionalContexts;
        this.artifactStorageSourceUri = artifactStorageSourceUri;
        this.context = context;
        this.fileHashes = fileHashes;
    }

    private SourceArgs() {
        this.additionalContexts = Output.empty();
        this.artifactStorageSourceUri = Output.empty();
        this.context = Output.empty();
        this.fileHashes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<SourceContextArgs>> additionalContexts;
        private @Nullable Output<String> artifactStorageSourceUri;
        private @Nullable Output<SourceContextArgs> context;
        private @Nullable Output<Map<String,String>> fileHashes;

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

        public Builder additionalContexts(@Nullable Output<List<SourceContextArgs>> additionalContexts) {
            this.additionalContexts = additionalContexts;
            return this;
        }
        public Builder additionalContexts(@Nullable List<SourceContextArgs> additionalContexts) {
            this.additionalContexts = Output.ofNullable(additionalContexts);
            return this;
        }
        public Builder additionalContexts(SourceContextArgs... additionalContexts) {
            return additionalContexts(List.of(additionalContexts));
        }
        public Builder artifactStorageSourceUri(@Nullable Output<String> artifactStorageSourceUri) {
            this.artifactStorageSourceUri = artifactStorageSourceUri;
            return this;
        }
        public Builder artifactStorageSourceUri(@Nullable String artifactStorageSourceUri) {
            this.artifactStorageSourceUri = Output.ofNullable(artifactStorageSourceUri);
            return this;
        }
        public Builder context(@Nullable Output<SourceContextArgs> context) {
            this.context = context;
            return this;
        }
        public Builder context(@Nullable SourceContextArgs context) {
            this.context = Output.ofNullable(context);
            return this;
        }
        public Builder fileHashes(@Nullable Output<Map<String,String>> fileHashes) {
            this.fileHashes = fileHashes;
            return this;
        }
        public Builder fileHashes(@Nullable Map<String,String> fileHashes) {
            this.fileHashes = Output.ofNullable(fileHashes);
            return this;
        }        public SourceArgs build() {
            return new SourceArgs(additionalContexts, artifactStorageSourceUri, context, fileHashes);
        }
    }
}

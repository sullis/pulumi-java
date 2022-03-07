// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.CompositePathResponse;
import io.pulumi.azurenative.documentdb.inputs.ExcludedPathResponse;
import io.pulumi.azurenative.documentdb.inputs.IncludedPathResponse;
import io.pulumi.azurenative.documentdb.inputs.SpatialSpecResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cosmos DB indexing policy
 * 
 */
public final class IndexingPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final IndexingPolicyResponse Empty = new IndexingPolicyResponse();

    /**
     * Indicates if the indexing policy is automatic
     * 
     */
    @InputImport(name="automatic")
      private final @Nullable Boolean automatic;

    public Optional<Boolean> getAutomatic() {
        return this.automatic == null ? Optional.empty() : Optional.ofNullable(this.automatic);
    }

    /**
     * List of composite path list
     * 
     */
    @InputImport(name="compositeIndexes")
      private final @Nullable List<List<CompositePathResponse>> compositeIndexes;

    public List<List<CompositePathResponse>> getCompositeIndexes() {
        return this.compositeIndexes == null ? List.of() : this.compositeIndexes;
    }

    /**
     * List of paths to exclude from indexing
     * 
     */
    @InputImport(name="excludedPaths")
      private final @Nullable List<ExcludedPathResponse> excludedPaths;

    public List<ExcludedPathResponse> getExcludedPaths() {
        return this.excludedPaths == null ? List.of() : this.excludedPaths;
    }

    /**
     * List of paths to include in the indexing
     * 
     */
    @InputImport(name="includedPaths")
      private final @Nullable List<IncludedPathResponse> includedPaths;

    public List<IncludedPathResponse> getIncludedPaths() {
        return this.includedPaths == null ? List.of() : this.includedPaths;
    }

    /**
     * Indicates the indexing mode.
     * 
     */
    @InputImport(name="indexingMode")
      private final @Nullable String indexingMode;

    public Optional<String> getIndexingMode() {
        return this.indexingMode == null ? Optional.empty() : Optional.ofNullable(this.indexingMode);
    }

    /**
     * List of spatial specifics
     * 
     */
    @InputImport(name="spatialIndexes")
      private final @Nullable List<SpatialSpecResponse> spatialIndexes;

    public List<SpatialSpecResponse> getSpatialIndexes() {
        return this.spatialIndexes == null ? List.of() : this.spatialIndexes;
    }

    public IndexingPolicyResponse(
        @Nullable Boolean automatic,
        @Nullable List<List<CompositePathResponse>> compositeIndexes,
        @Nullable List<ExcludedPathResponse> excludedPaths,
        @Nullable List<IncludedPathResponse> includedPaths,
        @Nullable String indexingMode,
        @Nullable List<SpatialSpecResponse> spatialIndexes) {
        this.automatic = automatic;
        this.compositeIndexes = compositeIndexes;
        this.excludedPaths = excludedPaths;
        this.includedPaths = includedPaths;
        this.indexingMode = indexingMode == null ? "consistent" : indexingMode;
        this.spatialIndexes = spatialIndexes;
    }

    private IndexingPolicyResponse() {
        this.automatic = null;
        this.compositeIndexes = List.of();
        this.excludedPaths = List.of();
        this.includedPaths = List.of();
        this.indexingMode = null;
        this.spatialIndexes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean automatic;
        private @Nullable List<List<CompositePathResponse>> compositeIndexes;
        private @Nullable List<ExcludedPathResponse> excludedPaths;
        private @Nullable List<IncludedPathResponse> includedPaths;
        private @Nullable String indexingMode;
        private @Nullable List<SpatialSpecResponse> spatialIndexes;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automatic = defaults.automatic;
    	      this.compositeIndexes = defaults.compositeIndexes;
    	      this.excludedPaths = defaults.excludedPaths;
    	      this.includedPaths = defaults.includedPaths;
    	      this.indexingMode = defaults.indexingMode;
    	      this.spatialIndexes = defaults.spatialIndexes;
        }

        public Builder setAutomatic(@Nullable Boolean automatic) {
            this.automatic = automatic;
            return this;
        }

        public Builder setCompositeIndexes(@Nullable List<List<CompositePathResponse>> compositeIndexes) {
            this.compositeIndexes = compositeIndexes;
            return this;
        }

        public Builder setExcludedPaths(@Nullable List<ExcludedPathResponse> excludedPaths) {
            this.excludedPaths = excludedPaths;
            return this;
        }

        public Builder setIncludedPaths(@Nullable List<IncludedPathResponse> includedPaths) {
            this.includedPaths = includedPaths;
            return this;
        }

        public Builder setIndexingMode(@Nullable String indexingMode) {
            this.indexingMode = indexingMode;
            return this;
        }

        public Builder setSpatialIndexes(@Nullable List<SpatialSpecResponse> spatialIndexes) {
            this.spatialIndexes = spatialIndexes;
            return this;
        }
        public IndexingPolicyResponse build() {
            return new IndexingPolicyResponse(automatic, compositeIndexes, excludedPaths, includedPaths, indexingMode, spatialIndexes);
        }
    }
}
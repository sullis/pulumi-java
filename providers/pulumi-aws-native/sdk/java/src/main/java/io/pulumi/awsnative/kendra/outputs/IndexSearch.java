// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IndexSearch {
    private final @Nullable Boolean displayable;
    private final @Nullable Boolean facetable;
    private final @Nullable Boolean searchable;
    private final @Nullable Boolean sortable;

    @OutputCustomType.Constructor({"displayable","facetable","searchable","sortable"})
    private IndexSearch(
        @Nullable Boolean displayable,
        @Nullable Boolean facetable,
        @Nullable Boolean searchable,
        @Nullable Boolean sortable) {
        this.displayable = displayable;
        this.facetable = facetable;
        this.searchable = searchable;
        this.sortable = sortable;
    }

    public Optional<Boolean> getDisplayable() {
        return Optional.ofNullable(this.displayable);
    }
    public Optional<Boolean> getFacetable() {
        return Optional.ofNullable(this.facetable);
    }
    public Optional<Boolean> getSearchable() {
        return Optional.ofNullable(this.searchable);
    }
    public Optional<Boolean> getSortable() {
        return Optional.ofNullable(this.sortable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexSearch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean displayable;
        private @Nullable Boolean facetable;
        private @Nullable Boolean searchable;
        private @Nullable Boolean sortable;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexSearch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayable = defaults.displayable;
    	      this.facetable = defaults.facetable;
    	      this.searchable = defaults.searchable;
    	      this.sortable = defaults.sortable;
        }

        public Builder setDisplayable(@Nullable Boolean displayable) {
            this.displayable = displayable;
            return this;
        }

        public Builder setFacetable(@Nullable Boolean facetable) {
            this.facetable = facetable;
            return this;
        }

        public Builder setSearchable(@Nullable Boolean searchable) {
            this.searchable = searchable;
            return this;
        }

        public Builder setSortable(@Nullable Boolean sortable) {
            this.sortable = sortable;
            return this;
        }

        public IndexSearch build() {
            return new IndexSearch(displayable, facetable, searchable, sortable);
        }
    }
}

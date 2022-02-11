// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resourcegroups.inputs;

import io.pulumi.awsnative.resourcegroups.inputs.GroupTagFilter;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupQuery extends io.pulumi.resources.InvokeArgs {

    public static final GroupQuery Empty = new GroupQuery();

    @InputImport(name="resourceTypeFilters")
    private final @Nullable List<String> resourceTypeFilters;

    public List<String> getResourceTypeFilters() {
        return this.resourceTypeFilters == null ? List.of() : this.resourceTypeFilters;
    }

    @InputImport(name="stackIdentifier")
    private final @Nullable String stackIdentifier;

    public Optional<String> getStackIdentifier() {
        return this.stackIdentifier == null ? Optional.empty() : Optional.ofNullable(this.stackIdentifier);
    }

    @InputImport(name="tagFilters")
    private final @Nullable List<GroupTagFilter> tagFilters;

    public List<GroupTagFilter> getTagFilters() {
        return this.tagFilters == null ? List.of() : this.tagFilters;
    }

    public GroupQuery(
        @Nullable List<String> resourceTypeFilters,
        @Nullable String stackIdentifier,
        @Nullable List<GroupTagFilter> tagFilters) {
        this.resourceTypeFilters = resourceTypeFilters;
        this.stackIdentifier = stackIdentifier;
        this.tagFilters = tagFilters;
    }

    private GroupQuery() {
        this.resourceTypeFilters = List.of();
        this.stackIdentifier = null;
        this.tagFilters = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupQuery defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> resourceTypeFilters;
        private @Nullable String stackIdentifier;
        private @Nullable List<GroupTagFilter> tagFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceTypeFilters = defaults.resourceTypeFilters;
    	      this.stackIdentifier = defaults.stackIdentifier;
    	      this.tagFilters = defaults.tagFilters;
        }

        public Builder setResourceTypeFilters(@Nullable List<String> resourceTypeFilters) {
            this.resourceTypeFilters = resourceTypeFilters;
            return this;
        }

        public Builder setStackIdentifier(@Nullable String stackIdentifier) {
            this.stackIdentifier = stackIdentifier;
            return this;
        }

        public Builder setTagFilters(@Nullable List<GroupTagFilter> tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }

        public GroupQuery build() {
            return new GroupQuery(resourceTypeFilters, stackIdentifier, tagFilters);
        }
    }
}

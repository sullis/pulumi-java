// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.azurenative.edgeorder.inputs.FilterableProperty;
import io.pulumi.azurenative.edgeorder.inputs.HierarchyInformation;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration filters
 * 
 */
public final class ConfigurationFilters extends io.pulumi.resources.InvokeArgs {

    public static final ConfigurationFilters Empty = new ConfigurationFilters();

    /**
     * Filters specific to product
     * 
     */
    @InputImport(name="filterableProperty")
      private final @Nullable List<FilterableProperty> filterableProperty;

    public List<FilterableProperty> getFilterableProperty() {
        return this.filterableProperty == null ? List.of() : this.filterableProperty;
    }

    /**
     * Product hierarchy information
     * 
     */
    @InputImport(name="hierarchyInformation", required=true)
      private final HierarchyInformation hierarchyInformation;

    public HierarchyInformation getHierarchyInformation() {
        return this.hierarchyInformation;
    }

    public ConfigurationFilters(
        @Nullable List<FilterableProperty> filterableProperty,
        HierarchyInformation hierarchyInformation) {
        this.filterableProperty = filterableProperty;
        this.hierarchyInformation = Objects.requireNonNull(hierarchyInformation, "expected parameter 'hierarchyInformation' to be non-null");
    }

    private ConfigurationFilters() {
        this.filterableProperty = List.of();
        this.hierarchyInformation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationFilters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FilterableProperty> filterableProperty;
        private HierarchyInformation hierarchyInformation;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationFilters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterableProperty = defaults.filterableProperty;
    	      this.hierarchyInformation = defaults.hierarchyInformation;
        }

        public Builder setFilterableProperty(@Nullable List<FilterableProperty> filterableProperty) {
            this.filterableProperty = filterableProperty;
            return this;
        }

        public Builder setHierarchyInformation(HierarchyInformation hierarchyInformation) {
            this.hierarchyInformation = Objects.requireNonNull(hierarchyInformation);
            return this;
        }
        public ConfigurationFilters build() {
            return new ConfigurationFilters(filterableProperty, hierarchyInformation);
        }
    }
}
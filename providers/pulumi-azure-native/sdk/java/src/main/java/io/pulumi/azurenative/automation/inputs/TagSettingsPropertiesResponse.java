// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Tag filter information for the VM.
 * 
 */
public final class TagSettingsPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final TagSettingsPropertiesResponse Empty = new TagSettingsPropertiesResponse();

    /**
     * Filter VMs by Any or All specified tags.
     * 
     */
    @InputImport(name="filterOperator")
    private final @Nullable String filterOperator;

    public Optional<String> getFilterOperator() {
        return this.filterOperator == null ? Optional.empty() : Optional.ofNullable(this.filterOperator);
    }

    /**
     * Dictionary of tags with its list of values.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Map<String,List<String>> tags;

    public Map<String,List<String>> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public TagSettingsPropertiesResponse(
        @Nullable String filterOperator,
        @Nullable Map<String,List<String>> tags) {
        this.filterOperator = filterOperator;
        this.tags = tags;
    }

    private TagSettingsPropertiesResponse() {
        this.filterOperator = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagSettingsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String filterOperator;
        private @Nullable Map<String,List<String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(TagSettingsPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterOperator = defaults.filterOperator;
    	      this.tags = defaults.tags;
        }

        public Builder setFilterOperator(@Nullable String filterOperator) {
            this.filterOperator = filterOperator;
            return this;
        }

        public Builder setTags(@Nullable Map<String,List<String>> tags) {
            this.tags = tags;
            return this;
        }

        public TagSettingsPropertiesResponse build() {
            return new TagSettingsPropertiesResponse(filterOperator, tags);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TagSettingsPropertiesResponse {
    /**
     * Filter VMs by Any or All specified tags.
     * 
     */
    private final @Nullable String filterOperator;
    /**
     * Dictionary of tags with its list of values.
     * 
     */
    private final @Nullable Map<String,List<String>> tags;

    @OutputCustomType.Constructor({"filterOperator","tags"})
    private TagSettingsPropertiesResponse(
        @Nullable String filterOperator,
        @Nullable Map<String,List<String>> tags) {
        this.filterOperator = filterOperator;
        this.tags = tags;
    }

    /**
     * Filter VMs by Any or All specified tags.
     * 
     */
    public Optional<String> getFilterOperator() {
        return Optional.ofNullable(this.filterOperator);
    }
    /**
     * Dictionary of tags with its list of values.
     * 
     */
    public Map<String,List<String>> getTags() {
        return this.tags == null ? Map.of() : this.tags;
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

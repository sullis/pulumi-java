// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ColumnResponse {
    /**
     * Column data type logical hint.
     * 
     */
    private final @Nullable String dataTypeHint;
    /**
     * Column description.
     * 
     */
    private final @Nullable String description;
    /**
     * Column display name.
     * 
     */
    private final @Nullable String displayName;
    /**
     * Is displayed by default.
     * 
     */
    private final Boolean isDefaultDisplay;
    /**
     * Is column hidden.
     * 
     */
    private final Boolean isHidden;
    /**
     * Column name.
     * 
     */
    private final @Nullable String name;
    /**
     * Column data type.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"dataTypeHint","description","displayName","isDefaultDisplay","isHidden","name","type"})
    private ColumnResponse(
        @Nullable String dataTypeHint,
        @Nullable String description,
        @Nullable String displayName,
        Boolean isDefaultDisplay,
        Boolean isHidden,
        @Nullable String name,
        @Nullable String type) {
        this.dataTypeHint = dataTypeHint;
        this.description = description;
        this.displayName = displayName;
        this.isDefaultDisplay = Objects.requireNonNull(isDefaultDisplay);
        this.isHidden = Objects.requireNonNull(isHidden);
        this.name = name;
        this.type = type;
    }

    /**
     * Column data type logical hint.
     * 
     */
    public Optional<String> getDataTypeHint() {
        return Optional.ofNullable(this.dataTypeHint);
    }
    /**
     * Column description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Column display name.
     * 
     */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Is displayed by default.
     * 
     */
    public Boolean getIsDefaultDisplay() {
        return this.isDefaultDisplay;
    }
    /**
     * Is column hidden.
     * 
     */
    public Boolean getIsHidden() {
        return this.isHidden;
    }
    /**
     * Column name.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Column data type.
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ColumnResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataTypeHint;
        private @Nullable String description;
        private @Nullable String displayName;
        private Boolean isDefaultDisplay;
        private Boolean isHidden;
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ColumnResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataTypeHint = defaults.dataTypeHint;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.isDefaultDisplay = defaults.isDefaultDisplay;
    	      this.isHidden = defaults.isHidden;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setDataTypeHint(@Nullable String dataTypeHint) {
            this.dataTypeHint = dataTypeHint;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setIsDefaultDisplay(Boolean isDefaultDisplay) {
            this.isDefaultDisplay = Objects.requireNonNull(isDefaultDisplay);
            return this;
        }

        public Builder setIsHidden(Boolean isHidden) {
            this.isHidden = Objects.requireNonNull(isHidden);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public ColumnResponse build() {
            return new ColumnResponse(dataTypeHint, description, displayName, isDefaultDisplay, isHidden, name, type);
        }
    }
}

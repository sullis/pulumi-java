// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.inputs;

import io.pulumi.awsnative.frauddetector.enums.DetectorEventVariableDataSource;
import io.pulumi.awsnative.frauddetector.enums.DetectorEventVariableDataType;
import io.pulumi.awsnative.frauddetector.enums.DetectorEventVariableVariableType;
import io.pulumi.awsnative.frauddetector.inputs.DetectorTag;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DetectorEventVariable extends io.pulumi.resources.InvokeArgs {

    public static final DetectorEventVariable Empty = new DetectorEventVariable();

    @InputImport(name="arn")
    private final @Nullable String arn;

    public Optional<String> getArn() {
        return this.arn == null ? Optional.empty() : Optional.ofNullable(this.arn);
    }

    /**
     * The time when the event variable was created.
     * 
     */
    @InputImport(name="createdTime")
    private final @Nullable String createdTime;

    public Optional<String> getCreatedTime() {
        return this.createdTime == null ? Optional.empty() : Optional.ofNullable(this.createdTime);
    }

    @InputImport(name="dataSource")
    private final @Nullable DetectorEventVariableDataSource dataSource;

    public Optional<DetectorEventVariableDataSource> getDataSource() {
        return this.dataSource == null ? Optional.empty() : Optional.ofNullable(this.dataSource);
    }

    @InputImport(name="dataType")
    private final @Nullable DetectorEventVariableDataType dataType;

    public Optional<DetectorEventVariableDataType> getDataType() {
        return this.dataType == null ? Optional.empty() : Optional.ofNullable(this.dataType);
    }

    @InputImport(name="defaultValue")
    private final @Nullable String defaultValue;

    public Optional<String> getDefaultValue() {
        return this.defaultValue == null ? Optional.empty() : Optional.ofNullable(this.defaultValue);
    }

    /**
     * The description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="inline")
    private final @Nullable Boolean inline;

    public Optional<Boolean> getInline() {
        return this.inline == null ? Optional.empty() : Optional.ofNullable(this.inline);
    }

    /**
     * The time when the event variable was last updated.
     * 
     */
    @InputImport(name="lastUpdatedTime")
    private final @Nullable String lastUpdatedTime;

    public Optional<String> getLastUpdatedTime() {
        return this.lastUpdatedTime == null ? Optional.empty() : Optional.ofNullable(this.lastUpdatedTime);
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Tags associated with this event variable.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable List<DetectorTag> tags;

    public List<DetectorTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    @InputImport(name="variableType")
    private final @Nullable DetectorEventVariableVariableType variableType;

    public Optional<DetectorEventVariableVariableType> getVariableType() {
        return this.variableType == null ? Optional.empty() : Optional.ofNullable(this.variableType);
    }

    public DetectorEventVariable(
        @Nullable String arn,
        @Nullable String createdTime,
        @Nullable DetectorEventVariableDataSource dataSource,
        @Nullable DetectorEventVariableDataType dataType,
        @Nullable String defaultValue,
        @Nullable String description,
        @Nullable Boolean inline,
        @Nullable String lastUpdatedTime,
        @Nullable String name,
        @Nullable List<DetectorTag> tags,
        @Nullable DetectorEventVariableVariableType variableType) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.dataSource = dataSource;
        this.dataType = dataType;
        this.defaultValue = defaultValue;
        this.description = description;
        this.inline = inline;
        this.lastUpdatedTime = lastUpdatedTime;
        this.name = name;
        this.tags = tags;
        this.variableType = variableType;
    }

    private DetectorEventVariable() {
        this.arn = null;
        this.createdTime = null;
        this.dataSource = null;
        this.dataType = null;
        this.defaultValue = null;
        this.description = null;
        this.inline = null;
        this.lastUpdatedTime = null;
        this.name = null;
        this.tags = List.of();
        this.variableType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorEventVariable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String createdTime;
        private @Nullable DetectorEventVariableDataSource dataSource;
        private @Nullable DetectorEventVariableDataType dataType;
        private @Nullable String defaultValue;
        private @Nullable String description;
        private @Nullable Boolean inline;
        private @Nullable String lastUpdatedTime;
        private @Nullable String name;
        private @Nullable List<DetectorTag> tags;
        private @Nullable DetectorEventVariableVariableType variableType;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorEventVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.dataSource = defaults.dataSource;
    	      this.dataType = defaults.dataType;
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.inline = defaults.inline;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.variableType = defaults.variableType;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setDataSource(@Nullable DetectorEventVariableDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        public Builder setDataType(@Nullable DetectorEventVariableDataType dataType) {
            this.dataType = dataType;
            return this;
        }

        public Builder setDefaultValue(@Nullable String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setInline(@Nullable Boolean inline) {
            this.inline = inline;
            return this;
        }

        public Builder setLastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTags(@Nullable List<DetectorTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setVariableType(@Nullable DetectorEventVariableVariableType variableType) {
            this.variableType = variableType;
            return this;
        }

        public DetectorEventVariable build() {
            return new DetectorEventVariable(arn, createdTime, dataSource, dataType, defaultValue, description, inline, lastUpdatedTime, name, tags, variableType);
        }
    }
}

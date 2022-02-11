// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.inputs;

import io.pulumi.awsnative.frauddetector.enums.DetectorEventVariableDataSource;
import io.pulumi.awsnative.frauddetector.enums.DetectorEventVariableDataType;
import io.pulumi.awsnative.frauddetector.enums.DetectorEventVariableVariableType;
import io.pulumi.awsnative.frauddetector.inputs.DetectorTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DetectorEventVariableArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorEventVariableArgs Empty = new DetectorEventVariableArgs();

    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    @InputImport(name="createdTime")
    private final @Nullable Input<String> createdTime;

    public Input<String> getCreatedTime() {
        return this.createdTime == null ? Input.empty() : this.createdTime;
    }

    @InputImport(name="dataSource")
    private final @Nullable Input<DetectorEventVariableDataSource> dataSource;

    public Input<DetectorEventVariableDataSource> getDataSource() {
        return this.dataSource == null ? Input.empty() : this.dataSource;
    }

    @InputImport(name="dataType")
    private final @Nullable Input<DetectorEventVariableDataType> dataType;

    public Input<DetectorEventVariableDataType> getDataType() {
        return this.dataType == null ? Input.empty() : this.dataType;
    }

    @InputImport(name="defaultValue")
    private final @Nullable Input<String> defaultValue;

    public Input<String> getDefaultValue() {
        return this.defaultValue == null ? Input.empty() : this.defaultValue;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="inline")
    private final @Nullable Input<Boolean> inline;

    public Input<Boolean> getInline() {
        return this.inline == null ? Input.empty() : this.inline;
    }

    @InputImport(name="lastUpdatedTime")
    private final @Nullable Input<String> lastUpdatedTime;

    public Input<String> getLastUpdatedTime() {
        return this.lastUpdatedTime == null ? Input.empty() : this.lastUpdatedTime;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<DetectorTagArgs>> tags;

    public Input<List<DetectorTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="variableType")
    private final @Nullable Input<DetectorEventVariableVariableType> variableType;

    public Input<DetectorEventVariableVariableType> getVariableType() {
        return this.variableType == null ? Input.empty() : this.variableType;
    }

    public DetectorEventVariableArgs(
        @Nullable Input<String> arn,
        @Nullable Input<String> createdTime,
        @Nullable Input<DetectorEventVariableDataSource> dataSource,
        @Nullable Input<DetectorEventVariableDataType> dataType,
        @Nullable Input<String> defaultValue,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> inline,
        @Nullable Input<String> lastUpdatedTime,
        @Nullable Input<String> name,
        @Nullable Input<List<DetectorTagArgs>> tags,
        @Nullable Input<DetectorEventVariableVariableType> variableType) {
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

    private DetectorEventVariableArgs() {
        this.arn = Input.empty();
        this.createdTime = Input.empty();
        this.dataSource = Input.empty();
        this.dataType = Input.empty();
        this.defaultValue = Input.empty();
        this.description = Input.empty();
        this.inline = Input.empty();
        this.lastUpdatedTime = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
        this.variableType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorEventVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> createdTime;
        private @Nullable Input<DetectorEventVariableDataSource> dataSource;
        private @Nullable Input<DetectorEventVariableDataType> dataType;
        private @Nullable Input<String> defaultValue;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> inline;
        private @Nullable Input<String> lastUpdatedTime;
        private @Nullable Input<String> name;
        private @Nullable Input<List<DetectorTagArgs>> tags;
        private @Nullable Input<DetectorEventVariableVariableType> variableType;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorEventVariableArgs defaults) {
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

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setCreatedTime(@Nullable Input<String> createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = Input.ofNullable(createdTime);
            return this;
        }

        public Builder setDataSource(@Nullable Input<DetectorEventVariableDataSource> dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        public Builder setDataSource(@Nullable DetectorEventVariableDataSource dataSource) {
            this.dataSource = Input.ofNullable(dataSource);
            return this;
        }

        public Builder setDataType(@Nullable Input<DetectorEventVariableDataType> dataType) {
            this.dataType = dataType;
            return this;
        }

        public Builder setDataType(@Nullable DetectorEventVariableDataType dataType) {
            this.dataType = Input.ofNullable(dataType);
            return this;
        }

        public Builder setDefaultValue(@Nullable Input<String> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setDefaultValue(@Nullable String defaultValue) {
            this.defaultValue = Input.ofNullable(defaultValue);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setInline(@Nullable Input<Boolean> inline) {
            this.inline = inline;
            return this;
        }

        public Builder setInline(@Nullable Boolean inline) {
            this.inline = Input.ofNullable(inline);
            return this;
        }

        public Builder setLastUpdatedTime(@Nullable Input<String> lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder setLastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = Input.ofNullable(lastUpdatedTime);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTags(@Nullable Input<List<DetectorTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<DetectorTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVariableType(@Nullable Input<DetectorEventVariableVariableType> variableType) {
            this.variableType = variableType;
            return this;
        }

        public Builder setVariableType(@Nullable DetectorEventVariableVariableType variableType) {
            this.variableType = Input.ofNullable(variableType);
            return this;
        }

        public DetectorEventVariableArgs build() {
            return new DetectorEventVariableArgs(arn, createdTime, dataSource, dataType, defaultValue, description, inline, lastUpdatedTime, name, tags, variableType);
        }
    }
}

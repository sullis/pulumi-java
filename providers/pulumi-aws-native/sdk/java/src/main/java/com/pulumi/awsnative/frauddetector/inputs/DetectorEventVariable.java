// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.frauddetector.inputs;

import com.pulumi.awsnative.frauddetector.enums.DetectorEventVariableDataSource;
import com.pulumi.awsnative.frauddetector.enums.DetectorEventVariableDataType;
import com.pulumi.awsnative.frauddetector.enums.DetectorEventVariableVariableType;
import com.pulumi.awsnative.frauddetector.inputs.DetectorTag;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DetectorEventVariable extends com.pulumi.resources.InvokeArgs {

    public static final DetectorEventVariable Empty = new DetectorEventVariable();

    @Import(name="arn")
    private @Nullable String arn;

    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The time when the event variable was created.
     * 
     */
    @Import(name="createdTime")
    private @Nullable String createdTime;

    /**
     * @return The time when the event variable was created.
     * 
     */
    public Optional<String> createdTime() {
        return Optional.ofNullable(this.createdTime);
    }

    @Import(name="dataSource")
    private @Nullable DetectorEventVariableDataSource dataSource;

    public Optional<DetectorEventVariableDataSource> dataSource() {
        return Optional.ofNullable(this.dataSource);
    }

    @Import(name="dataType")
    private @Nullable DetectorEventVariableDataType dataType;

    public Optional<DetectorEventVariableDataType> dataType() {
        return Optional.ofNullable(this.dataType);
    }

    @Import(name="defaultValue")
    private @Nullable String defaultValue;

    public Optional<String> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }

    /**
     * The description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return The description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="inline")
    private @Nullable Boolean inline;

    public Optional<Boolean> inline() {
        return Optional.ofNullable(this.inline);
    }

    /**
     * The time when the event variable was last updated.
     * 
     */
    @Import(name="lastUpdatedTime")
    private @Nullable String lastUpdatedTime;

    /**
     * @return The time when the event variable was last updated.
     * 
     */
    public Optional<String> lastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }

    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Tags associated with this event variable.
     * 
     */
    @Import(name="tags")
    private @Nullable List<DetectorTag> tags;

    /**
     * @return Tags associated with this event variable.
     * 
     */
    public Optional<List<DetectorTag>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="variableType")
    private @Nullable DetectorEventVariableVariableType variableType;

    public Optional<DetectorEventVariableVariableType> variableType() {
        return Optional.ofNullable(this.variableType);
    }

    private DetectorEventVariable() {}

    private DetectorEventVariable(DetectorEventVariable $) {
        this.arn = $.arn;
        this.createdTime = $.createdTime;
        this.dataSource = $.dataSource;
        this.dataType = $.dataType;
        this.defaultValue = $.defaultValue;
        this.description = $.description;
        this.inline = $.inline;
        this.lastUpdatedTime = $.lastUpdatedTime;
        this.name = $.name;
        this.tags = $.tags;
        this.variableType = $.variableType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DetectorEventVariable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DetectorEventVariable $;

        public Builder() {
            $ = new DetectorEventVariable();
        }

        public Builder(DetectorEventVariable defaults) {
            $ = new DetectorEventVariable(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable String arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param createdTime The time when the event variable was created.
         * 
         * @return builder
         * 
         */
        public Builder createdTime(@Nullable String createdTime) {
            $.createdTime = createdTime;
            return this;
        }

        public Builder dataSource(@Nullable DetectorEventVariableDataSource dataSource) {
            $.dataSource = dataSource;
            return this;
        }

        public Builder dataType(@Nullable DetectorEventVariableDataType dataType) {
            $.dataType = dataType;
            return this;
        }

        public Builder defaultValue(@Nullable String defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        /**
         * @param description The description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder inline(@Nullable Boolean inline) {
            $.inline = inline;
            return this;
        }

        /**
         * @param lastUpdatedTime The time when the event variable was last updated.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            $.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tags Tags associated with this event variable.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable List<DetectorTag> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags associated with this event variable.
         * 
         * @return builder
         * 
         */
        public Builder tags(DetectorTag... tags) {
            return tags(List.of(tags));
        }

        public Builder variableType(@Nullable DetectorEventVariableVariableType variableType) {
            $.variableType = variableType;
            return this;
        }

        public DetectorEventVariable build() {
            return $;
        }
    }

}

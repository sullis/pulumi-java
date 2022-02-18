// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.inputs;

import io.pulumi.awsnative.frauddetector.inputs.DetectorTag;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DetectorEntityType extends io.pulumi.resources.InvokeArgs {

    public static final DetectorEntityType Empty = new DetectorEntityType();

    @InputImport(name="arn")
    private final @Nullable String arn;

    public Optional<String> getArn() {
        return this.arn == null ? Optional.empty() : Optional.ofNullable(this.arn);
    }

    /**
     * The time when the entity type was created.
     * 
     */
    @InputImport(name="createdTime")
    private final @Nullable String createdTime;

    public Optional<String> getCreatedTime() {
        return this.createdTime == null ? Optional.empty() : Optional.ofNullable(this.createdTime);
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
     * The time when the entity type was last updated.
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
     * Tags associated with this entity type.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable List<DetectorTag> tags;

    public List<DetectorTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public DetectorEntityType(
        @Nullable String arn,
        @Nullable String createdTime,
        @Nullable String description,
        @Nullable Boolean inline,
        @Nullable String lastUpdatedTime,
        @Nullable String name,
        @Nullable List<DetectorTag> tags) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.description = description;
        this.inline = inline;
        this.lastUpdatedTime = lastUpdatedTime;
        this.name = name;
        this.tags = tags;
    }

    private DetectorEntityType() {
        this.arn = null;
        this.createdTime = null;
        this.description = null;
        this.inline = null;
        this.lastUpdatedTime = null;
        this.name = null;
        this.tags = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorEntityType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String createdTime;
        private @Nullable String description;
        private @Nullable Boolean inline;
        private @Nullable String lastUpdatedTime;
        private @Nullable String name;
        private @Nullable List<DetectorTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorEntityType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.inline = defaults.inline;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
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

        public DetectorEntityType build() {
            return new DetectorEntityType(arn, createdTime, description, inline, lastUpdatedTime, name, tags);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.frauddetector.inputs;

import com.pulumi.awsnative.frauddetector.inputs.DetectorTag;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DetectorOutcome extends com.pulumi.resources.InvokeArgs {

    public static final DetectorOutcome Empty = new DetectorOutcome();

    @Import(name="arn")
    private @Nullable String arn;

    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The time when the outcome was created.
     * 
     */
    @Import(name="createdTime")
    private @Nullable String createdTime;

    /**
     * @return The time when the outcome was created.
     * 
     */
    public Optional<String> createdTime() {
        return Optional.ofNullable(this.createdTime);
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
     * The time when the outcome was last updated.
     * 
     */
    @Import(name="lastUpdatedTime")
    private @Nullable String lastUpdatedTime;

    /**
     * @return The time when the outcome was last updated.
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
     * Tags associated with this outcome.
     * 
     */
    @Import(name="tags")
    private @Nullable List<DetectorTag> tags;

    /**
     * @return Tags associated with this outcome.
     * 
     */
    public Optional<List<DetectorTag>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DetectorOutcome() {}

    private DetectorOutcome(DetectorOutcome $) {
        this.arn = $.arn;
        this.createdTime = $.createdTime;
        this.description = $.description;
        this.inline = $.inline;
        this.lastUpdatedTime = $.lastUpdatedTime;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DetectorOutcome defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DetectorOutcome $;

        public Builder() {
            $ = new DetectorOutcome();
        }

        public Builder(DetectorOutcome defaults) {
            $ = new DetectorOutcome(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable String arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param createdTime The time when the outcome was created.
         * 
         * @return builder
         * 
         */
        public Builder createdTime(@Nullable String createdTime) {
            $.createdTime = createdTime;
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
         * @param lastUpdatedTime The time when the outcome was last updated.
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
         * @param tags Tags associated with this outcome.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable List<DetectorTag> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags associated with this outcome.
         * 
         * @return builder
         * 
         */
        public Builder tags(DetectorTag... tags) {
            return tags(List.of(tags));
        }

        public DetectorOutcome build() {
            return $;
        }
    }

}

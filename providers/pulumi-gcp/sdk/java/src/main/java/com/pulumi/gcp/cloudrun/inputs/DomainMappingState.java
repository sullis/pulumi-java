// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudrun.inputs.DomainMappingMetadataGetArgs;
import com.pulumi.gcp.cloudrun.inputs.DomainMappingSpecGetArgs;
import com.pulumi.gcp.cloudrun.inputs.DomainMappingStatusGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainMappingState extends com.pulumi.resources.ResourceArgs {

    public static final DomainMappingState Empty = new DomainMappingState();

    /**
     * The location of the cloud run instance. eg us-central1
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the cloud run instance. eg us-central1
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Metadata associated with this DomainMapping.
     * Structure is documented below.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<DomainMappingMetadataGetArgs> metadata;

    /**
     * @return Metadata associated with this DomainMapping.
     * Structure is documented below.
     * 
     */
    public Optional<Output<DomainMappingMetadataGetArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Name should be a [verified](https://support.google.com/webmasters/answer/9008080) domain
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name should be a [verified](https://support.google.com/webmasters/answer/9008080) domain
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The spec for this DomainMapping.
     * Structure is documented below.
     * 
     */
    @Import(name="spec")
    private @Nullable Output<DomainMappingSpecGetArgs> spec;

    /**
     * @return The spec for this DomainMapping.
     * Structure is documented below.
     * 
     */
    public Optional<Output<DomainMappingSpecGetArgs>> spec() {
        return Optional.ofNullable(this.spec);
    }

    /**
     * The current status of the DomainMapping.
     * 
     */
    @Import(name="statuses")
    private @Nullable Output<List<DomainMappingStatusGetArgs>> statuses;

    /**
     * @return The current status of the DomainMapping.
     * 
     */
    public Optional<Output<List<DomainMappingStatusGetArgs>>> statuses() {
        return Optional.ofNullable(this.statuses);
    }

    private DomainMappingState() {}

    private DomainMappingState(DomainMappingState $) {
        this.location = $.location;
        this.metadata = $.metadata;
        this.name = $.name;
        this.project = $.project;
        this.spec = $.spec;
        this.statuses = $.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainMappingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainMappingState $;

        public Builder() {
            $ = new DomainMappingState();
        }

        public Builder(DomainMappingState defaults) {
            $ = new DomainMappingState(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The location of the cloud run instance. eg us-central1
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the cloud run instance. eg us-central1
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param metadata Metadata associated with this DomainMapping.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<DomainMappingMetadataGetArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Metadata associated with this DomainMapping.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder metadata(DomainMappingMetadataGetArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param name Name should be a [verified](https://support.google.com/webmasters/answer/9008080) domain
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name should be a [verified](https://support.google.com/webmasters/answer/9008080) domain
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param spec The spec for this DomainMapping.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder spec(@Nullable Output<DomainMappingSpecGetArgs> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec The spec for this DomainMapping.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder spec(DomainMappingSpecGetArgs spec) {
            return spec(Output.of(spec));
        }

        /**
         * @param statuses The current status of the DomainMapping.
         * 
         * @return builder
         * 
         */
        public Builder statuses(@Nullable Output<List<DomainMappingStatusGetArgs>> statuses) {
            $.statuses = statuses;
            return this;
        }

        /**
         * @param statuses The current status of the DomainMapping.
         * 
         * @return builder
         * 
         */
        public Builder statuses(List<DomainMappingStatusGetArgs> statuses) {
            return statuses(Output.of(statuses));
        }

        /**
         * @param statuses The current status of the DomainMapping.
         * 
         * @return builder
         * 
         */
        public Builder statuses(DomainMappingStatusGetArgs... statuses) {
            return statuses(List.of(statuses));
        }

        public DomainMappingState build() {
            return $;
        }
    }

}

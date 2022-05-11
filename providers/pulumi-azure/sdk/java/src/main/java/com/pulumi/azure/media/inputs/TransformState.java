// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.inputs;

import com.pulumi.azure.media.inputs.TransformOutputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransformState extends com.pulumi.resources.ResourceArgs {

    public static final TransformState Empty = new TransformState();

    /**
     * An optional verbose description of the Transform.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional verbose description of the Transform.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Media Services account name. Changing this forces a new Transform to be created.
     * 
     */
    @Import(name="mediaServicesAccountName")
    private @Nullable Output<String> mediaServicesAccountName;

    /**
     * @return The Media Services account name. Changing this forces a new Transform to be created.
     * 
     */
    public Optional<Output<String>> mediaServicesAccountName() {
        return Optional.ofNullable(this.mediaServicesAccountName);
    }

    /**
     * The name which should be used for this Transform. Changing this forces a new Transform to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Transform. Changing this forces a new Transform to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * One or more `output` blocks as defined below. At least one `output` must be defined.
     * 
     */
    @Import(name="outputs")
    private @Nullable Output<List<TransformOutputArgs>> outputs;

    /**
     * @return One or more `output` blocks as defined below. At least one `output` must be defined.
     * 
     */
    public Optional<Output<List<TransformOutputArgs>>> outputs() {
        return Optional.ofNullable(this.outputs);
    }

    /**
     * The name of the Resource Group where the Transform should exist. Changing this forces a new Transform to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Transform should exist. Changing this forces a new Transform to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private TransformState() {}

    private TransformState(TransformState $) {
        this.description = $.description;
        this.mediaServicesAccountName = $.mediaServicesAccountName;
        this.name = $.name;
        this.outputs = $.outputs;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransformState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransformState $;

        public Builder() {
            $ = new TransformState();
        }

        public Builder(TransformState defaults) {
            $ = new TransformState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional verbose description of the Transform.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional verbose description of the Transform.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param mediaServicesAccountName The Media Services account name. Changing this forces a new Transform to be created.
         * 
         * @return builder
         * 
         */
        public Builder mediaServicesAccountName(@Nullable Output<String> mediaServicesAccountName) {
            $.mediaServicesAccountName = mediaServicesAccountName;
            return this;
        }

        /**
         * @param mediaServicesAccountName The Media Services account name. Changing this forces a new Transform to be created.
         * 
         * @return builder
         * 
         */
        public Builder mediaServicesAccountName(String mediaServicesAccountName) {
            return mediaServicesAccountName(Output.of(mediaServicesAccountName));
        }

        /**
         * @param name The name which should be used for this Transform. Changing this forces a new Transform to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Transform. Changing this forces a new Transform to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param outputs One or more `output` blocks as defined below. At least one `output` must be defined.
         * 
         * @return builder
         * 
         */
        public Builder outputs(@Nullable Output<List<TransformOutputArgs>> outputs) {
            $.outputs = outputs;
            return this;
        }

        /**
         * @param outputs One or more `output` blocks as defined below. At least one `output` must be defined.
         * 
         * @return builder
         * 
         */
        public Builder outputs(List<TransformOutputArgs> outputs) {
            return outputs(Output.of(outputs));
        }

        /**
         * @param outputs One or more `output` blocks as defined below. At least one `output` must be defined.
         * 
         * @return builder
         * 
         */
        public Builder outputs(TransformOutputArgs... outputs) {
            return outputs(List.of(outputs));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Transform should exist. Changing this forces a new Transform to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Transform should exist. Changing this forces a new Transform to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public TransformState build() {
            return $;
        }
    }

}

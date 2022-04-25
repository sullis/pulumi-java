// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineRunTargetPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final PipelineRunTargetPropertiesResponse Empty = new PipelineRunTargetPropertiesResponse();

    /**
     * The name of the target.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the target.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The type of the target.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return The type of the target.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private PipelineRunTargetPropertiesResponse() {}

    private PipelineRunTargetPropertiesResponse(PipelineRunTargetPropertiesResponse $) {
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineRunTargetPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineRunTargetPropertiesResponse $;

        public Builder() {
            $ = new PipelineRunTargetPropertiesResponse();
        }

        public Builder(PipelineRunTargetPropertiesResponse defaults) {
            $ = new PipelineRunTargetPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the target.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param type The type of the target.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public PipelineRunTargetPropertiesResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).def("AzureStorageBlob").getNullable();
            return $;
        }
    }

}

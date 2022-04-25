// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.enums.PipelineRunSourceType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineRunSourcePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineRunSourcePropertiesArgs Empty = new PipelineRunSourcePropertiesArgs();

    /**
     * The name of the source.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the source.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The type of the source.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,PipelineRunSourceType>> type;

    /**
     * @return The type of the source.
     * 
     */
    public Optional<Output<Either<String,PipelineRunSourceType>>> type() {
        return Optional.ofNullable(this.type);
    }

    private PipelineRunSourcePropertiesArgs() {}

    private PipelineRunSourcePropertiesArgs(PipelineRunSourcePropertiesArgs $) {
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineRunSourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineRunSourcePropertiesArgs $;

        public Builder() {
            $ = new PipelineRunSourcePropertiesArgs();
        }

        public Builder(PipelineRunSourcePropertiesArgs defaults) {
            $ = new PipelineRunSourcePropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the source.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the source.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The type of the source.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,PipelineRunSourceType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the source.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,PipelineRunSourceType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type The type of the source.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type The type of the source.
         * 
         * @return builder
         * 
         */
        public Builder type(PipelineRunSourceType type) {
            return type(Either.ofRight(type));
        }

        public PipelineRunSourcePropertiesArgs build() {
            $.type = Codegen.stringProp("type").left(PipelineRunSourceType.class).output().arg($.type).def("AzureStorageBlob").getNullable();
            return $;
        }
    }

}

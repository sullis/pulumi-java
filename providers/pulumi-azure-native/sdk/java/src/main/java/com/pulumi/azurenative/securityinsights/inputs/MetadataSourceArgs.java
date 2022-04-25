// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.azurenative.securityinsights.enums.SourceKind;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The original source of the content item, where it comes from.
 * 
 */
public final class MetadataSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetadataSourceArgs Empty = new MetadataSourceArgs();

    /**
     * Source type of the content
     * 
     */
    @Import(name="kind", required=true)
    private Output<Either<String,SourceKind>> kind;

    /**
     * @return Source type of the content
     * 
     */
    public Output<Either<String,SourceKind>> kind() {
        return this.kind;
    }

    /**
     * Name of the content source.  The repo name, solution name, LA workspace name etc.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the content source.  The repo name, solution name, LA workspace name etc.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * ID of the content source.  The solution ID, workspace ID, etc
     * 
     */
    @Import(name="sourceId")
    private @Nullable Output<String> sourceId;

    /**
     * @return ID of the content source.  The solution ID, workspace ID, etc
     * 
     */
    public Optional<Output<String>> sourceId() {
        return Optional.ofNullable(this.sourceId);
    }

    private MetadataSourceArgs() {}

    private MetadataSourceArgs(MetadataSourceArgs $) {
        this.kind = $.kind;
        this.name = $.name;
        this.sourceId = $.sourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetadataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetadataSourceArgs $;

        public Builder() {
            $ = new MetadataSourceArgs();
        }

        public Builder(MetadataSourceArgs defaults) {
            $ = new MetadataSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kind Source type of the content
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<Either<String,SourceKind>> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Source type of the content
         * 
         * @return builder
         * 
         */
        public Builder kind(Either<String,SourceKind> kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param kind Source type of the content
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Either.ofLeft(kind));
        }

        /**
         * @param kind Source type of the content
         * 
         * @return builder
         * 
         */
        public Builder kind(SourceKind kind) {
            return kind(Either.ofRight(kind));
        }

        /**
         * @param name Name of the content source.  The repo name, solution name, LA workspace name etc.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the content source.  The repo name, solution name, LA workspace name etc.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sourceId ID of the content source.  The solution ID, workspace ID, etc
         * 
         * @return builder
         * 
         */
        public Builder sourceId(@Nullable Output<String> sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        /**
         * @param sourceId ID of the content source.  The solution ID, workspace ID, etc
         * 
         * @return builder
         * 
         */
        public Builder sourceId(String sourceId) {
            return sourceId(Output.of(sourceId));
        }

        public MetadataSourceArgs build() {
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            return $;
        }
    }

}

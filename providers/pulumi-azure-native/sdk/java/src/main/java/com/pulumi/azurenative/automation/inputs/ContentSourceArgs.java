// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.azurenative.automation.enums.ContentSourceType;
import com.pulumi.azurenative.automation.inputs.ContentHashArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of the content source.
 * 
 */
public final class ContentSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContentSourceArgs Empty = new ContentSourceArgs();

    /**
     * Gets or sets the hash.
     * 
     */
    @Import(name="hash")
    private @Nullable Output<ContentHashArgs> hash;

    /**
     * @return Gets or sets the hash.
     * 
     */
    public Optional<Output<ContentHashArgs>> hash() {
        return Optional.ofNullable(this.hash);
    }

    /**
     * Gets or sets the content source type.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,ContentSourceType>> type;

    /**
     * @return Gets or sets the content source type.
     * 
     */
    public Optional<Output<Either<String,ContentSourceType>>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Gets or sets the value of the content. This is based on the content source type.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Gets or sets the value of the content. This is based on the content source type.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    /**
     * Gets or sets the version of the content.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Gets or sets the version of the content.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private ContentSourceArgs() {}

    private ContentSourceArgs(ContentSourceArgs $) {
        this.hash = $.hash;
        this.type = $.type;
        this.value = $.value;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContentSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContentSourceArgs $;

        public Builder() {
            $ = new ContentSourceArgs();
        }

        public Builder(ContentSourceArgs defaults) {
            $ = new ContentSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hash Gets or sets the hash.
         * 
         * @return builder
         * 
         */
        public Builder hash(@Nullable Output<ContentHashArgs> hash) {
            $.hash = hash;
            return this;
        }

        /**
         * @param hash Gets or sets the hash.
         * 
         * @return builder
         * 
         */
        public Builder hash(ContentHashArgs hash) {
            return hash(Output.of(hash));
        }

        /**
         * @param type Gets or sets the content source type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,ContentSourceType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Gets or sets the content source type.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,ContentSourceType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type Gets or sets the content source type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type Gets or sets the content source type.
         * 
         * @return builder
         * 
         */
        public Builder type(ContentSourceType type) {
            return type(Either.ofRight(type));
        }

        /**
         * @param value Gets or sets the value of the content. This is based on the content source type.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Gets or sets the value of the content. This is based on the content source type.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        /**
         * @param version Gets or sets the version of the content.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Gets or sets the version of the content.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ContentSourceArgs build() {
            return $;
        }
    }

}

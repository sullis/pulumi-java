// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The content hash.
 * 
 */
public final class ContentHashResponse extends com.pulumi.resources.InvokeArgs {

    public static final ContentHashResponse Empty = new ContentHashResponse();

    /**
     * The algorithm of the content hash.
     * 
     */
    @Import(name="algorithm")
    private @Nullable String algorithm;

    /**
     * @return The algorithm of the content hash.
     * 
     */
    public Optional<String> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }

    /**
     * The value of the content hash.
     * 
     */
    @Import(name="value")
    private @Nullable String value;

    /**
     * @return The value of the content hash.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private ContentHashResponse() {}

    private ContentHashResponse(ContentHashResponse $) {
        this.algorithm = $.algorithm;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContentHashResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContentHashResponse $;

        public Builder() {
            $ = new ContentHashResponse();
        }

        public Builder(ContentHashResponse defaults) {
            $ = new ContentHashResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param algorithm The algorithm of the content hash.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(@Nullable String algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        /**
         * @param value The value of the content hash.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public ContentHashResponse build() {
            return $;
        }
    }

}

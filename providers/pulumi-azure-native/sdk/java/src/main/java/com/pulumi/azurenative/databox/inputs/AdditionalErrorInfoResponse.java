// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Additional error info.
 * 
 */
public final class AdditionalErrorInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final AdditionalErrorInfoResponse Empty = new AdditionalErrorInfoResponse();

    /**
     * Additional error info.
     * 
     */
    @Import(name="info")
    private @Nullable Object info;

    /**
     * @return Additional error info.
     * 
     */
    public Optional<Object> info() {
        return Optional.ofNullable(this.info);
    }

    /**
     * Additional error type.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return Additional error type.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private AdditionalErrorInfoResponse() {}

    private AdditionalErrorInfoResponse(AdditionalErrorInfoResponse $) {
        this.info = $.info;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdditionalErrorInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdditionalErrorInfoResponse $;

        public Builder() {
            $ = new AdditionalErrorInfoResponse();
        }

        public Builder(AdditionalErrorInfoResponse defaults) {
            $ = new AdditionalErrorInfoResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param info Additional error info.
         * 
         * @return builder
         * 
         */
        public Builder info(@Nullable Object info) {
            $.info = info;
            return this;
        }

        /**
         * @param type Additional error type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public AdditionalErrorInfoResponse build() {
            return $;
        }
    }

}

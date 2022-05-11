// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContentKeyPolicyPolicyOptionTokenRestrictionRequiredClaimArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyPolicyOptionTokenRestrictionRequiredClaimArgs Empty = new ContentKeyPolicyPolicyOptionTokenRestrictionRequiredClaimArgs();

    /**
     * Token claim type.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Token claim type.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Token claim value.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Token claim value.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ContentKeyPolicyPolicyOptionTokenRestrictionRequiredClaimArgs() {}

    private ContentKeyPolicyPolicyOptionTokenRestrictionRequiredClaimArgs(ContentKeyPolicyPolicyOptionTokenRestrictionRequiredClaimArgs $) {
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContentKeyPolicyPolicyOptionTokenRestrictionRequiredClaimArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContentKeyPolicyPolicyOptionTokenRestrictionRequiredClaimArgs $;

        public Builder() {
            $ = new ContentKeyPolicyPolicyOptionTokenRestrictionRequiredClaimArgs();
        }

        public Builder(ContentKeyPolicyPolicyOptionTokenRestrictionRequiredClaimArgs defaults) {
            $ = new ContentKeyPolicyPolicyOptionTokenRestrictionRequiredClaimArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Token claim type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Token claim type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value Token claim value.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Token claim value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ContentKeyPolicyPolicyOptionTokenRestrictionRequiredClaimArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a selector for extracting and matching an MSH field to a value.
 * 
 */
public final class VersionSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final VersionSourceArgs Empty = new VersionSourceArgs();

    /**
     * The field to extract from the MSH segment. For example, &#34;3.1&#34; or &#34;18[1].1&#34;.
     * 
     */
    @Import(name="mshField")
    private @Nullable Output<String> mshField;

    /**
     * @return The field to extract from the MSH segment. For example, &#34;3.1&#34; or &#34;18[1].1&#34;.
     * 
     */
    public Optional<Output<String>> mshField() {
        return Optional.ofNullable(this.mshField);
    }

    /**
     * The value to match with the field. For example, &#34;My Application Name&#34; or &#34;2.3&#34;.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value to match with the field. For example, &#34;My Application Name&#34; or &#34;2.3&#34;.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private VersionSourceArgs() {}

    private VersionSourceArgs(VersionSourceArgs $) {
        this.mshField = $.mshField;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VersionSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VersionSourceArgs $;

        public Builder() {
            $ = new VersionSourceArgs();
        }

        public Builder(VersionSourceArgs defaults) {
            $ = new VersionSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mshField The field to extract from the MSH segment. For example, &#34;3.1&#34; or &#34;18[1].1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder mshField(@Nullable Output<String> mshField) {
            $.mshField = mshField;
            return this;
        }

        /**
         * @param mshField The field to extract from the MSH segment. For example, &#34;3.1&#34; or &#34;18[1].1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder mshField(String mshField) {
            return mshField(Output.of(mshField));
        }

        /**
         * @param value The value to match with the field. For example, &#34;My Application Name&#34; or &#34;2.3&#34;.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value to match with the field. For example, &#34;My Application Name&#34; or &#34;2.3&#34;.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public VersionSourceArgs build() {
            return $;
        }
    }

}

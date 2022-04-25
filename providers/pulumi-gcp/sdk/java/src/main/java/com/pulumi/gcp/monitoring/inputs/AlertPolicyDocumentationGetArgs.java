// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertPolicyDocumentationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertPolicyDocumentationGetArgs Empty = new AlertPolicyDocumentationGetArgs();

    /**
     * The text of the documentation, interpreted according to mimeType.
     * The content may not exceed 8,192 Unicode characters and may not
     * exceed more than 10,240 bytes when encoded in UTF-8 format,
     * whichever is smaller.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return The text of the documentation, interpreted according to mimeType.
     * The content may not exceed 8,192 Unicode characters and may not
     * exceed more than 10,240 bytes when encoded in UTF-8 format,
     * whichever is smaller.
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * The format of the content field. Presently, only the value
     * &#34;text/markdown&#34; is supported.
     * 
     */
    @Import(name="mimeType")
    private @Nullable Output<String> mimeType;

    /**
     * @return The format of the content field. Presently, only the value
     * &#34;text/markdown&#34; is supported.
     * 
     */
    public Optional<Output<String>> mimeType() {
        return Optional.ofNullable(this.mimeType);
    }

    private AlertPolicyDocumentationGetArgs() {}

    private AlertPolicyDocumentationGetArgs(AlertPolicyDocumentationGetArgs $) {
        this.content = $.content;
        this.mimeType = $.mimeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertPolicyDocumentationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertPolicyDocumentationGetArgs $;

        public Builder() {
            $ = new AlertPolicyDocumentationGetArgs();
        }

        public Builder(AlertPolicyDocumentationGetArgs defaults) {
            $ = new AlertPolicyDocumentationGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param content The text of the documentation, interpreted according to mimeType.
         * The content may not exceed 8,192 Unicode characters and may not
         * exceed more than 10,240 bytes when encoded in UTF-8 format,
         * whichever is smaller.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The text of the documentation, interpreted according to mimeType.
         * The content may not exceed 8,192 Unicode characters and may not
         * exceed more than 10,240 bytes when encoded in UTF-8 format,
         * whichever is smaller.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param mimeType The format of the content field. Presently, only the value
         * &#34;text/markdown&#34; is supported.
         * 
         * @return builder
         * 
         */
        public Builder mimeType(@Nullable Output<String> mimeType) {
            $.mimeType = mimeType;
            return this;
        }

        /**
         * @param mimeType The format of the content field. Presently, only the value
         * &#34;text/markdown&#34; is supported.
         * 
         * @return builder
         * 
         */
        public Builder mimeType(String mimeType) {
            return mimeType(Output.of(mimeType));
        }

        public AlertPolicyDocumentationGetArgs build() {
            return $;
        }
    }

}

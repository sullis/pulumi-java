// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Information needed to configure the payload.
 * 
 * By default, AWS IoT Events generates a standard payload in JSON for any action. This action payload contains all attribute-value pairs that have the information about the detector model instance and the event triggered the action. To configure the action payload, you can use `contentExpression`.
 * 
 */
public final class DetectorModelPayloadArgs extends com.pulumi.resources.ResourceArgs {

    public static final DetectorModelPayloadArgs Empty = new DetectorModelPayloadArgs();

    /**
     * The content of the payload. You can use a string expression that includes quoted strings (`&#39;&lt;string&gt;&#39;`), variables (`$variable.&lt;variable-name&gt;`), input values (`$input.&lt;input-name&gt;.&lt;path-to-datum&gt;`), string concatenations, and quoted strings that contain `${}` as the content. The recommended maximum size of a content expression is 1 KB.
     * 
     */
    @Import(name="contentExpression", required=true)
    private Output<String> contentExpression;

    /**
     * @return The content of the payload. You can use a string expression that includes quoted strings (`&#39;&lt;string&gt;&#39;`), variables (`$variable.&lt;variable-name&gt;`), input values (`$input.&lt;input-name&gt;.&lt;path-to-datum&gt;`), string concatenations, and quoted strings that contain `${}` as the content. The recommended maximum size of a content expression is 1 KB.
     * 
     */
    public Output<String> contentExpression() {
        return this.contentExpression;
    }

    /**
     * The value of the payload type can be either `STRING` or `JSON`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The value of the payload type can be either `STRING` or `JSON`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private DetectorModelPayloadArgs() {}

    private DetectorModelPayloadArgs(DetectorModelPayloadArgs $) {
        this.contentExpression = $.contentExpression;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DetectorModelPayloadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DetectorModelPayloadArgs $;

        public Builder() {
            $ = new DetectorModelPayloadArgs();
        }

        public Builder(DetectorModelPayloadArgs defaults) {
            $ = new DetectorModelPayloadArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentExpression The content of the payload. You can use a string expression that includes quoted strings (`&#39;&lt;string&gt;&#39;`), variables (`$variable.&lt;variable-name&gt;`), input values (`$input.&lt;input-name&gt;.&lt;path-to-datum&gt;`), string concatenations, and quoted strings that contain `${}` as the content. The recommended maximum size of a content expression is 1 KB.
         * 
         * @return builder
         * 
         */
        public Builder contentExpression(Output<String> contentExpression) {
            $.contentExpression = contentExpression;
            return this;
        }

        /**
         * @param contentExpression The content of the payload. You can use a string expression that includes quoted strings (`&#39;&lt;string&gt;&#39;`), variables (`$variable.&lt;variable-name&gt;`), input values (`$input.&lt;input-name&gt;.&lt;path-to-datum&gt;`), string concatenations, and quoted strings that contain `${}` as the content. The recommended maximum size of a content expression is 1 KB.
         * 
         * @return builder
         * 
         */
        public Builder contentExpression(String contentExpression) {
            return contentExpression(Output.of(contentExpression));
        }

        /**
         * @param type The value of the payload type can be either `STRING` or `JSON`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The value of the payload type can be either `STRING` or `JSON`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DetectorModelPayloadArgs build() {
            $.contentExpression = Objects.requireNonNull($.contentExpression, "expected parameter 'contentExpression' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}

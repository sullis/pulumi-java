// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.identitystore.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetUserFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetUserFilterArgs Empty = new GetUserFilterArgs();

    /**
     * The attribute path that is used to specify which attribute name to search. Currently, `UserName` is the only valid attribute path.
     * 
     */
    @Import(name="attributePath", required=true)
    private Output<String> attributePath;

    /**
     * @return The attribute path that is used to specify which attribute name to search. Currently, `UserName` is the only valid attribute path.
     * 
     */
    public Output<String> attributePath() {
        return this.attributePath;
    }

    /**
     * The value for an attribute.
     * 
     */
    @Import(name="attributeValue", required=true)
    private Output<String> attributeValue;

    /**
     * @return The value for an attribute.
     * 
     */
    public Output<String> attributeValue() {
        return this.attributeValue;
    }

    private GetUserFilterArgs() {}

    private GetUserFilterArgs(GetUserFilterArgs $) {
        this.attributePath = $.attributePath;
        this.attributeValue = $.attributeValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserFilterArgs $;

        public Builder() {
            $ = new GetUserFilterArgs();
        }

        public Builder(GetUserFilterArgs defaults) {
            $ = new GetUserFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attributePath The attribute path that is used to specify which attribute name to search. Currently, `UserName` is the only valid attribute path.
         * 
         * @return builder
         * 
         */
        public Builder attributePath(Output<String> attributePath) {
            $.attributePath = attributePath;
            return this;
        }

        /**
         * @param attributePath The attribute path that is used to specify which attribute name to search. Currently, `UserName` is the only valid attribute path.
         * 
         * @return builder
         * 
         */
        public Builder attributePath(String attributePath) {
            return attributePath(Output.of(attributePath));
        }

        /**
         * @param attributeValue The value for an attribute.
         * 
         * @return builder
         * 
         */
        public Builder attributeValue(Output<String> attributeValue) {
            $.attributeValue = attributeValue;
            return this;
        }

        /**
         * @param attributeValue The value for an attribute.
         * 
         * @return builder
         * 
         */
        public Builder attributeValue(String attributeValue) {
            return attributeValue(Output.of(attributeValue));
        }

        public GetUserFilterArgs build() {
            $.attributePath = Objects.requireNonNull($.attributePath, "expected parameter 'attributePath' to be non-null");
            $.attributeValue = Objects.requireNonNull($.attributeValue, "expected parameter 'attributeValue' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleFirehoseGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicRuleFirehoseGetArgs Empty = new TopicRuleFirehoseGetArgs();

    /**
     * The delivery stream name.
     * 
     */
    @Import(name="deliveryStreamName", required=true)
    private Output<String> deliveryStreamName;

    /**
     * @return The delivery stream name.
     * 
     */
    public Output<String> deliveryStreamName() {
        return this.deliveryStreamName;
    }

    /**
     * The IAM role ARN that grants access to the Amazon Kinesis Firehose stream.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return The IAM role ARN that grants access to the Amazon Kinesis Firehose stream.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * A character separator that is used to separate records written to the Firehose stream. Valid values are: &#39;\n&#39; (newline), &#39;\t&#39; (tab), &#39;\r\n&#39; (Windows newline), &#39;,&#39; (comma).
     * 
     */
    @Import(name="separator")
    private @Nullable Output<String> separator;

    /**
     * @return A character separator that is used to separate records written to the Firehose stream. Valid values are: &#39;\n&#39; (newline), &#39;\t&#39; (tab), &#39;\r\n&#39; (Windows newline), &#39;,&#39; (comma).
     * 
     */
    public Optional<Output<String>> separator() {
        return Optional.ofNullable(this.separator);
    }

    private TopicRuleFirehoseGetArgs() {}

    private TopicRuleFirehoseGetArgs(TopicRuleFirehoseGetArgs $) {
        this.deliveryStreamName = $.deliveryStreamName;
        this.roleArn = $.roleArn;
        this.separator = $.separator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicRuleFirehoseGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicRuleFirehoseGetArgs $;

        public Builder() {
            $ = new TopicRuleFirehoseGetArgs();
        }

        public Builder(TopicRuleFirehoseGetArgs defaults) {
            $ = new TopicRuleFirehoseGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deliveryStreamName The delivery stream name.
         * 
         * @return builder
         * 
         */
        public Builder deliveryStreamName(Output<String> deliveryStreamName) {
            $.deliveryStreamName = deliveryStreamName;
            return this;
        }

        /**
         * @param deliveryStreamName The delivery stream name.
         * 
         * @return builder
         * 
         */
        public Builder deliveryStreamName(String deliveryStreamName) {
            return deliveryStreamName(Output.of(deliveryStreamName));
        }

        /**
         * @param roleArn The IAM role ARN that grants access to the Amazon Kinesis Firehose stream.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The IAM role ARN that grants access to the Amazon Kinesis Firehose stream.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param separator A character separator that is used to separate records written to the Firehose stream. Valid values are: &#39;\n&#39; (newline), &#39;\t&#39; (tab), &#39;\r\n&#39; (Windows newline), &#39;,&#39; (comma).
         * 
         * @return builder
         * 
         */
        public Builder separator(@Nullable Output<String> separator) {
            $.separator = separator;
            return this;
        }

        /**
         * @param separator A character separator that is used to separate records written to the Firehose stream. Valid values are: &#39;\n&#39; (newline), &#39;\t&#39; (tab), &#39;\r\n&#39; (Windows newline), &#39;,&#39; (comma).
         * 
         * @return builder
         * 
         */
        public Builder separator(String separator) {
            return separator(Output.of(separator));
        }

        public TopicRuleFirehoseGetArgs build() {
            $.deliveryStreamName = Objects.requireNonNull($.deliveryStreamName, "expected parameter 'deliveryStreamName' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Ons.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNotificationTopicPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNotificationTopicPlainArgs Empty = new GetNotificationTopicPlainArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the topic to retrieve.
     * 
     */
    @Import(name="topicId", required=true)
    private String topicId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the topic to retrieve.
     * 
     */
    public String topicId() {
        return this.topicId;
    }

    private GetNotificationTopicPlainArgs() {}

    private GetNotificationTopicPlainArgs(GetNotificationTopicPlainArgs $) {
        this.topicId = $.topicId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNotificationTopicPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNotificationTopicPlainArgs $;

        public Builder() {
            $ = new GetNotificationTopicPlainArgs();
        }

        public Builder(GetNotificationTopicPlainArgs defaults) {
            $ = new GetNotificationTopicPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param topicId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the topic to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder topicId(String topicId) {
            $.topicId = topicId;
            return this;
        }

        public GetNotificationTopicPlainArgs build() {
            $.topicId = Objects.requireNonNull($.topicId, "expected parameter 'topicId' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OperatorAccessControl.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAccessRequestHistoryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccessRequestHistoryArgs Empty = new GetAccessRequestHistoryArgs();

    /**
     * unique AccessRequest identifier
     * 
     */
    @Import(name="accessRequestId", required=true)
    private Output<String> accessRequestId;

    /**
     * @return unique AccessRequest identifier
     * 
     */
    public Output<String> accessRequestId() {
        return this.accessRequestId;
    }

    private GetAccessRequestHistoryArgs() {}

    private GetAccessRequestHistoryArgs(GetAccessRequestHistoryArgs $) {
        this.accessRequestId = $.accessRequestId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccessRequestHistoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccessRequestHistoryArgs $;

        public Builder() {
            $ = new GetAccessRequestHistoryArgs();
        }

        public Builder(GetAccessRequestHistoryArgs defaults) {
            $ = new GetAccessRequestHistoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessRequestId unique AccessRequest identifier
         * 
         * @return builder
         * 
         */
        public Builder accessRequestId(Output<String> accessRequestId) {
            $.accessRequestId = accessRequestId;
            return this;
        }

        /**
         * @param accessRequestId unique AccessRequest identifier
         * 
         * @return builder
         * 
         */
        public Builder accessRequestId(String accessRequestId) {
            return accessRequestId(Output.of(accessRequestId));
        }

        public GetAccessRequestHistoryArgs build() {
            $.accessRequestId = Objects.requireNonNull($.accessRequestId, "expected parameter 'accessRequestId' to be non-null");
            return $;
        }
    }

}

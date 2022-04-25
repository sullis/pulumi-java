// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ServiceAttachmentConsumerAcceptListArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAttachmentConsumerAcceptListArgs Empty = new ServiceAttachmentConsumerAcceptListArgs();

    /**
     * The number of consumer forwarding rules the consumer project can
     * create.
     * 
     */
    @Import(name="connectionLimit", required=true)
    private Output<Integer> connectionLimit;

    /**
     * @return The number of consumer forwarding rules the consumer project can
     * create.
     * 
     */
    public Output<Integer> connectionLimit() {
        return this.connectionLimit;
    }

    /**
     * A project that is allowed to connect to this service attachment.
     * 
     */
    @Import(name="projectIdOrNum", required=true)
    private Output<String> projectIdOrNum;

    /**
     * @return A project that is allowed to connect to this service attachment.
     * 
     */
    public Output<String> projectIdOrNum() {
        return this.projectIdOrNum;
    }

    private ServiceAttachmentConsumerAcceptListArgs() {}

    private ServiceAttachmentConsumerAcceptListArgs(ServiceAttachmentConsumerAcceptListArgs $) {
        this.connectionLimit = $.connectionLimit;
        this.projectIdOrNum = $.projectIdOrNum;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAttachmentConsumerAcceptListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAttachmentConsumerAcceptListArgs $;

        public Builder() {
            $ = new ServiceAttachmentConsumerAcceptListArgs();
        }

        public Builder(ServiceAttachmentConsumerAcceptListArgs defaults) {
            $ = new ServiceAttachmentConsumerAcceptListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionLimit The number of consumer forwarding rules the consumer project can
         * create.
         * 
         * @return builder
         * 
         */
        public Builder connectionLimit(Output<Integer> connectionLimit) {
            $.connectionLimit = connectionLimit;
            return this;
        }

        /**
         * @param connectionLimit The number of consumer forwarding rules the consumer project can
         * create.
         * 
         * @return builder
         * 
         */
        public Builder connectionLimit(Integer connectionLimit) {
            return connectionLimit(Output.of(connectionLimit));
        }

        /**
         * @param projectIdOrNum A project that is allowed to connect to this service attachment.
         * 
         * @return builder
         * 
         */
        public Builder projectIdOrNum(Output<String> projectIdOrNum) {
            $.projectIdOrNum = projectIdOrNum;
            return this;
        }

        /**
         * @param projectIdOrNum A project that is allowed to connect to this service attachment.
         * 
         * @return builder
         * 
         */
        public Builder projectIdOrNum(String projectIdOrNum) {
            return projectIdOrNum(Output.of(projectIdOrNum));
        }

        public ServiceAttachmentConsumerAcceptListArgs build() {
            $.connectionLimit = Objects.requireNonNull($.connectionLimit, "expected parameter 'connectionLimit' to be non-null");
            $.projectIdOrNum = Objects.requireNonNull($.projectIdOrNum, "expected parameter 'projectIdOrNum' to be non-null");
            return $;
        }
    }

}
